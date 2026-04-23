package h1;

import android.net.Uri;
import com.google.android.gms.internal.ads.en1;
import l6.f;
import n6.e;
import p6.g;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13933h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f13934q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Uri f13935s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Uri uri, e eVar) {
        super(eVar);
        this.f13934q = dVar;
        this.f13935s = uri;
    }

    @Override // t6.p
    public final Object c(Object obj, Object obj2) {
        return ((c) e((e) obj2)).g(f.f15231a);
    }

    @Override // p6.a
    public final e e(e eVar) {
        return new c(this.f13934q, this.f13935s, eVar);
    }

    @Override // p6.a
    public final Object g(Object obj) throws Throwable {
        o6.a aVar = o6.a.f16110a;
        int i10 = this.f13933h;
        if (i10 == 0) {
            en1.K(obj);
            q7.b bVar = this.f13934q.f13936a;
            this.f13933h = 1;
            if (bVar.q(this.f13935s, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            en1.K(obj);
        }
        return f.f15231a;
    }
}
