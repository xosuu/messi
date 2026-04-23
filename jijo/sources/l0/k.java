package l0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import m2.s;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15122c;

    public k(s sVar) {
        this.f15120a = 1;
        this.f15122c = sVar;
        this.f15121b = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f15120a) {
            case 0:
                return new j(runnable, (String) this.f15122c, this.f15121b);
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f15121b);
                this.f15121b = this.f15121b + 1;
                return threadNewThread;
        }
    }

    public k() {
        this.f15120a = 0;
        this.f15122c = "fonts-androidx";
        this.f15121b = 10;
    }
}
