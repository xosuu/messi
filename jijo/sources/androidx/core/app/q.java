package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconCompat f510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f514e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f517h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f515f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f516g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f518i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f519j = false;

    public q(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f513d = true;
        this.f517h = true;
        this.f510a = iconCompat;
        this.f511b = NotificationCompat.Builder.limitCharSequenceLength(charSequence);
        this.f512c = pendingIntent;
        this.f514e = bundle;
        this.f513d = true;
        this.f517h = true;
    }
}
