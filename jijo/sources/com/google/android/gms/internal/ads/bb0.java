package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bb0 implements yx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fb0 f2953b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fx f2954d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ed f2955f;

    public /* synthetic */ bb0(fb0 fb0Var, fx fxVar, ed edVar, int i10) {
        this.f2952a = i10;
        this.f2953b = fb0Var;
        this.f2954d = fxVar;
        this.f2955f = edVar;
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void zza(boolean z9, int i10, String str, String str2) {
        int i11 = this.f2952a;
        fx fxVar = this.f2954d;
        ed edVar = this.f2955f;
        fb0 fb0Var = this.f2953b;
        switch (i11) {
            case 0:
                fb0Var.getClass();
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.A3)).booleanValue();
                or0 or0Var = fb0Var.f4440a;
                if (!zBooleanValue) {
                    if (or0Var.f7641a != null && fxVar.zzq() != null) {
                        fxVar.zzq().v1(or0Var.f7641a);
                    }
                    edVar.d();
                } else if (!z9) {
                    edVar.c(new zzeir(1, "Native Video WebView failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
                } else {
                    if (or0Var.f7641a != null && fxVar.zzq() != null) {
                        fxVar.zzq().v1(or0Var.f7641a);
                    }
                    edVar.d();
                }
                break;
            default:
                if (!z9) {
                    fb0Var.getClass();
                    edVar.c(new zzeir(1, "Html video Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
                } else {
                    or0 or0Var2 = fb0Var.f4440a;
                    if (or0Var2.f7641a != null && fxVar.zzq() != null) {
                        fxVar.zzq().v1(or0Var2.f7641a);
                    }
                    edVar.d();
                }
                break;
        }
    }
}
