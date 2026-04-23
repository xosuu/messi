package dev.epro.v2ray.model.policy;

import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class SystemPolicyObject {
    Boolean statsInboundDownlink;
    Boolean statsInboundUplink;
    Boolean statsOutboundDownlink;
    Boolean statsOutboundUplink;

    static {
        NativeUtil.classesInit0(59);
    }

    public native Boolean getStatsInboundDownlink();

    public native Boolean getStatsInboundUplink();

    public native Boolean getStatsOutboundDownlink();

    public native Boolean getStatsOutboundUplink();

    public native void setStatsInboundDownlink(Boolean bool);

    public native void setStatsInboundUplink(Boolean bool);

    public native void setStatsOutboundDownlink(Boolean bool);

    public native void setStatsOutboundUplink(Boolean bool);

    public native String toString();
}
