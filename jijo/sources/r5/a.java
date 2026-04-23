package r5;

import com.google.gson.internal.d;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f16536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f16537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16538c;

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeA = d.a(type);
        this.f16537b = typeA;
        this.f16536a = d.f(typeA);
        this.f16538c = typeA.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (d.d(this.f16537b, ((a) obj).f16537b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16538c;
    }

    public final String toString() {
        return d.h(this.f16537b);
    }
}
