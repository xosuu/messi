package dev.epro.v2ray.util;

import com.google.android.gms.ads.RequestConfiguration;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class VmessQRCode {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    String f12593v = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String ps = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String add = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String port = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String id = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String aid = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: net, reason: collision with root package name */
    String f12592net = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String type = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String host = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String path = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    String tls = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        NativeUtil.classesInit0(22);
    }

    public native String getAdd();

    public native String getAid();

    public native String getHost();

    public native String getId();

    public native String getNet();

    public native String getPath();

    public native String getPort();

    public native String getPs();

    public native String getTls();

    public native String getType();

    public native String getV();

    public native void setAdd(String str);

    public native void setAid(String str);

    public native void setHost(String str);

    public native void setId(String str);

    public native void setNet(String str);

    public native void setPath(String str);

    public native void setPort(String str);

    public native void setPs(String str);

    public native void setTls(String str);

    public native void setType(String str);

    public native void setV(String str);

    public native String toString();
}
