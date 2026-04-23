package dev.epro.v2ray.bean;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class LogBean {
    private String access;
    private String error;
    private String loglevel;

    static {
        NativeUtil.classesInit0(70);
    }

    public native String getAccess();

    public native String getError();

    public native String getLoglevel();

    public native void setAccess(String str);

    public native void setError(String str);

    public native void setLoglevel(String str);

    public native String toString();
}
