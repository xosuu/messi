package dev.epro.v2ray.model;

import dev.epro.v2ray.model.api.ApiObject;
import dev.epro.v2ray.model.browserForwarder.BrowserForwarderObject;
import dev.epro.v2ray.model.dns.DnsObject;
import dev.epro.v2ray.model.fakeDns.FakeDnsObject;
import dev.epro.v2ray.model.inbounds.InboundObject;
import dev.epro.v2ray.model.log.LogObject;
import dev.epro.v2ray.model.observatory.ObservatoryObject;
import dev.epro.v2ray.model.outbounds.OutboundObject;
import dev.epro.v2ray.model.policy.PolicyObject;
import dev.epro.v2ray.model.reverse.ReverseObject;
import dev.epro.v2ray.model.routing.RoutingObject;
import dev.epro.v2ray.model.stats.StatsObject;
import dev.epro.v2ray.model.transport.TransportObject;
import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class V2Ray {
    ApiObject api;
    BrowserForwarderObject browserForwarder;
    DnsObject dns;
    List<FakeDnsObject> fakedns;
    List<InboundObject> inbounds;
    LogObject log;
    ObservatoryObject observatory;
    List<OutboundObject> outbounds;
    PolicyObject policy;
    ReverseObject reverse;
    RoutingObject routing;
    StatsObject stats;
    TransportObject transport;

    static {
        NativeUtil.classesInit0(8);
    }

    public native ApiObject getApi();

    public native BrowserForwarderObject getBrowserForwarder();

    public native DnsObject getDns();

    public native List<FakeDnsObject> getFakeDns();

    public native List<InboundObject> getInbounds();

    public native LogObject getLog();

    public native ObservatoryObject getObservatory();

    public native List<OutboundObject> getOutbounds();

    public native PolicyObject getPolicy();

    public native ReverseObject getReverse();

    public native RoutingObject getRouting();

    public native StatsObject getStats();

    public native TransportObject getTransport();

    public native void setApi(ApiObject apiObject);

    public native void setBrowserForwarder(BrowserForwarderObject browserForwarderObject);

    public native void setDns(DnsObject dnsObject);

    public native void setFakeDns(List<FakeDnsObject> list);

    public native void setInbounds(List<InboundObject> list);

    public native void setLog(LogObject logObject);

    public native void setObservatory(ObservatoryObject observatoryObject);

    public native void setOutbounds(List<OutboundObject> list);

    public native void setPolicy(PolicyObject policyObject);

    public native void setReverse(ReverseObject reverseObject);

    public native void setRouting(RoutingObject routingObject);

    public native void setStats(StatsObject statsObject);

    public native void setTransport(TransportObject transportObject);

    public native String toString();
}
