package org.bugs4u.proxyserver.core;

import android.annotation.TargetApi;
import android.os.ParcelFileDescriptor;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(12)
public class Tun2Socks {
    private static final boolean LOGD = false;
    private static final String TAG = "Tun2Socks";
    private static String mDnsgwServerAddress;
    private static boolean mLibLoaded;
    private static String mSocksServerAddress;
    private static String mUdpgwServerAddress;
    private static boolean mUdpgwTransparentDNS;
    private static ParcelFileDescriptor mVpnInterfaceFileDescriptor;
    private static int mVpnInterfaceMTU;
    private static String mVpnIpAddress;
    private static String mVpnNetMask;

    public interface IProtectSocket {
        boolean doVpnProtect(Socket socket);
    }

    public static void Start(ParcelFileDescriptor parcelFileDescriptor, int i10, String str, String str2, String str3, String str4, String str5, boolean z9) {
        if (!mLibLoaded) {
            System.loadLibrary("tun2socks");
            mLibLoaded = true;
        }
        mVpnInterfaceFileDescriptor = parcelFileDescriptor;
        mVpnInterfaceMTU = i10;
        mVpnIpAddress = str;
        mVpnNetMask = str2;
        mSocksServerAddress = str3;
        mDnsgwServerAddress = str4;
        mUdpgwServerAddress = str5;
        mUdpgwTransparentDNS = z9;
        if (parcelFileDescriptor != null) {
            runTun2Socks(parcelFileDescriptor.detachFd(), mVpnInterfaceMTU, mVpnIpAddress, mVpnNetMask, mSocksServerAddress, mDnsgwServerAddress, mUdpgwServerAddress, mUdpgwTransparentDNS ? 1 : 0);
        }
    }

    public static void Stop() {
        if (!mLibLoaded) {
            System.loadLibrary("tun2socks");
            mLibLoaded = true;
        }
        terminateTun2Socks();
    }

    public static void logTun2Socks(String str, String str2, String str3) {
        str.compareTo("ERROR");
    }

    private static native int runTun2Socks(int i10, int i11, String str, String str2, String str3, String str4, String str5, int i12);

    private static native int terminateTun2Socks();
}
