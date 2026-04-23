package dev.epro.v2ray.model.observatory;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ObservatoryObject {
    String probeInterval;
    String probeURL;
    List<String> subjectSelector;

    static {
        NativeUtil.classesInit0(119);
    }

    public native String getProbeInterval();

    public native String getProbeURL();

    public native List<String> getSubjectSelector();

    public native void setProbeInterval(String str);

    public native void setProbeURL(String str);

    public native void setSubjectSelector(List<String> list);

    public native String toString();
}
