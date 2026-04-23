package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class h90 implements wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i90 f5237b;

    public h90(i90 i90Var, String str) {
        this.f5236a = str;
        this.f5237b = i90Var;
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final void Z(vb vbVar) {
        if (!((Boolean) zzba.zzc().a(eg.f4191z1)).booleanValue()) {
            if (vbVar.f9827j) {
                i90 i90Var = this.f5237b;
                i90Var.E.put(this.f5236a, Boolean.TRUE);
                i90 i90Var2 = this.f5237b;
                i90Var2.b(i90Var2.f5540u.zzf(), this.f5237b.f5540u.zzl(), this.f5237b.f5540u.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (vbVar.f9827j) {
                    i90 i90Var3 = this.f5237b;
                    if (i90Var3.f5540u == null) {
                        return;
                    }
                    i90Var3.E.put(this.f5236a, Boolean.TRUE);
                    i90 i90Var4 = this.f5237b;
                    i90Var4.b(i90Var4.f5540u.zzf(), this.f5237b.f5540u.zzl(), this.f5237b.f5540u.zzm(), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
