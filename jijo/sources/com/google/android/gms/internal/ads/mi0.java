package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class mi0 implements j80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VersionInfoParcel f6968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n5.a f6969b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fr0 f6970d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fx f6971f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final or0 f6972h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yk f6973q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f6974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qh0 f6975t;

    public mi0(VersionInfoParcel versionInfoParcel, qu quVar, fr0 fr0Var, nx nxVar, or0 or0Var, boolean z9, yk ykVar, qh0 qh0Var) {
        this.f6968a = versionInfoParcel;
        this.f6969b = quVar;
        this.f6970d = fr0Var;
        this.f6971f = nxVar;
        this.f6972h = or0Var;
        this.f6974s = z9;
        this.f6973q = ykVar;
        this.f6975t = qh0Var;
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void h(boolean z9, Context context, s40 s40Var) {
        boolean z10;
        int i10;
        c10 c10Var = (c10) tc1.t0(this.f6969b);
        this.f6971f.P(true);
        yk ykVar = this.f6973q;
        boolean z11 = this.f6974s;
        boolean zC = z11 ? ykVar.c(true) : true;
        if (z11) {
            synchronized (ykVar) {
                z10 = ykVar.f10920b;
            }
        } else {
            z10 = false;
        }
        float fA = z11 ? ykVar.a() : 0.0f;
        fr0 fr0Var = this.f6970d;
        zzk zzkVar = new zzk(zC, true, z10, fA, -1, z9, fr0Var.O, false);
        if (s40Var != null) {
            s40Var.zzf();
        }
        zzu.zzi();
        h80 h80Var = (h80) ((az) c10Var).L.zzb();
        fx fxVar = this.f6971f;
        int i11 = fr0Var.Q;
        or0 or0Var = this.f6972h;
        if (i11 == -1) {
            zzw zzwVar = or0Var.f7650j;
            if (zzwVar != null) {
                int i12 = zzwVar.zza;
                if (i12 == 1) {
                    i10 = 7;
                } else if (i12 == 2) {
                    i10 = 6;
                }
            }
            zzm.zze("Error setting app open orientation; no targeting orientation available.");
            i11 = fr0Var.Q;
            i10 = i11;
        } else {
            i10 = i11;
        }
        VersionInfoParcel versionInfoParcel = this.f6968a;
        String str = fr0Var.B;
        ir0 ir0Var = fr0Var.f4636s;
        zzn.zza(context, new AdOverlayInfoParcel((zza) null, h80Var, (zzaa) null, fxVar, i10, versionInfoParcel, str, zzkVar, ir0Var.f5680b, ir0Var.f5679a, or0Var.f7646f, s40Var, fr0Var.f4617i0 ? this.f6975t : null), true);
    }
}
