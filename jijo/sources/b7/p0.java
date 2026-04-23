package b7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(n0 n0Var) {
        super(true);
        boolean z9 = true;
        q(n0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u0.f1472b;
        g gVar = (g) atomicReferenceFieldUpdater.get(this);
        h hVar = gVar instanceof h ? (h) gVar : null;
        if (hVar == null) {
            z9 = false;
            break;
        }
        u0 u0VarK = hVar.k();
        while (!u0VarK.m()) {
            g gVar2 = (g) atomicReferenceFieldUpdater.get(u0VarK);
            h hVar2 = gVar2 instanceof h ? (h) gVar2 : null;
            if (hVar2 == null) {
                z9 = false;
                break;
            }
            u0VarK = hVar2.k();
        }
        this.f1436d = z9;
    }

    @Override // b7.u0
    public final boolean m() {
        return this.f1436d;
    }
}
