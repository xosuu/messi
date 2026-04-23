package l2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15133b;

    public e(String str, int i10) {
        this.f15132a = str;
        this.f15133b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f15133b != eVar.f15133b) {
            return false;
        }
        return this.f15132a.equals(eVar.f15132a);
    }

    public final int hashCode() {
        return (this.f15132a.hashCode() * 31) + this.f15133b;
    }
}
