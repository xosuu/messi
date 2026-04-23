package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class h5 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5 f5219b;

    public h5(int i10, c5 c5Var) {
        this.f5218a = i10;
        this.f5219b = c5Var;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f5218a, ((h5) obj).f5218a);
    }
}
