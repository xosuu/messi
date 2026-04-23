package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gv f4304b;

    public /* synthetic */ ev(gv gvVar, int i10) {
        this.f4303a = i10;
        this.f4304b = gvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4303a;
        gv gvVar = this.f4304b;
        switch (i10) {
            case 0:
                gvVar.c("firstFrameRendered", new String[0]);
                break;
            case 1:
                gvVar.c("surfaceCreated", new String[0]);
                break;
            default:
                gvVar.c("surfaceDestroyed", new String[0]);
                break;
        }
    }
}
