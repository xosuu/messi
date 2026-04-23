package dev.epro.v2ray.model.protocols.trojan;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class FallbackObject {
    String alpn;
    String dest;
    String path;
    Integer xver;

    static {
        NativeUtil.classesInit0(170);
    }

    public native String getAlpn();

    public native String getDest();

    public native String getPath();

    public native Integer getXver();

    public native void setAlpn(String str);

    public native void setDest(String str);

    public native void setPath(String str);

    public native void setXver(Integer num);

    public native String toString();
}
