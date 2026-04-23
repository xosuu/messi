package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class rt0 implements hw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8687b = new ArrayList(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8688d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public iz0 f8689f;

    public rt0(boolean z9) {
        this.f8686a = z9;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void a(va1 va1Var) {
        va1Var.getClass();
        ArrayList arrayList = this.f8687b;
        if (arrayList.contains(va1Var)) {
            return;
        }
        arrayList.add(va1Var);
        this.f8688d++;
    }

    public final void c(int i10) {
        iz0 iz0Var = this.f8689f;
        int i11 = yn0.f10944a;
        for (int i12 = 0; i12 < this.f8688d; i12++) {
            ((va1) this.f8687b.get(i12)).a(iz0Var, this.f8686a, i10);
        }
    }

    public final void i() {
        iz0 iz0Var = this.f8689f;
        int i10 = yn0.f10944a;
        for (int i11 = 0; i11 < this.f8688d; i11++) {
            ((va1) this.f8687b.get(i11)).m(iz0Var, this.f8686a);
        }
        this.f8689f = null;
    }

    public final void j(iz0 iz0Var) {
        for (int i10 = 0; i10 < this.f8688d; i10++) {
            ((va1) this.f8687b.get(i10)).zzc();
        }
    }

    public final void n(iz0 iz0Var) {
        this.f8689f = iz0Var;
        for (int i10 = 0; i10 < this.f8688d; i10++) {
            ((va1) this.f8687b.get(i10)).b(this, iz0Var, this.f8686a);
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }
}
