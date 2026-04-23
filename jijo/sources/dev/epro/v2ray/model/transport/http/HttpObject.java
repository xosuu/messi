package dev.epro.v2ray.model.transport.http;

import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Map;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class HttpObject {
    Map<String, List<String>> headers;
    List<String> host;
    String method;
    String path;

    static {
        NativeUtil.classesInit0(NotificationCompat.FLAG_HIGH_PRIORITY);
    }

    public native Map<String, List<String>> getHeaders();

    public native List<String> getHost();

    public native String getMethod();

    public native String getPath();

    public native void setHeaders(Map<String, List<String>> map);

    public native void setHost(List<String> list);

    public native void setMethod(String str);

    public native void setPath(String str);

    public native String toString();
}
