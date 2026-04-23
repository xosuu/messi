package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.ew0;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends ew0 {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.ew0
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzp();
            zzt.zzM(com.google.android.gms.ads.internal.zzu.zzo().f5058e, th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzu.zzo().i("AdMobHandler.handleMessage", e10);
        }
    }
}
