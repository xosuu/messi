package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ub0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f9451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f9452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f9453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f9454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f9455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f9456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh1 f9457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qh1 f9458j;

    public ub0(jy jyVar, nh1 nh1Var, nh1 nh1Var2, ry ryVar, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, nh1 nh1Var6, nh1 nh1Var7) {
        this.f9449a = 0;
        this.f9450b = jyVar;
        this.f9451c = nh1Var;
        this.f9452d = nh1Var2;
        this.f9453e = ryVar;
        this.f9454f = nh1Var3;
        this.f9455g = nh1Var4;
        this.f9456h = nh1Var5;
        this.f9457i = nh1Var6;
        this.f9458j = nh1Var7;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f9449a;
        qh1 qh1Var = this.f9458j;
        qh1 qh1Var2 = this.f9457i;
        qh1 qh1Var3 = this.f9456h;
        qh1 qh1Var4 = this.f9455g;
        qh1 qh1Var5 = this.f9454f;
        qh1 qh1Var6 = this.f9453e;
        qh1 qh1Var7 = this.f9452d;
        qh1 qh1Var8 = this.f9451c;
        qh1 qh1Var9 = this.f9450b;
        switch (i10) {
            case 0:
                return new rb0(((jy) qh1Var9).a(), (Executor) qh1Var8.zzb(), (y9) qh1Var7.zzb(), ((ry) qh1Var6).a(), zza.zza(), (lh0) qh1Var5.zzb(), (vt0) qh1Var4.zzb(), (ed0) qh1Var3.zzb(), (qh0) qh1Var2.zzb(), (pr0) qh1Var.zzb());
            case 1:
                Executor executor = (Executor) qh1Var9.zzb();
                Context contextA = ((jy) qh1Var8).a();
                WeakReference weakReference = ((ky) qh1Var7).f6412a.f5435d;
                tp1.b0(weakReference);
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new be0(executor, contextA, weakReference, muVar, (rc0) qh1Var6.zzb(), (ScheduledExecutorService) qh1Var5.zzb(), (jd0) qh1Var4.zzb(), ((ry) qh1Var3).a(), new b70(((oh1) ((c70) qh1Var2).f3225a).zzb()), (gt0) qh1Var.zzb());
            case 2:
                return new nl0((Context) qh1Var9.zzb(), (zzq) qh1Var8.zzb(), (String) qh1Var7.zzb(), (uq0) qh1Var6.zzb(), (kl0) qh1Var5.zzb(), (wq0) qh1Var4.zzb(), ((ry) qh1Var3).a(), (y9) qh1Var2.zzb(), (ed0) qh1Var.zzb());
            case 3:
                Context contextA2 = ((jy) qh1Var9).a();
                String str = ((g30) ((d40) qh1Var8).f3563a.zzb()).f4804b.f3107e;
                tp1.b0(str);
                return new xm0(contextA2, str, (String) qh1Var7.zzb(), (g30) qh1Var6.zzb(), (yr0) qh1Var5.zzb(), ((f40) qh1Var4).a(), (cd0) qh1Var3.zzb(), (k30) qh1Var2.zzb(), ((Long) qh1Var.zzb()).longValue());
            default:
                tj0 tj0Var = (tj0) qh1Var9.zzb();
                VersionInfoParcel versionInfoParcelA = ((ry) qh1Var8).a();
                String str2 = ((g30) ((d40) qh1Var7).f3563a.zzb()).f4804b.f3107e;
                tp1.b0(str2);
                return new ut0(tj0Var, versionInfoParcelA, str2, (String) qh1Var6.zzb(), (Context) qh1Var5.zzb(), ((e40) qh1Var4).f3854a.f11097d, (mr0) qh1Var3.zzb(), (y3.a) qh1Var2.zzb(), (y9) qh1Var.zzb());
        }
    }

    public ub0(nh1 nh1Var, jy jyVar, ky kyVar, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, ry ryVar, c70 c70Var, nh1 nh1Var5) {
        this.f9449a = 1;
        this.f9450b = nh1Var;
        this.f9451c = jyVar;
        this.f9452d = kyVar;
        this.f9453e = nh1Var2;
        this.f9454f = nh1Var3;
        this.f9455g = nh1Var4;
        this.f9456h = ryVar;
        this.f9457i = c70Var;
        this.f9458j = nh1Var5;
    }

    public /* synthetic */ ub0(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, nh1 nh1Var6, nh1 nh1Var7, nh1 nh1Var8, nh1 nh1Var9, int i10) {
        this.f9449a = i10;
        this.f9450b = nh1Var;
        this.f9451c = nh1Var2;
        this.f9452d = nh1Var3;
        this.f9453e = nh1Var4;
        this.f9454f = nh1Var5;
        this.f9455g = nh1Var6;
        this.f9456h = nh1Var7;
        this.f9457i = nh1Var8;
        this.f9458j = nh1Var9;
    }
}
