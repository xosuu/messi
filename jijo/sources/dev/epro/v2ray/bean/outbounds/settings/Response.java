package dev.epro.v2ray.bean.outbounds.settings;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class Response {
    String type;

    static {
        NativeUtil.classesInit0(10);
    }

    public native String getType();

    public native void setType(String str);

    public native String toString();
}
