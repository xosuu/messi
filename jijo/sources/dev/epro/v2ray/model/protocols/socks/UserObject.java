package dev.epro.v2ray.model.protocols.socks;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class UserObject {
    Integer level;
    String pass;
    String user;

    static {
        NativeUtil.classesInit0(14);
    }

    public native Integer getLevel();

    public native String getPass();

    public native String getUser();

    public native void setLevel(Integer num);

    public native void setPass(String str);

    public native void setUser(String str);

    public native String toString();
}
