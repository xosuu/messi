package m5;

import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.m01;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends m01 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15752b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15753d;

    public a(int i10, int i11) {
        super(3);
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException(en1.d(i11, i10, "index"));
        }
        this.f15752b = i10;
        this.f15753d = i11;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        b(obj);
        throw null;
    }

    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object c(int i10);

    public final void d(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15753d < this.f15752b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15753d > 0;
    }

    @Override // com.google.android.gms.internal.ads.m01, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15753d;
        this.f15753d = i10 + 1;
        return c(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15753d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15753d - 1;
        this.f15753d = i10;
        return c(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15753d - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        d(obj);
        throw null;
    }
}
