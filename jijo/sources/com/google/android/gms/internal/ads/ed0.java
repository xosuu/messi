package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ed0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd0 f3907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f3908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3909c;

    public ed0(hd0 hd0Var, mu muVar) {
        this.f3907a = hd0Var;
        hd0Var.getClass();
        this.f3909c = new HashMap(hd0Var.f5568a);
        this.f3908b = muVar;
    }

    public final m20 a() {
        m20 m20Var = new m20(this);
        ((Map) m20Var.f6809b).putAll(((ed0) m20Var.f6810d).f3909c);
        return m20Var;
    }

    public final void b() {
        if (((Boolean) zzba.zzc().a(eg.Ka)).booleanValue()) {
            m20 m20VarA = a();
            m20VarA.f("action", "pecr");
            m20VarA.h();
        }
    }
}
