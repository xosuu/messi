package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3 f8777a = new t3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f8778b = new ik0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8779c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8781e;

    public final boolean a(h0 h0Var) {
        int i10;
        boolean z9 = this.f8781e;
        ik0 ik0Var = this.f8778b;
        if (z9) {
            this.f8781e = false;
            ik0Var.f(0);
        }
        while (true) {
            if (this.f8781e) {
                return true;
            }
            int i11 = this.f8779c;
            t3 t3Var = this.f8777a;
            if (i11 < 0) {
                if (!t3Var.b(h0Var, -1L) || !t3Var.a(h0Var, true)) {
                    break;
                }
                int iB = t3Var.f9040d;
                if ((t3Var.f9037a & 1) == 1 && ik0Var.f5635c == 0) {
                    iB += b(0);
                    i10 = this.f8780d;
                } else {
                    i10 = 0;
                }
                try {
                    ((a0) h0Var).j(iB);
                    this.f8779c = i10;
                    i11 = i10;
                } catch (EOFException unused) {
                }
            }
            int iB2 = b(i11);
            int i12 = this.f8779c + this.f8780d;
            if (iB2 > 0) {
                ik0Var.d(ik0Var.f5635c + iB2);
                try {
                    ((a0) h0Var).h(ik0Var.f5633a, ik0Var.f5635c, iB2, false);
                    ik0Var.h(ik0Var.f5635c + iB2);
                    this.f8781e = t3Var.f9042f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == t3Var.f9039c) {
                i12 = -1;
            }
            this.f8779c = i12;
        }
        return false;
    }

    public final int b(int i10) {
        int i11;
        int i12 = 0;
        this.f8780d = 0;
        do {
            int i13 = this.f8780d;
            int i14 = i10 + i13;
            t3 t3Var = this.f8777a;
            if (i14 >= t3Var.f9039c) {
                break;
            }
            this.f8780d = i13 + 1;
            i11 = t3Var.f9042f[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }
}
