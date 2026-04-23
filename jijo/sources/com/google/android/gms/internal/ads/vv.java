package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xv f9977b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9978d;

    public /* synthetic */ vv(xv xvVar, String str, int i10) {
        this.f9976a = i10;
        this.f9977b = xvVar;
        this.f9978d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9976a;
        String str = this.f9978d;
        xv xvVar = this.f9977b;
        switch (i10) {
            case 0:
                bv bvVar = xvVar.f10658q;
                if (bvVar != null) {
                    ((gv) bvVar).c("exception", "what", "ExoPlayerAdapter exception", "extra", str);
                }
                break;
            default:
                bv bvVar2 = xvVar.f10658q;
                if (bvVar2 != null) {
                    ((gv) bvVar2).c("error", "what", "ExoPlayerAdapter error", "extra", str);
                }
                break;
        }
    }
}
