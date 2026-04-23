package l6;

import g4.a0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f15226a;

    public b(Throwable th) {
        a0.f(th, "exception");
        this.f15226a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (a0.b(this.f15226a, ((b) obj).f15226a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15226a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f15226a + ')';
    }
}
