package a3;

import android.content.Context;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import androidx.fragment.app.w;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0.a f12b = new t0.a(this, null, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Vibrator f13c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16f;

    public a(w wVar) {
        this.f11a = wVar;
    }

    public final void a() {
        Context context = this.f11a;
        this.f13c = (Vibrator) context.getSystemService("vibrator");
        this.f14d = Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 0) == 1;
        this.f15e = context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0;
        context.getContentResolver().registerContentObserver(Settings.System.getUriFor("haptic_feedback_enabled"), false, this.f12b);
    }

    public final void b() {
        if (this.f13c != null && this.f14d && this.f15e) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.f16f >= 125) {
                this.f13c.vibrate(5L);
                this.f16f = jUptimeMillis;
            }
        }
    }
}
