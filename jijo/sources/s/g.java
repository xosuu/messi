package s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16609b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16610d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16611f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k.d f16612h;

    public g(k.d dVar, int i10) {
        this.f16612h = dVar;
        this.f16608a = i10;
        this.f16609b = dVar.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16610d < this.f16609b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objD = this.f16612h.d(this.f16610d, this.f16608a);
        this.f16610d++;
        this.f16611f = true;
        return objD;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16611f) {
            throw new IllegalStateException();
        }
        int i10 = this.f16610d - 1;
        this.f16610d = i10;
        this.f16609b--;
        this.f16611f = false;
        this.f16612h.j(i10);
    }
}
