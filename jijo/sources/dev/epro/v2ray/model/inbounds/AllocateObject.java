package dev.epro.v2ray.model.inbounds;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class AllocateObject {
    Integer concurrency;
    Integer refresh;
    String strategy;

    static {
        NativeUtil.classesInit0(223);
    }

    public native Integer getConcurrency();

    public native Integer getRefresh();

    public native String getStrategy();

    public native void setConcurrency(Integer num);

    public native void setRefresh(Integer num);

    public native void setStrategy(String str);

    public native String toString();
}
