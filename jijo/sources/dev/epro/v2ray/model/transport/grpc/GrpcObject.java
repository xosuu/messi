package dev.epro.v2ray.model.transport.grpc;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class GrpcObject {
    String serviceName;

    static {
        NativeUtil.classesInit0(217);
    }

    public native String getServiceName();

    public native void setServiceName(String str);

    public native String toString();
}
