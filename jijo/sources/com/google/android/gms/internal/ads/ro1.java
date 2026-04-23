package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ro1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wo1 f8671b;

    public /* synthetic */ ro1(wo1 wo1Var, int i10) {
        this.f8670a = i10;
        this.f8671b = wo1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8670a;
        wo1 wo1Var = this.f8671b;
        switch (i10) {
            case 0:
                wo1Var.P = true;
                break;
            case 1:
                wo1Var.q();
                break;
            default:
                if (!wo1Var.V) {
                    ho1 ho1Var = wo1Var.f10272z;
                    ho1Var.getClass();
                    ho1Var.c(wo1Var);
                }
                break;
        }
    }
}
