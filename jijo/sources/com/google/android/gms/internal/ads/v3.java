package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v3 extends w3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f9741o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f9742p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9743n;

    public static boolean e(ik0 ik0Var, byte[] bArr) {
        if (ik0Var.n() < 8) {
            return false;
        }
        int i10 = ik0Var.f5634b;
        byte[] bArr2 = new byte[8];
        ik0Var.e(0, bArr2, 8);
        ik0Var.i(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final long a(ik0 ik0Var) {
        byte[] bArr = ik0Var.f5633a;
        return (((long) this.f10047i) * y3.c.B(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void b(boolean z9) {
        super.b(z9);
        if (z9) {
            this.f9743n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final boolean c(ik0 ik0Var, long j10, m20 m20Var) {
        if (e(ik0Var, f9741o)) {
            byte[] bArrCopyOf = Arrays.copyOf(ik0Var.f5633a, ik0Var.f5635c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListY = y3.c.y(bArrCopyOf);
            if (((y1) m20Var.f6809b) == null) {
                q0 q0Var = new q0();
                q0Var.f("audio/opus");
                q0Var.f8065y = i10;
                q0Var.f8066z = 48000;
                q0Var.f8054n = arrayListY;
                m20Var.f6809b = new y1(q0Var);
                return true;
            }
        } else {
            if (!e(ik0Var, f9742p)) {
                tc1.A((y1) m20Var.f6809b);
                return false;
            }
            tc1.A((y1) m20Var.f6809b);
            if (!this.f9743n) {
                this.f9743n = true;
                ik0Var.j(8);
                zzbk zzbkVarC0 = b4.f.c0(bz0.l((String[]) b4.f.i0(ik0Var, false, false).f6060b));
                if (zzbkVarC0 != null) {
                    y1 y1Var = (y1) m20Var.f6809b;
                    y1Var.getClass();
                    q0 q0Var2 = new q0(y1Var);
                    q0Var2.f8050j = zzbkVarC0.e(((y1) m20Var.f6809b).f10712k);
                    m20Var.f6809b = new y1(q0Var2);
                }
            }
        }
        return true;
    }
}
