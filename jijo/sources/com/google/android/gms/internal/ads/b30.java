package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b30 implements zzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b50 f2885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f2886b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f2887d = new AtomicBoolean(false);

    public b30(b50 b50Var) {
        this.f2885a = b50Var;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        AtomicBoolean atomicBoolean = this.f2887d;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        b50 b50Var = this.f2885a;
        b50Var.getClass();
        b50Var.I0(new m30(8));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        b50 b50Var = this.f2885a;
        b50Var.getClass();
        b50Var.I0(new m30(10));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        this.f2886b.set(true);
        AtomicBoolean atomicBoolean = this.f2887d;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        b50 b50Var = this.f2885a;
        b50Var.getClass();
        b50Var.I0(new m30(8));
    }
}
