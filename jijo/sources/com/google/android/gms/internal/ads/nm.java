package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wm f7310b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm f7311d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7312f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f7313h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ym f7314q;

    public /* synthetic */ nm(ym ymVar, wm wmVar, lm lmVar, ArrayList arrayList, long j10, int i10) {
        this.f7309a = i10;
        this.f7314q = ymVar;
        this.f7310b = wmVar;
        this.f7311d = lmVar;
        this.f7312f = arrayList;
        this.f7313h = j10;
    }

    private final void a() {
        ym ymVar = this.f7314q;
        wm wmVar = this.f7310b;
        lm lmVar = this.f7311d;
        ArrayList arrayList = this.f7312f;
        long j10 = this.f7313h;
        ymVar.getClass();
        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (ymVar.f10929a) {
            try {
                zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (wmVar.k() != -1 && wmVar.k() != 1) {
                    if (((Boolean) zzba.zzc().a(eg.S6)).booleanValue()) {
                        wmVar.m("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                    } else {
                        wmVar.l();
                    }
                    mu muVar = nu.f7387e;
                    Objects.requireNonNull(lmVar);
                    muVar.execute(new om(lmVar, 0));
                    String strValueOf = String.valueOf(zzba.zzc().a(eg.f3944b));
                    int iK = wmVar.k();
                    int i10 = ymVar.f10937i;
                    String strValueOf2 = String.valueOf(arrayList.get(0));
                    ((y3.b) zzu.zzB()).getClass();
                    zze.zza("Could not receive /jsLoaded in " + strValueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + iK + ". Update status(onEngLoadedTimeout) is " + i10 + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + strValueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + (System.currentTimeMillis() - j10) + " ms. Rejecting.");
                    zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7309a) {
            case 0:
                a();
                return;
            default:
                zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                synchronized (this.f7314q.f10929a) {
                    try {
                        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        if (this.f7310b.k() != -1 && this.f7310b.k() != 1) {
                            if (((Boolean) zzba.zzc().a(eg.S6)).booleanValue()) {
                                this.f7310b.m("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                this.f7310b.l();
                            }
                            mu muVar = nu.f7387e;
                            lm lmVar = this.f7311d;
                            Objects.requireNonNull(lmVar);
                            muVar.execute(new om(lmVar, 1));
                            String strValueOf = String.valueOf(zzba.zzc().a(eg.f3955c));
                            int iK = this.f7310b.k();
                            int i10 = this.f7314q.f10937i;
                            String strConcat = this.f7312f.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.f7312f.get(0)));
                            ((y3.b) zzu.zzB()).getClass();
                            zze.zza("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iK + ". Update status(fullLoadTimeout) is " + i10 + strConcat + " ms. Total latency(fullLoadTimeout) is " + (System.currentTimeMillis() - this.f7313h) + " ms at timeout. Rejecting.");
                            zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
