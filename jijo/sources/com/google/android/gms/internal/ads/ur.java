package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class ur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f9592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f9593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f9596n;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ur(android.content.Context r7) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ur.<init>(android.content.Context):void");
    }

    public static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzu.zzo().i("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final vr a() {
        return new vr(this.f9585c, this.f9586d, this.f9587e, this.f9588f, this.f9589g, this.f9590h, this.f9591i, this.f9592j, this.f9596n, this.f9583a, this.f9584b, this.f9593k, this.f9594l, this.f9595m);
    }

    public final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                zzu.zzo().i("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) zzba.zzc().a(eg.ba)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            intentRegisterReceiver.getIntExtra("level", -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0.getNetworkOperator()
            boolean r2 = z3.a.L()
            r3 = 0
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.xf r2 = com.google.android.gms.internal.ads.eg.L7
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            goto L31
        L2d:
            int r3 = r0.getNetworkType()
        L31:
            r5.f9584b = r3
            r0.getPhoneType()
            r0 = -2
            r5.f9583a = r0
            r0 = -1
            com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.zzt.zzA(r6, r2)
            if (r6 == 0) goto L5e
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L59
            int r0 = r6.getType()
            r5.f9583a = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            r6.ordinal()
            goto L5b
        L59:
            r5.f9583a = r0
        L5b:
            r1.isActiveNetworkMetered()
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ur.e(android.content.Context):void");
    }

    public ur(Context context, vr vrVar) {
        eg.a(context);
        c(context);
        e(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        pg.a(context);
        this.f9585c = vrVar.f9949a;
        this.f9586d = vrVar.f9950b;
        this.f9587e = vrVar.f9951c;
        this.f9588f = vrVar.f9952d;
        this.f9589g = vrVar.f9953e;
        this.f9590h = vrVar.f9954f;
        this.f9591i = vrVar.f9955g;
        this.f9592j = vrVar.f9956h;
        this.f9596n = vrVar.f9957i;
        this.f9593k = vrVar.f9960l;
        this.f9594l = vrVar.f9961m;
        this.f9595m = vrVar.f9962n;
    }
}
