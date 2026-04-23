package dev.epro.v2ray.util;

import dev.epro.v2ray.bean.LogBean;
import dev.epro.v2ray.bean.dns.DnsBean;
import dev.epro.v2ray.bean.inbounds.InboundBean;
import dev.epro.v2ray.bean.outbounds.OutboundBean;
import dev.epro.v2ray.bean.policy.PolicyBean;
import dev.epro.v2ray.bean.routing.RoutingBean;
import java.util.ArrayList;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class V2rayConfig {
    DnsBean dns;
    ArrayList<InboundBean> inbounds;
    LogBean log;
    ArrayList<OutboundBean> outbounds;
    PolicyBean policy;
    RoutingBean routing;
    Object stats;

    static {
        NativeUtil.classesInit0(88);
    }

    public native DnsBean getDns();

    public native ArrayList<InboundBean> getInbounds();

    public native LogBean getLog();

    public native ArrayList<OutboundBean> getOutbounds();

    public native PolicyBean getPolicy();

    public native RoutingBean getRouting();

    public native Object getStats();

    public native void setDns(DnsBean dnsBean);

    public native void setInbounds(ArrayList<InboundBean> arrayList);

    public native void setLog(LogBean logBean);

    public native void setOutbounds(ArrayList<OutboundBean> arrayList);

    public native void setPolicy(PolicyBean policyBean);

    public native void setRouting(RoutingBean routingBean);

    public native void setStats(Object obj);

    public native String toString();
}
