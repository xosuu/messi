package m2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f15696f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2.k f15698b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15699d = 0;

    static {
        c2.n.l("ForceStopRunnable");
        f15696f = TimeUnit.DAYS.toMillis(3650L);
    }

    public e(Context context, d2.k kVar) {
        this.f15697a = context.getApplicationContext();
        this.f15698b = kVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i10 = p7.q.l() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f15696f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.e.a():void");
    }

    public final boolean b() {
        c2.b bVar = this.f15698b.f12331d;
        bVar.getClass();
        if (TextUtils.isEmpty(null)) {
            c2.n.i().g(new Throwable[0]);
            return true;
        }
        boolean zA = h.a(this.f15697a, bVar);
        c2.n nVarI = c2.n.i();
        String.format("Is default app process = %s", Boolean.valueOf(zA));
        nVarI.g(new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d2.k kVar = this.f15698b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                d2.j.a(this.f15697a);
                c2.n.i().g(new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i10 = this.f15699d + 1;
                    this.f15699d = i10;
                    if (i10 >= 3) {
                        c2.n.i().h(e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        kVar.f12331d.getClass();
                        throw illegalStateException;
                    }
                    long j10 = ((long) i10) * 300;
                    c2.n nVarI = c2.n.i();
                    String.format("Retrying after %s", Long.valueOf(j10));
                    nVarI.g(e10);
                    try {
                        Thread.sleep(((long) this.f15699d) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            kVar.u0();
        }
    }
}
