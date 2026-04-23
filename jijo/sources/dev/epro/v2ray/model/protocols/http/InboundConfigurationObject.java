package dev.epro.v2ray.model.protocols.http;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class InboundConfigurationObject {
    List<AccountObject> accounts;
    Boolean allowTransparent;
    Integer timeout;
    Integer userLevel;

    static {
        NativeUtil.classesInit0(148);
    }

    public native List<AccountObject> getAccounts();

    public native Boolean getAllowTransparent();

    public native Integer getTimeout();

    public native Integer getUserLevel();

    public native void setAccounts(List<AccountObject> list);

    public native void setAllowTransparent(Boolean bool);

    public native void setTimeout(Integer num);

    public native void setUserLevel(Integer num);

    public native String toString();
}
