package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class nw extends lw {
    @Override // com.google.android.gms.internal.ads.lw
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final boolean r(String str) {
        String strZzf = zzf.zzf(str);
        pv pvVar = (pv) this.f6708d.get();
        if (pvVar != null && strZzf != null) {
            pvVar.f(strZzf, this);
        }
        zzm.zzj("VideoStreamNoopCache is doing nothing.");
        l(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
