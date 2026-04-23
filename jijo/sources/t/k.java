package t;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f16801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16802b = new j(this);

    public k(i iVar) {
        this.f16801a = new WeakReference(iVar);
    }

    @Override // n5.a
    public final void a(Runnable runnable, Executor executor) {
        this.f16802b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        i iVar = (i) this.f16801a.get();
        boolean zCancel = this.f16802b.cancel(z9);
        if (zCancel && iVar != null) {
            iVar.f16796a = null;
            iVar.f16797b = null;
            iVar.f16798c.i(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f16802b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16802b.f16793a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16802b.isDone();
    }

    public final String toString() {
        return this.f16802b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f16802b.get(j10, timeUnit);
    }
}
