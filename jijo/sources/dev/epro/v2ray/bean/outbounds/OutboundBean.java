package dev.epro.v2ray.bean.outbounds;

import dev.epro.v2ray.bean.outbounds.settings.OutSettingsBean;
import dev.epro.v2ray.bean.outbounds.stream.StreamSettingsBean;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class OutboundBean {
    MuxBean mux;
    String protocol;
    OutSettingsBean settings;
    StreamSettingsBean streamSettings;
    String tag;

    static {
        NativeUtil.classesInit0(228);
    }

    public native MuxBean getMux();

    public native String getProtocol();

    public native String getServerAddress();

    public native Integer getServerPort();

    public native OutSettingsBean getSettings();

    public native StreamSettingsBean getStreamSettings();

    public native String getTag();

    public native void setMux(MuxBean muxBean);

    public native void setProtocol(String str);

    public native void setSettings(OutSettingsBean outSettingsBean);

    public native void setStreamSettings(StreamSettingsBean streamSettingsBean);

    public native void setTag(String str);

    public native String toString();
}
