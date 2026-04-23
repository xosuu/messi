package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gb0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f4859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f4860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f4861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f4862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f4863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f4864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f4865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh1 f4866i;

    public gb0(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, ry ryVar, nh1 nh1Var5, nh1 nh1Var6, jh1 jh1Var, nh1 nh1Var7, nh1 nh1Var8, int i10) {
        this.f4858a = i10;
        if (i10 != 3) {
            this.f4859b = nh1Var2;
            this.f4860c = nh1Var3;
            this.f4861d = nh1Var4;
            this.f4862e = ryVar;
            this.f4863f = nh1Var6;
            this.f4864g = jh1Var;
            this.f4865h = nh1Var7;
            this.f4866i = nh1Var8;
            return;
        }
        this.f4859b = nh1Var;
        this.f4860c = nh1Var2;
        this.f4861d = nh1Var3;
        this.f4862e = nh1Var4;
        this.f4863f = ryVar;
        this.f4864g = nh1Var5;
        this.f4865h = nh1Var6;
        this.f4866i = nh1Var8;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f4858a;
        qh1 qh1Var = this.f4866i;
        qh1 qh1Var2 = this.f4865h;
        qh1 qh1Var3 = this.f4864g;
        qh1 qh1Var4 = this.f4863f;
        qh1 qh1Var5 = this.f4862e;
        qh1 qh1Var6 = this.f4861d;
        qh1 qh1Var7 = this.f4860c;
        qh1 qh1Var8 = this.f4859b;
        switch (i10) {
            case 0:
                return new fb0(((f40) qh1Var8).a(), (Executor) qh1Var7.zzb(), (kc0) qh1Var6.zzb(), (Context) qh1Var5.zzb(), (ed0) qh1Var4.zzb(), (vt0) qh1Var3.zzb(), (lh0) qh1Var2.zzb(), (xb0) qh1Var.zzb());
            case 1:
                return new qb0((j40) qh1Var8.zzb(), (b50) qh1Var7.zzb(), (i50) qh1Var6.zzb(), (l50) qh1Var5.zzb(), (j60) qh1Var4.zzb(), ((x20) qh1Var3).a(), ((z20) qh1Var2).f11093a.h(), (n00) qh1Var.zzb());
            case 2:
                return new kc0((Context) qh1Var8.zzb(), (y9) qh1Var7.zzb(), (ug) qh1Var6.zzb(), ((ry) qh1Var5).a(), zza.zza(), (kd) qh1Var4.zzb(), (r50) qh1Var3.zzb(), (qh0) qh1Var2.zzb(), (pr0) qh1Var.zzb());
            case 3:
                return new le0((me0) qh1Var8.zzb(), (we0) qh1Var7.zzb(), (de0) qh1Var6.zzb(), ((jy) qh1Var5).a(), ((ry) qh1Var4).a(), (ie0) qh1Var3.zzb(), (te0) qh1Var2.zzb(), new ot(), new ot(), ((oy) qh1Var).zzb());
            case 4:
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new ko0(muVar, (ScheduledExecutorService) qh1Var8.zzb(), (String) qh1Var7.zzb(), (zk0) qh1Var6.zzb(), (Context) qh1Var5.zzb(), ((f40) qh1Var4).a(), (xk0) qh1Var3.zzb(), (rc0) qh1Var2.zzb(), (ce0) qh1Var.zzb());
            default:
                return new br0((String) qh1Var8.zzb(), (yq0) qh1Var7.zzb(), (Context) qh1Var6.zzb(), (wq0) qh1Var5.zzb(), (lr0) qh1Var4.zzb(), ((ry) qh1Var3).a(), (y9) qh1Var2.zzb(), (ed0) qh1Var.zzb());
        }
    }

    public gb0(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, nh1 nh1Var6, nh1 nh1Var7, nh1 nh1Var8) {
        this.f4858a = 4;
        this.f4859b = nh1Var;
        this.f4860c = nh1Var2;
        this.f4861d = nh1Var3;
        this.f4862e = nh1Var4;
        this.f4863f = nh1Var5;
        this.f4864g = nh1Var6;
        this.f4865h = nh1Var7;
        this.f4866i = nh1Var8;
    }

    public /* synthetic */ gb0(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, nh1 nh1Var6, nh1 nh1Var7, nh1 nh1Var8, int i10) {
        this.f4858a = i10;
        this.f4859b = nh1Var;
        this.f4860c = nh1Var2;
        this.f4861d = nh1Var3;
        this.f4862e = nh1Var4;
        this.f4863f = nh1Var5;
        this.f4864g = nh1Var6;
        this.f4865h = nh1Var7;
        this.f4866i = nh1Var8;
    }
}
