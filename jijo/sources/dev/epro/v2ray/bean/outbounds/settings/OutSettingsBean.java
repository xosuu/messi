package dev.epro.v2ray.bean.outbounds.settings;

import dev.epro.v2ray.bean.outbounds.settings.vnext.VnextBean;
import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class OutSettingsBean {
    Response response;
    List<ServersBean> servers;
    List<VnextBean> vnext;

    static {
        NativeUtil.classesInit0(123);
    }

    public native Response getResponse();

    public native List<ServersBean> getServers();

    public native List<VnextBean> getVnext();

    public native void setResponse(Response response);

    public native void setServers(List<ServersBean> list);

    public native void setVnext(List<VnextBean> list);

    public native String toString();
}
