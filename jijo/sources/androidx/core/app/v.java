package androidx.core.app;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class v extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconCompat f531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f534h;

    public static IconCompat k(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 23 && android.support.v4.media.c.z(parcelable)) {
            Icon iconF = android.support.v4.media.c.f(parcelable);
            PorterDuff.Mode mode = IconCompat.f543k;
            return h0.d.a(iconF);
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f545b = (Bitmap) parcelable;
        return iconCompat;
    }

    @Override // androidx.core.app.g0
    public final void b(m mVar) {
        int i10 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(((h0) mVar).f485b).setBigContentTitle(this.f481b);
        IconCompat iconCompat = this.f531e;
        if (iconCompat != null) {
            if (i10 >= 31) {
                u.a(bigContentTitle, iconCompat.j(mVar instanceof h0 ? ((h0) mVar).f484a : null));
            } else if (iconCompat.g() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f531e.c());
            }
        }
        if (this.f533g) {
            IconCompat iconCompat2 = this.f532f;
            if (iconCompat2 == null) {
                s.a(bigContentTitle, null);
            } else if (i10 >= 23) {
                t.a(bigContentTitle, iconCompat2.j(mVar instanceof h0 ? ((h0) mVar).f484a : null));
            } else if (iconCompat2.g() == 1) {
                s.a(bigContentTitle, this.f532f.c());
            } else {
                s.a(bigContentTitle, null);
            }
        }
        if (this.f483d) {
            s.b(bigContentTitle, this.f482c);
        }
        if (i10 >= 31) {
            u.c(bigContentTitle, this.f534h);
            u.b(bigContentTitle, null);
        }
    }

    @Override // androidx.core.app.g0
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
        bundle.remove(NotificationCompat.EXTRA_PICTURE);
        bundle.remove(NotificationCompat.EXTRA_PICTURE_ICON);
        bundle.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
    }

    @Override // androidx.core.app.g0
    public final String f() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // androidx.core.app.g0
    public final void j(Bundle bundle) {
        super.j(bundle);
        if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
            this.f532f = k(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
            this.f533g = true;
        }
        Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
        this.f531e = parcelable != null ? k(parcelable) : k(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        this.f534h = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
    }
}
