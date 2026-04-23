package dev.epro.v2ray.util;

import com.google.android.gms.ads.RequestConfiguration;
import o5.b;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class V2rayNGUtils {

    @b("add")
    String add = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    @b("aid")
    String aid = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    @b("host")
    String host = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    @b("id")
    String id = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: net, reason: collision with root package name */
    @b("net")
    String f12590net = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    @b("path")
    String path = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    @b("port")
    String port = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    @b("ps")
    String ps = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    @b("scy")
    String scy = "auto";

    @b("sni")
    String sni = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    @b("tls")
    String tls = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    @b("type")
    String type = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @b("v")
    String f12591v = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        NativeUtil.classesInit0(36);
    }

    public native String getAdd();

    public native String getAid();

    public native String getHost();

    public native String getId();

    public native String getNet();

    public native String getPath();

    public native String getPort();

    public native String getPs();

    public native String getScy();

    public native String getSni();

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

    public native void setScy(String str);

    public native void setSni(String str);

    public native void setTls(String str);

    public native void setType(String str);

    public native void setV(String str);

    public native String toString();
}
