package dev.epro.v2ray.bean.policy;

import java.util.Map;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class PolicyBean {
    Map<String, LevelBean> levels;
    Object system;

    static {
        NativeUtil.classesInit0(76);
    }

    public native Map<String, LevelBean> getLevels();

    public native Object getSystem();

    public native void setLevels(Map<String, LevelBean> map);

    public native void setSystem(Object obj);

    public native String toString();
}
