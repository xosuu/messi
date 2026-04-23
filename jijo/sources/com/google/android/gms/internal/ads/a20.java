package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class a20 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f2566a;

    public a20(f40 f40Var) {
        this.f2566a = f40Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z9 = true;
        if (((f40) this.f2566a).a().a() == null) {
            if (!((Boolean) zzba.zzc().a(eg.V4)).booleanValue()) {
                z9 = false;
            }
        }
        return Boolean.valueOf(z9);
    }
}
