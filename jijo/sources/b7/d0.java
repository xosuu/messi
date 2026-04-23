package b7;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1406a;

    public d0(boolean z9) {
        this.f1406a = z9;
    }

    @Override // b7.j0
    public final boolean a() {
        return this.f1406a;
    }

    @Override // b7.j0
    public final w0 e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f1406a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
