package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6442b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6443d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6444f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6445h;

    public /* synthetic */ l(Object obj, String str, long j10, long j11, int i10) {
        this.f6441a = i10;
        this.f6445h = obj;
        this.f6442b = str;
        this.f6443d = j10;
        this.f6444f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6441a;
        Object obj = this.f6445h;
        switch (i10) {
            case 0:
                m20 m20Var = (m20) obj;
                String str = this.f6442b;
                long j10 = this.f6443d;
                long j11 = this.f6444f;
                m20Var.getClass();
                int i11 = yn0.f10944a;
                ((ri1) m20Var.f6810d).f8608a.f9512p.P(j10, str, j11);
                break;
            default:
                cj0 cj0Var = (cj0) obj;
                String str2 = this.f6442b;
                long j12 = this.f6443d;
                long j13 = this.f6444f;
                cj0Var.getClass();
                int i12 = yn0.f10944a;
                ((ri1) ((ol1) cj0Var.f3302d)).f8608a.f9512p.w(j12, str2, j13);
                break;
        }
    }
}
