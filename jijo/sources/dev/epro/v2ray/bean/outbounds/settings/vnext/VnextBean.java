package dev.epro.v2ray.bean.outbounds.settings.vnext;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class VnextBean {
    String address;
    int port;
    List<UsersBean> users;

    static {
        NativeUtil.classesInit0(82);
    }

    public native String getAddress();

    public native int getPort();

    public native List<UsersBean> getUsers();

    public native void setAddress(String str);

    public native void setPort(int i10);

    public native void setUsers(List<UsersBean> list);

    public native String toString();
}
