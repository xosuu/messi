package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes.dex */
public final class tf0 implements u50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mt f9149b;

    public tf0(Context context, mt mtVar) {
        this.f9148a = context;
        this.f9149b = mtVar;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void J(zzbvb zzbvbVar) {
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void b(kr0 kr0Var) {
        if (TextUtils.isEmpty(((hr0) kr0Var.f6383b.f10631d).f5374e)) {
            return;
        }
        mt mtVar = this.f9149b;
        Context context = this.f9148a;
        zzl zzlVar = ((or0) kr0Var.f6382a.f6060b).f7644d;
        mtVar.getClass();
        if (((Boolean) zzba.zzc().a(eg.f4012h0)).booleanValue() && mtVar.g(context) && mt.h(context)) {
            synchronized (mtVar.f7052i) {
            }
        }
        this.f9149b.l(this.f9148a, "_aq", ((hr0) kr0Var.f6383b.f10631d).f5374e, null);
    }
}
