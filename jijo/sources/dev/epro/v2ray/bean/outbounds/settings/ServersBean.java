package dev.epro.v2ray.bean.outbounds.settings;

import java.util.List;
import java.util.Map;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class ServersBean {
    String address;
    int level;
    String method;
    boolean ota;
    String password;
    int port;
    List<Map<String, Object>> users;

    static {
        NativeUtil.classesInit0(71);
    }

    public native String getAddress();

    public native int getLevel();

    public native String getMethod();

    public native String getPassword();

    public native int getPort();

    public native List<Map<String, Object>> getUsers();

    public native boolean isOta();

    public native void setAddress(String str);

    public native void setLevel(int i10);

    public native void setMethod(String str);

    public native void setOta(boolean z9);

    public native void setPassword(String str);

    public native void setPort(int i10);

    public native void setUsers(List<Map<String, Object>> list);

    public native String toString();
}
