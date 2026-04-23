package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v80 implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9799a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f9800b;

    @Override // com.google.android.gms.internal.ads.wk
    public final void b(Object obj, Map map) {
        WeakReference weakReference = this.f9800b;
        switch (this.f9799a) {
            case 0:
                w80 w80Var = (w80) weakReference.get();
                if (w80Var != null && "_ac".equals((String) map.get("eventName"))) {
                    w80Var.f10091h.onAdClicked();
                    if (((Boolean) zzba.zzc().a(eg.R9)).booleanValue()) {
                        p70 p70Var = w80Var.f10092i;
                        p70Var.L();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            p70Var.V();
                        }
                    }
                }
                break;
            case 1:
                w80 w80Var2 = (w80) weakReference.get();
                if (w80Var2 != null) {
                    w80Var2.f10091h.onAdClicked();
                    if (((Boolean) zzba.zzc().a(eg.R9)).booleanValue()) {
                        p70 p70Var2 = w80Var2.f10092i;
                        p70Var2.L();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            p70Var2.V();
                        }
                    }
                    break;
                }
                break;
            default:
                w80 w80Var3 = (w80) weakReference.get();
                if (w80Var3 != null) {
                    w80Var3.f10090g.zza();
                    break;
                }
                break;
        }
    }
}
