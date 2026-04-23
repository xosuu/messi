package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends oe1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f9334b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik0 f9335d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9336f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9337h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9338q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9339s;

    public u1(b1 b1Var) {
        super(b1Var);
        this.f9334b = new ik0(ds0.f3727a);
        this.f9335d = new ik0(4);
    }

    public final boolean J0(ik0 ik0Var) throws zzaes {
        int iV = ik0Var.v();
        int i10 = iV >> 4;
        int i11 = iV & 15;
        if (i11 != 7) {
            throw new zzaes(fb1.g("Video format not supported: ", i11));
        }
        this.f9339s = i10;
        return i10 != 5;
    }

    public final boolean K0(long j10, ik0 ik0Var) throws zzbo {
        int i10;
        int iV = ik0Var.v();
        byte[] bArr = ik0Var.f5633a;
        int i11 = ik0Var.f5634b;
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        ik0Var.f5634b = i11 + 3;
        long j11 = (bArr[i11 + 2] & 255) | ((i12 << 24) >> 8) | (i13 << 8);
        Object obj = this.f7565a;
        if (iV == 0) {
            if (!this.f9337h) {
                byte[] bArr2 = new byte[ik0Var.n()];
                ik0 ik0Var2 = new ik0(bArr2);
                ik0Var.e(0, bArr2, ik0Var.n());
                s sVarA = s.a(ik0Var2);
                this.f9336f = sVarA.f8728b;
                q0 q0Var = new q0();
                q0Var.f("video/avc");
                q0Var.f8049i = sVarA.f8737k;
                q0Var.f8057q = sVarA.f8729c;
                q0Var.f8058r = sVarA.f8730d;
                q0Var.f8061u = sVarA.f8736j;
                q0Var.f8054n = sVarA.f8727a;
                ((b1) obj).c(new y1(q0Var));
                this.f9337h = true;
                return false;
            }
        } else if (iV == 1 && this.f9337h) {
            int i14 = this.f9339s == 1 ? 1 : 0;
            if (this.f9338q) {
                i10 = i14;
            } else if (i14 != 0) {
                i10 = 1;
            }
            ik0 ik0Var3 = this.f9335d;
            byte[] bArr3 = ik0Var3.f5633a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = 4 - this.f9336f;
            int i16 = 0;
            while (ik0Var.n() > 0) {
                ik0Var.e(i15, ik0Var3.f5633a, this.f9336f);
                ik0Var3.i(0);
                int iY = ik0Var3.y();
                ik0 ik0Var4 = this.f9334b;
                ik0Var4.i(0);
                b1 b1Var = (b1) obj;
                b1Var.f(4, ik0Var4);
                b1Var.f(iY, ik0Var);
                i16 = i16 + 4 + iY;
            }
            ((b1) obj).e((j11 * 1000) + j10, i10, i16, 0, null);
            this.f9338q = true;
            return true;
        }
        return false;
    }
}
