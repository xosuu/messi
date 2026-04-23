package n;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15808b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f15809d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f15810f;

    public c(Object obj, Object obj2) {
        this.f15807a = obj;
        this.f15808b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15807a.equals(cVar.f15807a) && this.f15808b.equals(cVar.f15808b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15807a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15808b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f15807a.hashCode() ^ this.f15808b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15807a + "=" + this.f15808b;
    }
}
