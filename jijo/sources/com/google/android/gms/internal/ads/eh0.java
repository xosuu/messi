package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class eh0 extends f.h0 {
    public /* synthetic */ eh0(byte[] bArr, int i10) throws GeneralSecurityException {
        t51 t51Var;
        t51 t51Var2;
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        switch (i10) {
            case 0:
                t51Var = new t51(bArr, 1, 0);
                break;
            default:
                t51Var = new t51(bArr, 1, 1);
                break;
        }
        this.f12845a = t51Var;
        switch (i10) {
            case 0:
                t51Var2 = new t51(bArr, 0, 0);
                break;
            default:
                t51Var2 = new t51(bArr, 0, 1);
                break;
        }
        this.f12846b = t51Var2;
    }
}
