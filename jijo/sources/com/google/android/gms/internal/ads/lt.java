package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class lt implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f6700b;

    public /* synthetic */ lt(String str) {
        this.f6699a = 2;
        this.f6700b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.f6699a;
        Serializable serializable = this.f6700b;
        switch (i10) {
            case 0:
                return new Thread(runnable, fb1.g("AdWorker(SCION_TASK_EXECUTOR) #", ((AtomicInteger) serializable).getAndIncrement()));
            case 1:
                return new Thread(runnable, fb1.g("AdWorker(NG) #", ((AtomicInteger) serializable).getAndIncrement()));
            default:
                return new Thread(runnable, (String) serializable);
        }
    }

    public lt() {
        this.f6699a = 1;
        this.f6700b = new AtomicInteger(1);
    }

    public lt(int i10) {
        this.f6699a = 0;
        this.f6700b = new AtomicInteger(1);
    }
}
