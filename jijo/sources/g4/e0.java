package g4;

import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.m01;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends m01 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13715b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13716d;

    public e0(int i10, int i11) {
        super(2);
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException(en1.w0(i11, i10, "index"));
        }
        this.f13715b = i10;
        this.f13716d = i11;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        b(obj);
        throw null;
    }

    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void c(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object d(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f13716d < this.f13715b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13716d > 0;
    }

    @Override // com.google.android.gms.internal.ads.m01, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13716d;
        this.f13716d = i10 + 1;
        return d(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13716d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13716d - 1;
        this.f13716d = i10;
        return d(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13716d - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }
}
