package t2;

import f7.s;
import f7.u;
import java.util.logging.Logger;
import p7.n;
import p7.o;

/* JADX INFO: loaded from: classes.dex */
public final class g extends t3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3.i f16833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f16834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f16835d;

    public g(u uVar, q2.b bVar) {
        this.f16833b = uVar;
        this.f16835d = new b(bVar);
    }

    @Override // t3.i
    public final long h() {
        return this.f16833b.h();
    }

    @Override // t3.i
    public final s i() {
        return this.f16833b.i();
    }

    @Override // t3.i
    public final void z(p7.f fVar) {
        if (this.f16834c == null) {
            f fVar2 = new f(this, fVar);
            Logger logger = n.f16294a;
            this.f16834c = new o(fVar2);
        }
        this.f16833b.z(this.f16834c);
        this.f16834c.flush();
    }
}
