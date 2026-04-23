package s1;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class g extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f16678b;

    public g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f16678b = sQLiteStatement;
    }

    public final void D() {
        this.f16678b.executeUpdateDelete();
    }
}
