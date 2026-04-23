package dev.epro.v2ray.model.outbounds;

import dev.epro.v2ray.model.transport.StreamSettingsObject;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class OutboundObject {
    String domainStrategy;
    MuxObject mux;
    String protocol;
    ProxySettingsObject proxySettings;
    String sendThrough;
    Object settings;
    StreamSettingsObject streamSettings;
    String tag;

    static {
        NativeUtil.classesInit0(118);
    }

    public native String getDomainStrategy();

    public native MuxObject getMux();

    public native String getProtocol();

    public native ProxySettingsObject getProxySettings();

    public native String getSendThrough();

    public native Object getSettings();

    public native StreamSettingsObject getStreamSettings();

    public native String getTag();

    public native void setDomainStrategy(String str);

    public native void setMux(MuxObject muxObject);

    public native void setProtocol(String str);

    public native void setProxySettings(ProxySettingsObject proxySettingsObject);

    public native void setSendThrough(String str);

    public native void setSettings(Object obj);

    public native void setStreamSettings(StreamSettingsObject streamSettingsObject);

    public native void setTag(String str);

    public native String toString();
}
