package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotificationCompat.Builder f486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RemoteViews f487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RemoteViews f488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RemoteViews f491h;

    /* JADX WARN: Removed duplicated region for block: B:164:0x046f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h0(androidx.core.app.NotificationCompat.Builder r22) {
        /*
            Method dump skipped, instruction units count: 1251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.h0.<init>(androidx.core.app.NotificationCompat$Builder):void");
    }

    public static void b(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle extras;
        RemoteViews remoteViewsI;
        RemoteViews remoteViewsG;
        NotificationCompat.Builder builder = this.f486c;
        g0 g0Var = builder.mStyle;
        if (g0Var != null) {
            g0Var.b(this);
        }
        RemoteViews remoteViewsH = g0Var != null ? g0Var.h() : null;
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder2 = this.f485b;
        if (i10 >= 26) {
            notificationBuild = builder2.build();
        } else {
            int i11 = this.f490g;
            if (i10 >= 24) {
                notificationBuild = builder2.build();
                if (i11 != 0) {
                    if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && i11 == 2) {
                        b(notificationBuild);
                    }
                    if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && i11 == 1) {
                        b(notificationBuild);
                    }
                }
            } else {
                builder2.setExtras(this.f489f);
                notificationBuild = builder2.build();
                RemoteViews remoteViews = this.f487d;
                if (remoteViews != null) {
                    notificationBuild.contentView = remoteViews;
                }
                RemoteViews remoteViews2 = this.f488e;
                if (remoteViews2 != null) {
                    notificationBuild.bigContentView = remoteViews2;
                }
                RemoteViews remoteViews3 = this.f491h;
                if (remoteViews3 != null) {
                    notificationBuild.headsUpContentView = remoteViews3;
                }
                if (i11 != 0) {
                    if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && i11 == 2) {
                        b(notificationBuild);
                    }
                    if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && i11 == 1) {
                        b(notificationBuild);
                    }
                }
            }
        }
        if (remoteViewsH != null) {
            notificationBuild.contentView = remoteViewsH;
        } else {
            RemoteViews remoteViews4 = builder.mContentView;
            if (remoteViews4 != null) {
                notificationBuild.contentView = remoteViews4;
            }
        }
        if (g0Var != null && (remoteViewsG = g0Var.g()) != null) {
            notificationBuild.bigContentView = remoteViewsG;
        }
        if (g0Var != null && (remoteViewsI = builder.mStyle.i()) != null) {
            notificationBuild.headsUpContentView = remoteViewsI;
        }
        if (g0Var != null && (extras = NotificationCompat.getExtras(notificationBuild)) != null) {
            g0Var.a(extras);
        }
        return notificationBuild;
    }
}
