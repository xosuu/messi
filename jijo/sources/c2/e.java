package c2;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f1525a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.f1525a.equals(((e) obj).f1525a);
    }

    public final int hashCode() {
        return this.f1525a.hashCode();
    }
}
