package dev.epro.v2ray.model.inbounds;

import dev.epro.v2ray.model.transport.StreamSettingsObject;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class InboundObject {
    AllocateObject allocate;
    String listen;
    String port;
    String protocol;
    Object settings;
    SniffingObject sniffing;
    StreamSettingsObject streamSettings;
    String tag;

    static {
        NativeUtil.classesInit0(38);
    }

    public native AllocateObject getAllocate();

    public native String getListen();

    public native String getPort();

    public native String getProtocol();

    public native Object getSettings();

    public native SniffingObject getSniffing();

    public native StreamSettingsObject getStreamSettings();

    public native String getTag();

    public native void setAllocate(AllocateObject allocateObject);

    public native void setListen(String str);

    public native void setPort(String str);

    public native void setProtocol(String str);

    public native void setSettings(Object obj);

    public native void setSniffing(SniffingObject sniffingObject);

    public native void setStreamSettings(StreamSettingsObject streamSettingsObject);

    public native void setTag(String str);

    public native String toString();
}
