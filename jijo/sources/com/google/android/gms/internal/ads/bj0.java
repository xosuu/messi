package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bj0 implements j80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3028b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3029d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3030f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f3031h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f3032q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f3033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f3034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f3035u;

    public bj0(Context context, VersionInfoParcel versionInfoParcel, qu quVar, fr0 fr0Var, nx nxVar, or0 or0Var, boolean z9, yk ykVar, qh0 qh0Var) {
        this.f3028b = context;
        this.f3029d = versionInfoParcel;
        this.f3030f = quVar;
        this.f3031h = fr0Var;
        this.f3032q = nxVar;
        this.f3033s = or0Var;
        this.f3034t = ykVar;
        this.f3027a = z9;
        this.f3035u = qh0Var;
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void h(boolean z9, Context context, s40 s40Var) {
        boolean z10;
        boolean z11;
        a80 a80Var = (a80) tc1.t0((n5.a) this.f3030f);
        fx fxVar = (fx) this.f3032q;
        fxVar.P(true);
        boolean z12 = this.f3027a;
        Object obj = this.f3034t;
        boolean zC = z12 ? ((yk) obj).c(false) : false;
        zzu.zzp();
        Context context2 = (Context) this.f3028b;
        boolean z13 = this.f3027a;
        boolean zZzI = zzt.zzI(context2);
        if (z13) {
            yk ykVar = (yk) obj;
            synchronized (ykVar) {
                z11 = ykVar.f10920b;
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        float fA = this.f3027a ? ((yk) obj).a() : 0.0f;
        fr0 fr0Var = (fr0) this.f3031h;
        zzk zzkVar = new zzk(zC, zZzI, z10, fA, -1, z9, fr0Var.O, false);
        if (s40Var != null) {
            s40Var.zzf();
        }
        zzu.zzi();
        h80 h80Var = (h80) ((kz) a80Var).L.zzb();
        VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.f3029d;
        int i10 = fr0Var.Q;
        String str = fr0Var.B;
        ir0 ir0Var = fr0Var.f4636s;
        zzn.zza(context, new AdOverlayInfoParcel((zza) null, h80Var, (zzaa) null, fxVar, i10, versionInfoParcel, str, zzkVar, ir0Var.f5680b, ir0Var.f5679a, ((or0) this.f3033s).f7646f, s40Var, fr0Var.f4617i0 ? (qh0) this.f3035u : null), true);
    }

    public bj0() {
        this.f3028b = new HashMap();
        this.f3029d = new HashMap();
        this.f3030f = new HashMap();
        this.f3031h = new HashSet();
        this.f3032q = new HashSet();
        this.f3033s = new HashSet();
        this.f3034t = new HashMap();
        this.f3035u = new WeakHashMap();
    }
}
