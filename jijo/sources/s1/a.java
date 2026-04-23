package s1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SQLiteDatabase.CursorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.e f16662b;

    public /* synthetic */ a(r1.e eVar, int i10) {
        this.f16661a = i10;
        this.f16662b = eVar;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i10 = this.f16661a;
        r1.e eVar = this.f16662b;
        switch (i10) {
            case 0:
                eVar.u(new f(sQLiteQuery));
                break;
            default:
                eVar.u(new f(sQLiteQuery));
                break;
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
