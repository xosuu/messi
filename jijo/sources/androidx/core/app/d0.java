package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f454e = new ArrayList();

    @Override // androidx.core.app.g0
    public final void b(m mVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((h0) mVar).f485b).setBigContentTitle(this.f481b);
        if (this.f483d) {
            bigContentTitle.setSummaryText(this.f482c);
        }
        Iterator it = this.f454e.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
        }
    }

    @Override // androidx.core.app.g0
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove(NotificationCompat.EXTRA_TEXT_LINES);
    }

    @Override // androidx.core.app.g0
    public final String f() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // androidx.core.app.g0
    public final void j(Bundle bundle) {
        super.j(bundle);
        ArrayList arrayList = this.f454e;
        arrayList.clear();
        if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
        }
    }
}
