package p7;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f16283a;

    public j(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16283a = tVar;
    }

    @Override // p7.t
    public final v b() {
        return this.f16283a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16283a.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f16283a.toString() + ")";
    }
}
