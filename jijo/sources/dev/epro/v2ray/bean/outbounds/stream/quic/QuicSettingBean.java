package dev.epro.v2ray.bean.outbounds.stream.quic;

import com.google.android.gms.ads.RequestConfiguration;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class QuicSettingBean {
    String security = "none";
    String key = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    HeaderBean header = new HeaderBean();

    static {
        NativeUtil.classesInit0(209);
    }

    public native HeaderBean getHeader();

    public native String getKey();

    public native String getSecurity();

    public native void setHeader(HeaderBean headerBean);

    public native void setKey(String str);

    public native void setSecurity(String str);

    public native String toString();
}
