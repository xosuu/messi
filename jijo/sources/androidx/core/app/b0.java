package androidx.core.app;

import android.os.Build;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends g0 {
    @Override // androidx.core.app.g0
    public final void b(m mVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((h0) mVar).f485b.setStyle(p.b());
        }
    }

    @Override // androidx.core.app.g0
    public final String f() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // androidx.core.app.g0
    public final RemoteViews g() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        RemoteViews bigContentView = this.f480a.getBigContentView();
        if (bigContentView == null) {
            bigContentView = this.f480a.getContentView();
        }
        if (bigContentView == null) {
            return null;
        }
        return k(bigContentView, true);
    }

    @Override // androidx.core.app.g0
    public final RemoteViews h() {
        if (Build.VERSION.SDK_INT < 24 && this.f480a.getContentView() != null) {
            return k(this.f480a.getContentView(), false);
        }
        return null;
    }

    @Override // androidx.core.app.g0
    public final RemoteViews i() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        RemoteViews headsUpContentView = this.f480a.getHeadsUpContentView();
        RemoteViews contentView = headsUpContentView != null ? headsUpContentView : this.f480a.getContentView();
        if (headsUpContentView == null) {
            return null;
        }
        return k(contentView, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.RemoteViews k(android.widget.RemoteViews r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.b0.k(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
    }
}
