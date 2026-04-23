package w1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f18114g;

    public k(l lVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f18114g = lVar;
        this.f18108a = obj;
        this.f18109b = arrayList;
        this.f18110c = obj2;
        this.f18111d = arrayList2;
        this.f18112e = obj3;
        this.f18113f = arrayList3;
    }

    @Override // w1.r, w1.p
    public final void a() {
        l lVar = this.f18114g;
        Object obj = this.f18108a;
        if (obj != null) {
            lVar.u(obj, this.f18109b, null);
        }
        Object obj2 = this.f18110c;
        if (obj2 != null) {
            lVar.u(obj2, this.f18111d, null);
        }
        Object obj3 = this.f18112e;
        if (obj3 != null) {
            lVar.u(obj3, this.f18113f, null);
        }
    }

    @Override // w1.p
    public final void b(q qVar) {
        qVar.v(this);
    }
}
