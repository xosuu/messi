package dev.epro.v2ray.model.protocols.blackhole;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class OutboundConfigurationObject {
    ResponseObject response;

    static {
        NativeUtil.classesInit0(6);
    }

    public native ResponseObject getResponse();

    public native void setResponse(ResponseObject responseObject);

    public native String toString();
}
