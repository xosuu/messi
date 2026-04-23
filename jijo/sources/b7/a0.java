package b7;

import com.google.android.gms.internal.ads.e21;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tp1;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends e7.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1394d;

    public a0(int i10) {
        super(0L, e7.j.f12775g);
        this.f1394d = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract n6.e c();

    public Throwable e(Object obj) {
        k kVar = obj instanceof k ? (k) obj : null;
        if (kVar != null) {
            return kVar.f1424a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            g4.a0.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        g4.a0.c(th);
        tp1.k(c().getContext(), new e21("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Object objM = l6.f.f15231a;
        c2.n nVar = this.f12767b;
        try {
            n6.e eVarC = c();
            g4.a0.d(eVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            d7.e eVar = (d7.e) eVarC;
            n6.e eVar2 = eVar.f12488h;
            Object obj = eVar.f12490s;
            n6.j context = eVar2.getContext();
            Object objC = d7.a.c(context, obj);
            if (objC != d7.a.f12482e) {
                g4.a0.D(eVar2, context);
            }
            try {
                n6.j context2 = eVar2.getContext();
                Object objH = h();
                Throwable thE = e(objH);
                n0 n0Var = (thE == null && ((i10 = this.f1394d) == 1 || i10 == 2)) ? (n0) context2.A(r.f1440b) : null;
                if (n0Var != null && !n0Var.a()) {
                    CancellationException cancellationExceptionK = ((u0) n0Var).k();
                    b(objH, cancellationExceptionK);
                    eVar2.d(en1.m(cancellationExceptionK));
                } else if (thE != null) {
                    eVar2.d(en1.m(thE));
                } else {
                    eVar2.d(f(objH));
                }
                d7.a.a(context, objC);
                try {
                    nVar.getClass();
                } catch (Throwable th) {
                    objM = en1.m(th);
                }
                g(null, l6.c.a(objM));
            } catch (Throwable th2) {
                d7.a.a(context, objC);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                nVar.getClass();
            } catch (Throwable th4) {
                objM = en1.m(th4);
            }
            g(th3, l6.c.a(objM));
        }
    }
}
