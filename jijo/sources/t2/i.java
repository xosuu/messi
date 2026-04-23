package t2;

import f7.d0;
import java.util.logging.Logger;
import p7.n;
import p7.p;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f16838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f16839b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f16840d;

    public i(d0 d0Var, q2.b bVar) {
        this.f16838a = d0Var;
        this.f16840d = new b(bVar, 0);
    }

    @Override // f7.d0
    public final long a() {
        return this.f16838a.a();
    }

    @Override // f7.d0
    public final p7.g c() {
        if (this.f16839b == null) {
            h hVar = new h(this, this.f16838a.c());
            Logger logger = n.f16294a;
            this.f16839b = new p(hVar);
        }
        return this.f16839b;
    }
}
