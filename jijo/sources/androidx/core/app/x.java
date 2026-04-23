package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static a0 a(Notification.BubbleMetadata bubbleMetadata) {
        int desiredHeightResId;
        if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
            return null;
        }
        PendingIntent intent = bubbleMetadata.getIntent();
        Icon icon = bubbleMetadata.getIcon();
        PorterDuff.Mode mode = IconCompat.f543k;
        IconCompat iconCompatA = h0.d.a(icon);
        if (intent == null) {
            throw new NullPointerException("Bubble requires non-null pending intent");
        }
        int i10 = 0;
        int i11 = bubbleMetadata.getAutoExpandBubble() ? 0 | 1 : (~1) & 0;
        PendingIntent deleteIntent = bubbleMetadata.getDeleteIntent();
        int i12 = bubbleMetadata.isNotificationSuppressed() ? i11 | 2 : i11 & (~2);
        int iMax = bubbleMetadata.getDesiredHeight() != 0 ? Math.max(bubbleMetadata.getDesiredHeight(), 0) : 0;
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
        } else {
            i10 = iMax;
            desiredHeightResId = 0;
        }
        a0 a0Var = new a0();
        a0Var.f447a = intent;
        a0Var.f449c = iconCompatA;
        a0Var.f450d = i10;
        a0Var.f451e = desiredHeightResId;
        a0Var.f448b = deleteIntent;
        a0Var.f453g = null;
        a0Var.f452f = i12;
        return a0Var;
    }

    public static Notification.BubbleMetadata b(a0 a0Var) {
        PendingIntent pendingIntent;
        if (a0Var == null || (pendingIntent = a0Var.f447a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(a0Var.f449c.j(null)).setIntent(pendingIntent).setDeleteIntent(a0Var.f448b).setAutoExpandBubble((a0Var.f452f & 1) != 0).setSuppressNotification((a0Var.f452f & 2) != 0);
        int i10 = a0Var.f450d;
        if (i10 != 0) {
            suppressNotification.setDesiredHeight(i10);
        }
        int i11 = a0Var.f451e;
        if (i11 != 0) {
            suppressNotification.setDesiredHeightResId(i11);
        }
        return suppressNotification.build();
    }
}
