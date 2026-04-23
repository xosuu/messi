package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class c21 extends u11 {
    public b21 B;

    @Override // com.google.android.gms.internal.ads.m11
    public final void j() {
        b21 b21Var = this.B;
        if (b21Var != null) {
            b21Var.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.u11
    public final void u(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.u11
    public final void v() {
        b21 b21Var = this.B;
        if (b21Var != null) {
            try {
                b21Var.f2880d.execute(b21Var);
            } catch (RejectedExecutionException e10) {
                b21Var.f2881f.g(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u11
    public final void x(int i10) {
        this.f9341x = null;
        if (i10 == 1) {
            this.B = null;
        }
    }
}
