package dev.epro.v2ray.model.protocols.vmess;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ServerObject {
    String address;
    Integer port;
    List<UserObject> users;

    static {
        NativeUtil.classesInit0(212);
    }

    public native String getAddress();

    public native Integer getPort();

    public native List<UserObject> getUsers();

    public native void setAddress(String str);

    public native void setPort(Integer num);

    public native void setUsers(List<UserObject> list);

    public native String toString();
}
