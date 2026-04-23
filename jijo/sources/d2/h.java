package d2;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class h extends o1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12317c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12318d;

    public h(Context context, int i10, int i11) {
        super(i10, i11);
        this.f12318d = context;
    }

    @Override // o1.a
    public final void a(s1.b bVar) {
        int i10 = this.f12317c;
        Context context = this.f12318d;
        switch (i10) {
            case 0:
                if (this.f16090b >= 10) {
                    bVar.f16664a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.e("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                boolean zContains = sharedPreferences.contains("reschedule_needed");
                SQLiteDatabase sQLiteDatabase = bVar.f16664a;
                if (zContains || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bVar.a();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                        sharedPreferences.edit().clear().apply();
                        bVar.D();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i11 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i12 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.a();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i11)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i12)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.D();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public h(Context context) {
        super(9, 10);
        this.f12318d = context;
    }
}
