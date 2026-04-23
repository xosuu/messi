package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class ax0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ek0 f2817a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ek0 ek0Var = this.f2817a;
        ((ou) ek0Var.f4215f).d("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        ek0Var.c(new vh0(this, 13, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ek0 ek0Var = this.f2817a;
        ((ou) ek0Var.f4215f).d("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        ek0Var.c(new yd0(17, this));
    }
}
