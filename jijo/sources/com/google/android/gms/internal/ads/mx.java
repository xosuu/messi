package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fx f7072b;

    public /* synthetic */ mx(fx fxVar, int i10) {
        this.f7071a = i10;
        this.f7072b = fxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7071a;
        fx fxVar = this.f7072b;
        switch (i10) {
            case 0:
                fxVar.destroy();
                break;
            case 1:
                fxVar.onResume();
                break;
            case 2:
                fxVar.onPause();
                break;
            case 3:
                fxVar.destroy();
                break;
            case 4:
                fxVar.j("onSdkImpression", new s.b());
                break;
            case 5:
                fxVar.destroy();
                break;
            default:
                fxVar.R();
                break;
        }
    }
}
