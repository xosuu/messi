package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: loaded from: classes.dex */
public final class ym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f10932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gt0 f10933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzbd f10934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzbd f10935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public wm f10936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10937i;

    public ym(Context context, VersionInfoParcel versionInfoParcel, String str, gt0 gt0Var) {
        pe peVar = fn.f4577c;
        this.f10929a = new Object();
        this.f10937i = 1;
        this.f10931c = str;
        this.f10930b = context.getApplicationContext();
        this.f10932d = versionInfoParcel;
        this.f10933e = gt0Var;
        this.f10935g = peVar;
    }

    public final tm a() {
        zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.f10929a) {
            try {
                zze.zza("getEngine: Lock acquired");
                zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f10929a) {
                    try {
                        zze.zza("refreshIfDestroyed: Lock acquired");
                        wm wmVar = this.f10936h;
                        if (wmVar != null && this.f10937i == 0) {
                            wmVar.n(new jp0(4, this), new pe(7));
                        }
                    } finally {
                    }
                }
                zze.zza("refreshIfDestroyed: Lock released");
                wm wmVar2 = this.f10936h;
                if (wmVar2 != null && wmVar2.k() != -1) {
                    int i10 = this.f10937i;
                    if (i10 == 0) {
                        zze.zza("getEngine (NO_UPDATE): Lock released");
                        return this.f10936h.o();
                    }
                    if (i10 != 1) {
                        zze.zza("getEngine (UPDATING): Lock released");
                        return this.f10936h.o();
                    }
                    this.f10937i = 2;
                    b();
                    zze.zza("getEngine (PENDING_UPDATE): Lock released");
                    return this.f10936h.o();
                }
                this.f10937i = 2;
                this.f10936h = b();
                zze.zza("getEngine (NULL or REJECTED): Lock released");
                return this.f10936h.o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wm b() {
        bt0 bt0VarD = tc1.d(this.f10930b, 6);
        bt0VarD.zzi();
        wm wmVar = new wm(this.f10935g);
        zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        nu.f7387e.execute(new vm(this, wmVar));
        zze.zza("loadNewJavascriptEngine: Promise created");
        wmVar.n(new sm(this, wmVar, bt0VarD), new sm(this, wmVar, bt0VarD));
        return wmVar;
    }
}
