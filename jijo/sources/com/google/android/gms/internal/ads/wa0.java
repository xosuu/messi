package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wa0 implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzq f10136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr0 f10137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr0 f10138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f10139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f10140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10141g;

    public /* synthetic */ wa0(Object obj, zzq zzqVar, fr0 fr0Var, hr0 hr0Var, String str, String str2, int i10) {
        this.f10135a = i10;
        this.f10141g = obj;
        this.f10136b = zzqVar;
        this.f10137c = fr0Var;
        this.f10138d = hr0Var;
        this.f10139e = str;
        this.f10140f = str2;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final n5.a zza(Object obj) {
        int i10 = this.f10135a;
        String str = this.f10140f;
        String str2 = this.f10139e;
        hr0 hr0Var = this.f10138d;
        fr0 fr0Var = this.f10137c;
        zzq zzqVar = this.f10136b;
        Object obj2 = this.f10141g;
        switch (i10) {
            case 0:
                xa0 xa0Var = (xa0) obj2;
                nx nxVarA = xa0Var.f10510j.a(zzqVar, fr0Var, hr0Var);
                ed edVar = new ed(nxVarA);
                vb0 vb0Var = xa0Var.f10512l.f10532a;
                nxVarA.g().E(vb0Var, vb0Var, vb0Var, vb0Var, vb0Var, false, null, new zzb(xa0Var.f10501a, null, null), null, null, xa0Var.f10515o, xa0Var.f10514n, xa0Var.f10513m, null, vb0Var, null, null, null, null);
                nxVarA.l0("/getNativeAdViewSignals", vk.f9895s);
                nxVarA.l0("/getNativeClickMeta", vk.f9896t);
                nxVarA.g().f5715s = new aa(12, edVar);
                nxVarA.s0(str2, str);
                return edVar;
            default:
                fb0 fb0Var = (fb0) obj2;
                nx nxVarA2 = fb0Var.f4442c.a(zzqVar, fr0Var, hr0Var);
                ed edVar2 = new ed(nxVarA2);
                if (fb0Var.f4440a.f7642b != null) {
                    fb0Var.a(nxVarA2);
                    nxVarA2.t0(new b4.c(5, 0, 0, 3));
                } else {
                    vb0 vb0Var2 = fb0Var.f4443d.f10532a;
                    nxVarA2.g().E(vb0Var2, vb0Var2, vb0Var2, vb0Var2, vb0Var2, false, null, new zzb(fb0Var.f4444e, null, null), null, null, fb0Var.f4447h, fb0Var.f4446g, fb0Var.f4445f, null, vb0Var2, null, null, null, null);
                    fb0.b(nxVarA2);
                }
                nxVarA2.g().f5715s = new bb0(fb0Var, nxVarA2, edVar2, 1);
                nxVarA2.s0(str2, str);
                return edVar2;
        }
    }
}
