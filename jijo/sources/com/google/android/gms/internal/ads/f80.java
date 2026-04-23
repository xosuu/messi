package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class f80 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4428b;

    public /* synthetic */ f80(int i10, Object obj) {
        this.f4427a = i10;
        this.f4428b = obj;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        String str;
        String str2;
        int i10 = this.f4427a;
        Object obj = this.f4428b;
        switch (i10) {
            case 0:
                fx fxVar = (fx) ((p80) obj).f7835d;
                if (fxVar != null) {
                    return fxVar.q();
                }
                return null;
            case 1:
                gp0 gp0Var = (gp0) obj;
                switch (gp0Var.f5024a) {
                    case 0:
                        str = ((zzbuc) gp0Var.f5026d).f11559q;
                        break;
                    default:
                        str = ((zzbvb) gp0Var.f5026d).f11581t;
                        break;
                }
                tp1.b0(str);
                return str;
            case 2:
                String str3 = ((zzbug) ((jp0) obj).f6060b).f11571s;
                tp1.b0(str3);
                return str3;
            default:
                gp0 gp0Var2 = (gp0) obj;
                switch (gp0Var2.f5024a) {
                    case 0:
                        str2 = ((zzbuc) gp0Var2.f5026d).f11559q;
                        break;
                    default:
                        str2 = ((zzbvb) gp0Var2.f5026d).f11581t;
                        break;
                }
                tp1.b0(str2);
                return str2;
        }
    }
}
