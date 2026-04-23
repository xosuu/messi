package com.google.android.gms.ads.internal.client;

import a4.a;
import a4.b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.ds;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.mq;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.nq;
import com.google.android.gms.internal.ads.og;
import com.google.android.gms.internal.ads.oq;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.pq;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.uc;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbt extends pb implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z9;
        zzbh zzbfVar = null;
        zzci zzcgVar = null;
        zzbk zzbiVar = null;
        zzdg zzdeVar = null;
        uc scVar = null;
        zzby zzbwVar = null;
        es dsVar = null;
        zzcf zzcfVar = null;
        zzbe zzbcVar = null;
        og ngVar = null;
        pq oqVar = null;
        nq mqVar = null;
        zzcb zzbzVar = null;
        switch (i10) {
            case 1:
                a aVarZzn = zzn();
                parcel2.writeNoException();
                qb.e(parcel2, aVarZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzaa = zzaa();
                parcel2.writeNoException();
                ClassLoader classLoader = qb.f8146a;
                parcel2.writeInt(zZzaa ? 1 : 0);
                return true;
            case 4:
                zzl zzlVar = (zzl) qb.a(parcel, zzl.CREATOR);
                qb.b(parcel);
                boolean zZzab = zzab(zzlVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                qb.b(parcel);
                zzD(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzbzVar = iInterfaceQueryLocalInterface2 instanceof zzcb ? (zzcb) iInterfaceQueryLocalInterface2 : new zzbz(strongBinder2);
                }
                qb.b(parcel);
                zzG(zzbzVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzqVarZzg = zzg();
                parcel2.writeNoException();
                qb.d(parcel2, zzqVarZzg);
                return true;
            case 13:
                zzq zzqVar = (zzq) qb.a(parcel, zzq.CREATOR);
                qb.b(parcel);
                zzF(zzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    mqVar = iInterfaceQueryLocalInterface3 instanceof nq ? (nq) iInterfaceQueryLocalInterface3 : new mq(strongBinder3, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                }
                qb.b(parcel);
                zzM(mqVar);
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    oqVar = iInterfaceQueryLocalInterface4 instanceof pq ? (pq) iInterfaceQueryLocalInterface4 : new oq(strongBinder4, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                }
                String string = parcel.readString();
                qb.b(parcel);
                zzQ(oqVar, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    ngVar = iInterfaceQueryLocalInterface5 instanceof og ? (og) iInterfaceQueryLocalInterface5 : new ng(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                }
                qb.b(parcel);
                zzO(ngVar);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbcVar = iInterfaceQueryLocalInterface6 instanceof zzbe ? (zzbe) iInterfaceQueryLocalInterface6 : new zzbc(strongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener");
                }
                qb.b(parcel);
                zzC(zzbcVar);
                parcel2.writeNoException();
                return true;
            case sf.zzm /* 21 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = iInterfaceQueryLocalInterface7 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface7 : new zzcf(strongBinder7);
                }
                qb.b(parcel);
                zzac(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                ClassLoader classLoader2 = qb.f8146a;
                z9 = parcel.readInt() != 0;
                qb.b(parcel);
                zzN(z9);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                ClassLoader classLoader3 = qb.f8146a;
                parcel2.writeInt(zZzZ ? 1 : 0);
                return true;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    dsVar = iInterfaceQueryLocalInterface8 instanceof es ? (es) iInterfaceQueryLocalInterface8 : new ds(strongBinder8);
                }
                qb.b(parcel);
                zzS(dsVar);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                qb.b(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdq zzdqVarZzl = zzl();
                parcel2.writeNoException();
                qb.e(parcel2, zzdqVarZzl);
                return true;
            case 29:
                zzfk zzfkVar = (zzfk) qb.a(parcel, zzfk.CREATOR);
                qb.b(parcel);
                zzU(zzfkVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzdu zzduVar = (zzdu) qb.a(parcel, zzdu.CREATOR);
                qb.b(parcel);
                zzK(zzduVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case NotificationCompat.FLAG_NO_CLEAR /* 32 */:
                zzcb zzcbVarZzj = zzj();
                parcel2.writeNoException();
                qb.e(parcel2, zzcbVarZzj);
                return true;
            case 33:
                zzbh zzbhVarZzi = zzi();
                parcel2.writeNoException();
                qb.e(parcel2, zzbhVarZzi);
                return true;
            case 34:
                ClassLoader classLoader4 = qb.f8146a;
                z9 = parcel.readInt() != 0;
                qb.b(parcel);
                zzL(z9);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbwVar = iInterfaceQueryLocalInterface9 instanceof zzby ? (zzby) iInterfaceQueryLocalInterface9 : new zzbw(strongBinder9);
                }
                qb.b(parcel);
                zzE(zzbwVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                qb.d(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                qb.b(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzw zzwVar = (zzw) qb.a(parcel, zzw.CREATOR);
                qb.b(parcel);
                zzI(zzwVar);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    scVar = iInterfaceQueryLocalInterface10 instanceof uc ? (uc) iInterfaceQueryLocalInterface10 : new sc(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                }
                qb.b(parcel);
                zzH(scVar);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdn zzdnVarZzk = zzk();
                parcel2.writeNoException();
                qb.e(parcel2, zzdnVarZzk);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdeVar = iInterfaceQueryLocalInterface11 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface11 : new zzde(strongBinder11);
                }
                qb.b(parcel);
                zzP(zzdeVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar2 = (zzl) qb.a(parcel, zzl.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbiVar = iInterfaceQueryLocalInterface12 instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface12 : new zzbi(strongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
                }
                qb.b(parcel);
                zzy(zzlVar2, zzbiVar);
                parcel2.writeNoException();
                return true;
            case 44:
                a aVarT = b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzW(aVarT);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcgVar = iInterfaceQueryLocalInterface13 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface13 : new zzcg(strongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                }
                qb.b(parcel);
                zzJ(zzcgVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                ClassLoader classLoader5 = qb.f8146a;
                parcel2.writeInt(zZzY ? 1 : 0);
                return true;
        }
    }
}
