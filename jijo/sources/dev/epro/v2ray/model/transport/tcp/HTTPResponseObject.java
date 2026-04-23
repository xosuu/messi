package dev.epro.v2ray.model.transport.tcp;

import java.util.Map;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class HTTPResponseObject {
    Map<String, Object> headers;
    String reason;
    String status;
    String version;

    static {
        NativeUtil.classesInit0(205);
    }

    public native Map<String, Object> getHeaders();

    public native String getReason();

    public native String getStatus();

    public native String getVersion();

    public native void setHeaders(Map<String, Object> map);

    public native void setReason(String str);

    public native void setStatus(String str);

    public native void setVersion(String str);

    public native String toString();
}
