package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class gs extends pb implements hs {
    public gs() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                g1(aVarT);
                break;
            case 2:
                a4.b.t(parcel.readStrongBinder());
                parcel.readInt();
                qb.b(parcel);
                k0();
                break;
            case 3:
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                S0(aVarT2);
                break;
            case 4:
                a4.a aVarT3 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzj(aVarT3);
                break;
            case 5:
                a4.a aVarT4 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                L(aVarT4);
                break;
            case 6:
                a4.a aVarT5 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                c0(aVarT5);
                break;
            case 7:
                a4.a aVarT6 = a4.b.t(parcel.readStrongBinder());
                zzbvz zzbvzVar = (zzbvz) qb.a(parcel, zzbvz.CREATOR);
                qb.b(parcel);
                f0(aVarT6, zzbvzVar);
                break;
            case 8:
                a4.a aVarT7 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zze(aVarT7);
                break;
            case 9:
                a4.a aVarT8 = a4.b.t(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                qb.b(parcel);
                zzg(aVarT8, i11);
                break;
            case 10:
                a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                B();
                break;
            case 11:
                a4.a aVarT9 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                w0(aVarT9);
                break;
            case 12:
                qb.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
