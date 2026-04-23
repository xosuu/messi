package g4;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class q extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f13775a;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.f13775a;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f13775a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            super.startActivity(intent);
        }
    }
}
