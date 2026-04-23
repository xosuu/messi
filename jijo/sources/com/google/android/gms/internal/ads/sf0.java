package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class sf0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f8851a;

    public sf0(jy jyVar) {
        this.f8851a = jyVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rf0 zzb() {
        Context contextA = ((jy) this.f8851a).a();
        rf0 rf0Var = new rf0();
        rf0Var.f8587t = 1;
        rf0Var.f7571q = new cd(contextA, zzu.zzt().zzb(), rf0Var, rf0Var, 2);
        return rf0Var;
    }
}
