package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.pn;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            aq aqVarZzm = zzay.zza().zzm(this, new pn());
            if (aqVarZzm == null) {
                zzm.zzg("OfflineUtils is null");
            } else {
                aqVarZzm.y(getIntent());
            }
        } catch (RemoteException e10) {
            zzm.zzg("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
