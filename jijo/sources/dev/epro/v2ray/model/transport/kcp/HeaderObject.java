package dev.epro.v2ray.model.transport.kcp;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class HeaderObject {
    String type;

    static {
        NativeUtil.classesInit0(230);
    }

    public native String getType();

    public native void setType(String str);

    public native String toString();
}
