package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;

/* JADX INFO: loaded from: classes.dex */
public final class m90 extends zzdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6885a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.client.zzdq f6886b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eo f6887d;

    public m90(com.google.android.gms.ads.internal.client.zzdq zzdqVar, eo eoVar) {
        this.f6886b = zzdqVar;
        this.f6887d = eoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        eo eoVar = this.f6887d;
        if (eoVar != null) {
            return eoVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        eo eoVar = this.f6887d;
        if (eoVar != null) {
            return eoVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        synchronized (this.f6885a) {
            try {
                com.google.android.gms.ads.internal.client.zzdq zzdqVar = this.f6886b;
                if (zzdqVar == null) {
                    return null;
                }
                return zzdqVar.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z9) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) {
        synchronized (this.f6885a) {
            try {
                com.google.android.gms.ads.internal.client.zzdq zzdqVar = this.f6886b;
                if (zzdqVar != null) {
                    zzdqVar.zzm(zzdtVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
