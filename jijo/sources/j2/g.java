package j2;

import android.content.Intent;
import android.content.IntentFilter;
import c2.n;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {
    static {
        n.l("StorageNotLowTracker");
    }

    @Override // j2.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f14285b.registerReceiver(null, f());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // j2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            c(Boolean.TRUE);
        }
    }
}
