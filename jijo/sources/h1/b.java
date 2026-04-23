package h1;

import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.internal.ads.en1;
import l6.f;
import n6.e;
import p6.g;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13929h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f13930q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Uri f13931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InputEvent f13932t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Uri uri, InputEvent inputEvent, e eVar) {
        super(eVar);
        this.f13930q = dVar;
        this.f13931s = uri;
        this.f13932t = inputEvent;
    }

    @Override // t6.p
    public final Object c(Object obj, Object obj2) {
        return ((b) e((e) obj2)).g(f.f15231a);
    }

    @Override // p6.a
    public final e e(e eVar) {
        return new b(this.f13930q, this.f13931s, this.f13932t, eVar);
    }

    @Override // p6.a
    public final Object g(Object obj) throws Throwable {
        o6.a aVar = o6.a.f16110a;
        int i10 = this.f13929h;
        if (i10 == 0) {
            en1.K(obj);
            q7.b bVar = this.f13930q.f13936a;
            this.f13929h = 1;
            if (bVar.p(this.f13931s, this.f13932t, this) == aVar) {
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
