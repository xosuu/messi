package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ok0 implements ss0, k21, s60, cw0, no1, qm1, bf0, qe0, xp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7597b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7598d;

    public ok0(xq xqVar) {
        this.f7596a = 3;
        this.f7598d = xqVar;
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        synchronized (((ms0) this.f7598d)) {
            ((ms0) this.f7598d).f7042d = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.bf0
    public final void G(Object obj, p pVar) {
        fk1 fk1Var = (fk1) obj;
        fk1Var.k((is) this.f7598d, new cj0(pVar, ((nk1) this.f7597b).f7293h));
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void R(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var) {
        Pair pairD0 = d0(jo1Var);
        if (pairD0 != null) {
            ((tm0) ((rj1) this.f7598d).f8624i).b(new nj1(this, pairD0, bo1Var, gk1Var, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // com.google.android.gms.internal.ads.xp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.wz0 S(int r18, com.google.android.gms.internal.ads.ow r19, int[] r20) {
        /*
            r17 = this;
            r0 = r17
            r8 = r19
            java.lang.Object r1 = r0.f7597b
            r9 = r1
            com.google.android.gms.internal.ads.up1 r9 = (com.google.android.gms.internal.ads.up1) r9
            java.lang.Object r1 = r0.f7598d
            int[] r1 = (int[]) r1
            r1 = r1[r18]
            int r1 = r9.f10674a
            r10 = -1
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r13) goto L1b
            int r2 = r9.f10675b
            if (r2 != r13) goto L20
        L1b:
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L83
        L20:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L24:
            int r5 = r8.f7685a
            if (r3 >= r5) goto L82
            com.google.android.gms.internal.ads.y1[] r5 = r8.f7688d
            r5 = r5[r3]
            int r6 = r5.f10719r
            if (r6 <= 0) goto L7f
            int r7 = r5.f10720s
            if (r7 <= 0) goto L7f
            boolean r14 = r9.f10676c
            if (r14 == 0) goto L47
            if (r6 > r7) goto L3c
            r14 = 0
            goto L3d
        L3c:
            r14 = 1
        L3d:
            if (r1 > r2) goto L41
            r15 = 0
            goto L42
        L41:
            r15 = 1
        L42:
            if (r14 == r15) goto L47
            r14 = r1
            r15 = r2
            goto L49
        L47:
            r15 = r1
            r14 = r2
        L49:
            int r11 = r6 * r14
            int r12 = r7 * r15
            if (r11 < r12) goto L5a
            android.graphics.Point r11 = new android.graphics.Point
            int r14 = com.google.android.gms.internal.ads.yn0.f10944a
            int r12 = r12 + r6
            int r12 = r12 + r10
            int r12 = r12 / r6
            r11.<init>(r15, r12)
            goto L65
        L5a:
            android.graphics.Point r6 = new android.graphics.Point
            int r12 = com.google.android.gms.internal.ads.yn0.f10944a
            int r11 = r11 + r7
            int r11 = r11 + r10
            int r11 = r11 / r7
            r6.<init>(r11, r14)
            r11 = r6
        L65:
            int r5 = r5.f10719r
            int r6 = r5 * r7
            int r12 = r11.x
            float r12 = (float) r12
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r12 = r12 * r14
            int r12 = (int) r12
            if (r5 < r12) goto L7f
            int r5 = r11.y
            float r5 = (float) r5
            float r5 = r5 * r14
            int r5 = (int) r5
            if (r7 < r5) goto L7f
            if (r6 >= r4) goto L7f
            r4 = r6
        L7f:
            int r3 = r3 + 1
            goto L24
        L82:
            r11 = r4
        L83:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r12 = r1
            r14 = 0
            r15 = 0
        L89:
            int r1 = r8.f7685a
            if (r14 >= r1) goto Lc1
            com.google.android.gms.internal.ads.y1[] r1 = r8.f7688d
            r1 = r1[r14]
            int r1 = r1.a()
            if (r11 == r13) goto L9b
            if (r1 == r10) goto L9d
            if (r1 > r11) goto L9d
        L9b:
            r7 = 1
            goto L9e
        L9d:
            r7 = 0
        L9e:
            com.google.android.gms.internal.ads.zp1 r16 = new com.google.android.gms.internal.ads.zp1
            r6 = r20[r14]
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r14
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            int r1 = r15 + 1
            int r2 = r12.length
            if (r2 >= r1) goto Lbb
            int r2 = com.google.android.gms.internal.ads.vy0.d(r2, r1)
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r12, r2)
            r12 = r2
        Lbb:
            r12[r15] = r16
            int r14 = r14 + 1
            r15 = r1
            goto L89
        Lc1:
            com.google.android.gms.internal.ads.wz0 r1 = com.google.android.gms.internal.ads.bz0.j(r15, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ok0.S(int, com.google.android.gms.internal.ads.ow, int[]):com.google.android.gms.internal.ads.wz0");
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4a(Object obj) {
        synchronized (((ms0) this.f7598d)) {
            Object obj2 = this.f7598d;
            ((ms0) obj2).f7042d = null;
            ((ms0) obj2).f7041c.addFirst((bq0) this.f7597b);
            ms0 ms0Var = (ms0) this.f7598d;
            if (ms0Var.f7043e == 1) {
                ms0Var.b();
            }
        }
    }

    public final void a0(nh1 nh1Var) {
        ((List) this.f7598d).add(nh1Var);
    }

    public final void b0(nh1 nh1Var) {
        ((List) this.f7597b).add(nh1Var);
    }

    public final oh1 c0() {
        return new oh1((List) this.f7597b, (List) this.f7598d);
    }

    public final Pair d0(jo1 jo1Var) {
        jo1 jo1VarA;
        jo1 jo1Var2 = null;
        if (jo1Var != null) {
            pj1 pj1Var = (pj1) this.f7597b;
            int i10 = 0;
            while (true) {
                if (i10 >= pj1Var.f7902c.size()) {
                    jo1VarA = null;
                    break;
                }
                if (((jo1) pj1Var.f7902c.get(i10)).f6055d == jo1Var.f6055d) {
                    jo1VarA = jo1Var.a(Pair.create(pj1Var.f7901b, jo1Var.f6052a));
                    break;
                }
                i10++;
            }
            if (jo1VarA == null) {
                return null;
            }
            jo1Var2 = jo1VarA;
        }
        return Pair.create(Integer.valueOf(((pj1) this.f7597b).f7903d), jo1Var2);
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void g(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var) {
        Pair pairD0 = d0(jo1Var);
        if (pairD0 != null) {
            ((tm0) ((rj1) this.f7598d).f8624i).b(new nj1(this, pairD0, bo1Var, gk1Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void j(int i10, jo1 jo1Var, gk1 gk1Var) {
        Pair pairD0 = d0(jo1Var);
        if (pairD0 != null) {
            ((tm0) ((rj1) this.f7598d).f8624i).b(new l0.a(this, pairD0, gk1Var, 22, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void r(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var, IOException iOException, boolean z9) {
        Pair pairD0 = d0(jo1Var);
        if (pairD0 != null) {
            ((tm0) ((rj1) this.f7598d).f8624i).b(new mj1(this, pairD0, bo1Var, gk1Var, iOException, z9, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void u(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var) {
        Pair pairD0 = d0(jo1Var);
        if (pairD0 != null) {
            ((tm0) ((rj1) this.f7598d).f8624i).b(new nj1(this, pairD0, bo1Var, gk1Var, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        switch (this.f7596a) {
            case 2:
                ts0 ts0Var = (ts0) this.f7597b;
                ((ys0) obj).E((ws0) ts0Var.f9282a, ts0Var.f9283b, (Throwable) this.f7598d);
                break;
            case 8:
                ((fk1) obj).h((zzbp) this.f7598d);
                break;
            default:
                e10 e10Var = (e10) this.f7598d;
                ((fk1) obj).n(e10Var);
                int i10 = e10Var.f3802a;
                break;
        }
    }

    public /* synthetic */ ok0(Object obj, int i10, Object obj2) {
        this.f7596a = i10;
        this.f7597b = obj;
        this.f7598d = obj2;
    }

    public /* synthetic */ ok0(Object obj, Object obj2, int i10) {
        this.f7596a = i10;
        this.f7597b = obj2;
        this.f7598d = obj;
    }

    public ok0(int i10, int i11) {
        List arrayList;
        Object arrayList2;
        this.f7596a = 5;
        if (i10 == 0) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(i10);
        }
        this.f7597b = arrayList;
        if (i11 == 0) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(i11);
        }
        this.f7598d = arrayList2;
    }

    public ok0(Context context, int i10) {
        this.f7596a = i10;
        if (i10 == 10) {
            this.f7597b = context;
            return;
        }
        n11 n11Var = new n11();
        this.f7597b = context.getApplicationContext();
        this.f7598d = n11Var;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final hw0 zza() {
        n11 n11Var = (n11) ((cw0) this.f7598d);
        return new o01((Context) this.f7597b, new f41(null, n11Var.f7110b, n11Var.f7111d, false, n11Var.f7109a));
    }

    @Override // com.google.android.gms.internal.ads.ss0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final void mo6zza() {
        qk0 qk0Var = (qk0) this.f7597b;
        mg mgVar = (mg) this.f7598d;
        ng ngVar = (ng) qk0Var.f8207c;
        Parcel parcelM = ngVar.m();
        qb.e(parcelM, mgVar);
        ngVar.a0(parcelM, 1);
    }
}
