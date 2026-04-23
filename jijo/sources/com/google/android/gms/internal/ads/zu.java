package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzt;

/* JADX INFO: loaded from: classes.dex */
public final class zu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av f11327b;

    public /* synthetic */ zu(av avVar, int i10) {
        this.f11326a = i10;
        this.f11327b = avVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f11326a;
        av avVar = this.f11327b;
        switch (i10) {
            case 0:
                bv bvVar = avVar.B;
                if (bvVar != null) {
                    ((gv) bvVar).d();
                }
                break;
            case 1:
                bv bvVar2 = avVar.B;
                if (bvVar2 != null) {
                    gv gvVar = (gv) bvVar2;
                    fv fvVar = gvVar.f5074h;
                    fvVar.f4670b = false;
                    ew0 ew0Var = zzt.zza;
                    ew0Var.removeCallbacks(fvVar);
                    ew0Var.postDelayed(fvVar, 250L);
                    ew0Var.post(new ev(gvVar, 1));
                }
                break;
            case 2:
                bv bvVar3 = avVar.B;
                if (bvVar3 != null) {
                    gv gvVar2 = (gv) bvVar3;
                    gvVar2.c("pause", new String[0]);
                    gvVar2.b();
                    gvVar2.f5077t = false;
                    ((gv) avVar.B).g();
                }
                break;
            case 3:
                bv bvVar4 = avVar.B;
                if (bvVar4 != null) {
                    if (!avVar.C) {
                        gv gvVar3 = (gv) bvVar4;
                        gvVar3.f5072d.setVisibility(4);
                        zzt.zza.post(new ev(gvVar3, 0));
                        avVar.C = true;
                    }
                    ((gv) avVar.B).e();
                }
                break;
            default:
                bv bvVar5 = avVar.B;
                if (bvVar5 != null) {
                    gv gvVar4 = (gv) bvVar5;
                    gvVar4.c("pause", new String[0]);
                    gvVar4.b();
                    gvVar4.f5077t = false;
                }
                break;
        }
    }
}
