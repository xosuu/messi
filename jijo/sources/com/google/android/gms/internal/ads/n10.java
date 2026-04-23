package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n10 extends l10 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f7099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f7100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fx f7101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gr0 f7102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q20 f7103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r90 f7104o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r70 f7105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final eh1 f7106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Executor f7107r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zzq f7108s;

    public n10(jt jtVar, Context context, gr0 gr0Var, View view, fx fxVar, q20 q20Var, r90 r90Var, r70 r70Var, eh1 eh1Var, Executor executor) {
        super(jtVar);
        this.f7099j = context;
        this.f7100k = view;
        this.f7101l = fxVar;
        this.f7102m = gr0Var;
        this.f7103n = q20Var;
        this.f7104o = r90Var;
        this.f7105p = r70Var;
        this.f7106q = eh1Var;
        this.f7107r = executor;
    }

    @Override // com.google.android.gms.internal.ads.r20
    public final void a() {
        this.f7107r.execute(new s9(21, this));
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final int b() {
        return ((hr0) this.f8357a.f6383b.f10631d).f5373d;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final int c() {
        if (((Boolean) zzba.zzc().a(eg.Z6)).booleanValue() && this.f8358b.f4613g0) {
            if (!((Boolean) zzba.zzc().a(eg.f3941a7)).booleanValue()) {
                return 0;
            }
        }
        return ((hr0) this.f8357a.f6383b.f10631d).f5372c;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final View d() {
        return this.f7100k;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final com.google.android.gms.ads.internal.client.zzdq e() {
        try {
            return this.f7103n.zza();
        } catch (zzffn unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final gr0 f() {
        zzq zzqVar = this.f7108s;
        if (zzqVar != null) {
            return zzqVar.zzi ? new gr0(-3, 0, true) : new gr0(zzqVar.zze, zzqVar.zzb, false);
        }
        fr0 fr0Var = this.f8358b;
        if (fr0Var.f4605c0) {
            for (String str : fr0Var.f4600a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f7100k;
            return new gr0(view.getWidth(), view.getHeight(), false);
        }
        return (gr0) fr0Var.f4634r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final gr0 g() {
        return this.f7102m;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final void h() {
        this.f7105p.zza();
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final void i(FrameLayout frameLayout, zzq zzqVar) {
        fx fxVar;
        if (frameLayout == null || (fxVar = this.f7101l) == null) {
            return;
        }
        fxVar.t0(b4.c.a(zzqVar));
        frameLayout.setMinimumHeight(zzqVar.zzc);
        frameLayout.setMinimumWidth(zzqVar.zzf);
        this.f7108s = zzqVar;
    }
}
