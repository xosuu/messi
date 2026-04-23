package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ub1 implements Cloneable {
    public final void a(byte[] bArr, pc1 pc1Var) throws zzgyn {
        int length = bArr.length;
        uc1 uc1Var = (uc1) this;
        uc1Var.d();
        try {
            yd1.f10857c.a(uc1Var.f9462b.getClass()).h(uc1Var.f9462b, bArr, 0, length, new s7(pc1Var));
        } catch (zzgyn e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgyn.e();
        }
    }
}
