package d7;

import b7.a0;
import b7.b1;
import b7.g0;
import b7.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a0 implements p6.d, n6.e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12486t = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b7.q f12487f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n6.e f12488h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f12489q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f12490s;

    public e(b7.q qVar, p6.c cVar) {
        super(-1);
        this.f12487f = qVar;
        this.f12488h = cVar;
        this.f12489q = a.f12479b;
        n6.j jVar = cVar.f16255b;
        g4.a0.c(jVar);
        Object objU = jVar.u(0, r.f12511d);
        g4.a0.c(objU);
        this.f12490s = objU;
    }

    @Override // p6.d
    public final p6.d a() {
        n6.e eVar = this.f12488h;
        if (eVar instanceof p6.d) {
            return (p6.d) eVar;
        }
        return null;
    }

    @Override // b7.a0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof b7.l) {
            ((b7.l) obj).f1427b.d(cancellationException);
        }
    }

    @Override // b7.a0
    public final n6.e c() {
        return this;
    }

    @Override // n6.e
    public final void d(Object obj) {
        n6.e eVar = this.f12488h;
        n6.j context = eVar.getContext();
        Throwable thA = l6.c.a(obj);
        Object kVar = thA == null ? obj : new b7.k(thA, false);
        b7.q qVar = this.f12487f;
        if (qVar.E()) {
            this.f12489q = kVar;
            this.f1394d = 0;
            qVar.D(context, this);
            return;
        }
        g0 g0VarA = b1.a();
        if (g0VarA.f1414d >= 4294967296L) {
            this.f12489q = kVar;
            this.f1394d = 0;
            m6.b bVar = g0VarA.f1416h;
            if (bVar == null) {
                bVar = new m6.b();
                g0VarA.f1416h = bVar;
            }
            bVar.addLast(this);
            return;
        }
        g0VarA.H(true);
        try {
            n6.j context2 = eVar.getContext();
            Object objC = a.c(context2, this.f12490s);
            try {
                eVar.d(obj);
                while (g0VarA.I()) {
                }
            } finally {
                a.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // n6.e
    public final n6.j getContext() {
        return this.f12488h.getContext();
    }

    @Override // b7.a0
    public final Object h() {
        Object obj = this.f12489q;
        this.f12489q = a.f12479b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f12487f + ", " + u.A(this.f12488h) + ']';
    }
}
