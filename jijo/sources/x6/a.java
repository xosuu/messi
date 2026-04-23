package x6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18499b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18500d;

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f18498a = i10;
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                int i14 = i10 % i12;
                int i15 = ((i13 < 0 ? i13 + i12 : i13) - (i14 < 0 ? i14 + i12 : i14)) % i12;
                i11 -= i15 < 0 ? i15 + i12 : i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                int i18 = i11 % i16;
                int i19 = ((i17 < 0 ? i17 + i16 : i17) - (i18 < 0 ? i18 + i16 : i18)) % i16;
                i11 += i19 < 0 ? i19 + i16 : i19;
            }
        }
        this.f18499b = i11;
        this.f18500d = i12;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f18498a, this.f18499b, this.f18500d);
    }
}
