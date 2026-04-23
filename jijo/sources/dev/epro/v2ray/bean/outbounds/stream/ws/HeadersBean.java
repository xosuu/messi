package dev.epro.v2ray.bean.outbounds.stream.ws;

import com.google.android.gms.ads.RequestConfiguration;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class HeadersBean {
    String Host = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        NativeUtil.classesInit0(32);
    }

    public native String getHost();

    public native void setHost(String str);

    public native String toString();
}
