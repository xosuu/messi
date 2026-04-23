package dev.epro.v2ray.bean.dns;

import java.util.List;
import java.util.Map;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class DnsBean {
    Map<String, String> hosts;
    List<Object> servers;

    static {
        NativeUtil.classesInit0(86);
    }

    public DnsBean() {
    }

    public native Map<String, String> getHosts();

    public native List<Object> getServers();

    public native void setHosts(Map<String, String> map);

    public native void setServers(List<Object> list);

    public native String toString();

    public DnsBean(List<Object> list, Map<String, String> map) {
        this.servers = list;
        this.hosts = map;
    }
}
