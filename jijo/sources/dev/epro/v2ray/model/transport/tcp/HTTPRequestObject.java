package dev.epro.v2ray.model.transport.tcp;

import java.util.List;
import java.util.Map;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class HTTPRequestObject {
    Map<String, Object> headers;
    String method;
    List<String> path;
    String version;

    static {
        NativeUtil.classesInit0(135);
    }

    public native Map<String, Object> getHeaders();

    public native String getMethod();

    public native List<String> getPath();

    public native String getVersion();

    public native void setHeaders(Map<String, Object> map);

    public native void setMethod(String str);

    public native void setPath(List<String> list);

    public native void setVersion(String str);

    public native String toString();
}
