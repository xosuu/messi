package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class w extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f535e;

    @Override // androidx.core.app.g0
    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // androidx.core.app.g0
    public final void b(m mVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((h0) mVar).f485b).setBigContentTitle(this.f481b).bigText(this.f535e);
        if (this.f483d) {
            bigTextStyleBigText.setSummaryText(this.f482c);
        }
    }

    @Override // androidx.core.app.g0
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove(NotificationCompat.EXTRA_BIG_TEXT);
    }

    @Override // androidx.core.app.g0
    public final String f() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // androidx.core.app.g0
    public final void j(Bundle bundle) {
        super.j(bundle);
        this.f535e = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
    }
}
