package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class n extends b4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4.f f617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f618d;

    public n(b4.f fVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f617c = fVar;
        this.f618d = threadPoolExecutor;
    }

    @Override // b4.f
    public final void B(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f618d;
        try {
            this.f617c.B(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // b4.f
    public final void D(j2.h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f618d;
        try {
            this.f617c.D(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
