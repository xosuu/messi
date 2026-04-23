package c2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && k.class == obj.getClass();
    }

    public final int hashCode() {
        return k.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}
