package k1;

import g4.a0;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14640a;

    public b(List list) {
        a0.f(list, "topics");
        this.f14640a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List list = this.f14640a;
        b bVar = (b) obj;
        if (list.size() != bVar.f14640a.size()) {
            return false;
        }
        return a0.b(new HashSet(list), new HashSet(bVar.f14640a));
    }

    public final int hashCode() {
        return Objects.hash(this.f14640a);
    }

    public final String toString() {
        return "Topics=" + this.f14640a;
    }
}
