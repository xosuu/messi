package m5;

import com.google.android.gms.internal.ads.en1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f15763h = new h(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f15764d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f15765f;

    public h(int i10, Object[] objArr) {
        this.f15764d = objArr;
        this.f15765f = i10;
    }

    @Override // m5.e, m5.b
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f15764d;
        int i10 = this.f15765f;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // m5.b
    public final Object[] c() {
        return this.f15764d;
    }

    @Override // m5.b
    public final int d() {
        return this.f15765f;
    }

    @Override // m5.b
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        en1.f(i10, this.f15765f);
        Object obj = this.f15764d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15765f;
    }
}
