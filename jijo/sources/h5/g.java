package h5;

import android.app.NotificationChannel;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static /* synthetic */ NotificationChannel b(int i10) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i10);
    }

    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("openvpn_bg", str, 1);
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ NotificationChannel w(String str) {
        return new NotificationChannel("openvpn_newstat", str, 2);
    }

    public static /* synthetic */ NotificationChannel z(String str) {
        return new NotificationChannel("openvpn_userreq", str, 4);
    }
}
