package w;

import com.google.android.gms.internal.ads.ur0;
import g4.d0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import x.n;
import x.p;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final x.b L0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ur0 f18024r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final x.e f18025s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f18026t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public n f18027u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f18028v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final u.d f18029w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f18030x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f18031y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f18032z0;

    public e() {
        this.f18070q0 = new ArrayList();
        this.f18024r0 = new ur0(this);
        x.e eVar = new x.e();
        eVar.f18223a = true;
        eVar.f18224b = true;
        eVar.f18227e = new ArrayList();
        eVar.f18228f = new ArrayList();
        eVar.f18230h = null;
        eVar.f18231i = new x.b();
        eVar.f18229g = new ArrayList();
        eVar.f18225c = this;
        eVar.f18226d = this;
        this.f18025s0 = eVar;
        this.f18027u0 = null;
        this.f18028v0 = false;
        this.f18029w0 = new u.d();
        this.f18032z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new x.b();
    }

    public static void W(d dVar, n nVar, x.b bVar) {
        int i10;
        int i11;
        if (nVar == null) {
            return;
        }
        if (dVar.f17995g0 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f18215e = 0;
            bVar.f18216f = 0;
            return;
        }
        int[] iArr = dVar.f18013p0;
        bVar.f18211a = iArr[0];
        bVar.f18212b = iArr[1];
        bVar.f18213c = dVar.r();
        bVar.f18214d = dVar.l();
        bVar.f18219i = false;
        bVar.f18220j = 0;
        boolean z9 = bVar.f18211a == 3;
        boolean z10 = bVar.f18212b == 3;
        boolean z11 = z9 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        if (z9 && dVar.u(0) && dVar.f18015r == 0 && !z11) {
            bVar.f18211a = 2;
            if (z10 && dVar.f18016s == 0) {
                bVar.f18211a = 1;
            }
            z9 = false;
        }
        if (z10 && dVar.u(1) && dVar.f18016s == 0 && !z12) {
            bVar.f18212b = 2;
            if (z9 && dVar.f18015r == 0) {
                bVar.f18212b = 1;
            }
            z10 = false;
        }
        if (dVar.B()) {
            bVar.f18211a = 1;
            z9 = false;
        }
        if (dVar.C()) {
            bVar.f18212b = 1;
            z10 = false;
        }
        int[] iArr2 = dVar.f18017t;
        if (z11) {
            if (iArr2[0] == 4) {
                bVar.f18211a = 1;
            } else if (!z10) {
                if (bVar.f18212b == 1) {
                    i11 = bVar.f18214d;
                } else {
                    bVar.f18211a = 2;
                    nVar.b(dVar, bVar);
                    i11 = bVar.f18216f;
                }
                bVar.f18211a = 1;
                bVar.f18213c = (int) (dVar.W * i11);
            }
        }
        if (z12) {
            if (iArr2[1] == 4) {
                bVar.f18212b = 1;
            } else if (!z9) {
                if (bVar.f18211a == 1) {
                    i10 = bVar.f18213c;
                } else {
                    bVar.f18212b = 2;
                    nVar.b(dVar, bVar);
                    i10 = bVar.f18215e;
                }
                bVar.f18212b = 1;
                if (dVar.X == -1) {
                    bVar.f18214d = (int) (i10 / dVar.W);
                } else {
                    bVar.f18214d = (int) (dVar.W * i10);
                }
            }
        }
        nVar.b(dVar, bVar);
        dVar.P(bVar.f18215e);
        dVar.M(bVar.f18216f);
        dVar.E = bVar.f18218h;
        dVar.J(bVar.f18217g);
        bVar.f18220j = 0;
    }

    @Override // w.l, w.d
    public final void D() {
        this.f18029w0.t();
        this.f18030x0 = 0;
        this.f18031y0 = 0;
        super.D();
    }

    @Override // w.d
    public final void Q(boolean z9, boolean z10) {
        super.Q(z9, z10);
        int size = this.f18070q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f18070q0.get(i10)).Q(z9, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x067a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x07a5 A[PHI: r22 r23 r25
      0x07a5: PHI (r22v4 boolean) = (r22v10 boolean), (r22v19 boolean) binds: [B:477:0x07b4, B:472:0x07a2] A[DONT_GENERATE, DONT_INLINE]
      0x07a5: PHI (r23v3 java.lang.Object) = (r23v5 java.lang.Object), (r23v10 java.lang.Object) binds: [B:477:0x07b4, B:472:0x07a2] A[DONT_GENERATE, DONT_INLINE]
      0x07a5: PHI (r25v3 w.c) = (r25v5 w.c), (r25v12 w.c) binds: [B:477:0x07b4, B:472:0x07a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x080a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0816 A[LOOP:14: B:498:0x0814->B:499:0x0816, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x08e4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // w.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S() {
        /*
            Method dump skipped, instruction units count: 2301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.S():void");
    }

    public final void T(int i10, d dVar) {
        if (i10 == 0) {
            int i11 = this.f18032z0 + 1;
            b[] bVarArr = this.C0;
            if (i11 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i12 = this.f18032z0;
            bVarArr2[i12] = new b(dVar, 0, this.f18028v0);
            this.f18032z0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i13 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i14 = this.A0;
            bVarArr4[i14] = new b(dVar, 1, this.f18028v0);
            this.A0 = i14 + 1;
        }
    }

    public final void U(u.d dVar) {
        boolean zX = X(64);
        c(dVar, zX);
        int size = this.f18070q0.size();
        boolean z9 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar2 = (d) this.f18070q0.get(i10);
            boolean[] zArr = dVar2.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z9 = true;
            }
        }
        if (z9) {
            for (int i11 = 0; i11 < size; i11++) {
                d dVar3 = (d) this.f18070q0.get(i11);
                if (dVar3 instanceof a) {
                    a aVar = (a) dVar3;
                    for (int i12 = 0; i12 < aVar.f18068r0; i12++) {
                        d dVar4 = aVar.f18067q0[i12];
                        if (aVar.f17953t0 || dVar4.d()) {
                            int i13 = aVar.f17952s0;
                            if (i13 == 0 || i13 == 1) {
                                dVar4.S[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                dVar4.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            d dVar5 = (d) this.f18070q0.get(i14);
            dVar5.getClass();
            boolean z10 = dVar5 instanceof g;
            if (z10 || (dVar5 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar5);
                } else {
                    dVar5.c(dVar, zX);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i15 = 0; i15 < gVar.f18068r0; i15++) {
                    if (hashSet.contains(gVar.f18067q0[i15])) {
                        gVar.c(dVar, zX);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).c(dVar, zX);
                }
                hashSet.clear();
            }
        }
        if (u.d.f17468p) {
            HashSet<d> hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                d dVar6 = (d) this.f18070q0.get(i16);
                dVar6.getClass();
                if (!(dVar6 instanceof g) && !(dVar6 instanceof h)) {
                    hashSet2.add(dVar6);
                }
            }
            b(this, dVar, hashSet2, this.f18013p0[0] == 2 ? 0 : 1, false);
            for (d dVar7 : hashSet2) {
                k.a(this, dVar, dVar7);
                dVar7.c(dVar, zX);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                d dVar8 = (d) this.f18070q0.get(i17);
                if (dVar8 instanceof e) {
                    int[] iArr = dVar8.f18013p0;
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    if (i18 == 2) {
                        dVar8.N(1);
                    }
                    if (i19 == 2) {
                        dVar8.O(1);
                    }
                    dVar8.c(dVar, zX);
                    if (i18 == 2) {
                        dVar8.N(i18);
                    }
                    if (i19 == 2) {
                        dVar8.O(i19);
                    }
                } else {
                    k.a(this, dVar, dVar8);
                    if (!(dVar8 instanceof g) && !(dVar8 instanceof h)) {
                        dVar8.c(dVar, zX);
                    }
                }
            }
        }
        if (this.f18032z0 > 0) {
            d0.a(this, dVar, null, 0);
        }
        if (this.A0 > 0) {
            d0.a(this, dVar, null, 1);
        }
    }

    public final boolean V(int i10, boolean z9) {
        boolean z10;
        boolean z11 = true;
        boolean z12 = z9 & true;
        x.e eVar = this.f18025s0;
        e eVar2 = (e) eVar.f18225c;
        int iK = eVar2.k(0);
        int iK2 = eVar2.k(1);
        int iS = eVar2.s();
        int iT = eVar2.t();
        Object obj = eVar.f18227e;
        if (z12 && (iK == 2 || iK2 == 2)) {
            Iterator it = ((ArrayList) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f18270f == i10 && !pVar.k()) {
                    z12 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z12 && iK == 2) {
                    eVar2.N(1);
                    eVar2.P(eVar.d(eVar2, 0));
                    eVar2.f17988d.f18269e.d(eVar2.r());
                }
            } else if (z12 && iK2 == 2) {
                eVar2.O(1);
                eVar2.M(eVar.d(eVar2, 1));
                eVar2.f17990e.f18269e.d(eVar2.l());
            }
        }
        if (i10 == 0) {
            int i11 = eVar2.f18013p0[0];
            if (i11 == 1 || i11 == 4) {
                int iR = eVar2.r() + iS;
                eVar2.f17988d.f18273i.d(iR);
                eVar2.f17988d.f18269e.d(iR - iS);
                z10 = true;
            }
            z10 = false;
        } else {
            int i12 = eVar2.f18013p0[1];
            if (i12 == 1 || i12 == 4) {
                int iL = eVar2.l() + iT;
                eVar2.f17990e.f18273i.d(iL);
                eVar2.f17990e.f18269e.d(iL - iT);
                z10 = true;
            }
            z10 = false;
        }
        eVar.g();
        ArrayList<p> arrayList = (ArrayList) obj;
        for (p pVar2 : arrayList) {
            if (pVar2.f18270f == i10 && (pVar2.f18266b != eVar2 || pVar2.f18271g)) {
                pVar2.e();
            }
        }
        for (p pVar3 : arrayList) {
            if (pVar3.f18270f == i10 && (z10 || pVar3.f18266b != eVar2)) {
                if (!pVar3.f18272h.f18241j || !pVar3.f18273i.f18241j || (!(pVar3 instanceof x.c) && !pVar3.f18269e.f18241j)) {
                    z11 = false;
                    break;
                }
            }
        }
        eVar2.N(iK);
        eVar2.O(iK2);
        return z11;
    }

    public final boolean X(int i10) {
        return (this.D0 & i10) == i10;
    }

    @Override // w.d
    public final void o(StringBuilder sb) {
        sb.append(this.f18000j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        Iterator it = this.f18070q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
