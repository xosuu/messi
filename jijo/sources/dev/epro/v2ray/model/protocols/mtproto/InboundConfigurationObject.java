package dev.epro.v2ray.model.protocols.mtproto;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class InboundConfigurationObject {
    UserObject user;

    static {
        NativeUtil.classesInit0(60);
    }

    public native UserObject getUser();

    public native void setUser(UserObject userObject);

    public native String toString();
}
