package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class ij0 extends pb implements xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fi0 f5620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ui0 f5621b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij0(ui0 ui0Var, fi0 fi0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.f5621b = ui0Var;
        this.f5620a = fi0Var;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final void a(String str) {
        ((zi0) this.f5620a.f4536c).N(0, str);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        eo coVar;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                coVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                coVar = iInterfaceQueryLocalInterface instanceof eo ? (eo) iInterfaceQueryLocalInterface : new co(strongBinder);
            }
            qb.b(parcel);
            i1(coVar);
        } else if (i10 == 2) {
            String string = parcel.readString();
            qb.b(parcel);
            a(string);
        } else {
            if (i10 != 3) {
                return false;
            }
            zze zzeVar = (zze) qb.a(parcel, zze.CREATOR);
            qb.b(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final void i1(eo eoVar) {
        this.f5621b.f9496d = eoVar;
        ((zi0) this.f5620a.f4536c).zzo();
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final void zzf(zze zzeVar) {
        ((zi0) this.f5620a.f4536c).X(zzeVar);
    }
}
