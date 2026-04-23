package l2;

import c2.w;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f15141b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f15141b != iVar.f15141b) {
            return false;
        }
        return this.f15140a.equals(iVar.f15140a);
    }

    public final int hashCode() {
        return this.f15141b.hashCode() + (this.f15140a.hashCode() * 31);
    }
}
