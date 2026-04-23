package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0[] f522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PendingIntent f529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f530k;

    public r(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i10 != 0 ? IconCompat.b(null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, i10) : null, charSequence, pendingIntent, new Bundle(), (o0[]) null, (o0[]) null, true, 0, true, false, false);
    }

    public final IconCompat a() {
        int i10;
        if (this.f521b == null && (i10 = this.f527h) != 0) {
            this.f521b = IconCompat.b(null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, i10);
        }
        return this.f521b;
    }

    public r(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o0[] o0VarArr, o0[] o0VarArr2, boolean z9, int i11, boolean z10, boolean z11, boolean z12) {
        this(i10 != 0 ? IconCompat.b(null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, i10) : null, charSequence, pendingIntent, bundle, o0VarArr, o0VarArr2, z9, i11, z10, z11, z12);
    }

    public r(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o0[] o0VarArr, o0[] o0VarArr2, boolean z9, int i10, boolean z10, boolean z11, boolean z12) {
        this.f524e = true;
        this.f521b = iconCompat;
        if (iconCompat != null && iconCompat.g() == 2) {
            this.f527h = iconCompat.d();
        }
        this.f528i = NotificationCompat.Builder.limitCharSequenceLength(charSequence);
        this.f529j = pendingIntent;
        this.f520a = bundle == null ? new Bundle() : bundle;
        this.f522c = o0VarArr;
        this.f523d = z9;
        this.f525f = i10;
        this.f524e = z10;
        this.f526g = z11;
        this.f530k = z12;
    }
}
