package dev.epro.v2ray.model.protocols.socks;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class OutboundConfigurationObject {
    List<ServerObject> servers;
    String version;

    static {
        NativeUtil.classesInit0(219);
    }

    public native List<ServerObject> getServers();

    public native String getVersion();

    public native void setServers(List<ServerObject> list);

    public native void setVersion(String str);

    public native String toString();
}
