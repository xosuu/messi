package s1;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class f implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f16677a;

    public f(SQLiteProgram sQLiteProgram) {
        this.f16677a = sQLiteProgram;
    }

    public final void A(int i10, String str) {
        this.f16677a.bindString(i10, str);
    }

    public final void a(byte[] bArr, int i10) {
        this.f16677a.bindBlob(i10, bArr);
    }

    public final void c(int i10, double d10) {
        this.f16677a.bindDouble(i10, d10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16677a.close();
    }

    public final void e(int i10, long j10) {
        this.f16677a.bindLong(i10, j10);
    }

    public final void u(int i10) {
        this.f16677a.bindNull(i10);
    }
}
