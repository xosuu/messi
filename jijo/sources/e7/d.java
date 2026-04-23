package e7;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f12763f = new d(j.f12771c, j.f12772d, j.f12769a, j.f12773e);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // b7.q
    public final String toString() {
        return "Dispatchers.Default";
    }
}
