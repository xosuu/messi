package n0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15821b;

    public c(Object obj, Object obj2) {
        this.f15820a = obj;
        this.f15821b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f15820a, this.f15820a) && b.a(cVar.f15821b, this.f15821b);
    }

    public final int hashCode() {
        Object obj = this.f15820a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f15821b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f15820a + " " + this.f15821b + "}";
    }
}
