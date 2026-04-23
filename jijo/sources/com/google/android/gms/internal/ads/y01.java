package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class y01 extends a11 {
    @Override // com.google.android.gms.internal.ads.a11
    public final /* bridge */ /* synthetic */ Object s(Object obj, Throwable th) {
        y11 y11Var = (y11) obj;
        n5.a aVarZza = y11Var.zza(th);
        en1.x0(aVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", y11Var);
        return aVarZza;
    }

    @Override // com.google.android.gms.internal.ads.a11
    public final /* synthetic */ void t(Object obj) {
        l((n5.a) obj);
    }
}
