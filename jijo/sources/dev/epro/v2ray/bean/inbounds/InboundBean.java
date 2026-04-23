package dev.epro.v2ray.bean.inbounds;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class InboundBean {
    String listen;
    int port;
    String protocol;
    InSettingsBean settings;
    SniffingBean sniffing;
    String tag;

    static {
        NativeUtil.classesInit0(175);
    }

    public native String getListen();

    public native int getPort();

    public native String getProtocol();

    public native InSettingsBean getSettings();

    public native SniffingBean getSniffing();

    public native String getTag();

    public native void setListen(String str);

    public native void setPort(int i10);

    public native void setProtocol(String str);

    public native void setSettings(InSettingsBean inSettingsBean);

    public native void setSniffing(SniffingBean sniffingBean);

    public native void setTag(String str);

    public native String toString();
}
