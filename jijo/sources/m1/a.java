package m1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15399d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = this.f15396a;
        if (i10 != aVar.f15396a) {
            return false;
        }
        if (i10 == 8 && Math.abs(this.f15399d - this.f15397b) == 1 && this.f15399d == aVar.f15397b && this.f15397b == aVar.f15399d) {
            return true;
        }
        if (this.f15399d != aVar.f15399d || this.f15397b != aVar.f15397b) {
            return false;
        }
        Object obj2 = this.f15398c;
        if (obj2 != null) {
            if (!obj2.equals(aVar.f15398c)) {
                return false;
            }
        } else if (aVar.f15398c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f15396a * 31) + this.f15397b) * 31) + this.f15399d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i10 = this.f15396a;
        sb.append(i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f15397b);
        sb.append("c:");
        sb.append(this.f15399d);
        sb.append(",p:");
        sb.append(this.f15398c);
        sb.append("]");
        return sb.toString();
    }
}
