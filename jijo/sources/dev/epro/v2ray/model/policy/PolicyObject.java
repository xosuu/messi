package dev.epro.v2ray.model.policy;

import java.util.Map;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class PolicyObject {
    Map<String, LevelPolicyObject> levels;
    SystemPolicyObject system;

    static {
        NativeUtil.classesInit0(225);
    }

    public native Map<String, LevelPolicyObject> getLevels();

    public native SystemPolicyObject getSystem();

    public native void setLevels(Map<String, LevelPolicyObject> map);

    public native void setSystem(SystemPolicyObject systemPolicyObject);

    public native String toString();
}
