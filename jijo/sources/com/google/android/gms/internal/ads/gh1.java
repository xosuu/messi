package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class gh1 extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f4924a;

    public gh1(Handler handler) {
        this.f4924a = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f4924a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
