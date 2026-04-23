package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class lf0 implements k21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6602a;

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        if (((Boolean) dh.f3656h.k()).booleanValue() && (th instanceof zzba)) {
            b4.f.l0(this.f6602a);
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4a(Object obj) {
        if (((Boolean) dh.f3658j.k()).booleanValue()) {
            b4.f.l0(this.f6602a);
        }
    }

    public final n5.a b(boolean z9) {
        try {
            k1.a aVar = new k1.a(MobileAds.ERROR_DOMAIN, z9);
            i1.b bVarA = i1.b.a(this.f6602a);
            return bVarA != null ? bVarA.b(aVar) : tc1.Z(new IllegalStateException());
        } catch (Exception e10) {
            return tc1.Z(e10);
        }
    }
}
