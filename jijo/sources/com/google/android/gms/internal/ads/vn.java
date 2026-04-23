package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class vn extends pb implements wn {
    public vn() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static wn u1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof wn ? (wn) iInterfaceQueryLocalInterface : new un(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        ks jsVar;
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i11 = parcel.readInt();
                qb.b(parcel);
                c(i11);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof zn) {
                    }
                }
                qb.b(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                qb.b(parcel);
                u0(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (iInterfaceQueryLocalInterface2 instanceof gj) {
                    }
                }
                parcel.readString();
                qb.b(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                qb.b(parcel);
                break;
            case 13:
                J();
                break;
            case 14:
                zzbvz zzbvzVar = (zzbvz) qb.a(parcel, zzbvz.CREATOR);
                qb.b(parcel);
                I0(zzbvzVar);
                break;
            case 15:
                b();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    jsVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    jsVar = iInterfaceQueryLocalInterface3 instanceof ks ? (ks) iInterfaceQueryLocalInterface3 : new js(strongBinder3);
                }
                qb.b(parcel);
                t0(jsVar);
                break;
            case 17:
                int i12 = parcel.readInt();
                qb.b(parcel);
                j0(i12);
                break;
            case 18:
                zzu();
                break;
            case 19:
                qb.b(parcel);
                break;
            case 20:
                zzx();
                break;
            case sf.zzm /* 21 */:
                String string3 = parcel.readString();
                qb.b(parcel);
                l(string3);
                break;
            case 22:
                int i13 = parcel.readInt();
                String string4 = parcel.readString();
                qb.b(parcel);
                N(i13, string4);
                break;
            case 23:
                zze zzeVar = (zze) qb.a(parcel, zze.CREATOR);
                qb.b(parcel);
                X(zzeVar);
                break;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                zze zzeVar2 = (zze) qb.a(parcel, zze.CREATOR);
                qb.b(parcel);
                E(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
