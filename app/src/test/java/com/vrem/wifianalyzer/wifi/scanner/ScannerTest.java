/*
 *    Copyright (C) 2015 - 2016 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.vrem.wifianalyzer.wifi.scanner;

import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;

import com.vrem.wifianalyzer.Logger;
import com.vrem.wifianalyzer.MainConfiguration;
import com.vrem.wifianalyzer.MainContext;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.vendor.model.Database;
import com.vrem.wifianalyzer.vendor.model.VendorService;
import com.vrem.wifianalyzer.wifi.band.WiFiChannel;
import com.vrem.wifianalyzer.wifi.model.WiFiData;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ScannerTest {
    @Mock private Handler handler;
    @Mock private Settings settings;
    @Mock private WifiManager wifiManager;
    @Mock private UpdateNotifier updateNotifier1;
    @Mock private UpdateNotifier updateNotifier2;
    @Mock private WifiInfo wifiInfo;
    @Mock private Cache cache;
    @Mock private Transformer transformer;
    @Mock private Logger logger;
    @Mock private WiFiData wiFiData;
    @Mock private PeriodicScan periodicScan;
    @Mock private Context context;
    @Mock private Resources resources;
    @Mock private VendorService vendorService;
    @Mock private LayoutInflater layoutInflater;
    @Mock private Database database;

    private List<ScanResult> scanResults;
    private List<ScanResult> cachedScanResults;
    private List<WifiConfiguration> configuredNetworks;

    private Scanner fixture;

    @Before
    public void setUp() throws Exception {
        initializeMainContext();

        scanResults = new ArrayList<>();
        cachedScanResults = new ArrayList<>();
        configuredNetworks = new ArrayList<>();

        fixture = new Scanner();
        fixture.setCache(cache);
        fixture.setTransformer(transformer);
        fixture.addUpdateNotifier(updateNotifier1);
    }

    private void initializeMainContext() {
        MainConfiguration mainConfiguration = MainConfiguration.INSTANCE;
        mainConfiguration.setLocale(Locale.US);
        mainConfiguration.setWiFiChannelPair(new Pair<>(WiFiChannel.UNKNOWN, WiFiChannel.UNKNOWN));

        MainContext mainContext = MainContext.INSTANCE;
        mainContext.setSettings(settings);
        mainContext.setHandler(handler);
        mainContext.setWifiManager(wifiManager);
        mainContext.setLogger(logger);
        mainContext.setContext(context);
        mainContext.setResources(resources);
        mainContext.setVendorService(vendorService);
        mainContext.setLayoutInflater(layoutInflater);
        mainContext.setDatabase(database);
    }

    @After
    public void tearDown() throws Exception {
        MainConfiguration.INSTANCE.clear();
        MainContext.INSTANCE.clear();
    }

    @Test
    public void testPeriodicScanIsSet() throws Exception {
        assertNotNull(fixture.getPeriodicScan());
    }

    @Test
    public void testAddUpdateNotifierAllowsOnlyOneNotifierPerClass() throws Exception {
        Map<String, UpdateNotifier> updateNotifiers = fixture.getUpdateNotifiers();
        assertEquals(1, updateNotifiers.size());
        assertEquals(updateNotifier1, updateNotifiers.get(updateNotifier1.getClass().getName()));

        fixture.addUpdateNotifier(updateNotifier2);
        assertEquals(1, updateNotifiers.size());
        assertEquals(updateNotifier2, updateNotifiers.get(updateNotifier1.getClass().getName()));

        UpdateNotifier myUpdateNotifier = new UpdateNotifier() {
            @Override
            public void update(@NonNull WiFiData wiFiData) {
            }
        };

        fixture.addUpdateNotifier(myUpdateNotifier);
        assertEquals(2, updateNotifiers.size());
        assertEquals(myUpdateNotifier, updateNotifiers.get(myUpdateNotifier.getClass().getName()));
    }

    @Test
    public void testUpdateWithWiFiData() throws Exception {
        // setup
        withCache();
        withTransformer();
        withWiFiManager();
        // execute
        fixture.update();
        // validate
        verifyCache();
        verifyTransfomer();
        verifyWiFiManager();
        verify(updateNotifier1).update(wiFiData);
    }

    @Test
    public void testUpdateWithWiFiManager() throws Exception {
        // setup
        withCache();
        withWiFiManager();
        // execute
        fixture.update();
        // validate
        verifyWiFiManager();
    }

    @Test
    public void testUpdateWithCache() throws Exception {
        // setup
        withCache();
        withWiFiManager();
        // execute
        fixture.update();
        // validate
        verifyCache();
    }

    private void withCache() {
        when(cache.getScanResults()).thenReturn(cachedScanResults);
    }

    private void withTransformer() {
        when(transformer.transformToWiFiData(cachedScanResults, wifiInfo, configuredNetworks)).thenReturn(wiFiData);
    }

    private void verifyCache() {
        verify(cache).add(scanResults);
        verify(cache).getScanResults();
    }

    private void verifyWiFiManager() {
        verify(wifiManager).isWifiEnabled();
        verify(wifiManager).setWifiEnabled(true);
        verify(wifiManager).startScan();
        verify(wifiManager).getScanResults();
        verify(wifiManager).getConnectionInfo();
        verify(wifiManager).getConfiguredNetworks();
    }

    private void withWiFiManager() {
        when(wifiManager.isWifiEnabled()).thenReturn(false);
        when(wifiManager.startScan()).thenReturn(true);
        when(wifiManager.getScanResults()).thenReturn(scanResults);
        when(wifiManager.getConnectionInfo()).thenReturn(wifiInfo);
        when(wifiManager.getConfiguredNetworks()).thenReturn(configuredNetworks);
    }

    private void verifyTransfomer() {
        verify(transformer).transformToWiFiData(cachedScanResults, wifiInfo, configuredNetworks);
    }

    @Test
    public void testPause() throws Exception {
        // setup
        fixture.setPeriodicScan(periodicScan);
        // execute
        fixture.pause();
        // validate
        verify(periodicScan).stop();
    }

    @Test
    public void testResume() throws Exception {
        // setup
        fixture.setPeriodicScan(periodicScan);
        // execute
        fixture.resume();
        // validate
        verify(periodicScan).start();
    }


}