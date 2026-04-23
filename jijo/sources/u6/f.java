package u6;

import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f17653a;

    public f(Class cls) {
        a0.f(cls, "jClass");
        this.f17653a = cls;
    }

    @Override // u6.a
    public final Class a() {
        return this.f17653a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (a0.b(this.f17653a, ((f) obj).f17653a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17653a.hashCode();
    }

    public final String toString() {
        return this.f17653a.toString() + " (Kotlin reflection is not available)";
    }
}
