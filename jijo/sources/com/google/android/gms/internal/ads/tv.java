package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xv f9289b;

    public /* synthetic */ tv(xv xvVar, int i10) {
        this.f9288a = i10;
        this.f9289b = xvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9288a;
        xv xvVar = this.f9289b;
        switch (i10) {
            case 0:
                bv bvVar = xvVar.f10658q;
                if (bvVar != null) {
                    gv gvVar = (gv) bvVar;
                    gvVar.f5072d.setVisibility(4);
                    zzt.zza.post(new ev(gvVar, 0));
                }
                break;
            case 1:
                bv bvVar2 = xvVar.f10658q;
                if (bvVar2 != null) {
                    ((gv) bvVar2).e();
                }
                break;
            case 2:
                sv svVar = xvVar.f3455b;
                float f10 = svVar.f8970c ? svVar.f8972e ? 0.0f : svVar.f8973f : 0.0f;
                yw ywVar = xvVar.f10660t;
                if (ywVar == null) {
                    zzm.zzj("Trying to set volume before player is initialized.");
                } else {
                    try {
                        bk1 bk1Var = ywVar.f11058s;
                        if (bk1Var != null) {
                            bk1Var.j(f10);
                        }
                    } catch (IOException e10) {
                        zzm.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                        return;
                    }
                }
                break;
            case 3:
                bv bvVar3 = xvVar.f10658q;
                if (bvVar3 != null) {
                    ((gv) bvVar3).g();
                }
                break;
            case 4:
                bv bvVar4 = xvVar.f10658q;
                if (bvVar4 != null) {
                    gv gvVar2 = (gv) bvVar4;
                    gvVar2.c("pause", new String[0]);
                    gvVar2.b();
                    gvVar2.f5077t = false;
                }
                break;
            case 5:
                bv bvVar5 = xvVar.f10658q;
                if (bvVar5 != null) {
                    gv gvVar3 = (gv) bvVar5;
                    fv fvVar = gvVar3.f5074h;
                    fvVar.f4670b = false;
                    ew0 ew0Var = zzt.zza;
                    ew0Var.removeCallbacks(fvVar);
                    ew0Var.postDelayed(fvVar, 250L);
                    ew0Var.post(new ev(gvVar3, 1));
                }
                break;
            case 6:
                bv bvVar6 = xvVar.f10658q;
                if (bvVar6 != null) {
                    ((gv) bvVar6).d();
                }
                break;
            default:
                bv bvVar7 = xvVar.f10658q;
                if (bvVar7 != null) {
                    ((gv) bvVar7).f();
                }
                break;
        }
    }
}
