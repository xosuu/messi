package dev.epro.v2ray.util;

import com.google.android.gms.ads.RequestConfiguration;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class VmessBean {
    String guid = "123456";
    String address = "eprodev.org";
    int port = 80;
    String id = "a3482e88-686a-4a58-8126-99c9df64b7bf";
    int alterId = 64;
    String security = "aes-128-cfb";
    String network = "tcp";
    String remarks = "def";
    String headerType = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String requestHost = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String path = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String streamSecurity = "none";
    int configType = 1;
    int configVersion = 1;
    String testResult = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String subid = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        NativeUtil.classesInit0(173);
    }

    public native String getAddress();

    public native int getAlterId();

    public native int getConfigType();

    public native int getConfigVersion();

    public native String getGuid();

    public native String getHeaderType();

    public native String getId();

    public native String getNetwork();

    public native String getPath();

    public native int getPort();

    public native String getRemarks();

    public native String getRequestHost();

    public native String getSecurity();

    public native String getStreamSecurity();

    public native String getSubid();

    public native String getTestResult();

    public native void setAddress(String str);

    public native void setAlterId(int i10);

    public native void setConfigType(int i10);

    public native void setConfigVersion(int i10);

    public native void setGuid(String str);

    public native void setHeaderType(String str);

    public native void setId(String str);

    public native void setNetwork(String str);

    public native void setPath(String str);

    public native void setPort(int i10);

    public native void setRemarks(String str);

    public native void setRequestHost(String str);

    public native void setSecurity(String str);

    public native void setStreamSecurity(String str);

    public native void setSubid(String str);

    public native void setTestResult(String str);

    public native String toString();
}
