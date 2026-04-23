package b7;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6.l f1427b;

    public l(Object obj, t6.l lVar) {
        this.f1426a = obj;
        this.f1427b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return g4.a0.b(this.f1426a, lVar.f1426a) && g4.a0.b(this.f1427b, lVar.f1427b);
    }

    public final int hashCode() {
        Object obj = this.f1426a;
        return this.f1427b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f1426a + ", onCancellation=" + this.f1427b + ')';
    }
}
