package dev.epro.v2ray.model.protocols.freedom;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class OutboundConfigurationObject {
    String domainStrategy;
    String redirect;
    Integer userLevel;

    static {
        NativeUtil.classesInit0(79);
    }

    public native String getDomainStrategy();

    public native String getRedirect();

    public native Integer getUserLevel();

    public native void setDomainStrategy(String str);

    public native void setRedirect(String str);

    public native void setUserLevel(Integer num);

    public native String toString();
}
