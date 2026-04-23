package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r21 extends j21 implements ScheduledFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n5.a f8366b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f8367d;

    public r21(m11 m11Var, ScheduledFuture scheduledFuture) {
        super(2);
        this.f8366b = m11Var;
        this.f8367d = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        boolean zCancel = this.f8366b.cancel(z9);
        if (zCancel) {
            this.f8367d.cancel(z9);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f8367d.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f8367d.getDelay(timeUnit);
    }

    @Override // t.a
    public final /* synthetic */ Object o() {
        return this.f8366b;
    }
}
