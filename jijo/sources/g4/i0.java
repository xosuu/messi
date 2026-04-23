package g4;

import com.google.android.gms.internal.ads.en1;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f13729d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f13730f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0 f13731h;

    public i0(j0 j0Var, int i10, int i11) {
        this.f13731h = j0Var;
        this.f13729d = i10;
        this.f13730f = i11;
    }

    @Override // g4.g0
    public final int c() {
        return this.f13731h.d() + this.f13729d + this.f13730f;
    }

    @Override // g4.g0
    public final int d() {
        return this.f13731h.d() + this.f13729d;
    }

    @Override // g4.g0
    public final Object[] e() {
        return this.f13731h.e();
    }

    @Override // g4.j0, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final j0 subList(int i10, int i11) {
        en1.q0(i10, i11, this.f13730f);
        int i12 = this.f13729d;
        return this.f13731h.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        en1.V(i10, this.f13730f);
        return this.f13731h.get(i10 + this.f13729d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13730f;
    }
}
