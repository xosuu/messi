package dev.epro.v2ray.model.protocols.vmess;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class DetourObject {
    String to;

    static {
        NativeUtil.classesInit0(20);
    }

    public native String getTo();

    public native void setTo(String str);

    public native String toString();
}
