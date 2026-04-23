package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ Notification.Builder i(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* synthetic */ NotificationChannel j(String str) {
        return new NotificationChannel("udp_channel_id", str, 2);
    }
}
