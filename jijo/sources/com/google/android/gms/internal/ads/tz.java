package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tz extends zzcn {
    public boolean A = false;
    public final Long B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f9307b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rc0 f9308d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ei0 f9309f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zk0 f9310h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final be0 f9311q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mt f9312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tc0 f9313t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final le0 f9314u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final mu0 f9315v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gt0 f9316w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ur0 f9317x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n30 f9318y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ed0 f9319z;

    public tz(Context context, VersionInfoParcel versionInfoParcel, rc0 rc0Var, ei0 ei0Var, zk0 zk0Var, be0 be0Var, mt mtVar, tc0 tc0Var, le0 le0Var, mu0 mu0Var, gt0 gt0Var, ur0 ur0Var, n30 n30Var, ed0 ed0Var) {
        this.f9306a = context;
        this.f9307b = versionInfoParcel;
        this.f9308d = rc0Var;
        this.f9309f = ei0Var;
        this.f9310h = zk0Var;
        this.f9311q = be0Var;
        this.f9312s = mtVar;
        this.f9313t = tc0Var;
        this.f9314u = le0Var;
        this.f9315v = mu0Var;
        this.f9316w = gt0Var;
        this.f9317x = ur0Var;
        this.f9318y = n30Var;
        this.f9319z = ed0Var;
        ((y3.b) zzu.zzB()).getClass();
        this.B = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return zzu.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.f9307b.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return this.f9311q.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.f9310h.d(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.f9311q.f3013q = false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z9) throws RemoteException {
        try {
            kw0 kw0VarG = kw0.g(this.f9306a);
            kw0VarG.f5103f.a(Boolean.valueOf(z9), "paidv2_publisher_option");
            if (z9) {
                return;
            }
            kw0VarG.h();
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.A) {
            zzm.zzj("Mobile ads is initialized already.");
            return;
        }
        eg.a(this.f9306a);
        zzu.zzo().g(this.f9306a, this.f9307b);
        this.f9318y.a();
        zzu.zzc().d(this.f9306a);
        final int i10 = 1;
        this.A = true;
        this.f9311q.b();
        zk0 zk0Var = this.f9310h;
        zk0Var.getClass();
        zzu.zzo().d().zzr(new yk0(zk0Var, 1));
        final int i11 = 0;
        zk0Var.f11262f.execute(new yk0(zk0Var, 0));
        if (((Boolean) zzba.zzc().a(eg.E3)).booleanValue()) {
            tc0 tc0Var = this.f9313t;
            tc0Var.getClass();
            zzu.zzo().d().zzr(new sc0(tc0Var, 0));
            tc0Var.f9112c.execute(new sc0(tc0Var, 1));
        }
        this.f9314u.c();
        if (((Boolean) zzba.zzc().a(eg.f4102p8)).booleanValue()) {
            nu.f7383a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.rz

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ tz f8725b;

                {
                    this.f8725b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i11;
                    tz tzVar = this.f8725b;
                    switch (i12) {
                        case 0:
                            tzVar.getClass();
                            if (zzu.zzo().d().zzR()) {
                                String strZzl = zzu.zzo().d().zzl();
                                if (!zzu.zzs().zzj(tzVar.f9306a, strZzl, tzVar.f9307b.afmaVersion)) {
                                    zzu.zzo().d().zzC(false);
                                    zzu.zzo().d().zzB(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                }
                            }
                            break;
                        case 1:
                            xr0.a(tzVar.f9306a, true);
                            break;
                        default:
                            tzVar.getClass();
                            fr frVar = new fr("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            mu0 mu0Var = tzVar.f9315v;
                            mu0Var.getClass();
                            try {
                                bi biVar = (bi) zzq.zzb(mu0Var.f7056a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new pe(6));
                                Parcel parcelM = biVar.m();
                                qb.e(parcelM, frVar);
                                biVar.a0(parcelM, 1);
                            } catch (RemoteException e10) {
                                zzm.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                return;
                            } catch (zzp e11) {
                                zzm.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) zzba.zzc().a(eg.Y9)).booleanValue()) {
            final int i12 = 2;
            nu.f7383a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.rz

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ tz f8725b;

                {
                    this.f8725b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i12;
                    tz tzVar = this.f8725b;
                    switch (i122) {
                        case 0:
                            tzVar.getClass();
                            if (zzu.zzo().d().zzR()) {
                                String strZzl = zzu.zzo().d().zzl();
                                if (!zzu.zzs().zzj(tzVar.f9306a, strZzl, tzVar.f9307b.afmaVersion)) {
                                    zzu.zzo().d().zzC(false);
                                    zzu.zzo().d().zzB(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                }
                            }
                            break;
                        case 1:
                            xr0.a(tzVar.f9306a, true);
                            break;
                        default:
                            tzVar.getClass();
                            fr frVar = new fr("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            mu0 mu0Var = tzVar.f9315v;
                            mu0Var.getClass();
                            try {
                                bi biVar = (bi) zzq.zzb(mu0Var.f7056a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new pe(6));
                                Parcel parcelM = biVar.m();
                                qb.e(parcelM, frVar);
                                biVar.a0(parcelM, 1);
                            } catch (RemoteException e10) {
                                zzm.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                return;
                            } catch (zzp e11) {
                                zzm.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) zzba.zzc().a(eg.A2)).booleanValue()) {
            nu.f7383a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.rz

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ tz f8725b;

                {
                    this.f8725b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i10;
                    tz tzVar = this.f8725b;
                    switch (i122) {
                        case 0:
                            tzVar.getClass();
                            if (zzu.zzo().d().zzR()) {
                                String strZzl = zzu.zzo().d().zzl();
                                if (!zzu.zzs().zzj(tzVar.f9306a, strZzl, tzVar.f9307b.afmaVersion)) {
                                    zzu.zzo().d().zzC(false);
                                    zzu.zzo().d().zzB(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                }
                            }
                            break;
                        case 1:
                            xr0.a(tzVar.f9306a, true);
                            break;
                        default:
                            tzVar.getClass();
                            fr frVar = new fr("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            mu0 mu0Var = tzVar.f9315v;
                            mu0Var.getClass();
                            try {
                                bi biVar = (bi) zzq.zzb(mu0Var.f7056a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new pe(6));
                                Parcel parcelM = biVar.m();
                                qb.e(parcelM, frVar);
                                biVar.a0(parcelM, 1);
                            } catch (RemoteException e10) {
                                zzm.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
                                return;
                            } catch (zzp e11) {
                                zzm.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, a4.a aVar) {
        String strZzp;
        sz szVar;
        Context context = this.f9306a;
        eg.a(context);
        if (((Boolean) zzba.zzc().a(eg.I3)).booleanValue()) {
            try {
                zzu.zzp();
                strZzp = zzt.zzp(context);
            } catch (RemoteException | RuntimeException e10) {
                zzu.zzo().i("NonagonMobileAdsSettingManager_AppId", e10);
                strZzp = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
        } else {
            strZzp = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        boolean z9 = true;
        String str2 = true == TextUtils.isEmpty(strZzp) ? str : strZzp;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.C3)).booleanValue();
        xf xfVar = eg.H0;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzba.zzc().a(xfVar)).booleanValue();
        if (((Boolean) zzba.zzc().a(xfVar)).booleanValue()) {
            szVar = new sz(this, (Runnable) a4.b.a0(aVar), 0);
        } else {
            szVar = null;
            z9 = zBooleanValue2;
        }
        sz szVar2 = szVar;
        if (z9) {
            zzu.zza().zza(this.f9306a, this.f9307b, str2, szVar2, this.f9316w, this.f9319z, this.B);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
        this.f9314u.d(zzdaVar, ke0.f6264b);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(a4.a aVar, String str) {
        if (aVar == null) {
            zzm.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) a4.b.a0(aVar);
        if (context == null) {
            zzm.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzau zzauVar = new zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.f9307b.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(rn rnVar) {
        this.f9317x.U(rnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z9) {
        zzu.zzr().zzc(z9);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f10) {
        zzu.zzr().zzd(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        eg.a(this.f9306a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzba.zzc().a(eg.C3)).booleanValue()) {
                zzu.zza().zza(this.f9306a, this.f9307b, str, null, this.f9316w, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zl zlVar) {
        be0 be0Var = this.f9311q;
        be0Var.getClass();
        be0Var.f3001e.a(new vm(be0Var, 27, zlVar), be0Var.f3006j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) zzba.zzc().a(eg.A8)).booleanValue()) {
            zzu.zzo().f5060g = str;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
        mt mtVar = this.f9312s;
        Context context = this.f9306a;
        mtVar.getClass();
        jt jtVarE = jt.e(context);
        gt gtVar = (gt) ((nh1) jtVarE.f6078g).zzb();
        ((y3.b) ((y3.a) jtVarE.f6072a)).getClass();
        gtVar.a(-1, System.currentTimeMillis());
        if (((Boolean) zzba.zzc().a(eg.f4012h0)).booleanValue() && mtVar.g(context) && mt.h(context)) {
            synchronized (mtVar.f7052i) {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return zzu.zzr().zze();
    }
}
