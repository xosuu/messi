package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class jo extends pb implements tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationExtrasReceiver f6034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ur0 f6035b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hs f6036d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a4.a f6037f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f6038h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MediationInterstitialAd f6039q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public UnifiedNativeAdMapper f6040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NativeAdMapper f6041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public MediationRewardedAd f6042u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MediationInterscrollerAd f6043v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MediationAppOpenAd f6044w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f6045x;

    public jo(Adapter adapter) {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        this.f6045x = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f6034a = adapter;
    }

    public static final boolean x1(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        zzay.zzb();
        return zzf.zzs();
    }

    public static final String y1(zzl zzlVar, String str) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void C(a4.a aVar, zzl zzlVar, String str, wn wnVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzm.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) a4.b.a0(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, w1(zzlVar, str, null), v1(zzlVar), x1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, y1(zzlVar, str), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new ho(this, wnVar, 2));
                return;
            } catch (Exception e10) {
                z3.a.c0(aVar, e10, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void C0(zzl zzlVar, String str) throws RemoteException {
        u1(zzlVar, str);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void D0(a4.a aVar, zzl zzlVar, String str, wn wnVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzm.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) a4.b.a0(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, w1(zzlVar, str, null), v1(zzlVar), x1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, y1(zzlVar, str), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new io(this, wnVar, 2));
                return;
            } catch (Exception e10) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                z3.a.c0(aVar, e10, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    @Override // com.google.android.gms.internal.ads.tn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F0(a4.a r9, com.google.android.gms.internal.ads.wl r10, java.util.List r11) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jo.F0(a4.a, com.google.android.gms.internal.ads.wl, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void N0(a4.a aVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzm.zze("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.f6042u;
        if (mediationRewardedAd == null) {
            zzm.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) a4.b.a0(aVar));
        } catch (RuntimeException e10) {
            z3.a.c0(aVar, e10, "adapter.rewarded.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void O0(a4.a aVar, hs hsVar, List list) throws RemoteException {
        zzm.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void Q(a4.a aVar, zzl zzlVar, hs hsVar, String str) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f6037f = aVar;
            this.f6036d = hsVar;
            hsVar.g1(new a4.b(mediationExtrasReceiver));
            return;
        }
        zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void R0(a4.a aVar, zzq zzqVar, zzl zzlVar, String str, String str2, wn wnVar) throws RemoteException {
        String str3;
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        boolean z9 = mediationExtrasReceiver instanceof MediationBannerAdapter;
        if (!z9 && !(mediationExtrasReceiver instanceof Adapter)) {
            zzm.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzm.zze("Requesting banner ad from adapter.");
        AdSize adSizeZzd = zzqVar.zzn ? zzb.zzd(zzqVar.zze, zzqVar.zzb) : zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        if (!z9) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadBannerAd(new MediationBannerAdConfiguration((Context) a4.b.a0(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, w1(zzlVar, str, str2), v1(zzlVar), x1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, y1(zzlVar, str), adSizeZzd, this.f6045x), new ho(this, wnVar, 0));
                    return;
                } catch (Throwable th) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                    z3.a.c0(aVar, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) mediationExtrasReceiver;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = zzlVar.zzb;
            Date date = j10 == -1 ? null : new Date(j10);
            int i10 = zzlVar.zzd;
            Location location = zzlVar.zzk;
            boolean zX1 = x1(zzlVar);
            int i11 = zzlVar.zzg;
            boolean z10 = zzlVar.zzr;
            y1(zzlVar, str);
            go goVar = new go(date, i10, hashSet, location, zX1, i11, z10);
            Bundle bundle = zzlVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            Context context = (Context) a4.b.a0(aVar);
            ur0 ur0Var = new ur0(wnVar);
            Bundle bundleW1 = w1(zzlVar, str, str2);
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            try {
                mediationBannerAdapter.requestBannerAd(context, ur0Var, bundleW1, adSizeZzd, goVar, bundle2);
            } catch (Throwable th2) {
                th = th2;
                zzm.zzh(str3, th);
                z3.a.c0(aVar, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void S(a4.a aVar) {
        Context context = (Context) a4.b.a0(aVar);
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof OnContextChangedListener) {
            ((OnContextChangedListener) mediationExtrasReceiver).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void V0(a4.a aVar, zzl zzlVar, String str, wn wnVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzm.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedAd(new MediationRewardedAdConfiguration((Context) a4.b.a0(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, w1(zzlVar, str, null), v1(zzlVar), x1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, y1(zzlVar, str), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new ho(this, wnVar, 2));
                return;
            } catch (Exception e10) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                z3.a.c0(aVar, e10, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void W(a4.a aVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzm.zze("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.f6044w;
        if (mediationAppOpenAd == null) {
            zzm.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((Context) a4.b.a0(aVar));
        } catch (RuntimeException e10) {
            z3.a.c0(aVar, e10, "adapter.appOpen.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        hs fsVar;
        wn unVar = null;
        wn unVar2 = null;
        wn unVar3 = null;
        wn unVar4 = null;
        wl vlVar = null;
        wn unVar5 = null;
        gjVar = null;
        gj gjVar = null;
        wn unVar6 = null;
        hs fsVar2 = null;
        wn unVar7 = null;
        wn unVar8 = null;
        wn unVar9 = null;
        switch (i10) {
            case 1:
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                zzq zzqVar = (zzq) qb.a(parcel, zzq.CREATOR);
                zzl zzlVar = (zzl) qb.a(parcel, zzl.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    unVar = iInterfaceQueryLocalInterface instanceof wn ? (wn) iInterfaceQueryLocalInterface : new un(strongBinder);
                }
                wn wnVar = unVar;
                qb.b(parcel);
                R0(aVarT, zzqVar, zzlVar, string, null, wnVar);
                parcel2.writeNoException();
                return true;
            case 2:
                a4.a aVarZzn = zzn();
                parcel2.writeNoException();
                qb.e(parcel2, aVarZzn);
                return true;
            case 3:
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                zzl zzlVar2 = (zzl) qb.a(parcel, zzl.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    unVar9 = iInterfaceQueryLocalInterface2 instanceof wn ? (wn) iInterfaceQueryLocalInterface2 : new un(strongBinder2);
                }
                wn wnVar2 = unVar9;
                qb.b(parcel);
                p0(aVarT2, zzlVar2, string2, null, wnVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                w();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                a4.a aVarT3 = a4.b.t(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) qb.a(parcel, zzq.CREATOR);
                zzl zzlVar3 = (zzl) qb.a(parcel, zzl.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    unVar8 = iInterfaceQueryLocalInterface3 instanceof wn ? (wn) iInterfaceQueryLocalInterface3 : new un(strongBinder3);
                }
                wn wnVar3 = unVar8;
                qb.b(parcel);
                R0(aVarT3, zzqVar2, zzlVar3, string3, string4, wnVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                a4.a aVarT4 = a4.b.t(parcel.readStrongBinder());
                zzl zzlVar4 = (zzl) qb.a(parcel, zzl.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    unVar7 = iInterfaceQueryLocalInterface4 instanceof wn ? (wn) iInterfaceQueryLocalInterface4 : new un(strongBinder4);
                }
                wn wnVar4 = unVar7;
                qb.b(parcel);
                p0(aVarT4, zzlVar4, string5, string6, wnVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                d();
                parcel2.writeNoException();
                return true;
            case 10:
                a4.a aVarT5 = a4.b.t(parcel.readStrongBinder());
                zzl zzlVar5 = (zzl) qb.a(parcel, zzl.CREATOR);
                parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    fsVar2 = iInterfaceQueryLocalInterface5 instanceof hs ? (hs) iInterfaceQueryLocalInterface5 : new fs(strongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                }
                String string7 = parcel.readString();
                qb.b(parcel);
                Q(aVarT5, zzlVar5, fsVar2, string7);
                parcel2.writeNoException();
                return true;
            case 11:
                zzl zzlVar6 = (zzl) qb.a(parcel, zzl.CREATOR);
                String string8 = parcel.readString();
                qb.b(parcel);
                u1(zzlVar6, string8);
                parcel2.writeNoException();
                return true;
            case 12:
                s();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zG = g();
                parcel2.writeNoException();
                ClassLoader classLoader = qb.f8146a;
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 14:
                a4.a aVarT6 = a4.b.t(parcel.readStrongBinder());
                zzl zzlVar7 = (zzl) qb.a(parcel, zzl.CREATOR);
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    unVar6 = iInterfaceQueryLocalInterface6 instanceof wn ? (wn) iInterfaceQueryLocalInterface6 : new un(strongBinder6);
                }
                wn wnVar5 = unVar6;
                zzbes zzbesVar = (zzbes) qb.a(parcel, zzbes.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                qb.b(parcel);
                m1(aVarT6, zzlVar7, string9, string10, wnVar5, zzbesVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                qb.e(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                qb.e(parcel2, null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                qb.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                qb.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                qb.d(parcel2, bundle3);
                return true;
            case 20:
                zzl zzlVar8 = (zzl) qb.a(parcel, zzl.CREATOR);
                String string11 = parcel.readString();
                parcel.readString();
                qb.b(parcel);
                u1(zzlVar8, string11);
                parcel2.writeNoException();
                return true;
            case sf.zzm /* 21 */:
                a4.a aVarT7 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                S(aVarT7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader2 = qb.f8146a;
                parcel2.writeInt(0);
                return true;
            case 23:
                a4.a aVarT8 = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    fsVar = iInterfaceQueryLocalInterface7 instanceof hs ? (hs) iInterfaceQueryLocalInterface7 : new fs(strongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                } else {
                    fsVar = null;
                }
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                qb.b(parcel);
                O0(aVarT8, fsVar, arrayListCreateStringArrayList2);
                throw null;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                ur0 ur0Var = this.f6035b;
                if (ur0Var != null) {
                    hj hjVar = (hj) ur0Var.f9602f;
                    if (hjVar instanceof hj) {
                        gjVar = hjVar.f5309a;
                    }
                }
                parcel2.writeNoException();
                qb.e(parcel2, gjVar);
                return true;
            case 25:
                ClassLoader classLoader3 = qb.f8146a;
                boolean z9 = parcel.readInt() != 0;
                qb.b(parcel);
                b0(z9);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzh = zzh();
                parcel2.writeNoException();
                qb.e(parcel2, zzdqVarZzh);
                return true;
            case 27:
                eo eoVarZzk = zzk();
                parcel2.writeNoException();
                qb.e(parcel2, eoVarZzk);
                return true;
            case 28:
                a4.a aVarT9 = a4.b.t(parcel.readStrongBinder());
                zzl zzlVar9 = (zzl) qb.a(parcel, zzl.CREATOR);
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    unVar5 = iInterfaceQueryLocalInterface8 instanceof wn ? (wn) iInterfaceQueryLocalInterface8 : new un(strongBinder8);
                }
                qb.b(parcel);
                V0(aVarT9, zzlVar9, string12, unVar5);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                a4.a aVarT10 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                N0(aVarT10);
                parcel2.writeNoException();
                return true;
            case 31:
                a4.a aVarT11 = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    vlVar = iInterfaceQueryLocalInterface9 instanceof wl ? (wl) iInterfaceQueryLocalInterface9 : new vl(strongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzblf.CREATOR);
                qb.b(parcel);
                F0(aVarT11, vlVar, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case NotificationCompat.FLAG_NO_CLEAR /* 32 */:
                a4.a aVarT12 = a4.b.t(parcel.readStrongBinder());
                zzl zzlVar10 = (zzl) qb.a(parcel, zzl.CREATOR);
                String string13 = parcel.readString();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    unVar4 = iInterfaceQueryLocalInterface10 instanceof wn ? (wn) iInterfaceQueryLocalInterface10 : new un(strongBinder10);
                }
                qb.b(parcel);
                C(aVarT12, zzlVar10, string13, unVar4);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbra zzbraVarZzl = zzl();
                parcel2.writeNoException();
                qb.d(parcel2, zzbraVarZzl);
                return true;
            case 34:
                zzbra zzbraVarZzm = zzm();
                parcel2.writeNoException();
                qb.d(parcel2, zzbraVarZzm);
                return true;
            case 35:
                a4.a aVarT13 = a4.b.t(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) qb.a(parcel, zzq.CREATOR);
                zzl zzlVar11 = (zzl) qb.a(parcel, zzl.CREATOR);
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    unVar3 = iInterfaceQueryLocalInterface11 instanceof wn ? (wn) iInterfaceQueryLocalInterface11 : new un(strongBinder11);
                }
                wn wnVar6 = unVar3;
                qb.b(parcel);
                o1(aVarT13, zzqVar3, zzlVar11, string14, string15, wnVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                yn ynVarZzj = zzj();
                parcel2.writeNoException();
                qb.e(parcel2, ynVarZzj);
                return true;
            case 37:
                a4.a aVarT14 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                p1(aVarT14);
                parcel2.writeNoException();
                return true;
            case 38:
                a4.a aVarT15 = a4.b.t(parcel.readStrongBinder());
                zzl zzlVar12 = (zzl) qb.a(parcel, zzl.CREATOR);
                String string16 = parcel.readString();
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    unVar2 = iInterfaceQueryLocalInterface12 instanceof wn ? (wn) iInterfaceQueryLocalInterface12 : new un(strongBinder12);
                }
                qb.b(parcel);
                D0(aVarT15, zzlVar12, string16, unVar2);
                parcel2.writeNoException();
                return true;
            case 39:
                a4.a aVarT16 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                W(aVarT16);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void b0(boolean z9) {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) mediationExtrasReceiver).onImmersiveModeUpdated(z9);
                return;
            } catch (Throwable th) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                return;
            }
        }
        zzm.zze(OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void d() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onResume();
            } catch (Throwable th) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final ao e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final boolean g() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f6036d != null;
        }
        zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void m1(a4.a aVar, zzl zzlVar, String str, String str2, wn wnVar, zzbes zzbesVar, ArrayList arrayList) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        boolean z9 = mediationExtrasReceiver instanceof MediationNativeAdapter;
        if (!z9 && !(mediationExtrasReceiver instanceof Adapter)) {
            zzm.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzm.zze("Requesting native ad from adapter.");
        if (!z9) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) a4.b.a0(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, w1(zzlVar, str, str2), v1(zzlVar), x1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, y1(zzlVar, str), this.f6045x, zzbesVar), new io(this, wnVar, 1));
                    return;
                } catch (Throwable th) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                    z3.a.c0(aVar, th, "adapter.loadNativeAdMapper");
                    String message = th.getMessage();
                    if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                        throw new RemoteException();
                    }
                    try {
                        ((Adapter) mediationExtrasReceiver).loadNativeAd(new MediationNativeAdConfiguration((Context) a4.b.a0(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, w1(zzlVar, str, str2), v1(zzlVar), x1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, y1(zzlVar, str), this.f6045x, zzbesVar), new ho(this, wnVar, 1));
                        return;
                    } catch (Throwable th2) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th2);
                        z3.a.c0(aVar, th2, "adapter.loadNativeAd");
                        throw new RemoteException();
                    }
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) mediationExtrasReceiver;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = zzlVar.zzb;
            Date date = j10 == -1 ? null : new Date(j10);
            int i10 = zzlVar.zzd;
            Location location = zzlVar.zzk;
            boolean zX1 = x1(zzlVar);
            int i11 = zzlVar.zzg;
            boolean z10 = zzlVar.zzr;
            y1(zzlVar, str);
            no noVar = new no(date, i10, hashSet, location, zX1, i11, zzbesVar, arrayList, z10);
            Bundle bundle = zzlVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f6035b = new ur0(wnVar);
            mediationNativeAdapter.requestNativeAd((Context) a4.b.a0(aVar), this.f6035b, w1(zzlVar, str, str2), noVar, bundle2);
        } catch (Throwable th3) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th3);
            z3.a.c0(aVar, th3, "adapter.requestNativeAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void o1(a4.a aVar, zzq zzqVar, zzl zzlVar, String str, String str2, wn wnVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzm.zze("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) mediationExtrasReceiver;
            adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) a4.b.a0(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, w1(zzlVar, str, str2), v1(zzlVar), x1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, y1(zzlVar, str), zzb.zze(zzqVar.zze, zzqVar.zzb), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new ur0(this, wnVar, adapter, 26));
        } catch (Exception e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            z3.a.c0(aVar, e10, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void p0(a4.a aVar, zzl zzlVar, String str, String str2, wn wnVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        boolean z9 = mediationExtrasReceiver instanceof MediationInterstitialAdapter;
        if (!z9 && !(mediationExtrasReceiver instanceof Adapter)) {
            zzm.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzm.zze("Requesting interstitial ad from adapter.");
        if (!z9) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) a4.b.a0(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, w1(zzlVar, str, str2), v1(zzlVar), x1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, y1(zzlVar, str), this.f6045x), new io(this, wnVar, 0));
                    return;
                } catch (Throwable th) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                    z3.a.c0(aVar, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) mediationExtrasReceiver;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = zzlVar.zzb;
            Date date = j10 == -1 ? null : new Date(j10);
            int i10 = zzlVar.zzd;
            Location location = zzlVar.zzk;
            boolean zX1 = x1(zzlVar);
            int i11 = zzlVar.zzg;
            boolean z10 = zzlVar.zzr;
            y1(zzlVar, str);
            go goVar = new go(date, i10, hashSet, location, zX1, i11, z10);
            Bundle bundle = zzlVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) a4.b.a0(aVar), new ur0(wnVar), w1(zzlVar, str, str2), goVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th2);
            z3.a.c0(aVar, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void p1(a4.a aVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (!(mediationExtrasReceiver instanceof Adapter) && !(mediationExtrasReceiver instanceof MediationInterstitialAdapter)) {
            zzm.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            w();
            return;
        }
        zzm.zze("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.f6039q;
        if (mediationInterstitialAd == null) {
            zzm.zzg("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            mediationInterstitialAd.showAd((Context) a4.b.a0(aVar));
        } catch (RuntimeException e10) {
            z3.a.c0(aVar, e10, "adapter.interstitial.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void s() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        MediationRewardedAd mediationRewardedAd = this.f6042u;
        if (mediationRewardedAd == null) {
            zzm.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) a4.b.a0(this.f6037f));
        } catch (RuntimeException e10) {
            z3.a.c0(this.f6037f, e10, "adapter.showVideo");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final boolean u() {
        return false;
    }

    public final void u1(zzl zzlVar, String str) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof Adapter) {
            V0(this.f6037f, zzlVar, str, new lo((Adapter) mediationExtrasReceiver, this.f6036d));
            return;
        }
        zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    public final Bundle v1(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f6034a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void w() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            zzm.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) mediationExtrasReceiver).showInterstitial();
                return;
            } catch (Throwable th) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
        zzm.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    public final Bundle w1(zzl zzlVar, String str, String str2) throws RemoteException {
        zzm.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f6034a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void zzE() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onPause();
            } catch (Throwable th) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final bo zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof zza) {
            try {
                return ((zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final yn zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.f6043v;
        if (mediationInterscrollerAd != null) {
            return new ko(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final eo zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof MediationNativeAdapter) {
            ur0 ur0Var = this.f6035b;
            if (ur0Var == null || (unifiedNativeAdMapper = (UnifiedNativeAdMapper) ur0Var.f9601d) == null) {
                return null;
            }
            return new oo(unifiedNativeAdMapper);
        }
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            return null;
        }
        NativeAdMapper nativeAdMapper = this.f6041t;
        if (nativeAdMapper != null) {
            return new mo(nativeAdMapper);
        }
        UnifiedNativeAdMapper unifiedNativeAdMapper2 = this.f6040s;
        if (unifiedNativeAdMapper2 != null) {
            return new oo(unifiedNativeAdMapper2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final zzbra zzl() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof Adapter) {
            return zzbra.b(((Adapter) mediationExtrasReceiver).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final zzbra zzm() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof Adapter) {
            return zzbra.b(((Adapter) mediationExtrasReceiver).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final a4.a zzn() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof MediationBannerAdapter) {
            try {
                return new a4.b(((MediationBannerAdapter) mediationExtrasReceiver).getBannerView());
            } catch (Throwable th) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
        if (mediationExtrasReceiver instanceof Adapter) {
            return new a4.b(this.f6038h);
        }
        zzm.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void zzo() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6034a;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onDestroy();
            } catch (Throwable th) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    public jo(MediationAdapter mediationAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        this.f6045x = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f6034a = mediationAdapter;
    }
}
