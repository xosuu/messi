package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i90 f4433b;

    public /* synthetic */ f90(i90 i90Var, int i10) {
        this.f4432a = i10;
        this.f4433b = i90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4432a) {
            case 0:
                i90 i90Var = this.f4433b;
                try {
                    n90 n90Var = i90Var.f5530k;
                    int iB = n90Var.B();
                    r90 r90Var = i90Var.f5534o;
                    if (iB == 1) {
                        if (r90Var.f8537a != null) {
                            i90Var.q();
                            lj ljVar = r90Var.f8537a;
                            ej ejVar = (ej) i90Var.f5535p.zzb();
                            kj kjVar = (kj) ljVar;
                            Parcel parcelM = kjVar.m();
                            qb.e(parcelM, ejVar);
                            kjVar.a0(parcelM, 1);
                            return;
                        }
                        return;
                    }
                    if (iB == 2) {
                        if (r90Var.f8538b != null) {
                            i90Var.q();
                            jj jjVar = r90Var.f8538b;
                            dj djVar = (dj) i90Var.f5536q.zzb();
                            ij ijVar = (ij) jjVar;
                            Parcel parcelM2 = ijVar.m();
                            qb.e(parcelM2, djVar);
                            ijVar.a0(parcelM2, 1);
                            return;
                        }
                        return;
                    }
                    if (iB == 3) {
                        if (((rj) r90Var.f8542f.getOrDefault(n90Var.a(), null)) != null) {
                            if (n90Var.O() != null) {
                                i90Var.w("Google", true);
                            }
                            ((rj) r90Var.f8542f.getOrDefault(n90Var.a(), null)).k1((gj) i90Var.f5539t.zzb());
                            return;
                        }
                        return;
                    }
                    if (iB == 6) {
                        if (r90Var.f8539c != null) {
                            i90Var.q();
                            r90Var.f8539c.L0((gk) i90Var.f5537r.zzb());
                            return;
                        }
                        return;
                    }
                    if (iB != 7) {
                        zzm.zzg("Wrong native template id!");
                        return;
                    }
                    fm fmVar = r90Var.f8541e;
                    if (fmVar != null) {
                        bm bmVar = (bm) i90Var.f5538s.zzb();
                        em emVar = (em) fmVar;
                        Parcel parcelM3 = emVar.m();
                        qb.e(parcelM3, bmVar);
                        emVar.a0(parcelM3, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e10) {
                    zzm.zzh("RemoteException when notifyAdLoad is called", e10);
                    return;
                }
            default:
                i90 i90Var2 = this.f4433b;
                i90Var2.f5531l.zzi();
                n90 n90Var2 = i90Var2.f5530k;
                synchronized (n90Var2) {
                    try {
                        fx fxVar = n90Var2.f7206i;
                        if (fxVar != null) {
                            fxVar.destroy();
                            n90Var2.f7206i = null;
                        }
                        fx fxVar2 = n90Var2.f7207j;
                        if (fxVar2 != null) {
                            fxVar2.destroy();
                            n90Var2.f7207j = null;
                        }
                        fx fxVar3 = n90Var2.f7208k;
                        if (fxVar3 != null) {
                            fxVar3.destroy();
                            n90Var2.f7208k = null;
                        }
                        n5.a aVar = n90Var2.f7210m;
                        if (aVar != null) {
                            aVar.cancel(false);
                            n90Var2.f7210m = null;
                        }
                        qu quVar = n90Var2.f7211n;
                        if (quVar != null) {
                            quVar.cancel(false);
                            n90Var2.f7211n = null;
                        }
                        n90Var2.f7209l = null;
                        n90Var2.f7219v.clear();
                        n90Var2.f7220w.clear();
                        n90Var2.f7199b = null;
                        n90Var2.f7200c = null;
                        n90Var2.f7201d = null;
                        n90Var2.f7202e = null;
                        n90Var2.f7205h = null;
                        n90Var2.f7212o = null;
                        n90Var2.f7213p = null;
                        n90Var2.f7214q = null;
                        n90Var2.f7216s = null;
                        n90Var2.f7217t = null;
                        n90Var2.f7218u = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
