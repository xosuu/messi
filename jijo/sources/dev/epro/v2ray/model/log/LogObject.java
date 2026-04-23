package dev.epro.v2ray.model.log;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class LogObject {
    String access;
    String error;
    String loglevel;

    static {
        NativeUtil.classesInit0(126);
    }

    public native String getAccess();

    public native String getError();

    public native String getLoglevel();

    public native void setAccess(String str);

    public native void setError(String str);

    public native void setLoglevel(String str);

    public native String toString();
}
