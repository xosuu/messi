package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qm implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wm f8222b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm f8223d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym f8224f;

    public qm(ym ymVar, long j10, wm wmVar, lm lmVar) {
        this.f8221a = j10;
        this.f8222b = wmVar;
        this.f8223d = lmVar;
        this.f8224f = ymVar;
    }

    @Override // com.google.android.gms.internal.ads.wk
    public final void b(Object obj, Map map) {
        ((y3.b) zzu.zzB()).getClass();
        zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (System.currentTimeMillis() - this.f8221a) + " ms.");
        zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f8224f.f10929a) {
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.f8222b.k() != -1 && this.f8222b.k() != 1) {
                this.f8224f.f10937i = 0;
                lm lmVar = this.f8223d;
                lmVar.S("/log", vk.f9883g);
                lmVar.S("/result", vk.f9891o);
                ((qu) this.f8222b.f12845a).b(this.f8223d);
                this.f8224f.f10936h = this.f8222b;
                zze.zza("Successfully loaded JS Engine.");
                zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
