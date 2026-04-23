package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class wq0 implements OnAdMetadataChangedListener, e50, n40, k40, u40, o50, kq0, q70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zr0 f10294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f10295b = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f10296d = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f10297f = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f10298h = new AtomicReference();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReference f10299q = new AtomicReference();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicReference f10300s = new AtomicReference();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicReference f10301t = new AtomicReference();

    public wq0(zr0 zr0Var) {
        this.f10294a = zr0Var;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void L() {
        tc1.l(this.f10297f, new il0(26));
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void V() {
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void a(final zze zzeVar) {
        p40 p40Var = new p40(2, zzeVar);
        AtomicReference atomicReference = this.f10297f;
        tc1.l(atomicReference, p40Var);
        final int i10 = 1;
        tc1.l(atomicReference, new fq0() { // from class: com.google.android.gms.internal.ads.hl0
            @Override // com.google.android.gms.internal.ads.fq0
            /* JADX INFO: renamed from: zza */
            public final void mo5zza(Object obj) {
                int i11 = i10;
                zze zzeVar2 = zzeVar;
                switch (i11) {
                    case 0:
                        ((com.google.android.gms.ads.internal.client.zzbk) obj).zzb(zzeVar2);
                        break;
                    default:
                        ((qs) obj).f(zzeVar2.zza);
                        break;
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.kq0
    public final void b(kq0 kq0Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final void h(zzs zzsVar) {
        tc1.l(this.f10301t, new y50(zzsVar, 2));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void n(as asVar, String str, String str2) {
        tc1.l(this.f10297f, new rk0(21, asVar));
        tc1.l(this.f10299q, new a50(asVar, str, str2, 2));
        tc1.l(this.f10298h, new i10(28, asVar));
        tc1.l(this.f10300s, new a50(asVar, str, str2, 3));
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        tc1.l(this.f10295b, new il0(25));
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final void t(zze zzeVar) {
        int i10 = zzeVar.zza;
        a60 a60Var = new a60(3, zzeVar);
        AtomicReference atomicReference = this.f10296d;
        tc1.l(atomicReference, a60Var);
        tc1.l(atomicReference, new b4.j(i10, 6));
        tc1.l(this.f10298h, new b4.j(i10, 7));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zza() {
        ks0 ks0Var = this.f10294a.f11316a;
        if (ks0Var != null) {
            ms0 ms0Var = (ms0) ks0Var.f6384a;
            synchronized (ms0Var) {
                ms0Var.f7043e = 1;
                ms0Var.b();
            }
        }
        tc1.l(this.f10297f, new il0(28));
        tc1.l(this.f10298h, new il0(29));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzb() {
        Object obj = this.f10298h.get();
        if (obj == null) {
            return;
        }
        try {
            ds dsVar = (ds) ((es) obj);
            dsVar.a0(dsVar.m(), 6);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            zzm.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzc() {
        il0 il0Var = new il0(20);
        AtomicReference atomicReference = this.f10297f;
        tc1.l(atomicReference, il0Var);
        tc1.l(this.f10298h, new il0(21));
        tc1.l(atomicReference, new il0(22));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zze() {
        tc1.l(this.f10298h, new il0(27));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzf() {
        tc1.l(this.f10298h, new il0(19));
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void zzs() {
        tc1.l(this.f10296d, new il0(23));
        tc1.l(this.f10298h, new il0(24));
    }
}
