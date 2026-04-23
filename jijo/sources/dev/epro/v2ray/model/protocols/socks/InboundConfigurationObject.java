package dev.epro.v2ray.model.protocols.socks;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class InboundConfigurationObject {
    AccountObject accounts;
    String auth;
    String ip;
    Boolean udp;
    Integer userLevel;

    static {
        NativeUtil.classesInit0(62);
    }

    public native AccountObject getAccounts();

    public native String getAuth();

    public native String getIp();

    public native Boolean getUdp();

    public native Integer getUserLevel();

    public native void setAccounts(AccountObject accountObject);

    public native void setAuth(String str);

    public native void setIp(String str);

    public native void setUdp(Boolean bool);

    public native void setUserLevel(Integer num);

    public native String toString();
}
