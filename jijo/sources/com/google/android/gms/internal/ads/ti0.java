package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class ti0 extends pb implements so {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fi0 f9167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ui0 f9168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(ui0 ui0Var, fi0 fi0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.f9168b = ui0Var;
        this.f9167a = fi0Var;
    }

    @Override // com.google.android.gms.internal.ads.so
    public final void D(yn ynVar) {
        this.f9168b.f9497e = ynVar;
        ((zi0) this.f9167a.f4536c).zzo();
    }

    @Override // com.google.android.gms.internal.ads.so
    public final void a(String str) {
        ((zi0) this.f9167a.f4536c).N(0, str);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        yn xnVar;
        if (i10 == 1) {
            a4.a aVarT = a4.b.t(parcel.readStrongBinder());
            qb.b(parcel);
            j(aVarT);
        } else if (i10 == 2) {
            String string = parcel.readString();
            qb.b(parcel);
            a(string);
        } else if (i10 == 3) {
            zze zzeVar = (zze) qb.a(parcel, zze.CREATOR);
            qb.b(parcel);
            zzf(zzeVar);
        } else {
            if (i10 != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                xnVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                xnVar = iInterfaceQueryLocalInterface instanceof yn ? (yn) iInterfaceQueryLocalInterface : new xn(strongBinder);
            }
            qb.b(parcel);
            D(xnVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.so
    public final void j(a4.a aVar) {
        this.f9168b.f9496d = (View) a4.b.a0(aVar);
        ((zi0) this.f9167a.f4536c).zzo();
    }

    @Override // com.google.android.gms.internal.ads.so
    public final void zzf(zze zzeVar) {
        ((zi0) this.f9167a.f4536c).X(zzeVar);
    }
}
