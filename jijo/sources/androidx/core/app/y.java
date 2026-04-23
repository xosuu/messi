package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static a0 a(Notification.BubbleMetadata bubbleMetadata) {
        z zVar;
        if (bubbleMetadata == null) {
            return null;
        }
        if (bubbleMetadata.getShortcutId() != null) {
            String shortcutId = bubbleMetadata.getShortcutId();
            zVar = new z();
            if (TextUtils.isEmpty(shortcutId)) {
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }
            zVar.f542g = shortcutId;
        } else {
            PendingIntent intent = bubbleMetadata.getIntent();
            Icon icon = bubbleMetadata.getIcon();
            PorterDuff.Mode mode = IconCompat.f543k;
            zVar = new z(intent, h0.d.a(icon));
        }
        zVar.a(1, bubbleMetadata.getAutoExpandBubble());
        zVar.f541f = bubbleMetadata.getDeleteIntent();
        zVar.a(2, bubbleMetadata.isNotificationSuppressed());
        if (bubbleMetadata.getDesiredHeight() != 0) {
            zVar.f538c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
            zVar.f539d = 0;
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            zVar.f539d = bubbleMetadata.getDesiredHeightResId();
            zVar.f538c = 0;
        }
        PendingIntent pendingIntent = zVar.f536a;
        String str = zVar.f542g;
        if (str == null && pendingIntent == null) {
            throw new NullPointerException("Must supply pending intent or shortcut to bubble");
        }
        IconCompat iconCompat = zVar.f537b;
        if (str == null && iconCompat == null) {
            throw new NullPointerException("Must supply an icon or shortcut for the bubble");
        }
        PendingIntent pendingIntent2 = zVar.f541f;
        int i10 = zVar.f538c;
        int i11 = zVar.f539d;
        int i12 = zVar.f540e;
        a0 a0Var = new a0();
        a0Var.f447a = pendingIntent;
        a0Var.f449c = iconCompat;
        a0Var.f450d = i10;
        a0Var.f451e = i11;
        a0Var.f448b = pendingIntent2;
        a0Var.f453g = str;
        a0Var.f452f = i12;
        return a0Var;
    }

    public static Notification.BubbleMetadata b(a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        String str = a0Var.f453g;
        Notification.BubbleMetadata.Builder builder = str != null ? new Notification.BubbleMetadata.Builder(str) : new Notification.BubbleMetadata.Builder(a0Var.f447a, a0Var.f449c.j(null));
        builder.setDeleteIntent(a0Var.f448b).setAutoExpandBubble((a0Var.f452f & 1) != 0).setSuppressNotification((a0Var.f452f & 2) != 0);
        int i10 = a0Var.f450d;
        if (i10 != 0) {
            builder.setDesiredHeight(i10);
        }
        int i11 = a0Var.f451e;
        if (i11 != 0) {
            builder.setDesiredHeightResId(i11);
        }
        return builder.build();
    }
}
