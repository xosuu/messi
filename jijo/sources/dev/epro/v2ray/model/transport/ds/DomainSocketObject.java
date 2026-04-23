package dev.epro.v2ray.model.transport.ds;

import o5.b;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class DomainSocketObject {

    @b("abstract")
    Boolean abstractObject;
    Boolean padding;
    String path;

    static {
        NativeUtil.classesInit0(194);
    }

    public native Boolean getAbstractObject();

    public native Boolean getPadding();

    public native String getPath();

    public native void setAbstractObject(Boolean bool);

    public native void setPadding(Boolean bool);

    public native void setPath(String str);

    public native String toString();
}
