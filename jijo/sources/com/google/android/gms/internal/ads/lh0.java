package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzr;

/* JADX INFO: loaded from: classes.dex */
public final class lh0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6626d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p21 f6628b;

    public lh0(Context context, mu muVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzba.zzc().a(eg.A7)).intValue());
        this.f6627a = context;
        this.f6628b = muVar;
    }

    public static void u(SQLiteDatabase sQLiteDatabase, zzr zzrVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i10] = cursorQuery.getString(columnIndex);
                }
                i10++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i11 = 0; i11 < count; i11++) {
                zzrVar.zza(strArr[i11]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final void a(String str) {
        e(new ou(str));
    }

    public final void c(s7 s7Var) {
        e(new p80(this, 29, s7Var));
    }

    public final void e(rs0 rs0Var) {
        du duVar = new du(5, this);
        p21 p21Var = this.f6628b;
        tc1.u0(((q11) p21Var).b(duVar), new aa(17, rs0Var, 0), p21Var);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
