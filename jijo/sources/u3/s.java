package u3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class s extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.f f17614b;

    public s(f.f fVar) {
        this.f17614b = fVar;
    }

    public final synchronized void a() {
        try {
            Context context = this.f17613a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f17613a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f17614b.H();
            a();
        }
    }
}
