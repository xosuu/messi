package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.qf;
import h5.g;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(26)
public class zzw extends zzv {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final qf zzg(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean zZzA = zzt.zzA(context, "android.permission.ACCESS_NETWORK_STATE");
        qf qfVar = qf.ENUM_FALSE;
        return (zZzA && telephonyManager.isDataEnabled()) ? qf.ENUM_TRUE : qfVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzh(Context context, String str, String str2) {
        g.g();
        NotificationChannel notificationChannelB = g.b(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.H7)).intValue());
        notificationChannelB.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelB);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zzi(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }
}
