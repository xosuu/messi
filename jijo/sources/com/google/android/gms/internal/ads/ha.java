package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ha implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f5239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5240c;

    public ha() {
        this.f5238a = 0;
        this.f5240c = Executors.defaultThreadFactory();
        this.f5239b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f5239b;
        int i10 = this.f5238a;
        Object obj = this.f5240c;
        switch (i10) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(runnable);
                threadNewThread.setName("gads-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            default:
                return new Thread(runnable, "AdWorker(" + ((String) obj) + ") #" + atomicInteger.getAndIncrement());
        }
    }

    public ha(String str) {
        this.f5238a = 1;
        this.f5240c = str;
        this.f5239b = new AtomicInteger(1);
    }
}
