package dev.epro.v2ray.model.protocols.mtproto;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class UserObject {
    String email;
    Integer level;
    String secret;

    static {
        NativeUtil.classesInit0(89);
    }

    public native String getEmail();

    public native Integer getLevel();

    public native String getSecret();

    public native void setEmail(String str);

    public native void setLevel(Integer num);

    public native void setSecret(String str);

    public native String toString();
}
