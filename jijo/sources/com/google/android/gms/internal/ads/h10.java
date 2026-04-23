package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class h10 extends pb implements rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g10 f5126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbu f5127b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sp0 f5128d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5129f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ed0 f5130h;

    public h10(g10 g10Var, wp0 wp0Var, sp0 sp0Var, ed0 ed0Var) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f5129f = ((Boolean) zzba.zzc().a(eg.f4181y0)).booleanValue();
        this.f5126a = g10Var;
        this.f5127b = wp0Var;
        this.f5128d = sp0Var;
        this.f5130h = ed0Var;
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final void V(a4.a aVar, xc xcVar) {
        try {
            this.f5128d.f8940f.set(xcVar);
            this.f5126a.c((Activity) a4.b.a0(aVar), this.f5129f);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        xc wcVar;
        switch (i10) {
            case 2:
                parcel2.writeNoException();
                qb.e(parcel2, this.f5127b);
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof vc) {
                    }
                }
                qb.b(parcel);
                parcel2.writeNoException();
                break;
            case 4:
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    wcVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    wcVar = iInterfaceQueryLocalInterface2 instanceof xc ? (xc) iInterfaceQueryLocalInterface2 : new wc(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                }
                qb.b(parcel);
                V(aVarT, wcVar);
                parcel2.writeNoException();
                break;
            case 5:
                zzdn zzdnVarZzf = zzf();
                parcel2.writeNoException();
                qb.e(parcel2, zzdnVarZzf);
                break;
            case 6:
                ClassLoader classLoader = qb.f8146a;
                boolean z9 = parcel.readInt() != 0;
                qb.b(parcel);
                this.f5129f = z9;
                parcel2.writeNoException();
                break;
            case 7:
                zzdg zzdgVarZzb = zzdf.zzb(parcel.readStrongBinder());
                qb.b(parcel);
                a1(zzdgVarZzb);
                parcel2.writeNoException();
                break;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final void a1(zzdg zzdgVar) {
        z3.a.j("setOnPaidEventListener must be called on the main UI thread.");
        sp0 sp0Var = this.f5128d;
        if (sp0Var != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.f5130h.b();
                }
            } catch (RemoteException e10) {
                zzm.zzf("Error in making CSI ping for reporting paid event callback", e10);
            }
            sp0Var.f8943s.set(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final void x(boolean z9) {
        this.f5129f = z9;
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final zzdn zzf() {
        if (((Boolean) zzba.zzc().a(eg.f3962c6)).booleanValue()) {
            return this.f5126a.f8362f;
        }
        return null;
    }
}
