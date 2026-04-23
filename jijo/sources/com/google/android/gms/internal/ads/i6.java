package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class i6 implements o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6 f5501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f5502b = new ik0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5506f;

    public i6(h6 h6Var) {
        this.f5501a = h6Var;
    }

    @Override // com.google.android.gms.internal.ads.o6
    public final void a(int i10, ik0 ik0Var) {
        int i11 = i10 & 1;
        int iV = i11 != 0 ? ik0Var.f5634b + ik0Var.v() : -1;
        if (this.f5506f) {
            if (i11 == 0) {
                return;
            }
            this.f5506f = false;
            ik0Var.i(iV);
            this.f5504d = 0;
        }
        while (ik0Var.n() > 0) {
            int i12 = this.f5504d;
            ik0 ik0Var2 = this.f5502b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iV2 = ik0Var.v();
                    ik0Var.i(ik0Var.f5634b - 1);
                    if (iV2 == 255) {
                        this.f5506f = true;
                        return;
                    }
                }
                int iMin = Math.min(ik0Var.n(), 3 - this.f5504d);
                ik0Var.e(this.f5504d, ik0Var2.f5633a, iMin);
                int i13 = this.f5504d + iMin;
                this.f5504d = i13;
                if (i13 == 3) {
                    ik0Var2.i(0);
                    ik0Var2.h(3);
                    ik0Var2.j(1);
                    int iV3 = ik0Var2.v();
                    boolean z9 = (iV3 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
                    int iV4 = ik0Var2.v();
                    this.f5505e = z9;
                    int i14 = (((iV3 & 15) << 8) | iV4) + 3;
                    this.f5503c = i14;
                    byte[] bArr = ik0Var2.f5633a;
                    if (bArr.length < i14) {
                        int length = bArr.length;
                        ik0Var2.d(Math.min(4098, Math.max(i14, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(ik0Var.n(), this.f5503c - i12);
                ik0Var.e(this.f5504d, ik0Var2.f5633a, iMin2);
                int i15 = this.f5504d + iMin2;
                this.f5504d = i15;
                int i16 = this.f5503c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f5505e) {
                        ik0Var2.h(i16);
                    } else {
                        if (yn0.m(0, i16, -1, ik0Var2.f5633a) != 0) {
                            this.f5506f = true;
                            return;
                        }
                        ik0Var2.h(this.f5503c - 4);
                    }
                    ik0Var2.i(0);
                    this.f5501a.c(ik0Var2);
                    this.f5504d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o6
    public final void b(nn0 nn0Var, i0 i0Var, q2.d dVar) {
        this.f5501a.b(nn0Var, i0Var, dVar);
        this.f5506f = true;
    }

    @Override // com.google.android.gms.internal.ads.o6
    public final void zzc() {
        this.f5506f = true;
    }
}
