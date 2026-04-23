package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.fx;
import k3.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(fx fxVar) throws a {
        this.zzb = fxVar.getLayoutParams();
        ViewParent parent = fxVar.getParent();
        this.zzd = fxVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new a("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(fxVar.d());
        viewGroup.removeView(fxVar.d());
        fxVar.P(true);
    }
}
