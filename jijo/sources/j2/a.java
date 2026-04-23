package j2;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import c2.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    static {
        n.l("BatteryChrgTracker");
    }

    @Override // j2.d
    public final Object a() {
        int intExtra;
        Intent intentRegisterReceiver = this.f14285b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z9 = false;
        if (intentRegisterReceiver == null) {
            n.i().h(new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? intentRegisterReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) != 2 && intExtra != 5)) {
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }

    @Override // j2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // j2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L7
            return
        L7:
            c2.n r0 = c2.n.i()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String.format(r4, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            r0.g(r2)
            int r0 = r6.hashCode()
            r2 = -1
            switch(r0) {
                case -1886648615: goto L44;
                case -54942926: goto L3b;
                case 948344062: goto L30;
                case 1019184907: goto L25;
                default: goto L23;
            }
        L23:
            r1 = -1
            goto L4e
        L25:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e
            goto L23
        L2e:
            r1 = 3
            goto L4e
        L30:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L39
            goto L23
        L39:
            r1 = 2
            goto L4e
        L3b:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4e
            goto L23
        L44:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4d
            goto L23
        L4d:
            r1 = 0
        L4e:
            switch(r1) {
                case 0: goto L64;
                case 1: goto L5e;
                case 2: goto L58;
                case 3: goto L52;
                default: goto L51;
            }
        L51:
            goto L69
        L52:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L69
        L58:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L69
        L5e:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            goto L69
        L64:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.a.g(android.content.Intent):void");
    }
}
