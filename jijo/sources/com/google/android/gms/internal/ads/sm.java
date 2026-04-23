package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: loaded from: classes.dex */
public final class sm implements tu, su {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wm f8922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bt0 f8923b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym f8924d;

    public /* synthetic */ sm(ym ymVar, wm wmVar, bt0 bt0Var) {
        this.f8922a = wmVar;
        this.f8923b = bt0Var;
        this.f8924d = ymVar;
    }

    @Override // com.google.android.gms.internal.ads.su, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: zza */
    public final void mo1zza() {
        gt0 gt0Var;
        zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f8924d.f10929a) {
            try {
                zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                this.f8924d.f10937i = 1;
                zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.f8922a.p();
                if (((Boolean) eh.f4204d.k()).booleanValue() && (gt0Var = this.f8924d.f10933e) != null) {
                    bt0 bt0Var = this.f8923b;
                    bt0Var.i("Failed loading new engine");
                    bt0Var.x(false);
                    gt0Var.b(bt0Var.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }

    @Override // com.google.android.gms.internal.ads.tu, com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final /* bridge */ /* synthetic */ void mo5zza(Object obj) {
        gt0 gt0Var;
        zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f8924d.f10929a) {
            try {
                zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                ym ymVar = this.f8924d;
                ymVar.f10937i = 0;
                wm wmVar = ymVar.f10936h;
                if (wmVar != null && this.f8922a != wmVar) {
                    zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    this.f8924d.f10936h.p();
                }
                this.f8924d.f10936h = this.f8922a;
                if (((Boolean) eh.f4204d.k()).booleanValue() && (gt0Var = this.f8924d.f10933e) != null) {
                    bt0 bt0Var = this.f8923b;
                    bt0Var.x(true);
                    gt0Var.b(bt0Var.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
