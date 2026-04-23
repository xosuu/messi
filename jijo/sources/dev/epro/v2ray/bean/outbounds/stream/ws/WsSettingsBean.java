package dev.epro.v2ray.bean.outbounds.stream.ws;

import com.google.android.gms.ads.RequestConfiguration;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class WsSettingsBean {
    String path = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    HeadersBean headers = new HeadersBean();

    static {
        NativeUtil.classesInit0(96);
    }

    public native HeadersBean getHeaders();

    public native String getPath();

    public native void setHeaders(HeadersBean headersBean);

    public native void setPath(String str);

    public native String toString();
}
