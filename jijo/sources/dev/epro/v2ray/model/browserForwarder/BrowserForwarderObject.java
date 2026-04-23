package dev.epro.v2ray.model.browserForwarder;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class BrowserForwarderObject {
    String listenAddr;
    Integer listenPort;

    static {
        NativeUtil.classesInit0(133);
    }

    public native String getListenAddr();

    public native Integer getListenPort();

    public native void setListenAddr(String str);

    public native void setListenPort(Integer num);

    public native String toString();
}
