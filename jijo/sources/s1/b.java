package s1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class b implements r1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f16663b = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f16664a;

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f16664a = sQLiteDatabase;
    }

    public final Cursor A(r1.e eVar) {
        return this.f16664a.rawQueryWithFactory(new a(eVar, 0), eVar.c(), f16663b, null);
    }

    public final void D() {
        this.f16664a.setTransactionSuccessful();
    }

    public final void a() {
        this.f16664a.beginTransaction();
    }

    public final void c() {
        this.f16664a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16664a.close();
    }

    public final void e(String str) {
        this.f16664a.execSQL(str);
    }

    public final Cursor u(String str) {
        return A(new f.f(str));
    }
}
