package dev.epro.v2ray.model.outbounds;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ProxySettingsObject {
    String tag;
    Boolean transportLayer;

    static {
        NativeUtil.classesInit0(111);
    }

    public native String getTag();

    public native Boolean getTransportLayer();

    public native void setTag(String str);

    public native void setTransportLayer(Boolean bool);

    public native String toString();
}
