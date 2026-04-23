package dev.epro.v2ray.bean.outbounds.stream.kcp;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class KcpSettingsBean {
    int mtu = 1350;
    int tti = 20;
    int uplinkCapacity = 12;
    int downlinkCapacity = 100;
    boolean congestion = false;
    int readBufferSize = 1;
    int writeBufferSize = 1;
    HeaderBean header = new HeaderBean();

    static {
        NativeUtil.classesInit0(68);
    }

    public native int getDownlinkCapacity();

    public native HeaderBean getHeader();

    public native int getMtu();

    public native int getReadBufferSize();

    public native int getTti();

    public native int getUplinkCapacity();

    public native int getWriteBufferSize();

    public native boolean isCongestion();

    public native void setCongestion(boolean z9);

    public native void setDownlinkCapacity(int i10);

    public native void setHeader(HeaderBean headerBean);

    public native void setMtu(int i10);

    public native void setReadBufferSize(int i10);

    public native void setTti(int i10);

    public native void setUplinkCapacity(int i10);

    public native void setWriteBufferSize(int i10);

    public native String toString();
}
