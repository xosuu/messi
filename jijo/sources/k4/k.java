package k4;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4.e f14681a = new e4.e(Looper.getMainLooper(), 1);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14681a.post(runnable);
    }
}
