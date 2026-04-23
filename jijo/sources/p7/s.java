package p7;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface s extends Closeable, Flushable {
    v b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void h(e eVar, long j10);
}
