package e8;

import com.google.android.gms.internal.ads.ql1;
import f8.y;
import java.util.Iterator;
import x7.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends org.minidns.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f12784p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ql1 ql1Var) {
        super(ql1Var);
        this.f12784p = cVar;
    }

    @Override // org.minidns.a
    public final boolean c(e eVar, y7.c cVar) {
        boolean z9;
        Iterator it = cVar.f20468a.f18541l.iterator();
        while (true) {
            if (!it.hasNext()) {
                z9 = false;
                break;
            }
            if (((y) it.next()).d(eVar)) {
                z9 = true;
                break;
            }
        }
        return this.f12784p.c(eVar, cVar) && z9;
    }

    @Override // org.minidns.a
    public final x7.a d(x7.a aVar) {
        aVar.f18511g = true;
        if (aVar.f18520p == null) {
            aVar.f18520p = new c8.a();
        }
        c8.a aVar2 = aVar.f18520p;
        this.f16128e.getClass();
        aVar2.f1583a = 1024;
        aVar2.f1584b = false;
        return this.f12784p.d(aVar);
    }
}
