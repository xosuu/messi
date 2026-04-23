package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f3138d = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p80 f3139f = new p80(new qz(5, (g1.a) null));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p80 f3140h = new p80(new qz(6, (g1.a) null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wz0 f3141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qz f3142b = new qz(15, (g1.a) null);

    public final void a(int i10, ArrayList arrayList) {
        qz qzVar = this.f3142b;
        switch (i10) {
            case 0:
                arrayList.add(new r3(1));
                break;
            case 1:
                arrayList.add(new r3(2));
                break;
            case 2:
                arrayList.add(new l5());
                break;
            case 3:
                arrayList.add(new e1());
                break;
            case 4:
                g0 g0VarD = f3139f.d(0);
                if (g0VarD == null) {
                    arrayList.add(new q1());
                } else {
                    arrayList.add(g0VarD);
                }
                break;
            case 5:
                arrayList.add(new s1());
                break;
            case 6:
                arrayList.add(new h2(new e2(), 0, qzVar));
                break;
            case 7:
                arrayList.add(new l2());
                break;
            case 8:
                arrayList.add(new e3(qzVar, 0, wz0.f10382h));
                arrayList.add(new h3(0, qzVar));
                break;
            case 9:
                arrayList.add(new r3(0));
                break;
            case 10:
                arrayList.add(new g6());
                break;
            case 11:
                if (this.f3141a == null) {
                    zy0 zy0Var = bz0.f3132b;
                    this.f3141a = wz0.f10382h;
                }
                nn0 nn0Var = new nn0();
                wz0 wz0Var = this.f3141a;
                c1.d dVar = new c1.d();
                dVar.f1500a = wz0Var;
                arrayList.add(new l6(qzVar, nn0Var, dVar));
                break;
            case 12:
                s6 s6Var = new s6();
                s6Var.f8805c = 0;
                s6Var.f8806d = -1L;
                s6Var.f8808f = -1;
                s6Var.f8809g = -1L;
                arrayList.add(s6Var);
                break;
            case 14:
                arrayList.add(new o1());
                break;
            case 15:
                g0 g0VarD2 = f3140h.d(new Object[0]);
                if (g0VarD2 != null) {
                    arrayList.add(g0VarD2);
                }
                break;
            case 16:
                arrayList.add(new g1(qzVar));
                break;
            case 17:
                arrayList.add(new o1(1));
                break;
            case 18:
                arrayList.add(new n1(2));
                break;
            case 19:
                arrayList.add(new o1(0));
                break;
            case 20:
                arrayList.add(new n1(1));
                break;
            case sf.zzm /* 21 */:
                arrayList.add(new n1(0));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    @Override // com.google.android.gms.internal.ads.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.g0[] h(android.net.Uri r27, java.util.Map r28) {
        /*
            Method dump skipped, instruction units count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c0.h(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.g0[]");
    }
}
