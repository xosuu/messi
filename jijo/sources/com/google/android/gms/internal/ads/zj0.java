package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class zj0 extends pb implements zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fi0 f11251a;

    public zj0(fi0 fi0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
        this.f11251a = fi0Var;
    }

    @Override // com.google.android.gms.internal.ads.zo
    public final void a(String str) {
        ((zi0) this.f11251a.f4536c).N(0, str);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            zzg();
        } else if (i10 == 3) {
            String string = parcel.readString();
            qb.b(parcel);
            a(string);
        } else {
            if (i10 != 4) {
                return false;
            }
            zze zzeVar = (zze) qb.a(parcel, zze.CREATOR);
            qb.b(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zo
    public final void zzf(zze zzeVar) {
        ((zi0) this.f11251a.f4536c).X(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zo
    public final void zzg() {
        ((zi0) this.f11251a.f4536c).zzo();
    }
}
