package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q3 extends w3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m0 f8094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v2 f8095o;

    @Override // com.google.android.gms.internal.ads.w3
    public final long a(ik0 ik0Var) {
        byte[] bArr = ik0Var.f5633a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6) {
            ik0Var.j(4);
            ik0Var.F();
        } else if (i10 == 7) {
            i10 = 7;
            ik0Var.j(4);
            ik0Var.F();
        }
        int iA0 = z3.a.a0(i10, ik0Var);
        ik0Var.i(0);
        return iA0;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void b(boolean z9) {
        super.b(z9);
        if (z9) {
            this.f8094n = null;
            this.f8095o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final boolean c(ik0 ik0Var, long j10, m20 m20Var) {
        byte[] bArr = ik0Var.f5633a;
        m0 m0Var = this.f8094n;
        if (m0Var == null) {
            m0 m0Var2 = new m0(bArr, 17);
            this.f8094n = m0Var2;
            m20Var.f6809b = m0Var2.b(Arrays.copyOfRange(bArr, 9, ik0Var.f5635c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & 127) != 3) {
            if (b10 != -1) {
                return true;
            }
            v2 v2Var = this.f8095o;
            if (v2Var != null) {
                v2Var.f9733a = j10;
                m20Var.f6810d = v2Var;
            }
            ((y1) m20Var.f6809b).getClass();
            return false;
        }
        m20 m20VarI = t3.i.I(ik0Var);
        m0 m0Var3 = new m0(m0Var.f6784a, m0Var.f6785b, m0Var.f6786c, m0Var.f6787d, m0Var.f6788e, m0Var.f6790g, m0Var.f6791h, m0Var.f6793j, m20VarI, m0Var.f6795l);
        this.f8094n = m0Var3;
        v2 v2Var2 = new v2();
        v2Var2.f9735d = m0Var3;
        v2Var2.f9736f = m20VarI;
        v2Var2.f9733a = -1L;
        v2Var2.f9734b = -1L;
        this.f8095o = v2Var2;
        return true;
    }
}
