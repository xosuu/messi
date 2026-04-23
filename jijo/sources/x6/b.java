package x6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18502b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18503d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18504f;

    public b(int i10, int i11, int i12) {
        this.f18501a = i12;
        this.f18502b = i11;
        boolean z9 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z9 = false;
        }
        this.f18503d = z9;
        this.f18504f = z9 ? i10 : i11;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        int i10 = this.f18504f;
        if (i10 != this.f18502b) {
            this.f18504f = this.f18501a + i10;
        } else {
            if (!this.f18503d) {
                throw new NoSuchElementException();
            }
            this.f18503d = false;
        }
        return Integer.valueOf(i10);
    }

    public final void b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18503d;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }
}
