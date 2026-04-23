package l0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements n0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15107b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f15106a = i10;
        this.f15107b = obj;
    }

    @Override // n0.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f15106a) {
            case 0:
                b((g) obj);
                break;
            default:
                b((g) obj);
                break;
        }
    }

    public final void b(g gVar) {
        switch (this.f15106a) {
            case 0:
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((f.f) this.f15107b).E(gVar);
                return;
            default:
                synchronized (h.f15112c) {
                    try {
                        s.k kVar = h.f15113d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f15107b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f15107b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((n0.a) arrayList.get(i10)).a(gVar);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
