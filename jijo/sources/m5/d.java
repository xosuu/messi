package m5;

import com.google.android.gms.internal.ads.en1;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f15756d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f15757f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f15758h;

    public d(e eVar, int i10, int i11) {
        this.f15758h = eVar;
        this.f15756d = i10;
        this.f15757f = i11;
    }

    @Override // m5.b
    public final Object[] c() {
        return this.f15758h.c();
    }

    @Override // m5.b
    public final int d() {
        return this.f15758h.e() + this.f15756d + this.f15757f;
    }

    @Override // m5.b
    public final int e() {
        return this.f15758h.e() + this.f15756d;
    }

    @Override // m5.e, java.util.List
    /* JADX INFO: renamed from: g */
    public final e subList(int i10, int i11) {
        en1.g(i10, i11, this.f15757f);
        int i12 = this.f15756d;
        return this.f15758h.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        en1.f(i10, this.f15757f);
        return this.f15758h.get(i10 + this.f15756d);
    }

    @Override // m5.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // m5.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15757f;
    }

    @Override // m5.e, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
