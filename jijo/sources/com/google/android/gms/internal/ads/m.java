package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6780a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m20 f6781b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6782d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6783f;

    public /* synthetic */ m(m20 m20Var, int i10, long j10) {
        this.f6781b = m20Var;
        this.f6783f = i10;
        this.f6782d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6780a;
        long j10 = this.f6782d;
        int i11 = this.f6783f;
        m20 m20Var = this.f6781b;
        switch (i10) {
            case 0:
                m20Var.getClass();
                int i12 = yn0.f10944a;
                ((ri1) m20Var.f6810d).f8608a.f9512p.W(i11, j10);
                break;
            default:
                m20Var.getClass();
                int i13 = yn0.f10944a;
                ((ri1) m20Var.f6810d).f8608a.f9512p.D(i11, j10);
                break;
        }
    }

    public /* synthetic */ m(m20 m20Var, long j10, int i10) {
        this.f6781b = m20Var;
        this.f6782d = j10;
        this.f6783f = i10;
    }
}
