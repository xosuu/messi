package e7;

import b7.h0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f12765d;

    public g(int i10, int i11, String str, long j10) {
        this.f12765d = new b(i10, i11, str, j10);
    }

    @Override // b7.q
    public final void D(n6.j jVar, Runnable runnable) {
        b bVar = this.f12765d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f12750t;
        bVar.c(runnable, j.f12775g, false);
    }
}
