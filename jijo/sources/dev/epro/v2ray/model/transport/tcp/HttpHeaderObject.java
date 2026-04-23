package dev.epro.v2ray.model.transport.tcp;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class HttpHeaderObject {
    HTTPRequestObject request;
    HTTPResponseObject response;
    String type;

    static {
        NativeUtil.classesInit0(26);
    }

    public native HTTPRequestObject getRequest();

    public native HTTPResponseObject getResponse();

    public native String getType();

    public native void setRequest(HTTPRequestObject hTTPRequestObject);

    public native void setResponse(HTTPResponseObject hTTPResponseObject);

    public native void setType(String str);

    public native String toString();
}
