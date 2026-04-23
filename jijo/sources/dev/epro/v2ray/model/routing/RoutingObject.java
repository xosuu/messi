package dev.epro.v2ray.model.routing;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class RoutingObject {
    List<BalancerObject> balancers;
    String domainMatcher;
    String domainStrategy;
    List<RuleObject> rules;

    static {
        NativeUtil.classesInit0(234);
    }

    public native List<BalancerObject> getBalancers();

    public native String getDomainMatcher();

    public native String getDomainStrategy();

    public native List<RuleObject> getRules();

    public native void setBalancers(List<BalancerObject> list);

    public native void setDomainMatcher(String str);

    public native void setDomainStrategy(String str);

    public native void setRules(List<RuleObject> list);

    public native String toString();
}
