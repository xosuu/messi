package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class mw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f7069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ClipData f7070b;

    static {
        f7069a = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        f7070b = ClipData.newIntent(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new Intent());
    }

    public static Intent a(int i10, Intent intent) {
        boolean z9 = true;
        en1.F0("Cannot set any dangerous parts of intent to be mutable.", (i10 & 88) == 0);
        en1.F0("Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.", (i10 & 1) == 0 || b(0, 3));
        en1.F0("Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.", (i10 & 2) == 0 || b(0, 5));
        en1.F0("Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.", (i10 & 4) == 0 || b(0, 9));
        en1.F0("Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.", (i10 & NotificationCompat.FLAG_HIGH_PRIORITY) == 0 || b(0, 17));
        en1.F0("Must set component on Intent.", intent.getComponent() != null);
        if (b(0, 1)) {
            en1.F0("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i10, 67108864));
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !b(i10, 67108864)) {
                z9 = false;
            }
            en1.F0("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", z9);
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !b(i10, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f7070b);
            }
        }
        return intent2;
    }

    public static boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
