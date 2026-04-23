package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r3 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8371d;

    public r3(int i10) {
        this.f8368a = i10;
        if (i10 == 1) {
            this.f8370c = new k5(null, 0, 0);
            this.f8371d = new ik0(2786);
        } else {
            if (i10 != 2) {
                return;
            }
            this.f8370c = new k5(null, 0, 1);
            this.f8371d = new ik0(16384);
        }
    }

    public final boolean a(h0 h0Var) {
        t3 t3Var = new t3();
        if (t3Var.a(h0Var, true) && (t3Var.f9037a & 2) == 2) {
            int iMin = Math.min(t3Var.f9041e, 8);
            ik0 ik0Var = new ik0(iMin);
            ((a0) h0Var).m(ik0Var.f5633a, 0, iMin, false);
            ik0Var.i(0);
            if (ik0Var.n() >= 5 && ik0Var.v() == 127 && ik0Var.D() == 1179402563) {
                this.f8371d = new q3();
            } else {
                ik0Var.i(0);
                if (b4.f.j0(1, ik0Var, true)) {
                    this.f8371d = new x3();
                } else {
                    ik0Var.i(0);
                    if (v3.e(ik0Var, v3.f9741o)) {
                        this.f8371d = new v3();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        switch (this.f8368a) {
            case 0:
                w3 w3Var = (w3) this.f8371d;
                if (w3Var != null) {
                    s3 s3Var = w3Var.f10039a;
                    t3 t3Var = s3Var.f8777a;
                    t3Var.f9037a = 0;
                    t3Var.f9038b = 0L;
                    t3Var.f9039c = 0;
                    t3Var.f9040d = 0;
                    t3Var.f9041e = 0;
                    s3Var.f8778b.f(0);
                    s3Var.f8779c = -1;
                    s3Var.f8781e = false;
                    if (j10 == 0) {
                        w3Var.b(!w3Var.f10050l);
                    } else if (w3Var.f10046h != 0) {
                        long j12 = (((long) w3Var.f10047i) * j11) / 1000000;
                        w3Var.f10043e = j12;
                        u3 u3Var = w3Var.f10042d;
                        int i10 = yn0.f10944a;
                        u3Var.b(j12);
                        w3Var.f10046h = 2;
                    }
                }
                break;
            case 1:
                this.f8369b = false;
                ((k5) this.f8370c).zze();
                break;
            default:
                this.f8369b = false;
                ((k5) this.f8370c).zze();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01f6  */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.ads.h0 r22, com.google.android.gms.internal.ads.k0 r23) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r3.d(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.k0):int");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        switch (this.f8368a) {
            case 0:
                this.f8370c = i0Var;
                break;
            case 1:
                ((k5) this.f8370c).d(i0Var, new q2.d(Integer.MIN_VALUE, 0, 1));
                i0Var.i();
                i0Var.p(new l0(-9223372036854775807L, 0L));
                break;
            default:
                ((k5) this.f8370c).d(i0Var, new q2.d(Integer.MIN_VALUE, 0, 1));
                i0Var.i();
                i0Var.p(new l0(-9223372036854775807L, 0L));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0139 A[LOOP:5: B:38:0x00d7->B:56:0x0139, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.android.gms.internal.ads.h0 r18) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r3.f(com.google.android.gms.internal.ads.h0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final /* synthetic */ g0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final List zzd() {
        switch (this.f8368a) {
            case 0:
                zy0 zy0Var = bz0.f3132b;
                break;
            case 1:
                zy0 zy0Var2 = bz0.f3132b;
                break;
            default:
                zy0 zy0Var3 = bz0.f3132b;
                break;
        }
        return wz0.f10382h;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void zzf() {
    }
}
