package dev.epro.v2ray.model.transport.tcp;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class TcpObject {
    Boolean acceptProxyProtocol;
    Object header;

    static {
        NativeUtil.classesInit0(121);
    }

    public native Boolean getAcceptProxyProtocol();

    public native Object getHeader();

    public native void setAcceptProxyProtocol(Boolean bool);

    public native void setHeader(Object obj);

    public native String toString();
}
