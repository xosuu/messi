package dev.epro.v2ray.model.dns;

import java.util.List;
import java.util.Map;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class DnsObject {
    String clientIp;
    Boolean disableCache;
    Boolean disableFallback;
    Boolean disableFallbackIfMatch;
    Map<String, Object> hosts;
    String queryStrategy;
    List<Object> servers;
    String tag;

    static {
        NativeUtil.classesInit0(125);
    }

    public native String getClientIp();

    public native Boolean getDisableCache();

    public native Boolean getDisableFallback();

    public native Boolean getDisableFallbackIfMatch();

    public native Map<String, Object> getHosts();

    public native String getQueryStrategy();

    public native List<Object> getServers();

    public native String getTag();

    public native void setClientIp(String str);

    public native void setDisableCache(Boolean bool);

    public native void setDisableFallback(Boolean bool);

    public native void setDisableFallbackIfMatch(Boolean bool);

    public native void setHosts(Map<String, Object> map);

    public native void setQueryStrategy(String str);

    public native void setServers(List<Object> list);

    public native void setTag(String str);

    public native String toString();
}
