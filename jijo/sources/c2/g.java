package c2;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f1530c;

    public g(int i10, int i11, Notification notification) {
        this.f1528a = i10;
        this.f1530c = notification;
        this.f1529b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f1528a == gVar.f1528a && this.f1529b == gVar.f1529b) {
            return this.f1530c.equals(gVar.f1530c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1530c.hashCode() + (((this.f1528a * 31) + this.f1529b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f1528a + ", mForegroundServiceType=" + this.f1529b + ", mNotification=" + this.f1530c + '}';
    }
}
