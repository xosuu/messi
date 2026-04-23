package dev.epro.v2ray.model.protocols.vmess;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class DefaultObject {
    Integer alterId;
    Integer level;

    static {
        NativeUtil.classesInit0(44);
    }

    public native Integer getAlterId();

    public native Integer getLevel();

    public native void setAlterId(Integer num);

    public native void setLevel(Integer num);

    public native String toString();
}
