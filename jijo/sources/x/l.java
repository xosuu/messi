package x;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f18247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f18248b;

    public static long a(f fVar, long j10) {
        p pVar = fVar.f18235d;
        if (pVar instanceof j) {
            return j10;
        }
        ArrayList arrayList = fVar.f18242k;
        int size = arrayList.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f18235d != pVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f18237f) + j10));
                }
            }
        }
        if (fVar != pVar.f18273i) {
            return jMin;
        }
        long j11 = pVar.j();
        f fVar3 = pVar.f18272h;
        long j12 = j10 - j11;
        return Math.min(Math.min(jMin, a(fVar3, j12)), j12 - ((long) fVar3.f18237f));
    }

    public static long b(f fVar, long j10) {
        p pVar = fVar.f18235d;
        if (pVar instanceof j) {
            return j10;
        }
        ArrayList arrayList = fVar.f18242k;
        int size = arrayList.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f18235d != pVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f18237f) + j10));
                }
            }
        }
        if (fVar != pVar.f18272h) {
            return jMax;
        }
        long j11 = pVar.j();
        f fVar3 = pVar.f18273i;
        long j12 = j10 + j11;
        return Math.max(Math.max(jMax, b(fVar3, j12)), j12 - ((long) fVar3.f18237f));
    }
}
