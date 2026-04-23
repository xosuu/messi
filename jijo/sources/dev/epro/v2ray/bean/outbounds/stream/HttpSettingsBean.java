package dev.epro.v2ray.bean.outbounds.stream;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class HttpSettingsBean {
    List<String> host = new ArrayList();
    String path = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        NativeUtil.classesInit0(43);
    }

    public native List<String> getHost();

    public native String getPath();

    public native void setHost(List<String> list);

    public native void setPath(String str);

    public native String toString();
}
