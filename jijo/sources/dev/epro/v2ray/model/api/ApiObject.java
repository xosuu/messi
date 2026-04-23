package dev.epro.v2ray.model.api;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ApiObject {
    List<String> services;
    String tag;

    static {
        NativeUtil.classesInit0(15);
    }

    public native List<String> getServices();

    public native String getTag();

    public native void setServices(List<String> list);

    public native void setTag(String str);

    public native String toString();
}
