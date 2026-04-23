package s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16615a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k.d f16618f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16617d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16616b = -1;

    public i(k.d dVar) {
        this.f16618f = dVar;
        this.f16615a = dVar.f() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f16617d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f16616b;
        k.d dVar = this.f16618f;
        Object objD = dVar.d(i10, 0);
        if (key != objD && (key == null || !key.equals(objD))) {
            return false;
        }
        Object value = entry.getValue();
        Object objD2 = dVar.d(this.f16616b, 1);
        return value == objD2 || (value != null && value.equals(objD2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f16617d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f16618f.d(this.f16616b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f16617d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f16618f.d(this.f16616b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16616b < this.f16615a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f16617d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f16616b;
        k.d dVar = this.f16618f;
        Object objD = dVar.d(i10, 0);
        Object objD2 = dVar.d(this.f16616b, 1);
        return (objD == null ? 0 : objD.hashCode()) ^ (objD2 != null ? objD2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16616b++;
        this.f16617d = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16617d) {
            throw new IllegalStateException();
        }
        this.f16618f.j(this.f16616b);
        this.f16616b--;
        this.f16615a--;
        this.f16617d = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f16617d) {
            return this.f16618f.k(this.f16616b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
