package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w21 extends f21 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n5.a f10037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ScheduledFuture f10038u;

    @Override // com.google.android.gms.internal.ads.m11
    public final String d() {
        n5.a aVar = this.f10037t;
        ScheduledFuture scheduledFuture = this.f10038u;
        if (aVar == null) {
            return null;
        }
        String strI = fb1.i("inputFuture=[", aVar.toString(), "]");
        if (scheduledFuture == null) {
            return strI;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strI;
        }
        return strI + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final void e() {
        k(this.f10037t);
        ScheduledFuture scheduledFuture = this.f10038u;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f10037t = null;
        this.f10038u = null;
    }
}
