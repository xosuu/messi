package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class k20 implements e50, wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fr0 f6147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v40 f6148b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j50 f6149d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f6150f = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f6151h = new AtomicBoolean();

    public k20(fr0 fr0Var, v40 v40Var, j50 j50Var) {
        this.f6147a = fr0Var;
        this.f6148b = v40Var;
        this.f6149d = j50Var;
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final void Z(vb vbVar) {
        if (this.f6147a.f4608e == 1 && vbVar.f9827j) {
            a();
        }
        if (vbVar.f9827j && this.f6151h.compareAndSet(false, true)) {
            j50 j50Var = this.f6149d;
            synchronized (j50Var) {
                j50Var.I0(new m30(15));
            }
        }
    }

    public final void a() {
        if (this.f6150f.compareAndSet(false, true)) {
            this.f6148b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final synchronized void zzs() {
        if (this.f6147a.f4608e != 1) {
            a();
        }
    }
}
