package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class rp1 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8679b;

    public rp1(int i10, y1 y1Var) {
        this.f8678a = 1 == (y1Var.f10706e & 1);
        this.f8679b = tp1.O(i10, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rp1 rp1Var) {
        return uy0.f9695a.d(this.f8679b, rp1Var.f8679b).d(this.f8678a, rp1Var.f8678a).a();
    }
}
