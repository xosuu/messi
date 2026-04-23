package team.dev.epro.apkcustom.widgets;

import android.net.wifi.WifiManager;
import java.lang.reflect.Method;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f17445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f17446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f17447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f17448e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WifiManager f17449a;

    static {
        for (Method method : WifiManager.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equals(Crypt.a(Crypt.xrc("\u001cm<KhmKhjJl8\u001cj;H;j\u001bhjJ<<L=kK:>\u001d9")))) {
                f17445b = method;
            } else if (name.equals(Crypt.a(Crypt.xrc("Kg9\u001e<?H9cH:mAmoM=8\u001a;kOob\u001b<8IjoJh")))) {
                f17446c = method;
            } else if (name.equals(Crypt.a(Crypt.xrc("\u001a=nO>n\u001di8\u001am?Nm<\u001b<nOlo\u001ag8JgbH=m\u001bjcNfiJomA<oHl<HjnL>kI;<\u001c;>\u001e9mM=;\u001e")))) {
                f17447d = method;
            } else if (name.equals(Crypt.a(Crypt.xrc("Nf9Ol9H>nKj8Og>AhiLlm\u001chlJii\u001elcM9hAg?@hc\u001b:?\u001d>n@=<\u001cjmNn;JocI>>Mgc\u001c")))) {
                f17448e = method;
            }
        }
    }
}
