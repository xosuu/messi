package dev.epro.v2ray.bean.outbounds.stream.quic;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class HeaderBean {
    String type = "none";

    static {
        NativeUtil.classesInit0(24);
    }

    public native String getType();

    public native void setType(String str);

    public native String toString();
}
