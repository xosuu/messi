package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class q40 extends j30 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.google.android.gms.internal.ads.e30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q40.b(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.j30
    public final e20 c(e20 e20Var) throws zzcs {
        int i10 = e20Var.f3820c;
        if (i10 != 3) {
            if (i10 == 2) {
                return e20.f3817e;
            }
            if (i10 != 268435456 && i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
                throw new zzcs(e20Var);
            }
        }
        return new e20(e20Var.f3818a, e20Var.f3819b, 2);
    }
}
