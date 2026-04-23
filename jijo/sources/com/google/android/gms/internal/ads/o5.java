package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o5 implements p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f7513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f7514g;

    public o5() {
        this.f7508a = 1;
        this.f7513f = new ik0(10);
        this.f7510c = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void b(boolean z9) {
        int i10;
        switch (this.f7508a) {
            case 0:
                if (this.f7509b) {
                    tc1.W(this.f7510c != -9223372036854775807L);
                    for (b1 b1Var : (b1[]) this.f7514g) {
                        b1Var.e(this.f7510c, 1, this.f7512e, 0, null);
                    }
                    this.f7509b = false;
                }
                break;
            default:
                tc1.A((b1) this.f7514g);
                if (this.f7509b && (i10 = this.f7511d) != 0 && this.f7512e == i10) {
                    tc1.W(this.f7510c != -9223372036854775807L);
                    ((b1) this.f7514g).e(this.f7510c, 1, this.f7511d, 0, null);
                    this.f7509b = false;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void c(ik0 ik0Var) {
        switch (this.f7508a) {
            case 0:
                if (this.f7509b) {
                    if (this.f7511d == 2) {
                        if (ik0Var.n() != 0) {
                            if (ik0Var.v() != 32) {
                                this.f7509b = false;
                            }
                            this.f7511d--;
                            if (!this.f7509b) {
                            }
                        }
                    }
                    if (this.f7511d == 1) {
                        if (ik0Var.n() != 0) {
                            if (ik0Var.v() != 0) {
                                this.f7509b = false;
                            }
                            this.f7511d--;
                            if (!this.f7509b) {
                            }
                        }
                    }
                    int i10 = ik0Var.f5634b;
                    int iN = ik0Var.n();
                    for (b1 b1Var : (b1[]) this.f7514g) {
                        ik0Var.i(i10);
                        b1Var.f(iN, ik0Var);
                    }
                    this.f7512e += iN;
                }
                break;
            default:
                tc1.A((b1) this.f7514g);
                if (this.f7509b) {
                    int iN2 = ik0Var.n();
                    int i11 = this.f7512e;
                    if (i11 < 10) {
                        int iMin = Math.min(iN2, 10 - i11);
                        byte[] bArr = ik0Var.f5633a;
                        int i12 = ik0Var.f5634b;
                        ik0 ik0Var2 = (ik0) this.f7513f;
                        System.arraycopy(bArr, i12, ik0Var2.f5633a, this.f7512e, iMin);
                        if (this.f7512e + iMin == 10) {
                            ik0Var2.i(0);
                            if (ik0Var2.v() == 73 && ik0Var2.v() == 68 && ik0Var2.v() == 51) {
                                ik0Var2.j(3);
                                this.f7511d = ik0Var2.u() + 10;
                            } else {
                                fg0.f("Discarding invalid ID3 tag");
                                this.f7509b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iN2, this.f7511d - this.f7512e);
                    ((b1) this.f7514g).f(iMin2, ik0Var);
                    this.f7512e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void d(i0 i0Var, q2.d dVar) {
        switch (this.f7508a) {
            case 0:
                for (int i10 = 0; i10 < ((b1[]) this.f7514g).length; i10++) {
                    m6 m6Var = (m6) ((List) this.f7513f).get(i10);
                    dVar.c();
                    dVar.d();
                    b1 b1VarJ = i0Var.j(dVar.f16414c, 3);
                    q0 q0Var = new q0();
                    dVar.d();
                    q0Var.f8041a = dVar.f16416e;
                    q0Var.f("application/dvbsubs");
                    q0Var.f8054n = Collections.singletonList(m6Var.f6876b);
                    q0Var.f8044d = m6Var.f6875a;
                    b1VarJ.c(new y1(q0Var));
                    ((b1[]) this.f7514g)[i10] = b1VarJ;
                }
                break;
            default:
                dVar.c();
                dVar.d();
                b1 b1VarJ2 = i0Var.j(dVar.f16414c, 5);
                this.f7514g = b1VarJ2;
                q0 q0Var2 = new q0();
                dVar.d();
                q0Var2.f8041a = dVar.f16416e;
                q0Var2.f("application/id3");
                b1VarJ2.c(new y1(q0Var2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void e(int i10, long j10) {
        switch (this.f7508a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f7509b = true;
                    this.f7510c = j10;
                    this.f7512e = 0;
                    this.f7511d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.f7509b = true;
                    this.f7510c = j10;
                    this.f7511d = 0;
                    this.f7512e = 0;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void zze() {
        switch (this.f7508a) {
            case 0:
                this.f7509b = false;
                this.f7510c = -9223372036854775807L;
                break;
            default:
                this.f7509b = false;
                this.f7510c = -9223372036854775807L;
                break;
        }
    }

    public o5(List list) {
        this.f7508a = 0;
        this.f7513f = list;
        this.f7514g = new b1[list.size()];
        this.f7510c = -9223372036854775807L;
    }
}
