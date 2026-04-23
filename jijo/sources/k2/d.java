package k2;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Notification f14660b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14661d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f14662f;

    public d(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f14662f = systemForegroundService;
        this.f14659a = i10;
        this.f14660b = notification;
        this.f14661d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        Notification notification = this.f14660b;
        int i11 = this.f14659a;
        SystemForegroundService systemForegroundService = this.f14662f;
        if (i10 >= 29) {
            systemForegroundService.startForeground(i11, notification, this.f14661d);
        } else {
            systemForegroundService.startForeground(i11, notification);
        }
    }
}
