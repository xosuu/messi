package l0;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15119a;

    public j(Runnable runnable, String str, int i10) {
        super(runnable, str);
        this.f15119a = i10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f15119a);
        super.run();
    }
}
