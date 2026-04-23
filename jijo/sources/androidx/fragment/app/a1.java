package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f726b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f727d;

    public /* synthetic */ a1(c1 c1Var, b1 b1Var, int i10) {
        this.f725a = i10;
        this.f727d = c1Var;
        this.f726b = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f725a;
        b1 b1Var = this.f726b;
        c1 c1Var = this.f727d;
        switch (i10) {
            case 0:
                if (c1Var.f747b.contains(b1Var)) {
                    g1.a.a(b1Var.f732a, b1Var.f734c.S);
                }
                break;
            default:
                c1Var.f747b.remove(b1Var);
                c1Var.f748c.remove(b1Var);
                break;
        }
    }
}
