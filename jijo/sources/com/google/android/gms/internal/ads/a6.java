package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class a6 implements p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f2594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f2595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b1 f2598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2600g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2606m;

    public a6(String str, int i10) {
        ik0 ik0Var = new ik0(4);
        this.f2594a = ik0Var;
        ik0Var.f5633a[0] = -1;
        this.f2595b = new t0();
        this.f2606m = -9223372036854775807L;
        this.f2596c = str;
        this.f2597d = i10;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void b(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void c(ik0 ik0Var) {
        tc1.A(this.f2598e);
        while (ik0Var.n() > 0) {
            int i10 = this.f2600g;
            ik0 ik0Var2 = this.f2594a;
            if (i10 == 0) {
                byte[] bArr = ik0Var.f5633a;
                int i11 = ik0Var.f5634b;
                int i12 = ik0Var.f5635c;
                while (true) {
                    if (i11 >= i12) {
                        ik0Var.i(i12);
                        break;
                    }
                    int i13 = i11 + 1;
                    byte b10 = bArr[i11];
                    boolean z9 = (b10 & 255) == 255;
                    boolean z10 = this.f2603j && (b10 & 224) == 224;
                    this.f2603j = z9;
                    if (z10) {
                        ik0Var.i(i13);
                        this.f2603j = false;
                        ik0Var2.f5633a[1] = bArr[i11];
                        this.f2601h = 2;
                        this.f2600g = 1;
                        break;
                    }
                    i11 = i13;
                }
            } else if (i10 != 1) {
                int iMin = Math.min(ik0Var.n(), this.f2605l - this.f2601h);
                this.f2598e.f(iMin, ik0Var);
                int i14 = this.f2601h + iMin;
                this.f2601h = i14;
                if (i14 >= this.f2605l) {
                    tc1.W(this.f2606m != -9223372036854775807L);
                    this.f2598e.e(this.f2606m, 1, this.f2605l, 0, null);
                    this.f2606m += this.f2604k;
                    this.f2601h = 0;
                    this.f2600g = 0;
                }
            } else {
                int iMin2 = Math.min(ik0Var.n(), 4 - this.f2601h);
                ik0Var.e(this.f2601h, ik0Var2.f5633a, iMin2);
                int i15 = this.f2601h + iMin2;
                this.f2601h = i15;
                if (i15 >= 4) {
                    ik0Var2.i(0);
                    int iQ = ik0Var2.q();
                    t0 t0Var = this.f2595b;
                    if (t0Var.a(iQ)) {
                        this.f2605l = t0Var.f9006b;
                        if (!this.f2602i) {
                            this.f2604k = (((long) t0Var.f9010f) * 1000000) / ((long) t0Var.f9007c);
                            q0 q0Var = new q0();
                            q0Var.f8041a = this.f2599f;
                            q0Var.f((String) t0Var.f9011g);
                            q0Var.f8053m = NotificationCompat.FLAG_BUBBLE;
                            q0Var.f8065y = t0Var.f9008d;
                            q0Var.f8066z = t0Var.f9007c;
                            q0Var.f8044d = this.f2596c;
                            q0Var.f8046f = this.f2597d;
                            this.f2598e.c(new y1(q0Var));
                            this.f2602i = true;
                        }
                        ik0Var2.i(0);
                        this.f2598e.f(4, ik0Var2);
                        this.f2600g = 2;
                    } else {
                        this.f2601h = 0;
                        this.f2600g = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void d(i0 i0Var, q2.d dVar) {
        dVar.c();
        dVar.d();
        this.f2599f = dVar.f16416e;
        dVar.d();
        this.f2598e = i0Var.j(dVar.f16414c, 1);
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void e(int i10, long j10) {
        this.f2606m = j10;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void zze() {
        this.f2600g = 0;
        this.f2601h = 0;
        this.f2603j = false;
        this.f2606m = -9223372036854775807L;
    }
}
