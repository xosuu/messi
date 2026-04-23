package c2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1532a = f.f1526b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return this.f1532a.equals(((j) obj).f1532a);
    }

    public final int hashCode() {
        return this.f1532a.hashCode() + (j.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f1532a + '}';
    }
}
