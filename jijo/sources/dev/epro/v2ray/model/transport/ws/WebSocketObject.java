package dev.epro.v2ray.model.transport.ws;

import java.util.Map;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class WebSocketObject {
    Boolean acceptProxyProtocol;
    String earlyDataHeaderName;
    Map<String, String> headers;
    Integer maxEarlyData;
    String path;
    Boolean useBrowserForwarding;

    static {
        NativeUtil.classesInit0(192);
    }

    public native Boolean getAcceptProxyProtocol();

    public native String getEarlyDataHeaderName();

    public native Map<String, String> getHeaders();

    public native Integer getMaxEarlyData();

    public native String getPath();

    public native Boolean getUseBrowserForwarding();

    public native void setAcceptProxyProtocol(Boolean bool);

    public native void setEarlyDataHeaderName(String str);

    public native void setHeaders(Map<String, String> map);

    public native void setMaxEarlyData(Integer num);

    public native void setPath(String str);

    public native void setUseBrowserForwarding(Boolean bool);

    public native String toString();
}
