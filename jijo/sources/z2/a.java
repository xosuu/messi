package z2;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.balsikandar.crashreporter.ui.CrashReporterActivity;
import com.balsikandar.crashreporter.utils.CrashReporterNotInitializedException;
import com.google.android.gms.ads.RequestConfiguration;
import d0.f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import t3.i;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f20683a;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()) + "_crash.txt";
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String string = stringWriter.toString();
        printWriter.close();
        String strA = TextUtils.isEmpty(null) ? b.a() : null;
        File file = new File(strA);
        if (!file.exists() || !file.isDirectory()) {
            strA = b.a();
            file.toString();
            b.a();
        }
        for (File file2 : file.listFiles()) {
            file2.delete();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(strA + File.separator + str));
            bufferedWriter.write(string);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception unused) {
        }
        String localizedMessage = th.getLocalizedMessage();
        if (i.f16852a == null) {
            try {
                throw new CrashReporterNotInitializedException("Initialize CrashReporter : call CrashReporter.initialize(context, crashReportPath)");
            } catch (Exception unused2) {
            }
        }
        Context context = i.f16852a;
        if (f.a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                NotificationChannel notificationChannelN = p8.a.n(context.getString(R.string.q0));
                notificationChannelN.setDescription(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                notificationManager.createNotificationChannel(notificationChannelN);
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "crashreporter_channel_id");
            builder.setSmallIcon(R.drawable.g8);
            Intent flags = new Intent(i.f16852a, (Class<?>) CrashReporterActivity.class).setFlags(268468224);
            flags.putExtra("landing", true);
            flags.setAction(Long.toString(System.currentTimeMillis()));
            builder.setContentIntent(PendingIntent.getActivity(context, 0, flags, i10 >= 31 ? 33554432 : 0));
            builder.setContentTitle(context.getString(R.string.a00));
            if (TextUtils.isEmpty(localizedMessage)) {
                builder.setContentText(context.getString(R.string.dl));
            } else {
                builder.setContentText(localizedMessage);
            }
            builder.setAutoCancel(true);
            builder.setColor(f.b(context, R.color.ba));
            notificationManager.notify(1, builder.build());
        } else {
            Intent flags2 = new Intent(i.f16852a, (Class<?>) CrashReporterActivity.class).setFlags(268468224);
            flags2.putExtra("landing", true);
            flags2.setAction(Long.toString(System.currentTimeMillis()));
            context.startActivity(flags2);
        }
        this.f20683a.uncaughtException(thread, th);
    }
}
