package s3;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.j0;
import androidx.fragment.app.w;
import v3.p;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16684c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f16685d = new c();

    public static AlertDialog e(Context context, int i10, p pVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(v3.m.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        String string = i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(R.string.ok) : resources.getString(xyz.easypro.httpcustom.R.string.e1) : resources.getString(xyz.easypro.httpcustom.R.string.ea) : resources.getString(xyz.easypro.httpcustom.R.string.e4);
        if (string != null) {
            builder.setPositiveButton(string, pVar);
        }
        String strC = v3.m.c(context, i10);
        if (strC != null) {
            builder.setTitle(strC);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10));
        new IllegalArgumentException();
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof w) {
                j0 j0VarD = ((w) activity).A.d();
                h hVar = new h();
                if (alertDialog == null) {
                    throw new NullPointerException("Cannot display null dialog");
                }
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                hVar.f16693x0 = alertDialog;
                if (onCancelListener != null) {
                    hVar.f16694y0 = onCancelListener;
                }
                hVar.d0(j0VarD, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        if (alertDialog == null) {
            throw new NullPointerException("Cannot display null dialog");
        }
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f16681a = alertDialog;
        if (onCancelListener != null) {
            bVar.f16682b = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    @Override // s3.d
    public final Intent b(int i10, Context context, String str) {
        return super.b(i10, context, str);
    }

    @Override // s3.d
    public final int c(Context context, int i10) {
        return super.c(context, i10);
    }

    public final void d(Activity activity, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i10, new v3.n(activity, super.b(i10, activity, "d")), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null);
        new IllegalArgumentException();
        if (i10 == 18) {
            new i(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strE = i10 == 6 ? v3.m.e(context, "common_google_play_services_resolution_required_title") : v3.m.c(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(xyz.easypro.httpcustom.R.string.e8);
        }
        String strD = (i10 == 6 || i10 == 19) ? v3.m.d(context, "common_google_play_services_resolution_required_text", v3.m.a(context)) : v3.m.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        z3.a.l(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationCompat.Builder contentTitle = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(strE);
        androidx.core.app.w wVar = new androidx.core.app.w();
        wVar.f535e = NotificationCompat.Builder.limitCharSequenceLength(strD);
        NotificationCompat.Builder style = contentTitle.setStyle(wVar);
        PackageManager packageManager = context.getPackageManager();
        if (y3.c.f20453b == null) {
            y3.c.f20453b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (y3.c.f20453b.booleanValue()) {
            style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
            if (y3.c.e(context)) {
                style.addAction(2131230862, resources.getString(xyz.easypro.httpcustom.R.string.ef), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(R.drawable.stat_sys_warning).setTicker(resources.getString(xyz.easypro.httpcustom.R.string.e8)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(strD);
        }
        if (z3.a.K()) {
            if (!z3.a.K()) {
                throw new IllegalStateException();
            }
            synchronized (f16684c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(Crypt.a(Crypt.xrc("\u001a=>\u001c>9\u001co9L>hAji\u0019=;H=o\u001cnn\u0019niK:9H:jM<cAhiMj?\u0019nb@on@:i\u001c<<\u001bo>I>iN;o\u001c=<L:9LlhH9?Hnh@iiLio\u001af?KnmIj9\u0019jc")));
            String string = context.getResources().getString(xyz.easypro.httpcustom.R.string.e7);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(p8.a.b(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            style.setChannelId("com.google.android.gms.availability");
        }
        Notification notificationBuild = style.build();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            f.f16689a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationBuild);
    }

    public final void h(Activity activity, u3.f fVar, int i10, u3.k kVar) {
        AlertDialog alertDialogE = e(activity, i10, new v3.o(super.b(i10, activity, "d"), fVar), kVar);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", kVar);
    }
}
