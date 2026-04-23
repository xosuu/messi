package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconCompat f537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PendingIntent f541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f542g;

    public z(PendingIntent pendingIntent, IconCompat iconCompat) {
        if (pendingIntent == null) {
            throw new NullPointerException("Bubble requires non-null pending intent");
        }
        this.f536a = pendingIntent;
        this.f537b = iconCompat;
    }

    public final void a(int i10, boolean z9) {
        if (z9) {
            this.f540e = i10 | this.f540e;
        } else {
            this.f540e = (~i10) & this.f540e;
        }
    }
}
