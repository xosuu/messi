package dev.epro.v2ray.model.protocols.blackhole;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ResponseObject {
    String type;

    static {
        NativeUtil.classesInit0(45);
    }

    public native String getType();

    public native void setType(String str);

    public native String toString();
}
