package d4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k4.l;
import l.j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements q3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f12357c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f12359b;

    public f(Context context) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f12359b = Executors.newSingleThreadExecutor();
        this.f12358a = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new androidx.activity.e(this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public static final void b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("app_set_id_storage", 0);
        if (sharedPreferences.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        if (strValueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(strValueOf);
        }
        throw new e("Failed to store the app set ID last used time.");
    }

    @Override // q3.a
    public final l a() {
        k4.e eVar = new k4.e();
        this.f12359b.execute(new j(this, eVar, 19));
        return eVar.f14669a;
    }
}
