package androidx.core.app;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ Notification.DecoratedCustomViewStyle b() {
        return new Notification.DecoratedCustomViewStyle();
    }

    public static /* synthetic */ Notification.MessagingStyle.Message c(CharSequence charSequence, long j10, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
    }

    public static /* synthetic */ Notification.MessagingStyle d(CharSequence charSequence) {
        return new Notification.MessagingStyle(charSequence);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return Notification.MessagingStyle.class;
    }

    public static /* synthetic */ void j() {
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return Notification.DecoratedCustomViewStyle.class;
    }
}
