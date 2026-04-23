package c7;

import android.os.Handler;
import android.os.Looper;
import b7.b0;
import b7.n0;
import b7.r;
import b7.u0;
import b7.v0;
import b7.z;
import d7.m;
import g4.a0;
import java.util.concurrent.CancellationException;
import n6.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends v0 implements z {
    private volatile c _immediate;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f1579d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1580f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1581h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f1582q;

    public c(Handler handler, String str, boolean z9) {
        this.f1579d = handler;
        this.f1580f = str;
        this.f1581h = z9;
        this._immediate = z9 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f1582q = cVar;
    }

    @Override // b7.q
    public final void D(j jVar, Runnable runnable) {
        if (this.f1579d.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        n0 n0Var = (n0) jVar.A(r.f1440b);
        if (n0Var != null) {
            ((u0) n0Var).f(cancellationException);
        }
        b0.f1397b.D(jVar, runnable);
    }

    @Override // b7.q
    public final boolean E() {
        return (this.f1581h && a0.b(Looper.myLooper(), this.f1579d.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f1579d == this.f1579d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1579d);
    }

    @Override // b7.q
    public final String toString() {
        c cVar;
        String str;
        e7.d dVar = b0.f1396a;
        v0 v0Var = m.f12508a;
        if (this == v0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = ((c) v0Var).f1582q;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f1580f;
        if (string == null) {
            string = this.f1579d.toString();
        }
        return this.f1581h ? g1.a.y(string, ".immediate") : string;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
