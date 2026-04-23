package e7;

import b7.u;
import c2.n;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f12768d;

    public i(Runnable runnable, long j10, n nVar) {
        super(j10, nVar);
        this.f12768d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f12768d.run();
        } finally {
            this.f12767b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f12768d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(u.m(runnable));
        sb.append(", ");
        sb.append(this.f12766a);
        sb.append(", ");
        sb.append(this.f12767b);
        sb.append(']');
        return sb.toString();
    }
}
