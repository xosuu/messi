package e7;

import b7.h0;
import b7.q;
import com.google.android.gms.internal.ads.fb1;
import g4.a0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f12761d = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f12762f;

    static {
        k kVar = k.f12777d;
        int i10 = d7.q.f12510a;
        if (64 >= i10) {
            i10 = 64;
        }
        int iC = a0.C("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12);
        kVar.getClass();
        if (iC < 1) {
            throw new IllegalArgumentException(fb1.g("Expected positive parallelism level, but got ", iC).toString());
        }
        q fVar = kVar;
        if (iC < j.f12772d) {
            if (iC < 1) {
                throw new IllegalArgumentException(fb1.g("Expected positive parallelism level, but got ", iC).toString());
            }
            fVar = new d7.f(kVar, iC);
        }
        f12762f = fVar;
    }

    @Override // b7.q
    public final void D(n6.j jVar, Runnable runnable) {
        f12762f.D(jVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D(n6.k.f15981a, runnable);
    }

    @Override // b7.q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
