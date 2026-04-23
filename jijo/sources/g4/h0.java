package g4;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0 f13726f;

    public h0(j0 j0Var, int i10) {
        super(j0Var.size(), i10);
        this.f13726f = j0Var;
    }

    @Override // g4.e0
    public final Object d(int i10) {
        return this.f13726f.get(i10);
    }
}
