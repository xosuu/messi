package b7;

import com.google.android.gms.internal.ads.tp1;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends u0 implements n6.e, t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n6.j f1393d;

    public a(n6.j jVar, boolean z9) {
        super(z9);
        q((n0) jVar.A(r.f1440b));
        this.f1393d = jVar.c(this);
    }

    @Override // b7.u0, b7.n0
    public final boolean a() {
        return super.a();
    }

    @Override // n6.e
    public final void d(Object obj) {
        Object objB;
        Throwable thA = l6.c.a(obj);
        if (thA != null) {
            obj = new k(thA, false);
        }
        do {
            objB = B(o(), obj);
            if (objB == u.f1462j) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                k kVar = obj instanceof k ? (k) obj : null;
                throw new IllegalStateException(str, kVar != null ? kVar.f1424a : null);
            }
        } while (objB == u.f1464l);
    }

    @Override // b7.u0
    public final String g() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // n6.e
    public final n6.j getContext() {
        return this.f1393d;
    }

    @Override // b7.u0
    public final void p(CompletionHandlerException completionHandlerException) {
        tp1.k(this.f1393d, completionHandlerException);
    }

    @Override // b7.u0
    public final String s() {
        return super.s();
    }

    @Override // b7.u0
    public final void w(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            Throwable th = kVar.f1424a;
            kVar.getClass();
            k.f1423b.get(kVar);
        }
    }
}
