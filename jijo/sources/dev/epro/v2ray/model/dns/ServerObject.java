package dev.epro.v2ray.model.dns;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ServerObject {
    String address;
    String clientIp;
    List<String> domains;
    List<String> expectIPs;
    Integer port;

    static {
        NativeUtil.classesInit0(132);
    }

    public native String getAddress();

    public native String getClientIp();

    public native List<String> getDomains();

    public native List<String> getExpectIPs();

    public native Integer getPort();

    public native void setAddress(String str);

    public native void setClientIp(String str);

    public native void setDomains(List<String> list);

    public native void setExpectIPs(List<String> list);

    public native void setPort(Integer num);

    public native String toString();
}
