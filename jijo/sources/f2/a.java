package f2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import c2.n;
import com.google.android.gms.internal.ads.ur0;
import d2.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13054a = 0;

    static {
        n.l("Alarms");
    }

    public static void a(int i10, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        n nVarI = n.i();
        String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10));
        nVarI.g(new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, k kVar, String str, long j10) {
        int iM;
        WorkDatabase workDatabase = kVar.f12332e;
        ur0 ur0VarK = workDatabase.k();
        l2.e eVarF = ur0VarK.F(str);
        if (eVarF != null) {
            a(eVarF.f15133b, context, str);
            c(context, str, eVarF.f15133b, j10);
            return;
        }
        m2.f fVar = new m2.f(0, workDatabase);
        synchronized (m2.f.class) {
            iM = fVar.m("next_alarm_manager_id");
        }
        ur0VarK.I(new l2.e(str, iM));
        c(context, str, iM, j10);
    }

    public static void c(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
