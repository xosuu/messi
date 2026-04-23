package b7;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends o0 implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f1417h;

    public h(u0 u0Var) {
        this.f1417h = u0Var;
    }

    @Override // b7.g
    public final boolean c(Throwable th) {
        u0 u0VarK = k();
        if (th instanceof CancellationException) {
            return true;
        }
        return u0VarK.f(th) && u0VarK.m();
    }

    @Override // t6.l
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        l((Throwable) obj);
        return l6.f.f15231a;
    }

    @Override // b7.q0
    public final void l(Throwable th) {
        ((u0) this.f1417h).f(k());
    }
}
