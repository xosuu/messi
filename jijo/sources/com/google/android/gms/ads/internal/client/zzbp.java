package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.em;
import com.google.android.gms.internal.ads.fm;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.jj;
import com.google.android.gms.internal.ads.kj;
import com.google.android.gms.internal.ads.lj;
import com.google.android.gms.internal.ads.mj;
import com.google.android.gms.internal.ads.oj;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.pj;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rj;
import com.google.android.gms.internal.ads.tj;
import com.google.android.gms.internal.ads.uj;
import com.google.android.gms.internal.ads.vj;
import com.google.android.gms.internal.ads.xj;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzblh;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbp extends pb implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        rj pjVar;
        zzbh zzbfVar = null;
        fm emVar = null;
        xj vjVar = null;
        uj tjVar = null;
        zzcf zzcfVar = null;
        oj mjVar = null;
        lj kjVar = null;
        jj ijVar = null;
        switch (i10) {
            case 1:
                zzbn zzbnVarZze = zze();
                parcel2.writeNoException();
                qb.e(parcel2, zzbnVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                qb.b(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    ijVar = iInterfaceQueryLocalInterface2 instanceof jj ? (jj) iInterfaceQueryLocalInterface2 : new ij(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                }
                qb.b(parcel);
                zzf(ijVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    kjVar = iInterfaceQueryLocalInterface3 instanceof lj ? (lj) iInterfaceQueryLocalInterface3 : new kj(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                }
                qb.b(parcel);
                zzg(kjVar);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    pjVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    pjVar = iInterfaceQueryLocalInterface4 instanceof rj ? (rj) iInterfaceQueryLocalInterface4 : new pj(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    mjVar = iInterfaceQueryLocalInterface5 instanceof oj ? (oj) iInterfaceQueryLocalInterface5 : new mj(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                }
                qb.b(parcel);
                zzh(string, pjVar, mjVar);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbes zzbesVar = (zzbes) qb.a(parcel, zzbes.CREATOR);
                qb.b(parcel);
                zzo(zzbesVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = iInterfaceQueryLocalInterface6 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface6 : new zzcf(strongBinder6);
                }
                qb.b(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    tjVar = iInterfaceQueryLocalInterface7 instanceof uj ? (uj) iInterfaceQueryLocalInterface7 : new tj(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                }
                zzq zzqVar = (zzq) qb.a(parcel, zzq.CREATOR);
                qb.b(parcel);
                zzj(tjVar, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) qb.a(parcel, PublisherAdViewOptions.CREATOR);
                qb.b(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    vjVar = iInterfaceQueryLocalInterface8 instanceof xj ? (xj) iInterfaceQueryLocalInterface8 : new vj(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                }
                qb.b(parcel);
                zzk(vjVar);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzblh zzblhVar = (zzblh) qb.a(parcel, zzblh.CREATOR);
                qb.b(parcel);
                zzn(zzblhVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    emVar = iInterfaceQueryLocalInterface9 instanceof fm ? (fm) iInterfaceQueryLocalInterface9 : new em(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                }
                qb.b(parcel);
                zzi(emVar);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) qb.a(parcel, AdManagerAdViewOptions.CREATOR);
                qb.b(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
