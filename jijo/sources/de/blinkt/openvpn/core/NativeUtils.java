package de.blinkt.openvpn.core;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeUtils {
    static {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return;
        }
        System.loadLibrary("opvpnutil");
    }

    public static String a() {
        return "robolectric".equals(Build.FINGERPRINT) ? "ROBO" : getJNIAPI();
    }

    private static native String getJNIAPI();
}
