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

package com.vrem.wifianalyzer.wifi.band;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class WiFiChannelCountry {
    public static final Locale LocaleWW = new Locale("", "WW");

    static final String UNKNOWN = "Unknown country";
    static final String DEVELOPMENT = "DEVELOPMENT";
    static final List<Integer> DEFAULT_CHANNELS_GHZ_2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
    static final List<Integer> DEFAULT_CHANNELS_GHZ_5 = Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64);

    private static final WiFiChannelCountry[] COUNTRY_CHANNELS = new WiFiChannelCountry[]{
            new WiFiChannelCountry("AE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("AG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("AN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("AR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("AS",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("AT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("AU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("AW",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("AZ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("BA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("BB",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("BD",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("BE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("BG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("BH",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("BM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("BN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("BO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("BR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("BS",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("BT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("BY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("CA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("CH",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("CL",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("CN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("CO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("CR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("CU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161)
            ),
            new WiFiChannelCountry("CV",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("CY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("CZ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("DE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("DK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("DM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("DO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("EC",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("EE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("EG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("ES",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("FI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("FK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("FM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("FR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("GB",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("GF",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("GG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("GI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("GP",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("GR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("GT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("GU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("HK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("HN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("HR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("HT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("HU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("ID",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("IE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("IL",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64)
            ),
            new WiFiChannelCountry("IM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("IN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("IR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161)
            ),
            new WiFiChannelCountry("IS",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("IT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("JE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("JM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("JO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48)
            ),
            new WiFiChannelCountry("JP",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("KE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48)
            ),
            new WiFiChannelCountry("KI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("KR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161)
            ),
            new WiFiChannelCountry("KW",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("KY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("LA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("LB",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("LI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("LK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("LS",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("LT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("LU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("LV",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("MA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48)
            ),
            new WiFiChannelCountry("MC",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64)
            ),
            new WiFiChannelCountry("MK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("MO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161)
            ),
            new WiFiChannelCountry("MP",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("MQ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("MR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("MT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("MU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("MV",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("MW",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("MX",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64)
            ),
            new WiFiChannelCountry("MY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("NG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("NI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("NL",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("NO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("NZ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("OM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("PA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("PE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("PG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("PH",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("PK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("PL",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("PM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64)
            ),
            new WiFiChannelCountry("PR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("PT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("RE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("RO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("RU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("SA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161)
            ),
            new WiFiChannelCountry("SE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("SG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("SI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("SK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("SV",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("SY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161)
            ),
            new WiFiChannelCountry("TH",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("TJ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("TN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("TR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140)
            ),
            new WiFiChannelCountry("TT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("TW",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 56, 60, 64, 149, 153, 157, 161, 165),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("TZ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161)
            ),
            new WiFiChannelCountry("UA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("UM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("US",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("UY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("UZ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("VA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>()
            ),
            new WiFiChannelCountry("VE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("VG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("VI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("VN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165)
            ),
            new WiFiChannelCountry("YT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("ZA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("ZM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140)
            ),
            new WiFiChannelCountry("WW",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14),
                    Arrays.asList(8, 12, 16, 36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165, 184, 188, 192, 196)
            )
    };

    private final String countryCode;
    private final List<Integer> channelsGHZ_2;
    private final List<Integer> channelsGHZ_5;
    private final String countryName;

    public WiFiChannelCountry(@NonNull String countryCode) {
        this(countryCode, DEFAULT_CHANNELS_GHZ_2, DEFAULT_CHANNELS_GHZ_5);
    }

    private WiFiChannelCountry(@NonNull String countryCode, @NonNull List<Integer> channelsGHZ_2, List<Integer> channelsGHZ_5) {
        this.countryCode = countryCode;
        this.channelsGHZ_2 = channelsGHZ_2;
        this.channelsGHZ_5 = channelsGHZ_5.isEmpty() ? DEFAULT_CHANNELS_GHZ_5 : channelsGHZ_5;
        this.countryName = findCountryName(countryCode);
    }

    public static WiFiChannelCountry find(@NonNull String countryCode) {
        for (WiFiChannelCountry wiFiChannelCountry : COUNTRY_CHANNELS) {
                if (wiFiChannelCountry.getCountryCode().equalsIgnoreCase(countryCode)) {
                return wiFiChannelCountry;
            }
        }
        return new WiFiChannelCountry(countryCode);
    }

    public static List<WiFiChannelCountry> getAll() {
        return Collections.unmodifiableList(Arrays.asList(COUNTRY_CHANNELS));
    }

    private String findCountryName(@NonNull String countryCode) {
        if (LocaleWW.getCountry().equals(countryCode)) {
            return DEVELOPMENT;
        }
        String countryName = Country.INSTANCE.getCountry(countryCode).getDisplayCountry();
        return countryCode.equals(countryName) ? UNKNOWN : countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public List<Integer> getChannelsGHZ_2() {
        return Collections.unmodifiableList(channelsGHZ_2);
    }

    public List<Integer> getChannelsGHZ_5() {
        return Collections.unmodifiableList(channelsGHZ_5);
    }

    boolean isChannelAvailableGHZ_2(int channel) {
        return channelsGHZ_2.contains(channel);
    }

    boolean isChannelAvailableGHZ_5(int channel) {
        return channelsGHZ_5.contains(channel);
    }
}
