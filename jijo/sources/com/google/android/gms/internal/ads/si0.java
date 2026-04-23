package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class si0 implements q20, j80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fi0 f8876a;

    public /* synthetic */ si0(fi0 fi0Var) {
        this.f8876a = fi0Var;
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void h(boolean z9, Context context, s40 s40Var) throws zzdgw {
        fi0 fi0Var = this.f8876a;
        try {
            ((vr0) fi0Var.f4535b).c(z9);
            vr0 vr0Var = (vr0) fi0Var.f4535b;
            vr0Var.getClass();
            try {
                vr0Var.f9963a.N0(new a4.b(context));
            } catch (Throwable th) {
                throw new zzffn(th);
            }
        } catch (zzffn e10) {
            throw new zzdgw(e10.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final com.google.android.gms.ads.internal.client.zzdq zza() throws zzffn {
        try {
            return ((bp) this.f8876a.f4535b).zze();
        } catch (RemoteException e10) {
            throw new zzffn(e10);
        }
    }
}
