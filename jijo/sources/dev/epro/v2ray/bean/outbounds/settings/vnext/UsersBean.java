package dev.epro.v2ray.bean.outbounds.settings.vnext;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class UsersBean {
    int alterId;
    String id;
    int level;
    String security;

    static {
        NativeUtil.classesInit0(165);
    }

    public native int getAlterId();

    public native String getId();

    public native int getLevel();

    public native String getSecurity();

    public native void setAlterId(int i10);

    public native void setId(String str);

    public native void setLevel(int i10);

    public native void setSecurity(String str);

    public native String toString();
}
