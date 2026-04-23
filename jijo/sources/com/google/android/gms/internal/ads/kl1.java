package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kl1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6322b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6323d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6324f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6325h;

    public /* synthetic */ kl1(Object obj, int i10, long j10, long j11, int i11) {
        this.f6321a = i11;
        this.f6325h = obj;
        this.f6322b = i10;
        this.f6323d = j10;
        this.f6324f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6321a;
        Object obj = this.f6325h;
        switch (i10) {
            case 0:
                cj0 cj0Var = (cj0) obj;
                int i11 = this.f6322b;
                long j10 = this.f6323d;
                long j11 = this.f6324f;
                cj0Var.getClass();
                int i12 = yn0.f10944a;
                ((ri1) ((ol1) cj0Var.f3302d)).f8608a.f9512p.p(j10, j11, i11);
                break;
            default:
                ((gq1) obj).f5035b.y(this.f6323d, this.f6324f, this.f6322b);
                break;
        }
    }
}
