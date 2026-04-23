package dev.epro.v2ray.model.protocols.dns;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class OutboundConfigurationObject {
    String address;
    String network;
    Integer port;

    static {
        NativeUtil.classesInit0(154);
    }

    public native String getAddress();

    public native String getNetwork();

    public native Integer getPort();

    public native void setAddress(String str);

    public native void setNetwork(String str);

    public native void setPort(Integer num);

    public native String toString();
}
