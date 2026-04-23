package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t61 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t61 f9074b = (t61) zzgnz.a(new pe(4));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f9075a = new AtomicReference(new l71(new xq(28)));

    public final t.a a(f71 f71Var) throws GeneralSecurityException {
        l71 l71Var = (l71) this.f9075a.get();
        l71Var.getClass();
        j71 j71Var = new j71(f71.class, f71Var.f4422b);
        HashMap map = l71Var.f6528b;
        if (map.containsKey(j71Var)) {
            return ((a61) map.get(j71Var)).f2611c.d(f71Var);
        }
        throw new GeneralSecurityException(fb1.i("No Key Parser for requested key type ", j71Var.toString(), " available"));
    }

    public final l31 b(g71 g71Var) throws GeneralSecurityException {
        l71 l71Var = (l71) this.f9075a.get();
        l71Var.getClass();
        j71 j71Var = new j71(g71.class, g71Var.f4842a);
        HashMap map = l71Var.f6530d;
        if (map.containsKey(j71Var)) {
            return ((v61) map.get(j71Var)).f9792c.j(g71Var);
        }
        throw new GeneralSecurityException(fb1.i("No Parameters Parser for requested key type ", j71Var.toString(), " available"));
    }

    public final i71 c(t.a aVar) throws GeneralSecurityException {
        l71 l71Var = (l71) this.f9075a.get();
        l71Var.getClass();
        k71 k71Var = new k71(aVar.getClass(), f71.class);
        HashMap map = l71Var.f6527a;
        if (map.containsKey(k71Var)) {
            return ((c61) map.get(k71Var)).f3223c.b(aVar);
        }
        throw new GeneralSecurityException(fb1.i("No Key serializer for ", k71Var.toString(), " available"));
    }

    public final i71 d(t31 t31Var) throws GeneralSecurityException {
        l71 l71Var = (l71) this.f9075a.get();
        l71Var.getClass();
        k71 k71Var = new k71(t31Var.getClass(), g71.class);
        HashMap map = l71Var.f6529c;
        if (map.containsKey(k71Var)) {
            return ((x61) map.get(k71Var)).f10462c.g(t31Var);
        }
        throw new GeneralSecurityException(fb1.i("No Key Format serializer for ", k71Var.toString(), " available"));
    }

    public final synchronized void e(a61 a61Var) {
        xq xqVar = new xq((l71) this.f9075a.get());
        xqVar.f(a61Var);
        this.f9075a.set(new l71(xqVar));
    }

    public final synchronized void f(c61 c61Var) {
        xq xqVar = new xq((l71) this.f9075a.get());
        xqVar.n(c61Var);
        this.f9075a.set(new l71(xqVar));
    }

    public final synchronized void g(v61 v61Var) {
        xq xqVar = new xq((l71) this.f9075a.get());
        xqVar.r(v61Var);
        this.f9075a.set(new l71(xqVar));
    }

    public final synchronized void h(x61 x61Var) {
        xq xqVar = new xq((l71) this.f9075a.get());
        xqVar.y(x61Var);
        this.f9075a.set(new l71(xqVar));
    }
}
