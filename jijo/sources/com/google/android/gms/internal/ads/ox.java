package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ox implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ px f7692b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7693d;

    public /* synthetic */ ox(px pxVar, String str, int i10) {
        this.f7691a = i10;
        if (i10 != 1) {
            this.f7692b = pxVar;
            this.f7693d = "about:blank";
        } else {
            this.f7692b = pxVar;
            this.f7693d = str;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7691a;
        px pxVar = this.f7692b;
        switch (i10) {
            case 0:
                pxVar.A0();
                break;
            default:
                pxVar.z0(this.f7693d);
                break;
        }
    }
}
