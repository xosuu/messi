package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes.dex */
public final class g30 implements e50, zza, u50, w40, k40, p60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3.a f4803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bu f4804b;

    public g30(y3.a aVar, bu buVar) {
        this.f4803a = aVar;
        this.f4804b = buVar;
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void E(ve veVar) {
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void J(zzbvb zzbvbVar) {
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void S(ve veVar) {
        bu buVar = this.f4804b;
        synchronized (buVar.f3106d) {
            buVar.f3104b.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void T(ve veVar) {
        bu buVar = this.f4804b;
        synchronized (buVar.f3106d) {
            buVar.f3104b.d();
        }
    }

    public final void a(zzl zzlVar) {
        bu buVar = this.f4804b;
        synchronized (buVar.f3106d) {
            ((y3.b) buVar.f3103a).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            buVar.f3112j = jElapsedRealtime;
            buVar.f3104b.f(zzlVar, jElapsedRealtime);
        }
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void b(kr0 kr0Var) {
        y3.a aVar = this.f4803a;
        bu buVar = this.f4804b;
        ((y3.b) aVar).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (buVar.f3106d) {
            try {
                buVar.f3113k = jElapsedRealtime;
                if (jElapsedRealtime != -1) {
                    buVar.f3104b.a(buVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void h(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void k(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void n(as asVar, String str, String str2) {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        bu buVar = this.f4804b;
        synchronized (buVar.f3106d) {
            try {
                if (buVar.f3113k != -1) {
                    au auVar = new au(buVar);
                    ((y3.b) buVar.f3103a).getClass();
                    auVar.f2789a = SystemClock.elapsedRealtime();
                    buVar.f3105c.add(auVar);
                    buVar.f3111i++;
                    buVar.f3104b.b();
                    buVar.f3104b.a(buVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zza() {
        bu buVar = this.f4804b;
        synchronized (buVar.f3106d) {
            try {
                if (buVar.f3113k != -1 && !buVar.f3105c.isEmpty()) {
                    au auVar = (au) buVar.f3105c.getLast();
                    if (auVar.f2790b == -1) {
                        ((y3.b) auVar.f2791c.f3103a).getClass();
                        auVar.f2790b = SystemClock.elapsedRealtime();
                        buVar.f3104b.a(buVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final void zzr() {
        bu buVar = this.f4804b;
        synchronized (buVar.f3106d) {
            try {
                if (buVar.f3113k != -1 && buVar.f3109g == -1) {
                    ((y3.b) buVar.f3103a).getClass();
                    buVar.f3109g = SystemClock.elapsedRealtime();
                    buVar.f3104b.a(buVar);
                }
                buVar.f3104b.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void zzs() {
        bu buVar = this.f4804b;
        synchronized (buVar.f3106d) {
            try {
                if (buVar.f3113k != -1) {
                    ((y3.b) buVar.f3103a).getClass();
                    buVar.f3110h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
