package c2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f1503a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1504b;

    public a(boolean z9) {
        this.f1504b = z9;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbS = g1.a.s(this.f1504b ? "WM.task-" : "androidx.work-");
        sbS.append(this.f1503a.incrementAndGet());
        return new Thread(runnable, sbS.toString());
    }
}
