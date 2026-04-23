package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzay;

/* JADX INFO: loaded from: classes.dex */
public final class p30 implements u50, v70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final or0 f7785b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f7786d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzg f7787f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final be0 f7788h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gt0 f7789q;

    public p30(Context context, or0 or0Var, VersionInfoParcel versionInfoParcel, zzj zzjVar, be0 be0Var, gt0 gt0Var) {
        this.f7784a = context;
        this.f7785b = or0Var;
        this.f7786d = versionInfoParcel;
        this.f7787f = zzjVar;
        this.f7788h = be0Var;
        this.f7789q = gt0Var;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void J(zzbvb zzbvbVar) {
        a();
    }

    public final void a() {
        if (((Boolean) zzba.zzc().a(eg.C3)).booleanValue()) {
            Context context = this.f7784a;
            VersionInfoParcel versionInfoParcel = this.f7786d;
            gt0 gt0Var = this.f7789q;
            zzu.zza().zzc(context, versionInfoParcel, this.f7785b.f7646f, this.f7787f.zzh(), gt0Var);
        }
        this.f7788h.b();
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void b(kr0 kr0Var) {
    }

    @Override // com.google.android.gms.internal.ads.v70
    public final void zze(zzay zzayVar) {
        if (((Boolean) zzba.zzc().a(eg.D3)).booleanValue()) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.v70
    public final void zzf(String str) {
    }
}
