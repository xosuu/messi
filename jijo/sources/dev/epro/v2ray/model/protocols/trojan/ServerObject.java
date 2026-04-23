package dev.epro.v2ray.model.protocols.trojan;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ServerObject {
    String address;
    String email;
    Integer level;
    String password;
    Integer port;

    static {
        NativeUtil.classesInit0(74);
    }

    public native String getAddress();

    public native String getEmail();

    public native Integer getLevel();

    public native String getPassword();

    public native Integer getPort();

    public native void setAddress(String str);

    public native void setEmail(String str);

    public native void setLevel(Integer num);

    public native void setPassword(String str);

    public native void setPort(Integer num);

    public native String toString();
}
