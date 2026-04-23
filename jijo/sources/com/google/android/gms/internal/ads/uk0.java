package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;

/* JADX INFO: loaded from: classes.dex */
public final class uk0 implements zzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzg f9526a;

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: zza */
    public final synchronized void mo8zza(View view) {
        zzg zzgVar = this.f9526a;
        if (zzgVar != null) {
            zzgVar.mo8zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzb() {
        zzg zzgVar = this.f9526a;
        if (zzgVar != null) {
            zzgVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzc() {
        zzg zzgVar = this.f9526a;
        if (zzgVar != null) {
            zzgVar.zzc();
        }
    }
}
