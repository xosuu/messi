package c2;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f1544b;

    public r(Throwable th) {
        this.f1544b = th;
    }

    public final String toString() {
        return String.format("FAILURE (%s)", this.f1544b.getMessage());
    }
}
