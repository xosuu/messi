package d7;

import b7.a1;
import b7.b1;
import b7.g0;
import b7.n0;
import b7.u0;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fb1;
import g4.a0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v3.k f12478a = new v3.k("NO_DECISION", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v3.k f12479b = new v3.k("UNDEFINED", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v3.k f12480c = new v3.k("REUSABLE_CLAIMED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v3.k f12481d = new v3.k("CONDITION_FALSE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v3.k f12482e = new v3.k("NO_THREAD_ELEMENTS", 2);

    public static final void a(n6.j jVar, Object obj) {
        if (obj == f12482e) {
            return;
        }
        if (!(obj instanceof t)) {
            Object objU = jVar.u(null, r.f12512f);
            a0.d(objU, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            fb1.t(objU);
            throw null;
        }
        t tVar = (t) obj;
        a1[] a1VarArr = tVar.f12517b;
        int length = a1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        a1 a1Var = a1VarArr[length];
        a0.c(null);
        Object obj2 = tVar.f12516a[length];
        throw null;
    }

    public static final void b(n6.e eVar, t6.l lVar) {
        l6.f fVar = l6.f.f15231a;
        if (!(eVar instanceof e)) {
            eVar.d(fVar);
            return;
        }
        e eVar2 = (e) eVar;
        Throwable thA = l6.c.a(fVar);
        Object lVar2 = thA == null ? lVar != null ? new b7.l(fVar, lVar) : fVar : new b7.k(thA, false);
        n6.e eVar3 = eVar2.f12488h;
        eVar3.getContext();
        b7.q qVar = eVar2.f12487f;
        if (qVar.E()) {
            eVar2.f12489q = lVar2;
            eVar2.f1394d = 1;
            qVar.D(eVar3.getContext(), eVar2);
            return;
        }
        g0 g0VarA = b1.a();
        if (g0VarA.f1414d >= 4294967296L) {
            eVar2.f12489q = lVar2;
            eVar2.f1394d = 1;
            m6.b bVar = g0VarA.f1416h;
            if (bVar == null) {
                bVar = new m6.b();
                g0VarA.f1416h = bVar;
            }
            bVar.addLast(eVar2);
            return;
        }
        g0VarA.H(true);
        try {
            n0 n0Var = (n0) eVar3.getContext().A(b7.r.f1440b);
            if (n0Var == null || n0Var.a()) {
                Object obj = eVar2.f12490s;
                n6.j context = eVar3.getContext();
                Object objC = c(context, obj);
                if (objC != f12482e) {
                    a0.D(eVar3, context);
                }
                try {
                    eVar3.d(fVar);
                } finally {
                    a(context, objC);
                }
            } else {
                CancellationException cancellationExceptionK = ((u0) n0Var).k();
                eVar2.b(lVar2, cancellationExceptionK);
                eVar2.d(en1.m(cancellationExceptionK));
            }
            while (g0VarA.I()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final Object c(n6.j jVar, Object obj) {
        if (obj == null) {
            obj = jVar.u(0, r.f12511d);
            a0.c(obj);
        }
        if (obj == 0) {
            return f12482e;
        }
        if (obj instanceof Integer) {
            return jVar.u(new t(jVar, ((Number) obj).intValue()), r.f12513h);
        }
        fb1.t(obj);
        throw null;
    }
}
