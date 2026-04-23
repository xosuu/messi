package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: loaded from: classes.dex */
public abstract class zp extends pb implements aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11287a = 0;

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                Intent intent = (Intent) qb.a(parcel, Intent.CREATOR);
                qb.b(parcel);
                ((qh0) this).y(intent);
                break;
            case 2:
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                qb.b(parcel);
                ((qh0) this).M(aVarT, new zza(string, string2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                break;
            case 3:
                ((qh0) this).zzh();
                break;
            case 4:
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                ((qh0) this).j(aVarT2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                a4.a aVarT3 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                ((qh0) this).l1(strArrCreateStringArray, iArrCreateIntArray, aVarT3);
                break;
            case 6:
                a4.a aVarT4 = a4.b.t(parcel.readStrongBinder());
                zza zzaVar = (zza) qb.a(parcel, zza.CREATOR);
                qb.b(parcel);
                ((qh0) this).M(aVarT4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
