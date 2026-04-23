package b7;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1414d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1415f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m6.b f1416h;

    public final void F() {
        long j10 = this.f1414d - 4294967296L;
        this.f1414d = j10;
        if (j10 <= 0 && this.f1415f) {
            shutdown();
        }
    }

    public abstract Thread G();

    public final void H(boolean z9) {
        this.f1414d = (z9 ? 4294967296L : 1L) + this.f1414d;
        if (z9) {
            return;
        }
        this.f1415f = true;
    }

    public final boolean I() {
        m6.b bVar = this.f1416h;
        if (bVar == null) {
            return false;
        }
        a0 a0Var = (a0) (bVar.isEmpty() ? null : bVar.removeFirst());
        if (a0Var == null) {
            return false;
        }
        a0Var.run();
        return true;
    }

    public abstract void shutdown();
}
