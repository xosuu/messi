package dev.epro.v2ray.model.fakeDns;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class FakeDnsObject {
    String ipPool;
    Integer poolSize;

    static {
        NativeUtil.classesInit0(115);
    }

    public native String getIpPool();

    public native Integer getPoolSize();

    public native void setIpPool(String str);

    public native void setPoolSize(Integer num);

    public native String toString();
}
