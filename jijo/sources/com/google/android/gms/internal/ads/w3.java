package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b1 f10040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f10041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u3 f10042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10047i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10051m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s3 f10039a = new s3();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m20 f10048j = new m20(3);

    public abstract long a(ik0 ik0Var);

    public void b(boolean z9) {
        int i10;
        if (z9) {
            this.f10048j = new m20(3);
            this.f10044f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f10046h = i10;
        this.f10043e = -1L;
        this.f10045g = 0L;
    }

    public abstract boolean c(ik0 ik0Var, long j10, m20 m20Var);

    public void d(long j10) {
        this.f10045g = j10;
    }
}
