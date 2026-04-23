package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ik0 f9349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ik0 f9350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9352i;

    public u2(ik0 ik0Var, ik0 ik0Var2, boolean z9) throws zzbo {
        this.f9350g = ik0Var;
        this.f9349f = ik0Var2;
        this.f9348e = z9;
        ik0Var2.i(12);
        this.f9344a = ik0Var2.y();
        ik0Var.i(12);
        this.f9352i = ik0Var.y();
        b4.f.f0("first_chunk must be 1", ik0Var.q() == 1);
        this.f9345b = -1;
    }

    public final boolean a() {
        int i10 = this.f9345b + 1;
        this.f9345b = i10;
        if (i10 == this.f9344a) {
            return false;
        }
        boolean z9 = this.f9348e;
        ik0 ik0Var = this.f9349f;
        this.f9347d = z9 ? ik0Var.E() : ik0Var.D();
        if (this.f9345b == this.f9351h) {
            ik0 ik0Var2 = this.f9350g;
            this.f9346c = ik0Var2.y();
            ik0Var2.j(4);
            int i11 = this.f9352i - 1;
            this.f9352i = i11;
            this.f9351h = i11 > 0 ? (-1) + ik0Var2.y() : -1;
        }
        return true;
    }
}
