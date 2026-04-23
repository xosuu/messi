package dev.epro.v2ray.model.protocols.trojan;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class InboundConfigurationObject {
    List<ClientObject> clients;
    List<FallbackObject> fallbacks;

    static {
        NativeUtil.classesInit0(145);
    }

    public native List<ClientObject> getClients();

    public native List<FallbackObject> getFallbacks();

    public native void setClients(List<ClientObject> list);

    public native void setFallbacks(List<FallbackObject> list);

    public native String toString();
}
