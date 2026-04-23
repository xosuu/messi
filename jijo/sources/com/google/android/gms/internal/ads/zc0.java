package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzj;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f11208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f11209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f11210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f11211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f11212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f11213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f11214h;

    public /* synthetic */ zc0(jh1 jh1Var, nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, nh1 nh1Var6, int i10) {
        this.f11207a = i10;
        this.f11208b = jh1Var;
        this.f11209c = nh1Var;
        this.f11210d = nh1Var2;
        this.f11211e = nh1Var3;
        this.f11212f = nh1Var4;
        this.f11213g = nh1Var5;
        this.f11214h = nh1Var6;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f11207a;
        qh1 qh1Var = this.f11214h;
        qh1 qh1Var2 = this.f11213g;
        qh1 qh1Var3 = this.f11212f;
        qh1 qh1Var4 = this.f11211e;
        qh1 qh1Var5 = this.f11210d;
        qh1 qh1Var6 = this.f11209c;
        qh1 qh1Var7 = this.f11208b;
        switch (i10) {
            case 0:
                Context contextA = ((jy) qh1Var7).a();
                sr0 sr0Var = (sr0) qh1Var6.zzb();
                ed0 ed0Var = (ed0) qh1Var5.zzb();
                kr0 kr0VarK = ((a30) qh1Var4).f2572a.k();
                tp1.b0(kr0VarK);
                return new yc0(contextA, sr0Var, ed0Var, kr0VarK, ((x20) qh1Var3).a(), (lh0) qh1Var2.zzb(), (String) qh1Var.zzb());
            case 1:
                return new cd0(((jy) qh1Var7).a(), (hd0) qh1Var6.zzb(), ((sy) qh1Var5).zzb(), ((f40) qh1Var4).a(), (String) qh1Var3.zzb(), (String) qh1Var2.zzb(), (zzj) qh1Var.zzb());
            case 2:
                return new li0((d10) qh1Var7.zzb(), (Context) qh1Var6.zzb(), (Executor) qh1Var5.zzb(), (kc0) qh1Var4.zzb(), ((f40) qh1Var3).a(), ((ry) qh1Var2).a(), new yk(), (qh0) qh1Var.zzb());
            case 3:
                return new li0((Context) qh1Var7.zzb(), ((ry) qh1Var6).a(), ((f40) qh1Var5).a(), (Executor) qh1Var4.zzb(), (i80) qh1Var3.zzb(), (kc0) qh1Var2.zzb(), new yk(), (qh0) qh1Var.zzb());
            case 4:
                return new li0((Context) qh1Var7.zzb(), ((ry) qh1Var6).a(), ((f40) qh1Var5).a(), (Executor) qh1Var4.zzb(), (ec0) qh1Var3.zzb(), (kc0) qh1Var2.zzb(), new yk(), (qh0) qh1Var.zzb());
            case 5:
                return new wp0((gy) qh1Var7.zzb(), (Context) qh1Var6.zzb(), (String) qh1Var5.zzb(), (tp0) qh1Var4.zzb(), (sp0) qh1Var3.zzb(), ((ry) qh1Var2).a(), (ed0) qh1Var.zzb());
            default:
                return new yp0((Context) qh1Var7.zzb(), (Executor) qh1Var6.zzb(), (zzq) qh1Var5.zzb(), (gy) qh1Var4.zzb(), (kl0) qh1Var3.zzb(), (ml0) qh1Var2.zzb(), new nr0(), (k60) qh1Var.zzb());
        }
    }

    public /* synthetic */ zc0(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, nh1 nh1Var6, nh1 nh1Var7, int i10) {
        this.f11207a = i10;
        this.f11208b = nh1Var;
        this.f11209c = nh1Var2;
        this.f11210d = nh1Var3;
        this.f11211e = nh1Var4;
        this.f11212f = nh1Var5;
        this.f11213g = nh1Var6;
        this.f11214h = nh1Var7;
    }
}
