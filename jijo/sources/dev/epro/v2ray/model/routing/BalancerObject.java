package dev.epro.v2ray.model.routing;

import java.util.List;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class BalancerObject {
    List<String> selector;
    StrategyObject strategy;
    String tag;

    static {
        NativeUtil.classesInit0(41);
    }

    public native List<String> getSelector();

    public native StrategyObject getStrategy();

    public native String getTag();

    public native void setSelector(List<String> list);

    public native void setStrategy(StrategyObject strategyObject);

    public native void setTag(String str);

    public native String toString();
}
