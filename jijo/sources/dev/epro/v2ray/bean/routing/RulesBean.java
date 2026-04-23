package dev.epro.v2ray.bean.routing;

import java.util.ArrayList;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class RulesBean {
    ArrayList<String> domain;
    ArrayList<String> inboundTag;
    ArrayList<String> ip;
    String outboundTag;
    String port;
    String type;

    static {
        NativeUtil.classesInit0(13);
    }

    public RulesBean() {
    }

    public native ArrayList<String> getDomain();

    public native ArrayList<String> getInboundTag();

    public native ArrayList<String> getIp();

    public native String getOutboundTag();

    public native String getPort();

    public native String getType();

    public native void setDomain(ArrayList<String> arrayList);

    public native void setInboundTag(ArrayList<String> arrayList);

    public native void setIp(ArrayList<String> arrayList);

    public native void setOutboundTag(String str);

    public native void setPort(String str);

    public native void setType(String str);

    public native String toString();

    public RulesBean(String str, ArrayList<String> arrayList, String str2) {
        this.type = str;
        this.domain = arrayList;
        this.outboundTag = str2;
    }
}
