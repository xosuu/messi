package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s00 f8343b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8344d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8345f;

    public /* synthetic */ r00(s00 s00Var, int i10, int i11, int i12) {
        this.f8342a = i12;
        this.f8343b = s00Var;
        this.f8344d = i10;
        this.f8345f = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8342a;
        int i11 = this.f8345f;
        int i12 = this.f8344d;
        s00 s00Var = this.f8343b;
        switch (i10) {
            case 0:
                s00Var.j(i12 - 1, i11);
                break;
            default:
                s00Var.getClass();
                s00Var.f8743b.execute(new r00(s00Var, i12, i11, 0));
                break;
        }
    }
}
