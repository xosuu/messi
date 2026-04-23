package l2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f15131b;

    public d(long j10, String str) {
        this.f15130a = str;
        this.f15131b = Long.valueOf(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f15130a.equals(dVar.f15130a)) {
            return false;
        }
        Long l9 = dVar.f15131b;
        Long l10 = this.f15131b;
        return l10 != null ? l10.equals(l9) : l9 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f15130a.hashCode() * 31;
        Long l9 = this.f15131b;
        return iHashCode + (l9 != null ? l9.hashCode() : 0);
    }
}
