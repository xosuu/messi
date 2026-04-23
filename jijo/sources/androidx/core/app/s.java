package androidx.core.app;

import android.app.Notification;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
        bigPictureStyle.bigLargeIcon(bitmap);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setSummaryText(charSequence);
    }
}
