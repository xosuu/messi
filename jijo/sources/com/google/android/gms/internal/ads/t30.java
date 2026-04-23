package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t30 implements e50, x40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fr0 f9044a;

    public t30(fr0 fr0Var) {
        this.f9044a = fr0Var;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void L(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void h(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void z(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void zzs() {
        fr0 fr0Var = this.f9044a;
        lq lqVar = fr0Var.f4607d0;
        if (lqVar == null || !lqVar.f6692a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (((String) fr0Var.f4607d0.f6694c).isEmpty()) {
            return;
        }
        arrayList.add((String) fr0Var.f4607d0.f6694c);
    }
}
