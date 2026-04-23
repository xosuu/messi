package b7;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends n6.a implements n6.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f1437b = new p(0);

    public q() {
        super(n6.f.f15980a);
    }

    @Override // n6.a, n6.j
    public final n6.h A(n6.i iVar) {
        g4.a0.f(iVar, "key");
        if (!(iVar instanceof n6.b)) {
            if (n6.f.f15980a == iVar) {
                return this;
            }
            return null;
        }
        n6.b bVar = (n6.b) iVar;
        n6.i iVar2 = this.f15972a;
        g4.a0.f(iVar2, "key");
        if (iVar2 != bVar && bVar.f15974b != iVar2) {
            return null;
        }
        n6.h hVar = (n6.h) bVar.f15973a.d(this);
        if (hVar instanceof n6.h) {
            return hVar;
        }
        return null;
    }

    public abstract void D(n6.j jVar, Runnable runnable);

    public boolean E() {
        return !(this instanceof c1);
    }

    @Override // n6.a, n6.j
    public final n6.j e(n6.i iVar) {
        g4.a0.f(iVar, "key");
        boolean z9 = iVar instanceof n6.b;
        n6.k kVar = n6.k.f15981a;
        if (z9) {
            n6.b bVar = (n6.b) iVar;
            n6.i iVar2 = this.f15972a;
            g4.a0.f(iVar2, "key");
            if ((iVar2 == bVar || bVar.f15974b == iVar2) && ((n6.h) bVar.f15973a.d(this)) != null) {
                return kVar;
            }
        } else if (n6.f.f15980a == iVar) {
            return kVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + u.m(this);
    }
}
