package dev.epro.v2ray.model.routing;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class RuleObject {
    String attrs;
    String balancerTag;
    String domainMatcher;
    List<String> domains;
    List<String> inboundTag;
    List<String> ip;
    String network;
    String outboundTag;
    String port;
    List<String> protocol;
    List<String> source;
    String sourcePort;
    String type;
    List<String> user;

    static {
        NativeUtil.classesInit0(120);
    }

    public native String getAttrs();

    public native String getBalancerTag();

    public native String getDomainMatcher();

    public native List<String> getDomains();

    public native List<String> getInboundTag();

    public native List<String> getIp();

    public native String getNetwork();

    public native String getOutboundTag();

    public native String getPort();

    public native List<String> getProtocol();

    public native List<String> getSource();

    public native String getSourcePort();

    public native String getType();

    public native List<String> getUser();

    public native void setAttrs(String str);

    public native void setBalancerTag(String str);

    public native void setDomainMatcher(String str);

    public native void setDomains(List<String> list);

    public native void setInboundTag(List<String> list);

    public native void setIp(List<String> list);

    public native void setNetwork(String str);

    public native void setOutboundTag(String str);

    public native void setPort(String str);

    public native void setProtocol(List<String> list);

    public native void setSource(List<String> list);

    public native void setSourcePort(String str);

    public native void setType(String str);

    public native void setUser(List<String> list);

    public native String toString();
}
