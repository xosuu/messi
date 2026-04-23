package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o80 implements t20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f7533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f7534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r90 f7535e;

    public o80(Map map, Map map2, Map map3, qh1 qh1Var, r90 r90Var) {
        this.f7531a = map;
        this.f7532b = map2;
        this.f7533c = map3;
        this.f7534d = qh1Var;
        this.f7535e = r90Var;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final ci0 a(int i10, String str) {
        ci0 ci0VarA;
        ci0 ci0Var = (ci0) this.f7531a.get(str);
        if (ci0Var != null) {
            return ci0Var;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            hj0 hj0Var = (hj0) this.f7533c.get(str);
            if (hj0Var != null) {
                return new di0(hj0Var, new b3(5));
            }
            ci0VarA = (ci0) this.f7532b.get(str);
            if (ci0VarA == null) {
                return null;
            }
        } else if (this.f7535e.f8540d == null || (ci0VarA = ((t20) this.f7534d.zzb()).a(i10, str)) == null) {
            return null;
        }
        return new di0(ci0VarA, new b3(6));
    }
}
