package dev.epro.v2ray.bean.outbounds.stream.tcp;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class HeaderBean {
    Object request;
    Object response;
    String type = "none";

    static {
        NativeUtil.classesInit0(136);
    }

    public native Object getRequest();

    public native Object getResponse();

    public native String getType();

    public native void setRequest(Object obj);

    public native void setResponse(Object obj);

    public native void setType(String str);

    public native String toString();
}
