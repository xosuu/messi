package dev.epro.v2ray.model.protocols.vless;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class UserObject {
    String encryption;
    String flow;
    String id;
    Integer level;

    static {
        NativeUtil.classesInit0(147);
    }

    public native String getEncryption();

    public native String getFlow();

    public native String getId();

    public native Integer getLevel();

    public native void setEncryption(String str);

    public native void setFlow(String str);

    public native void setId(String str);

    public native void setLevel(Integer num);

    public native String toString();
}
