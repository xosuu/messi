package g4;

import com.google.android.gms.internal.ads.en1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends j0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m0 f13755h = new m0(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f13756d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f13757f;

    public m0(int i10, Object[] objArr) {
        this.f13756d = objArr;
        this.f13757f = i10;
    }

    @Override // g4.j0, g4.g0
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f13756d;
        int i10 = this.f13757f;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // g4.g0
    public final int c() {
        return this.f13757f;
    }

    @Override // g4.g0
    public final int d() {
        return 0;
    }

    @Override // g4.g0
    public final Object[] e() {
        return this.f13756d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        en1.V(i10, this.f13757f);
        Object obj = this.f13756d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13757f;
    }
}
