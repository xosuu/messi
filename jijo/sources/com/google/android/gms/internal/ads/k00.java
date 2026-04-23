package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class k00 implements x40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6132b;

    public /* synthetic */ k00(int i10, Object obj) {
        this.f6131a = i10;
        this.f6132b = obj;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void L(Context context) {
        zzffn zzffnVar;
        int i10 = this.f6131a;
        Object obj = this.f6132b;
        switch (i10) {
            case 0:
                try {
                    vr0 vr0Var = (vr0) obj;
                    vr0Var.getClass();
                    try {
                        vr0Var.f9963a.d();
                        if (context != null) {
                            vr0 vr0Var2 = (vr0) obj;
                            vr0Var2.getClass();
                            try {
                                vr0Var2.f9963a.S(new a4.b(context));
                                return;
                            } finally {
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (zzffn e10) {
                    zzm.zzk("Cannot invoke onResume for the mediation adapter.", e10);
                    return;
                }
            default:
                fx fxVar = (fx) obj;
                if (fxVar != null) {
                    fxVar.onResume();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void h(Context context) {
        int i10 = this.f6131a;
        Object obj = this.f6132b;
        switch (i10) {
            case 0:
                try {
                    vr0 vr0Var = (vr0) obj;
                    vr0Var.getClass();
                    try {
                        vr0Var.f9963a.zzE();
                        return;
                    } catch (Throwable th) {
                        throw new zzffn(th);
                    }
                } catch (zzffn e10) {
                    zzm.zzk("Cannot invoke onPause for the mediation adapter.", e10);
                    return;
                }
            default:
                fx fxVar = (fx) obj;
                if (fxVar != null) {
                    fxVar.onPause();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void z(Context context) {
        int i10 = this.f6131a;
        Object obj = this.f6132b;
        switch (i10) {
            case 0:
                try {
                    vr0 vr0Var = (vr0) obj;
                    vr0Var.getClass();
                    try {
                        vr0Var.f9963a.zzo();
                        return;
                    } catch (Throwable th) {
                        throw new zzffn(th);
                    }
                } catch (zzffn e10) {
                    zzm.zzk("Cannot invoke onDestroy for the mediation adapter.", e10);
                    return;
                }
            default:
                fx fxVar = (fx) obj;
                if (fxVar != null) {
                    fxVar.destroy();
                    return;
                }
                return;
        }
    }
}
