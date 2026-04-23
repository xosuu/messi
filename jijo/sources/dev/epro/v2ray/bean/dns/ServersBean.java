package dev.epro.v2ray.bean.dns;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ServersBean {
    String address;
    List<String> domains;
    int port;

    static {
        NativeUtil.classesInit0(222);
    }

    public ServersBean() {
    }

    public native String getAddress();

    public native List<String> getDomains();

    public native int getPort();

    public native void setAddress(String str);

    public native void setDomains(List<String> list);

    public native void setPort(int i10);

    public native String toString();

    public ServersBean(String str, int i10, List<String> list) {
        this.address = str;
        this.port = i10;
        this.domains = list;
    }
}
