package x6;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f18498a == cVar.f18498a) {
                    if (this.f18499b == cVar.f18499b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f18498a * 31) + this.f18499b;
    }

    public final boolean isEmpty() {
        return this.f18498a > this.f18499b;
    }

    public final String toString() {
        return this.f18498a + ".." + this.f18499b;
    }
}
