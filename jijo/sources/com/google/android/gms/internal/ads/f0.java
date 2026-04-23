package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4345a = new byte[NotificationCompat.FLAG_BUBBLE];

    @Override // com.google.android.gms.internal.ads.b1
    public final void a(ik0 ik0Var, int i10, int i11) {
        ik0Var.j(i10);
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final int b(nl1 nl1Var, int i10, boolean z9) throws EOFException {
        int iB = nl1Var.b(0, this.f4345a, Math.min(NotificationCompat.FLAG_BUBBLE, i10));
        if (iB != -1) {
            return iB;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final void c(y1 y1Var) {
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final int d(nl1 nl1Var, int i10, boolean z9) {
        return b(nl1Var, i10, z9);
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final void e(long j10, int i10, int i11, int i12, a1 a1Var) {
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final void f(int i10, ik0 ik0Var) {
        a(ik0Var, i10, 0);
    }
}
