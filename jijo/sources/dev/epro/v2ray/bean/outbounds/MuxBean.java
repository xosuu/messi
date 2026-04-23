package dev.epro.v2ray.bean.outbounds;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class MuxBean {
    boolean enabled;

    static {
        NativeUtil.classesInit0(193);
    }

    public native boolean isEnabled();

    public native void setEnabled(boolean z9);

    public native String toString();
}
