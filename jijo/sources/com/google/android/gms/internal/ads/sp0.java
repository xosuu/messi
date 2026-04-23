package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzp;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class sp0 implements n40, k50, kq0, zzp, o50, u40, q70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zr0 f8937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f8938b = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f8939d = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f8940f = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f8941h = new AtomicReference();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReference f8942q = new AtomicReference();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicReference f8943s = new AtomicReference();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public sp0 f8944t = null;

    public sp0(zr0 zr0Var) {
        this.f8937a = zr0Var;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void L() {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.L();
        } else {
            tc1.l(this.f8940f, new il0(12));
        }
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void V() {
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void a(zze zzeVar) {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.a(zzeVar);
        } else {
            tc1.l(this.f8940f, new l40(4, zzeVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.kq0
    public final void b(kq0 kq0Var) {
        this.f8944t = (sp0) kq0Var;
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final void h(zzs zzsVar) {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.h(zzsVar);
        } else {
            tc1.l(this.f8943s, new i10(27, zzsVar));
        }
    }

    public final void j() {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.j();
            return;
        }
        ks0 ks0Var = this.f8937a.f11316a;
        if (ks0Var != null) {
            ms0 ms0Var = (ms0) ks0Var.f6384a;
            synchronized (ms0Var) {
                ms0Var.f7043e = 1;
                ms0Var.b();
            }
        }
        tc1.l(this.f8939d, new il0(13));
        tc1.l(this.f8940f, new il0(14));
    }

    public final void k(h10 h10Var) {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.k(h10Var);
        } else {
            tc1.l(this.f8938b, new jp0(24, h10Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final void t(zze zzeVar) {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.t(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.f8938b;
        tc1.l(atomicReference, new a60(2, zzeVar));
        tc1.l(atomicReference, new l40(5, zzeVar));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.zzdq();
        } else {
            tc1.l(this.f8942q, new il0(11));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.zzdr();
            return;
        }
        tc1.l(this.f8942q, new il0(17));
        AtomicReference atomicReference = this.f8940f;
        tc1.l(atomicReference, new il0(9));
        tc1.l(atomicReference, new il0(10));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.zzdt();
        } else {
            tc1.l(this.f8942q, new il0(16));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.zzdu(i10);
        } else {
            tc1.l(this.f8942q, new b4.j(i10, 5));
        }
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void zzg() {
        sp0 sp0Var = this.f8944t;
        if (sp0Var != null) {
            sp0Var.zzg();
        } else {
            tc1.l(this.f8941h, new il0(15));
        }
    }
}
