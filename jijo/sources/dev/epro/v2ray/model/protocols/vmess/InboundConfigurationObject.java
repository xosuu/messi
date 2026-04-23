package dev.epro.v2ray.model.protocols.vmess;

import java.util.List;
import o5.b;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class InboundConfigurationObject {
    List<ClientObject> clients;

    @b("default")
    DefaultObject defaultObject;
    DetourObject detour;
    Boolean disableInsecureEncryption;

    static {
        NativeUtil.classesInit0(180);
    }

    public native List<ClientObject> getClients();

    public native DefaultObject getDefaultObject();

    public native DetourObject getDetour();

    public native Boolean getDisableInsecureEncryption();

    public native void setClients(List<ClientObject> list);

    public native void setDefaultObject(DefaultObject defaultObject);

    public native void setDetour(DetourObject detourObject);

    public native void setDisableInsecureEncryption(Boolean bool);

    public native String toString();
}
