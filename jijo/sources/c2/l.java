package c2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1533a;

    public l(f fVar) {
        this.f1533a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f1533a.equals(((l) obj).f1533a);
    }

    public final int hashCode() {
        return this.f1533a.hashCode() + (l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f1533a + '}';
    }
}
