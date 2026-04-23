package f7;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 implements Closeable {
    public abstract long a();

    public abstract p7.g c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g7.b.d(c());
    }
}
