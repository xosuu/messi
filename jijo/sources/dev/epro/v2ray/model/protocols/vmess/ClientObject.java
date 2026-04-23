package dev.epro.v2ray.model.protocols.vmess;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ClientObject {
    Integer alterId;
    String email;
    String id;
    Integer level;

    static {
        NativeUtil.classesInit0(56);
    }

    public native Integer getAlterId();

    public native String getEmail();

    public native String getId();

    public native Integer getLevel();

    public native void setAlterId(Integer num);

    public native void setEmail(String str);

    public native void setId(String str);

    public native void setLevel(Integer num);

    public native String toString();
}
