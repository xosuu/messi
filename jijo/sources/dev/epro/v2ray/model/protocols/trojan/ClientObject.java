package dev.epro.v2ray.model.protocols.trojan;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ClientObject {
    String email;
    Integer level;
    String password;

    static {
        NativeUtil.classesInit0(161);
    }

    public native String getEmail();

    public native Integer getLevel();

    public native String getPassword();

    public native void setEmail(String str);

    public native void setLevel(Integer num);

    public native void setPassword(String str);

    public native String toString();
}
