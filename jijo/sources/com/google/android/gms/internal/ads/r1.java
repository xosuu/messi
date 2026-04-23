package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends oe1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f8347h = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8348b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8349d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8350f;

    public final boolean J0(ik0 ik0Var) {
        if (this.f8348b) {
            ik0Var.j(1);
        } else {
            int iV = ik0Var.v();
            int i10 = iV >> 4;
            this.f8350f = i10;
            Object obj = this.f7565a;
            if (i10 == 2) {
                int i11 = f8347h[(iV >> 2) & 3];
                q0 q0Var = new q0();
                q0Var.f("audio/mpeg");
                q0Var.f8065y = 1;
                q0Var.f8066z = i11;
                ((b1) obj).c(new y1(q0Var));
                this.f8349d = true;
            } else if (i10 == 7 || i10 == 8) {
                q0 q0Var2 = new q0();
                q0Var2.f(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                q0Var2.f8065y = 1;
                q0Var2.f8066z = 8000;
                ((b1) obj).c(new y1(q0Var2));
                this.f8349d = true;
            } else if (i10 != 10) {
                throw new zzaes(fb1.g("Audio format not supported: ", i10));
            }
            this.f8348b = true;
        }
        return true;
    }

    public final boolean K0(long j10, ik0 ik0Var) {
        int i10 = this.f8350f;
        Object obj = this.f7565a;
        if (i10 == 2) {
            int iN = ik0Var.n();
            b1 b1Var = (b1) obj;
            b1Var.f(iN, ik0Var);
            b1Var.e(j10, 1, iN, 0, null);
            return true;
        }
        int iV = ik0Var.v();
        if (iV != 0 || this.f8349d) {
            if (this.f8350f == 10 && iV != 1) {
                return false;
            }
            int iN2 = ik0Var.n();
            b1 b1Var2 = (b1) obj;
            b1Var2.f(iN2, ik0Var);
            b1Var2.e(j10, 1, iN2, 0, null);
            return true;
        }
        int iN3 = ik0Var.n();
        byte[] bArr = new byte[iN3];
        ik0Var.e(0, bArr, iN3);
        z0.b bVarW = tc1.w(new d1(bArr, iN3), false);
        q0 q0Var = new q0();
        q0Var.f("audio/mp4a-latm");
        q0Var.f8049i = (String) bVarW.f20648c;
        q0Var.f8065y = bVarW.f20647b;
        q0Var.f8066z = bVarW.f20646a;
        q0Var.f8054n = Collections.singletonList(bArr);
        ((b1) obj).c(new y1(q0Var));
        this.f8349d = true;
        return false;
    }
}
