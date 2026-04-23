package n6;

import g4.a0;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public final class c extends u6.e implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f15975d = new c(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f15976f = new c(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15977b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(2);
        this.f15977b = i10;
    }

    @Override // t6.p
    public final Object c(Object obj, Object obj2) {
        d dVar;
        switch (this.f15977b) {
            case 0:
                String str = (String) obj;
                h hVar = (h) obj2;
                a0.f(str, "acc");
                a0.f(hVar, "element");
                if (str.length() == 0) {
                    return hVar.toString();
                }
                return str + ", " + hVar;
            default:
                j jVar = (j) obj;
                h hVar2 = (h) obj2;
                a0.f(jVar, "acc");
                a0.f(hVar2, "element");
                j jVarE = jVar.e(hVar2.getKey());
                k kVar = k.f15981a;
                if (jVarE == kVar) {
                    return hVar2;
                }
                f fVar = f.f15980a;
                g gVar = (g) jVarE.A(fVar);
                if (gVar == null) {
                    dVar = new d(hVar2, jVarE);
                } else {
                    j jVarE2 = jVarE.e(fVar);
                    if (jVarE2 == kVar) {
                        return new d(gVar, hVar2);
                    }
                    dVar = new d(gVar, new d(hVar2, jVarE2));
                }
                return dVar;
        }
    }
}
