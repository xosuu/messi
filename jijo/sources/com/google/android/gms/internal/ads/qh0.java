package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public final class qh0 extends zp {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f8179u = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8180b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f8181d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ed0 f8182f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzr f8183h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lh0 f8184q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f8185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f8186t;

    public qh0(Context context, lh0 lh0Var, zzr zzrVar, ed0 ed0Var) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f8180b = new HashMap();
        this.f8181d = context;
        this.f8182f = ed0Var;
        this.f8183h = zzrVar;
        this.f8184q = lh0Var;
    }

    public static void u1(Context context, ed0 ed0Var, lh0 lh0Var, String str, String str2, Map map) {
        String strGenerateUrl;
        String str3 = true != zzu.zzo().a(context) ? "offline" : "online";
        if (ed0Var != null) {
            m20 m20VarA = ed0Var.a();
            m20VarA.f("gqi", str);
            m20VarA.f("action", str2);
            m20VarA.f("device_connectivity", str3);
            ((y3.b) zzu.zzB()).getClass();
            m20VarA.f("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                m20VarA.f((String) entry.getKey(), (String) entry.getValue());
            }
            strGenerateUrl = ((ed0) m20VarA.f6810d).f3907a.f5573f.generateUrl((Map) m20VarA.f6809b);
        } else {
            strGenerateUrl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String str4 = strGenerateUrl;
        ((y3.b) zzu.zzB()).getClass();
        lh0Var.c(new s7(System.currentTimeMillis(), str, str4, 2));
    }

    public static final PendingIntent w1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
            return PendingIntent.getActivity(context, 0, mw0.a(201326592, intent), 201326592);
        }
        intent.setClassName(context, AdService.CLASS_NAME);
        int i10 = mw0.f7069a | 1073741824;
        return PendingIntent.getService(context, 0, mw0.a(i10, intent), i10);
    }

    public static String x1(int i10, String str) {
        Resources resourcesB = zzu.zzo().b();
        return resourcesB == null ? str : resourcesB.getString(i10);
    }

    public final void A1(Activity activity, zzm zzmVar) {
        zzu.zzp();
        if (new androidx.core.app.j0(activity).a()) {
            z1();
            B1(activity, zzmVar);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        b01 b01Var = b01.f2859s;
        if (i10 >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            y1(b01Var, this.f8185s, "asnpdi");
            return;
        }
        zzu.zzp();
        AlertDialog.Builder builderZzK = zzt.zzK(activity);
        int i11 = 0;
        builderZzK.setTitle(x1(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(x1(R.string.notifications_permission_confirm, "Allow"), new mh0(this, activity, zzmVar, i11)).setNegativeButton(x1(R.string.notifications_permission_decline, "Don't allow"), new nh0(this, i11, zzmVar)).setOnCancelListener(new oh0(this, zzmVar, i11));
        builderZzK.create().show();
        y1(b01Var, this.f8185s, "rtsdi");
    }

    public final void B1(Activity activity, zzm zzmVar) {
        AlertDialog alertDialogCreate;
        zzu.zzp();
        AlertDialog.Builder onCancelListener = zzt.zzK(activity).setOnCancelListener(new bx(2, zzmVar));
        int i10 = R.layout.offline_ads_dialog;
        Resources resourcesB = zzu.zzo().b();
        XmlResourceParser layout = resourcesB == null ? null : resourcesB.getLayout(i10);
        if (layout == null) {
            onCancelListener.setMessage(x1(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            HashMap map = this.f8180b;
            jh0 jh0Var = (jh0) map.get(this.f8185s);
            String str = jh0Var == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : jh0Var.f5950a;
            if (!str.isEmpty()) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(str);
            }
            jh0 jh0Var2 = (jh0) map.get(this.f8185s);
            Drawable drawable = jh0Var2 != null ? jh0Var2.f5952c : null;
            if (drawable != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
            }
            alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new ph0(alertDialogCreate, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void M(a4.a aVar, zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) a4.b.a0(aVar);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        jh0 jh0Var = (jh0) this.f8180b.get(this.f8185s);
        String str5 = jh0Var == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : jh0Var.f5950a;
        zzu.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentW1 = w1(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentW12 = w1(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (str5.isEmpty()) {
            builder.setContentTitle(x1(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(String.format(x1(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), str5));
        }
        builder.setAutoCancel(true).setDeleteIntent(pendingIntentW12).setContentIntent(pendingIntentW1).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) zzba.zzc().a(eg.G7)).intValue());
        if (!((Boolean) zzba.zzc().a(eg.I7)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                NotificationCompat.Builder largeIcon = builder.setLargeIcon(bitmapDecodeStream);
                androidx.core.app.v vVar = new androidx.core.app.v();
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f545b = bitmapDecodeStream;
                vVar.f531e = iconCompat;
                vVar.f532f = null;
                vVar.f533g = true;
                largeIcon.setStyle(vVar);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e10) {
            map.put("notification_not_shown_reason", e10.getMessage());
            str = "offline_notification_failed";
        }
        y1(map, str3, str);
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void j(a4.a aVar) {
        kh0 kh0Var = (kh0) ((rh0) a4.b.a0(aVar));
        Activity activity = kh0Var.f6291a;
        this.f8185s = kh0Var.f6293c;
        this.f8186t = kh0Var.f6294d;
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.F7)).booleanValue();
        zzm zzmVar = kh0Var.f6292b;
        if (zBooleanValue) {
            A1(activity, zzmVar);
            return;
        }
        y1(b01.f2859s, this.f8185s, "dialog_impression");
        zzu.zzp();
        AlertDialog.Builder builderZzK = zzt.zzK(activity);
        int i10 = 1;
        builderZzK.setTitle(x1(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(x1(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(x1(R.string.offline_opt_in_confirm, "OK"), new mh0(this, activity, zzmVar, i10)).setNegativeButton(x1(R.string.offline_opt_in_decline, "No thanks"), new nh0(this, i10, zzmVar)).setOnCancelListener(new oh0(this, zzmVar, i10));
        builderZzK.create().show();
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void l1(String[] strArr, int[] iArr, a4.a aVar) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                kh0 kh0Var = (kh0) ((rh0) a4.b.a0(aVar));
                Activity activity = kh0Var.f6291a;
                HashMap map = new HashMap();
                int i11 = iArr[i10];
                zzm zzmVar = kh0Var.f6292b;
                if (i11 == 0) {
                    map.put("dialog_action", "confirm");
                    z1();
                    B1(activity, zzmVar);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVar != null) {
                        zzmVar.zzb();
                    }
                }
                y1(map, this.f8185s, "asnpdc");
                return;
            }
        }
    }

    public final void v1(String str, n90 n90Var) {
        pi piVar;
        boolean zIsEmpty = TextUtils.isEmpty(n90Var.T());
        String string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String strT = !zIsEmpty ? n90Var.T() : n90Var.b() != null ? n90Var.b() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        pi piVarJ = n90Var.J();
        if (piVarJ != null) {
            try {
                string = piVarJ.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (n90Var) {
            piVar = n90Var.f7216s;
        }
        Drawable drawable = null;
        if (piVar != null) {
            try {
                a4.a aVarZzf = piVar.zzf();
                if (aVarZzf != null) {
                    drawable = (Drawable) a4.b.a0(aVarZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f8180b.put(str, new jh0(strT, string, drawable));
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void y(Intent intent) {
        lh0 lh0Var = this.f8184q;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            gu guVarZzo = zzu.zzo();
            Context context = this.f8181d;
            boolean zA = guVarZzo.a(context);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zA ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            y1(map, stringExtra2, "offline_notification_action");
            try {
                SQLiteDatabase writableDatabase = lh0Var.getWritableDatabase();
                if (c == 1) {
                    ((mu) lh0Var.f6628b).execute(new l0.a(writableDatabase, stringExtra2, this.f8183h, 16, 0));
                } else {
                    writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                }
            } catch (SQLiteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get writable offline buffering database: ".concat(e10.toString()));
            }
        }
    }

    public final void y1(Map map, String str, String str2) {
        u1(this.f8181d, this.f8182f, this.f8184q, str, str2, map);
    }

    public final void z1() {
        boolean zZzg;
        Context context = this.f8181d;
        try {
            zzu.zzp();
            zzbr zzbrVarZzz = zzt.zzz(context);
            a4.b bVar = new a4.b(context);
            String str = this.f8186t;
            String str2 = this.f8185s;
            jh0 jh0Var = (jh0) this.f8180b.get(str2);
            zZzg = zzbrVarZzz.zzg(bVar, new zza(str, str2, jh0Var == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : jh0Var.f5951b));
            if (!zZzg) {
                try {
                    zZzg = zzbrVarZzz.zzf(new a4.b(context), this.f8186t, this.f8185s);
                } catch (RemoteException e10) {
                    e = e10;
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to schedule offline notification poster.", e);
                }
            }
        } catch (RemoteException e11) {
            e = e11;
            zZzg = false;
        }
        if (zZzg) {
            return;
        }
        this.f8184q.a(this.f8185s);
        y1(b01.f2859s, this.f8185s, "offline_notification_worker_not_scheduled");
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void zzh() {
        this.f8184q.e(new rk0(18, this.f8183h));
    }
}
