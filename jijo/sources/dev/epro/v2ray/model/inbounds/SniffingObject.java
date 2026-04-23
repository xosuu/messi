package dev.epro.v2ray.model.inbounds;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class SniffingObject {
    List<String> destOverride;
    Boolean enabled;
    Boolean metadataOnly;
    Boolean routeOnly;

    static {
        NativeUtil.classesInit0(92);
    }

    public native List<String> getDestOverride();

    public native Boolean getEnabled();

    public native Boolean getMetadataOnly();

    public native Boolean getRouteOnly();

    public native void setDestOverride(List<String> list);

    public native void setEnabled(Boolean bool);

    public native void setMetadataOnly(Boolean bool);

    public native void setRouteOnly(Boolean bool);

    public native String toString();
}
