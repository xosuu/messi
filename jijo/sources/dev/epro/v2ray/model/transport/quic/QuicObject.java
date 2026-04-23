package dev.epro.v2ray.model.transport.quic;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class QuicObject {
    HeaderObject header;
    String key;
    String security;

    static {
        NativeUtil.classesInit0(107);
    }

    public native HeaderObject getHeader();

    public native String getKey();

    public native String getSecurity();

    public native void setHeader(HeaderObject headerObject);

    public native void setKey(String str);

    public native void setSecurity(String str);

    public native String toString();
}
