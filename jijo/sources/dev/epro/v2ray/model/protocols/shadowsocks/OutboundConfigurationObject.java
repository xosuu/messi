package dev.epro.v2ray.model.protocols.shadowsocks;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class OutboundConfigurationObject {
    List<ServerObject> servers;

    static {
        NativeUtil.classesInit0(237);
    }

    public native List<ServerObject> getServers();

    public native void setServers(List<ServerObject> list);

    public native String toString();
}
