package i1;

import com.google.android.gms.internal.ads.en1;
import l6.f;
import n6.e;
import p6.g;
import t3.i;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14160h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f14161q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k1.a f14162s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, k1.a aVar, e eVar) {
        super(eVar);
        this.f14161q = bVar;
        this.f14162s = aVar;
    }

    @Override // t6.p
    public final Object c(Object obj, Object obj2) {
        return ((a) e((e) obj2)).g(f.f15231a);
    }

    @Override // p6.a
    public final e e(e eVar) {
        return new a(this.f14161q, this.f14162s, eVar);
    }

    @Override // p6.a
    public final Object g(Object obj) throws Throwable {
        o6.a aVar = o6.a.f16110a;
        int i10 = this.f14160h;
        if (i10 == 0) {
            en1.K(obj);
            i iVar = this.f14161q.f14163a;
            this.f14160h = 1;
            obj = iVar.l(this.f14162s, this);
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
