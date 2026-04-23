package l6;

import g4.a0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15225b;

    public a(Object obj, Object obj2) {
        this.f15224a = obj;
        this.f15225b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return a0.b(this.f15224a, aVar.f15224a) && a0.b(this.f15225b, aVar.f15225b);
    }

    public final int hashCode() {
        Object obj = this.f15224a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f15225b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f15224a + ", " + this.f15225b + ')';
    }
}
