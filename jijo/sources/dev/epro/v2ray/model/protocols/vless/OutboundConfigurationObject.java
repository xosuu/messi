package dev.epro.v2ray.model.protocols.vless;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class OutboundConfigurationObject {
    List<ServerObject> vnext;

    static {
        NativeUtil.classesInit0(235);
    }

    public native List<ServerObject> getVnext();

    public native void setVnext(List<ServerObject> list);

    public native String toString();
}
