package dev.epro.v2ray.model.outbounds;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class MuxObject {
    Integer concurrency;
    Boolean enabled;

    static {
        NativeUtil.classesInit0(33);
    }

    public native Integer getConcurrency();

    public native Boolean getEnabled();

    public native void setConcurrency(Integer num);

    public native void setEnabled(Boolean bool);

    public native String toString();
}
