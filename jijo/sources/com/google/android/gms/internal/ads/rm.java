package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rm implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8659a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8660b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8661d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f8662f;

    public rm(ym ymVar, lm lmVar, zzby zzbyVar) {
        this.f8660b = lmVar;
        this.f8661d = zzbyVar;
        this.f8662f = ymVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.wk, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.wk
    public final void b(Object obj, Map map) {
        switch (this.f8659a) {
            case 0:
                zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                synchronized (((ym) this.f8662f).f10929a) {
                    try {
                        zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        zzm.zzi("JS Engine is requesting an update");
                        if (((ym) this.f8662f).f10937i == 0) {
                            zzm.zzi("Starting reload.");
                            Object obj2 = this.f8662f;
                            ((ym) obj2).f10937i = 2;
                            ((ym) obj2).b();
                        }
                        ((lm) this.f8660b).z("/requestReload", ((zzby) this.f8661d).zza());
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((oj) this.f8660b).l0((gj) ((eh1) this.f8662f).zzb(), str);
                    return;
                } catch (RemoteException e10) {
                    zzm.zzk("Failed to call onCustomClick for asset " + str + ".", e10);
                    return;
                }
        }
    }

    public rm(r90 r90Var, n90 n90Var, tb0 tb0Var, eh1 eh1Var) {
        this.f8660b = (oj) r90Var.f8543g.getOrDefault(n90Var.a(), null);
        this.f8661d = tb0Var;
        this.f8662f = eh1Var;
    }
}
