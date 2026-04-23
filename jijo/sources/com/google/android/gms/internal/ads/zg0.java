package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.jasypt.digest.StandardStringDigester;
import team.dev.epro.apkcustom.models.VPNServer;

/* JADX INFO: loaded from: classes.dex */
public final class zg0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11232a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg0(Context context, int i10) {
        super(context, "OfflineUpload.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f11232a = i10;
        if (i10 != 1) {
        } else {
            super(context, "Records.db", (SQLiteDatabase.CursorFactory) null, 1);
        }
    }

    public final ArrayList a(String str) {
        SQLiteDatabase sQLiteDatabase;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT * FROM vpn_server ORDER BY countryLong " + str, null);
        if (cursorRawQuery.moveToFirst()) {
            while (true) {
                sQLiteDatabase = writableDatabase;
                arrayList.add(new VPNServer(cursorRawQuery.getString(1), cursorRawQuery.getString(2), cursorRawQuery.getString(3), cursorRawQuery.getString(4), cursorRawQuery.getString(5), cursorRawQuery.getString(6), cursorRawQuery.getString(7), cursorRawQuery.getString(8), cursorRawQuery.getString(9), cursorRawQuery.getString(10), cursorRawQuery.getString(11), cursorRawQuery.getString(12), cursorRawQuery.getString(13), cursorRawQuery.getString(14), cursorRawQuery.getString(15), cursorRawQuery.getString(16)));
                if (!cursorRawQuery.moveToNext()) {
                    break;
                }
                writableDatabase = sQLiteDatabase;
            }
        } else {
            sQLiteDatabase = writableDatabase;
        }
        cursorRawQuery.close();
        sQLiteDatabase.close();
        return arrayList;
    }

    public final void c(String str) {
        String strTrim;
        String[] strArrSplit;
        String[] strArrSplit2 = str.split(",");
        if (strArrSplit2.length == 15) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("hostName", strArrSplit2[0]);
            contentValues.put("ip", strArrSplit2[1]);
            contentValues.put("score", strArrSplit2[2]);
            contentValues.put("ping", strArrSplit2[3]);
            contentValues.put("speed", strArrSplit2[4]);
            contentValues.put("countryLong", strArrSplit2[5]);
            contentValues.put("countryShort", strArrSplit2[6]);
            contentValues.put("numVpnSessions", strArrSplit2[7]);
            contentValues.put("uptime", strArrSplit2[8]);
            contentValues.put("totalUsers", strArrSplit2[9]);
            contentValues.put("totalTraffic", strArrSplit2[10]);
            contentValues.put("logType", strArrSplit2[11]);
            contentValues.put("operator", strArrSplit2[12]);
            contentValues.put("message", strArrSplit2[13]);
            contentValues.put("configData", strArrSplit2[14]);
            try {
                strArrSplit = new String(Base64.decode(strArrSplit2[14], 0), StandardStringDigester.MESSAGE_CHARSET).split("\\n");
            } catch (UnsupportedEncodingException unused) {
            }
            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                if (strArrSplit[i10].startsWith("proto")) {
                    strTrim = strArrSplit[i10].split(" ")[1].trim();
                    break;
                }
                strTrim = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            strTrim = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            contentValues.put("proto", strTrim);
            writableDatabase.insert("vpn_server", null, contentValues);
            writableDatabase.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f11232a) {
            case 0:
                sQLiteDatabase.execSQL("CREATE TABLE offline_signal_contents (timestamp INTEGER PRIMARY_KEY, serialized_proto_data BLOB)");
                sQLiteDatabase.execSQL("CREATE TABLE offline_signal_statistics (statistic_name TEXT PRIMARY_KEY, value INTEGER)");
                en1.I0(sQLiteDatabase, "failed_requests");
                en1.I0(sQLiteDatabase, "total_requests");
                en1.I0(sQLiteDatabase, "completed_requests");
                ContentValues contentValues = new ContentValues();
                contentValues.put("statistic_name", "last_successful_request_time");
                contentValues.put("value", (Long) 0L);
                sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
                break;
            default:
                sQLiteDatabase.execSQL("create table vpn_server(_id integer primary key,hostName text,ip text,score text,ping text,speed text,countryLong text,countryShort text,numVpnSessions text,uptime text,totalUsers text,totalTraffic text,logType text,operator text,message text,configData text,proto text)");
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        switch (this.f11232a) {
            case 0:
                onUpgrade(sQLiteDatabase, i10, i11);
                break;
            default:
                super.onDowngrade(sQLiteDatabase, i10, i11);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        switch (this.f11232a) {
            case 0:
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_contents");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_statistics");
                break;
            default:
                sQLiteDatabase.execSQL("drop table if exists vpn_server");
                onCreate(sQLiteDatabase);
                break;
        }
    }
}
