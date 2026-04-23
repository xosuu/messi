package dev.epro.v2ray.model.protocols.http;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ServerObject {
    String address;
    Integer port;
    List<AccountObject> users;

    static {
        NativeUtil.classesInit0(129);
    }

    public native String getAddress();

    public native Integer getPort();

    public native List<AccountObject> getUsers();

    public native void setAddress(String str);

    public native void setPort(Integer num);

    public native void setUsers(List<AccountObject> list);

    public native String toString();
}
