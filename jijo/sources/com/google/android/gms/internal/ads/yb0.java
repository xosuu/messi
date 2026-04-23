package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 extends VideoController.VideoLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n90 f10821a;

    public yb0(n90 n90Var) {
        this.f10821a = n90Var;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzdq zzdqVarG = this.f10821a.G();
        zzdt zzdtVarZzi = null;
        if (zzdqVarG != null) {
            try {
                zzdtVarZzi = zzdqVarG.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzdtVarZzi == null) {
            return;
        }
        try {
            zzdtVarZzi.zze();
        } catch (RemoteException e10) {
            zzm.zzk("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzdq zzdqVarG = this.f10821a.G();
        zzdt zzdtVarZzi = null;
        if (zzdqVarG != null) {
            try {
                zzdtVarZzi = zzdqVarG.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzdtVarZzi == null) {
            return;
        }
        try {
            zzdtVarZzi.zzg();
        } catch (RemoteException e10) {
            zzm.zzk("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzdq zzdqVarG = this.f10821a.G();
        zzdt zzdtVarZzi = null;
        if (zzdqVarG != null) {
            try {
                zzdtVarZzi = zzdqVarG.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzdtVarZzi == null) {
            return;
        }
        try {
            zzdtVarZzi.zzi();
        } catch (RemoteException e10) {
            zzm.zzk("Unable to call onVideoEnd()", e10);
        }
    }
}
