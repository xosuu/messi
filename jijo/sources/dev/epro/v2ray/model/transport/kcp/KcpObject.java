package dev.epro.v2ray.model.transport.kcp;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class KcpObject {
    Boolean congestion;
    Integer downlinkCapacity;
    HeaderObject header;
    Integer mtu;
    Integer readBufferSize;
    String seed;
    Integer tti;
    Integer uplinkCapacity;
    Integer writeBufferSize;

    static {
        NativeUtil.classesInit0(51);
    }

    public native Boolean getCongestion();

    public native Integer getDownlinkCapacity();

    public native HeaderObject getHeader();

    public native Integer getMtu();

    public native Integer getReadBufferSize();

    public native String getSeed();

    public native Integer getTti();

    public native Integer getUplinkCapacity();

    public native Integer getWriteBufferSize();

    public native void setCongestion(Boolean bool);

    public native void setDownlinkCapacity(Integer num);

    public native void setHeader(HeaderObject headerObject);

    public native void setMtu(Integer num);

    public native void setReadBufferSize(Integer num);

    public native void setSeed(String str);

    public native void setTti(Integer num);

    public native void setUplinkCapacity(Integer num);

    public native void setWriteBufferSize(Integer num);

    public native String toString();
}
