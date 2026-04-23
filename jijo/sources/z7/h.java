package z7;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public abstract String a();

    public final boolean equals(Object obj) {
        return (obj instanceof h) && ((h) obj).a().equals(a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
