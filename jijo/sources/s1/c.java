package s1;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import l.b0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f16665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b[] f16666b;

    public c(b0 b0Var, b[] bVarArr) {
        this.f16665a = b0Var;
        this.f16666b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b bVarA = d.a(this.f16666b, sQLiteDatabase);
        this.f16665a.getClass();
        bVarA.f16664a.getPath();
        SQLiteDatabase sQLiteDatabase2 = bVarA.f16664a;
        if (!sQLiteDatabase2.isOpen()) {
            b0.b(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                bVarA.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<Pair<String, String>> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    b0.b((String) it.next().second);
                }
            } else {
                b0.b(sQLiteDatabase2.getPath());
            }
        }
    }
}
