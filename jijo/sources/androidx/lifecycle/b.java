package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f946b;

    public b(int i10, Method method) {
        this.f945a = i10;
        this.f946b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f945a == bVar.f945a && this.f946b.getName().equals(bVar.f946b.getName());
    }

    public final int hashCode() {
        return this.f946b.getName().hashCode() + (this.f945a * 31);
    }
}
