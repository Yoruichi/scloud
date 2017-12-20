package com.redteamobile.scloudz.util;

/**
 * Created by yoruichi on 17/4/21.
 */
public class NumberUtils {
    public static long parseLong(String source, long defaultValue) {
        try {
            return Long.parseLong(source);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static int parseInt(String source, int defaultValue) {
        try {
            return Integer.parseInt(source);
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
