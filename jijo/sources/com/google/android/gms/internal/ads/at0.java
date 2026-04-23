package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class at0 implements f70, u40, h70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft0 f2787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bt0 f2788b;

    public at0(Context context, ft0 ft0Var) {
        this.f2787a = ft0Var;
        this.f2788b = tc1.d(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void a(zze zzeVar) {
        if (((Boolean) eh.f4204d.k()).booleanValue()) {
            String string = zzeVar.zza().toString();
            bt0 bt0Var = this.f2788b;
            bt0Var.i(string);
            bt0Var.x(false);
            this.f2787a.a(bt0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final void zzb() {
        if (((Boolean) eh.f4204d.k()).booleanValue()) {
            bt0 bt0Var = this.f2788b;
            bt0Var.x(true);
            this.f2787a.a(bt0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.f70
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.f70
    public final void zzl() {
        if (((Boolean) eh.f4204d.k()).booleanValue()) {
            this.f2788b.zzi();
        }
    }
}
