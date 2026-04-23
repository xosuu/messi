package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class me0 implements zzp, yx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f6922b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public le0 f6923d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nx f6924f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6925h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6926q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public zzda f6928t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6929u;

    public me0(Context context, VersionInfoParcel versionInfoParcel) {
        this.f6921a = context;
        this.f6922b = versionInfoParcel;
    }

    public final synchronized void a(zzda zzdaVar, xk xkVar, ok okVar, xk xkVar2) {
        if (c(zzdaVar)) {
            try {
                zzu.zzz();
                nx nxVarA = lx.a(this.f6921a, this.f6922b, null, null, new b4.c(0, 0, 0, 3), null, new kd(), null, null, null, null, null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false);
                this.f6924f = nxVarA;
                ix ixVarG = nxVarA.g();
                if (ixVarG == null) {
                    zzm.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzu.zzo().i("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        zzdaVar.zze(en1.u0(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e10) {
                        zzu.zzo().i("InspectorUi.openInspector 3", e10);
                        return;
                    }
                }
                this.f6928t = zzdaVar;
                ixVarG.E(null, null, null, null, null, false, null, null, null, null, null, null, null, xkVar, null, new ok(5, this.f6921a), okVar, xkVar2, null);
                ixVarG.f5715s = this;
                nx nxVar = this.f6924f;
                nxVar.f7407a.loadUrl((String) zzba.zzc().a(eg.f3953b8));
                zzu.zzi();
                zzn.zza(this.f6921a, new AdOverlayInfoParcel(this, this.f6924f, 1, this.f6922b), true);
                ((y3.b) zzu.zzB()).getClass();
                this.f6927s = System.currentTimeMillis();
            } catch (zzcev e11) {
                zzm.zzk("Failed to obtain a web view for the ad inspector", e11);
                try {
                    zzu.zzo().i("InspectorUi.openInspector 0", e11);
                    zzdaVar.zze(en1.u0(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e12) {
                    zzu.zzo().i("InspectorUi.openInspector 1", e12);
                }
            }
        }
    }

    public final synchronized void b(String str) {
        if (this.f6925h && this.f6926q) {
            nu.f7387e.execute(new vm(this, 29, str));
        }
    }

    public final synchronized boolean c(zzda zzdaVar) {
        if (!((Boolean) zzba.zzc().a(eg.f3942a8)).booleanValue()) {
            zzm.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(en1.u0(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f6923d == null) {
            zzm.zzj("Ad inspector had an internal error.");
            try {
                zzu.zzo().i("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                zzdaVar.zze(en1.u0(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f6925h && !this.f6926q) {
            ((y3.b) zzu.zzB()).getClass();
            if (System.currentTimeMillis() >= this.f6927s + ((long) ((Integer) zzba.zzc().a(eg.f3976d8)).intValue())) {
                return true;
            }
        }
        zzm.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzdaVar.zze(en1.u0(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final synchronized void zza(boolean z9, int i10, String str, String str2) {
        if (z9) {
            zze.zza("Ad inspector loaded.");
            this.f6925h = true;
            b(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            return;
        }
        zzm.zzj("Ad inspector failed to load.");
        try {
            zzu.zzo().i("InspectorUi.onAdWebViewFinishedLoading 0", new Exception("Failed to load UI. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
            zzda zzdaVar = this.f6928t;
            if (zzdaVar != null) {
                zzdaVar.zze(en1.u0(17, null, null));
            }
        } catch (RemoteException e10) {
            zzu.zzo().i("InspectorUi.onAdWebViewFinishedLoading 1", e10);
        }
        this.f6929u = true;
        this.f6924f.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        this.f6926q = true;
        b(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdu(int i10) {
        this.f6924f.destroy();
        if (!this.f6929u) {
            zze.zza("Inspector closed.");
            zzda zzdaVar = this.f6928t;
            if (zzdaVar != null) {
                try {
                    zzdaVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f6926q = false;
        this.f6925h = false;
        this.f6927s = 0L;
        this.f6929u = false;
        this.f6928t = null;
    }
}
