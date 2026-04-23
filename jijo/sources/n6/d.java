package n6;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.tp1;
import g4.a0;
import java.io.Serializable;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f15979b;

    public d(h hVar, j jVar) {
        a0.f(jVar, "left");
        a0.f(hVar, "element");
        this.f15978a = jVar;
        this.f15979b = hVar;
    }

    @Override // n6.j
    public final h A(i iVar) {
        a0.f(iVar, "key");
        d dVar = this;
        while (true) {
            h hVarA = dVar.f15979b.A(iVar);
            if (hVarA != null) {
                return hVarA;
            }
            j jVar = dVar.f15978a;
            if (!(jVar instanceof d)) {
                return jVar.A(iVar);
            }
            dVar = (d) jVar;
        }
    }

    @Override // n6.j
    public final j c(j jVar) {
        return tp1.o(this, jVar);
    }

    @Override // n6.j
    public final j e(i iVar) {
        a0.f(iVar, "key");
        h hVar = this.f15979b;
        h hVarA = hVar.A(iVar);
        j jVar = this.f15978a;
        if (hVarA != null) {
            return jVar;
        }
        j jVarE = jVar.e(iVar);
        return jVarE == jVar ? this : jVarE == k.f15981a ? hVar : new d(hVar, jVarE);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                dVar.getClass();
                int i10 = 2;
                d dVar2 = dVar;
                int i11 = 2;
                while (true) {
                    j jVar = dVar2.f15978a;
                    dVar2 = jVar instanceof d ? (d) jVar : null;
                    if (dVar2 == null) {
                        break;
                    }
                    i11++;
                }
                d dVar3 = this;
                while (true) {
                    j jVar2 = dVar3.f15978a;
                    dVar3 = jVar2 instanceof d ? (d) jVar2 : null;
                    if (dVar3 == null) {
                        break;
                    }
                    i10++;
                }
                if (i11 == i10) {
                    d dVar4 = this;
                    while (true) {
                        h hVar = dVar4.f15979b;
                        if (!a0.b(dVar.A(hVar.getKey()), hVar)) {
                            break;
                        }
                        j jVar3 = dVar4.f15978a;
                        if (jVar3 instanceof d) {
                            dVar4 = (d) jVar3;
                        } else {
                            a0.d(jVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            h hVar2 = (h) jVar3;
                            if (a0.b(dVar.A(hVar2.getKey()), hVar2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15979b.hashCode() + this.f15978a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) u(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, c.f15975d)) + ']';
    }

    @Override // n6.j
    public final Object u(Object obj, p pVar) {
        return pVar.c(this.f15978a.u(obj, pVar), this.f15979b);
    }
}
