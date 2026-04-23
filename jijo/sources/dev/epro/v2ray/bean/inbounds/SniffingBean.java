package dev.epro.v2ray.bean.inbounds;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class SniffingBean {
    List<String> destOverride;
    boolean enabled;

    static {
        NativeUtil.classesInit0(146);
    }

    public native List<String> getDestOverride();

    public native boolean isEnabled();

    public native void setDestOverride(List<String> list);

    public native void setEnabled(boolean z9);

    public native String toString();
}
