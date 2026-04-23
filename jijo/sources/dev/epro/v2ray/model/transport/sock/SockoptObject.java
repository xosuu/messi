package dev.epro.v2ray.model.transport.sock;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class SockoptObject {
    Integer mark;
    Boolean tcpFastOpen;
    Integer tcpFastOpenQueueLength;
    Integer tcpKeepAliveInterval;
    String tproxy;

    static {
        NativeUtil.classesInit0(18);
    }

    public native Integer getMark();

    public native Boolean getTcpFastOpen();

    public native Integer getTcpFastOpenQueueLength();

    public native Integer getTcpKeepAliveInterval();

    public native String getTproxy();

    public native void setMark(Integer num);

    public native void setTcpFastOpen(Boolean bool);

    public native void setTcpFastOpenQueueLength(Integer num);

    public native void setTcpKeepAliveInterval(Integer num);

    public native void setTproxy(String str);

    public native String toString();
}
