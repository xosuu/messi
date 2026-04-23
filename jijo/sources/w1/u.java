package w1;

/* JADX INFO: loaded from: classes.dex */
public final class u extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f18143a;

    @Override // w1.r, w1.p
    public final void a() {
        v vVar = this.f18143a;
        if (vVar.M) {
            return;
        }
        vVar.F();
        vVar.M = true;
    }

    @Override // w1.p
    public final void b(q qVar) {
        v vVar = this.f18143a;
        int i10 = vVar.L - 1;
        vVar.L = i10;
        if (i10 == 0) {
            vVar.M = false;
            vVar.m();
        }
        qVar.v(this);
    }
}
