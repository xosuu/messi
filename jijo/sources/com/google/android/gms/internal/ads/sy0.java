package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class sy0 extends uy0 {
    public static final uy0 f(int i10) {
        return i10 < 0 ? uy0.f9696b : i10 > 0 ? uy0.f9697c : uy0.f9695a;
    }

    @Override // com.google.android.gms.internal.ads.uy0
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.uy0
    public final uy0 b(int i10, int i11) {
        return f(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.uy0
    public final uy0 c(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.uy0
    public final uy0 d(boolean z9, boolean z10) {
        return f(z9 == z10 ? 0 : !z9 ? -1 : 1);
    }

    @Override // com.google.android.gms.internal.ads.uy0
    public final uy0 e(boolean z9, boolean z10) {
        return f(z10 == z9 ? 0 : !z10 ? -1 : 1);
    }
}
