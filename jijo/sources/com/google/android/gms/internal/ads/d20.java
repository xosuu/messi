package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d20 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3540a;

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = (Runnable) this.f3540a.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
