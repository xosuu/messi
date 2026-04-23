package s1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import l.b0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b[] f16667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f16668b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16669d;

    public d(Context context, String str, b[] bVarArr, b0 b0Var) {
        super(context, str, null, b0Var.f14789a, new c(b0Var, bVarArr));
        this.f16668b = b0Var;
        this.f16667a = bVarArr;
    }

    public static b a(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || bVar.f16664a != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase);
        }
        return bVarArr[0];
    }

    public final synchronized r1.a c() {
        this.f16669d = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f16669d) {
            return a(this.f16667a, writableDatabase);
        }
        close();
        return c();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f16667a[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.f16667a, sQLiteDatabase);
        this.f16668b.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r5 = this;
            s1.b[] r0 = r5.f16667a
            s1.b r6 = a(r0, r6)
            l.b0 r0 = r5.f16668b
            r0.getClass()
            java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r1 = r6.u(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L20
            r3 = 0
            if (r2 == 0) goto L22
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            r2 = 1
            goto L23
        L20:
            r6 = move-exception
            goto L79
        L22:
            r2 = 0
        L23:
            r1.close()
            java.lang.Object r1 = r0.f14791d
            com.google.android.gms.internal.ads.gp0 r1 = (com.google.android.gms.internal.ads.gp0) r1
            r1.getClass()
            com.google.android.gms.internal.ads.gp0.h(r6)
            if (r2 != 0) goto L53
            f.x0 r2 = com.google.android.gms.internal.ads.gp0.k(r6)
            boolean r4 = r2.f12984a
            if (r4 == 0) goto L3b
            goto L53
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.Object r1 = r2.f12985b
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L53:
            r0.j(r6)
            java.lang.Object r6 = r1.f5026d
            androidx.work.impl.WorkDatabase_Impl r6 = (androidx.work.impl.WorkDatabase_Impl) r6
            int r0 = androidx.work.impl.WorkDatabase_Impl.f1180s
            java.util.List r6 = r6.f15869g
            if (r6 == 0) goto L78
            int r6 = r6.size()
        L64:
            if (r3 >= r6) goto L78
            java.lang.Object r0 = r1.f5026d
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0
            java.util.List r0 = r0.f15869g
            java.lang.Object r0 = r0.get(r3)
            d2.f r0 = (d2.f) r0
            r0.getClass()
            int r3 = r3 + 1
            goto L64
        L78:
            return
        L79:
            r1.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.d.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f16669d = true;
        this.f16668b.e(a(this.f16667a, sQLiteDatabase), i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r11) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.d.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f16669d = true;
        this.f16668b.e(a(this.f16667a, sQLiteDatabase), i10, i11);
    }
}
