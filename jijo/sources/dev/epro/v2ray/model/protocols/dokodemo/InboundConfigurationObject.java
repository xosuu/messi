package dev.epro.v2ray.model.protocols.dokodemo;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class InboundConfigurationObject {
    String address;
    Boolean followRedirect;
    String network;
    Integer port;
    Integer timeout;
    Integer userLevel;

    static {
        NativeUtil.classesInit0(198);
    }

    public native String getAddress();

    public native Boolean getFollowRedirect();

    public native String getNetwork();

    public native Integer getPort();

    public native Integer getTimeout();

    public native Integer getUserLevel();

    public native void setAddress(String str);

    public native void setFollowRedirect(Boolean bool);

    public native void setNetwork(String str);

    public native void setPort(Integer num);

    public native void setTimeout(Integer num);

    public native void setUserLevel(Integer num);

    public native String toString();
}
