package p7;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k extends v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f16284e;

    public k(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16284e = vVar;
    }

    @Override // p7.v
    public final v a() {
        return this.f16284e.a();
    }

    @Override // p7.v
    public final v b() {
        return this.f16284e.b();
    }

    @Override // p7.v
    public final long c() {
        return this.f16284e.c();
    }

    @Override // p7.v
    public final v d(long j10) {
        return this.f16284e.d(j10);
    }

    @Override // p7.v
    public final boolean e() {
        return this.f16284e.e();
    }

    @Override // p7.v
    public final void f() throws InterruptedIOException {
        this.f16284e.f();
    }

    @Override // p7.v
    public final v g(long j10, TimeUnit timeUnit) {
        return this.f16284e.g(j10, timeUnit);
    }
}
