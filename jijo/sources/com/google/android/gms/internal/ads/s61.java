package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s61 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s61 f8810b = new s61();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f8811a = new AtomicReference(new c71(new yz(0)));

    public final Class a() {
        HashMap map = ((c71) this.f8811a.get()).f3227b;
        if (map.containsKey(a31.class)) {
            return ((e71) map.get(a31.class)).zza();
        }
        throw new GeneralSecurityException(fb1.i("No input primitive class for ", a31.class.toString(), " available"));
    }

    public final Object b(t.a aVar, Class cls) {
        c71 c71Var = (c71) this.f8811a.get();
        c71Var.getClass();
        b71 b71Var = new b71(aVar.getClass(), cls);
        HashMap map = c71Var.f3226a;
        if (map.containsKey(b71Var)) {
            return ((z61) map.get(b71Var)).f11168c.b(aVar);
        }
        throw new GeneralSecurityException(fb1.i("No PrimitiveConstructor for ", b71Var.toString(), " available"));
    }

    public final synchronized void c(z61 z61Var) {
        yz yzVar = new yz((c71) this.f8811a.get());
        yzVar.b(z61Var);
        this.f8811a.set(new c71(yzVar));
    }

    public final synchronized void d(e71 e71Var) {
        yz yzVar = new yz((c71) this.f8811a.get());
        Class clsZzb = e71Var.zzb();
        Map map = yzVar.f11074b;
        if (map.containsKey(clsZzb)) {
            e71 e71Var2 = (e71) map.get(clsZzb);
            if (!e71Var2.equals(e71Var) || !e71Var.equals(e71Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            map.put(clsZzb, e71Var);
        }
        this.f8811a.set(new c71(yzVar));
    }
}
