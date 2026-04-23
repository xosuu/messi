package f;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12978a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12978a) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
            default:
                runnable.run();
                break;
            case 2:
                m.a.r0().q0(runnable);
                break;
        }
    }
}
