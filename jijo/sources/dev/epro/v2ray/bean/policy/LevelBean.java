package dev.epro.v2ray.bean.policy;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class LevelBean {
    Integer connIdle;
    Integer downlinkOnly;
    Integer handshake;
    Integer uplinkOnly;

    static {
        NativeUtil.classesInit0(52);
    }

    public native Integer getConnIdle();

    public native Integer getDownlinkOnly();

    public native Integer getHandshake();

    public native Integer getUplinkOnly();

    public native void setConnIdle(Integer num);

    public native void setDownlinkOnly(Integer num);

    public native void setHandshake(Integer num);

    public native void setUplinkOnly(Integer num);

    public native String toString();
}
