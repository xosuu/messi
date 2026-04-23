package dev.epro.v2ray.bean.outbounds.stream;

import com.google.android.gms.ads.RequestConfiguration;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class TlsSettingsBean {
    boolean allowInsecure = true;
    String serverName = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        NativeUtil.classesInit0(182);
    }

    public native String getServerName();

    public native boolean isAllowInsecure();

    public native void setAllowInsecure(boolean z9);

    public native void setServerName(String str);

    public native String toString();
}
