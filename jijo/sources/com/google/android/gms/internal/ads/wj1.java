package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class wj1 extends zn1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10214c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10215d;

    public wj1(wv wvVar) {
        super(wvVar);
        this.f10215d = new hv();
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final vu d(int i10, vu vuVar, boolean z9) {
        int i11 = this.f10214c;
        wv wvVar = this.f11279b;
        switch (i11) {
            case 0:
                vu vuVarD = wvVar.d(i10, vuVar, z9);
                if (wvVar.e(vuVarD.f9970c, (hv) this.f10215d, 0L).b()) {
                    Object obj = vuVar.f9968a;
                    Object obj2 = vuVar.f9969b;
                    int i12 = vuVar.f9970c;
                    long j10 = vuVar.f9971d;
                    zc zcVar = zc.f11204b;
                    vuVarD.b(obj, obj2, i12, j10, true);
                } else {
                    vuVarD.f9972e = true;
                }
                return vuVarD;
            default:
                return wvVar.d(i10, vuVar, z9);
        }
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final hv e(int i10, hv hvVar, long j10) {
        int i11 = this.f10214c;
        wv wvVar = this.f11279b;
        switch (i11) {
            case 1:
                wvVar.e(i10, hvVar, j10);
                fg fgVar = (fg) this.f10215d;
                hvVar.f5408b = fgVar;
                gb gbVar = fgVar.f4518b;
                return hvVar;
            default:
                return wvVar.e(i10, hvVar, j10);
        }
    }

    public wj1(wv wvVar, fg fgVar) {
        super(wvVar);
        this.f10215d = fgVar;
    }
}
