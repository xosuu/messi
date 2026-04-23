package v5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f17810b;

    public c(g gVar, g gVar2) {
        this.f17810b = gVar;
        this.f17809a = gVar2;
    }

    @Override // v5.a
    public final void a(b bVar) {
    }

    @Override // v5.a
    public final void b() {
    }

    @Override // v5.a
    public final void c(b bVar) {
        bVar.e(this);
        g gVar = this.f17810b;
        gVar.f17822b.remove(bVar);
        g gVar2 = this.f17809a;
        ((f) gVar2.f17823d.get(bVar)).f17821q = true;
        if (gVar.f17828t) {
            return;
        }
        ArrayList arrayList = gVar2.f17825h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((f) arrayList.get(i10)).f17821q) {
                return;
            }
        }
        ArrayList arrayList2 = gVar.f17808a;
        if (arrayList2 != null) {
            ArrayList arrayList3 = (ArrayList) arrayList2.clone();
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((a) arrayList3.get(i11)).c(gVar2);
            }
        }
        gVar2.f17829u = false;
    }
}
