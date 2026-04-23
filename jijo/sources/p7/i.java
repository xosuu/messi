package p7;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f16282a;

    public i(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16282a = sVar;
    }

    @Override // p7.s
    public final v b() {
        return this.f16282a.b();
    }

    @Override // p7.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16282a.close();
    }

    @Override // p7.s, java.io.Flushable
    public final void flush() {
        this.f16282a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f16282a.toString() + ")";
    }
}
