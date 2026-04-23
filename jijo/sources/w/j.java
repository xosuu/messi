package w;

import b7.u;
import java.util.ArrayList;
import x.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends d implements i {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public d[] f18067q0 = new d[4];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f18068r0 = 0;

    public final void S(int i10, o oVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f18068r0; i11++) {
            d dVar = this.f18067q0[i11];
            ArrayList arrayList2 = oVar.f18260a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i12 = 0; i12 < this.f18068r0; i12++) {
            u.j(this.f18067q0[i12], i10, arrayList, oVar);
        }
    }

    public void a() {
    }
}
