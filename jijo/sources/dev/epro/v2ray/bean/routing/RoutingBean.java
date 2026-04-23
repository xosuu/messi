package dev.epro.v2ray.bean.routing;

import java.util.ArrayList;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class RoutingBean {
    String domainStrategy;
    ArrayList<RulesBean> rules;

    static {
        NativeUtil.classesInit0(112);
    }

    public native String getDomainStrategy();

    public native ArrayList<RulesBean> getRules();

    public native void setDomainStrategy(String str);

    public native void setRules(ArrayList<RulesBean> arrayList);

    public native String toString();
}
