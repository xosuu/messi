package dev.epro.v2ray.model.reverse;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ReverseObject {
    List<BridgeObject> bridges;
    List<PortalObject> portals;

    static {
        NativeUtil.classesInit0(100);
    }

    public native List<BridgeObject> getBridges();

    public native List<PortalObject> getPortals();

    public native void setBridges(List<BridgeObject> list);

    public native void setPortals(List<PortalObject> list);

    public native String toString();
}
