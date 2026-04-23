package k6;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f14720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f14721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f14722c;

    public g(f fVar, f fVar2) {
        this.f14721b = fVar;
        this.f14722c = fVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f14721b == this.f14721b && gVar.f14722c == this.f14722c;
    }

    public final int hashCode() {
        return this.f14722c.hashCode() + this.f14721b.hashCode();
    }
}
