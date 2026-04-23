package dev.epro.v2ray.model.reverse;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class BridgeObject {
    String domain;
    String tag;

    static {
        NativeUtil.classesInit0(229);
    }

    public native String getDomain();

    public native String getTag();

    public native void setDomain(String str);

    public native void setTag(String str);

    public native String toString();
}
