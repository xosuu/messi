package w;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f18069a = new boolean[3];

    public static void a(e eVar, u.d dVar, d dVar2) {
        dVar2.f18010o = -1;
        dVar2.f18012p = -1;
        int i10 = eVar.f18013p0[0];
        int[] iArr = dVar2.f18013p0;
        if (i10 != 2 && iArr[0] == 4) {
            c cVar = dVar2.I;
            int i11 = cVar.f17979g;
            int iR = eVar.r();
            c cVar2 = dVar2.K;
            int i12 = iR - cVar2.f17979g;
            cVar.f17981i = dVar.k(cVar);
            cVar2.f17981i = dVar.k(cVar2);
            dVar.d(cVar.f17981i, i11);
            dVar.d(cVar2.f17981i, i12);
            dVar2.f18010o = 2;
            dVar2.Y = i11;
            int i13 = i12 - i11;
            dVar2.U = i13;
            int i14 = dVar2.f17985b0;
            if (i13 < i14) {
                dVar2.U = i14;
            }
        }
        if (eVar.f18013p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        c cVar3 = dVar2.J;
        int i15 = cVar3.f17979g;
        int iL = eVar.l();
        c cVar4 = dVar2.L;
        int i16 = iL - cVar4.f17979g;
        cVar3.f17981i = dVar.k(cVar3);
        cVar4.f17981i = dVar.k(cVar4);
        dVar.d(cVar3.f17981i, i15);
        dVar.d(cVar4.f17981i, i16);
        if (dVar2.f17983a0 > 0 || dVar2.f17995g0 == 8) {
            c cVar5 = dVar2.M;
            u.i iVarK = dVar.k(cVar5);
            cVar5.f17981i = iVarK;
            dVar.d(iVarK, dVar2.f17983a0 + i15);
        }
        dVar2.f18012p = 2;
        dVar2.Z = i15;
        int i17 = i16 - i15;
        dVar2.V = i17;
        int i18 = dVar2.f17987c0;
        if (i17 < i18) {
            dVar2.V = i18;
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
