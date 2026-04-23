package dev.epro.v2ray.bean.inbounds;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class InSettingsBean {
    String address;
    String auth;
    String network;
    Integer port;
    Boolean udp;
    Integer userLevel;

    static {
        NativeUtil.classesInit0(224);
    }

    public native String getAddress();

    public native String getAuth();

    public native String getNetwork();

    public native Integer getPort();

    public native Boolean getUdp();

    public native Integer getUserLevel();

    public native void setAddress(String str);

    public native void setAuth(String str);

    public native void setNetwork(String str);

    public native void setPort(Integer num);

    public native void setUdp(Boolean bool);

    public native void setUserLevel(Integer num);

    public native String toString();
}
