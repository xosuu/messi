package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;

/* JADX INFO: loaded from: classes.dex */
public final class h30 implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k30 f5194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final or0 f5195b;

    public h30(k30 k30Var, or0 or0Var) {
        this.f5194a = k30Var;
        this.f5195b = or0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        or0 or0Var = this.f5195b;
        k30 k30Var = this.f5194a;
        String str = or0Var.f7646f;
        synchronized (k30Var.f6163a) {
            try {
                Integer num = (Integer) k30Var.f6164b.get(str);
                k30Var.f6164b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
