package dev.epro.v2ray.model.protocols.vmess;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class UserObject {
    Integer alterId;
    String id;
    Integer level;
    String security;

    static {
        NativeUtil.classesInit0(84);
    }

    public native Integer getAlterId();

    public native String getId();

    public native Integer getLevel();

    public native String getSecurity();

    public native void setAlterId(Integer num);

    public native void setId(String str);

    public native void setLevel(Integer num);

    public native void setSecurity(String str);

    public native String toString();
}
