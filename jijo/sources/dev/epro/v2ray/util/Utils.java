package dev.epro.v2ray.util;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    static {
        NativeUtil.classesInit0(83);
    }

    public static native void clearClipboard(Context context);

    private static native boolean copyAsset(AssetManager assetManager, String str, String str2);

    public static native boolean copyAssetFolder(AssetManager assetManager, String str, String str2);

    private static native void copyFile(InputStream inputStream, OutputStream outputStream);

    public static native String decode(String str);

    public static native String encode(String str);

    public static native String getClipboard(Context context);

    public static native ArrayList<String> getDomesticDnsServers(String str);

    public static native ArrayList<String> getRemoteDnsServers(String str);

    public static native boolean isIpAddress(String str);

    public static native boolean isIpv4Address(String str);

    public static native boolean isIpv6Address(String str);

    public static native boolean isPureIpAddress(String str);

    public static native VmessBean jsonToVmess(String str);

    public static native int parseInt(String str);

    public static native void setClipboard(Context context, String str);

    public static native int share2Clipboard(Context context, String str);

    public static native String shareConfig(String str);

    public static native String shareConfig_(String str);

    public static native String urlDecode(String str);

    public static native String urlEncode(String str);

    public static native String userAssetPath(Context context);
}
