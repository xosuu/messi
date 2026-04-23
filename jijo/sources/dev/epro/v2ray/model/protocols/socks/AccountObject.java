package dev.epro.v2ray.model.protocols.socks;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class AccountObject {
    String pass;
    String user;

    static {
        NativeUtil.classesInit0(110);
    }

    public native String getPass();

    public native String getUser();

    public native void setPass(String str);

    public native void setUser(String str);

    public native String toString();
}
