package dev.epro.v2ray.util;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class Result {
    String content;
    Boolean status;

    static {
        NativeUtil.classesInit0(72);
    }

    public Result(Boolean bool, String str) {
        this.status = bool;
        this.content = str;
    }

    public native String getContent();

    public native Boolean getStatus();

    public native void setContent(String str);

    public native void setStatus(Boolean bool);

    public native String toString();
}
