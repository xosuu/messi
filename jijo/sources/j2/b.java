package j2;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import c2.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    static {
        n.l("BatteryNotLowTracker");
    }

    @Override // j2.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f14285b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        n.i().h(new Throwable[0]);
        return null;
    }

    @Override // j2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // j2.c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        n nVarI = n.i();
        String.format("Received %s", intent.getAction());
        nVarI.g(new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
