package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import c2.n;
import d2.k;
import f2.b;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        n.l("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n nVarI = n.i();
        String.format("Received intent %s", intent);
        nVarI.g(new Throwable[0]);
        if (Build.VERSION.SDK_INT < 23) {
            int i10 = b.f13055f;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
            return;
        }
        try {
            k kVarS0 = k.s0(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (k.f12329n) {
                try {
                    kVarS0.f12338k = pendingResultGoAsync;
                    if (kVarS0.f12337j) {
                        pendingResultGoAsync.finish();
                        kVarS0.f12338k = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e10) {
            n.i().h(e10);
        }
    }
}
