package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class ul implements v3.c, j80, tu, yx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu f9529a;

    public /* synthetic */ ul(qu quVar) {
        this.f9529a = quVar;
    }

    @Override // com.google.android.gms.internal.ads.j80
    public void h(boolean z9, Context context, s40 s40Var) {
        qu quVar = this.f9529a;
        try {
            zzu.zzi();
            zzn.zza(context, (AdOverlayInfoParcel) quVar.f8276a.get(), true);
        } catch (Exception unused) {
        }
    }

    @Override // v3.c
    public void t(ConnectionResult connectionResult) {
        this.f9529a.c(new RuntimeException("Connection failed."));
    }

    @Override // com.google.android.gms.internal.ads.tu, com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public void mo5zza(Object obj) {
        this.f9529a.b((zm) obj);
    }

    public ul(qu quVar, int i10) {
        this.f9529a = quVar;
    }

    @Override // com.google.android.gms.internal.ads.yx
    public void zza(boolean z9, int i10, String str, String str2) {
        qu quVar = this.f9529a;
        if (z9) {
            quVar.b(null);
            return;
        }
        quVar.c(new Exception("Ad Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
