package dev.epro.v2ray.model.protocols.shadowsocks;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class InboundConfigurationObject {
    String email;
    Integer level;
    String method;
    String network;
    String password;

    static {
        NativeUtil.classesInit0(227);
    }

    public native String getEmail();

    public native Integer getLevel();

    public native String getMethod();

    public native String getNetwork();

    public native String getPassword();

    public native void setEmail(String str);

    public native void setLevel(Integer num);

    public native void setMethod(String str);

    public native void setNetwork(String str);

    public native void setPassword(String str);

    public native String toString();
}
