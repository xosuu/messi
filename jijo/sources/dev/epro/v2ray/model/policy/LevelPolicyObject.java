package dev.epro.v2ray.model.policy;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class LevelPolicyObject {
    Integer bufferSize;
    Integer connIdle;
    Integer downlinkOnly;
    Integer handshake;
    Boolean statsUserDownlink;
    Boolean statsUserUplink;
    Integer uplinkOnly;

    static {
        NativeUtil.classesInit0(91);
    }

    public native Integer getBufferSize();

    public native Integer getConnIdle();

    public native Integer getDownlinkOnly();

    public native Integer getHandshake();

    public native Boolean getStatsUserDownlink();

    public native Boolean getStatsUserUplink();

    public native Integer getUplinkOnly();

    public native void setBufferSize(Integer num);

    public native void setConnIdle(Integer num);

    public native void setDownlinkOnly(Integer num);

    public native void setHandshake(Integer num);

    public native void setStatsUserDownlink(Boolean bool);

    public native void setStatsUserUplink(Boolean bool);

    public native void setUplinkOnly(Integer num);

    public native String toString();
}
