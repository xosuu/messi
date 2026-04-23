package h1;

import com.google.android.gms.internal.ads.en1;
import l6.f;
import n6.e;
import p6.g;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13927h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f13928q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, e eVar) {
        super(eVar);
        this.f13928q = dVar;
    }

    @Override // t6.p
    public final Object c(Object obj, Object obj2) {
        return ((a) e((e) obj2)).g(f.f15231a);
    }

    @Override // p6.a
    public final e e(e eVar) {
        return new a(this.f13928q, eVar);
    }

    @Override // p6.a
    public final Object g(Object obj) throws Throwable {
        o6.a aVar = o6.a.f16110a;
        int i10 = this.f13927h;
        if (i10 == 0) {
            en1.K(obj);
            q7.b bVar = this.f13928q.f13936a;
            this.f13927h = 1;
            obj = bVar.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            en1.K(obj);
        }
        return obj;
    }
}
