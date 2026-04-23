package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import java.util.Iterator;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fp extends pb implements bp {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f4587q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RtbAdapter f4588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationInterstitialAd f4589b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationRewardedAd f4590d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationAppOpenAd f4591f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4592h;

    public fp(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f4592h = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f4588a = rtbAdapter;
    }

    public static final Bundle v1(String str) throws RemoteException {
        zzm.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            throw new RemoteException();
        }
    }

    public static final boolean w1(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        zzay.zzb();
        return zzf.zzs();
    }

    public static final String x1(zzl zzlVar, String str) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final boolean A(a4.a aVar) {
        MediationRewardedAd mediationRewardedAd = this.f4590d;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) a4.b.a0(aVar));
            return true;
        } catch (Throwable th) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            z3.a.c0(aVar, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final void B0(String str, String str2, zzl zzlVar, a4.a aVar, zo zoVar, wn wnVar) throws RemoteException {
        try {
            this.f4588a.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) a4.b.a0(aVar), str, v1(str2), u1(zzlVar), w1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, x1(zzlVar, str2), this.f4592h), new ep(this, zoVar, wnVar, 0));
        } catch (Throwable th) {
            zzm.zzh("Adapter failed to render rewarded ad.", th);
            z3.a.c0(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final void F(String str, String str2, zzl zzlVar, a4.a aVar, vo voVar, wn wnVar) throws RemoteException {
        try {
            this.f4588a.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) a4.b.a0(aVar), str, v1(str2), u1(zzlVar), w1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, x1(zzlVar, str2), this.f4592h), new ur0(this, voVar, wnVar, 28));
        } catch (Throwable th) {
            zzm.zzh("Adapter failed to render interstitial ad.", th);
            z3.a.c0(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final void J0(String str, String str2, zzl zzlVar, a4.a aVar, so soVar, wn wnVar, zzq zzqVar) throws RemoteException {
        try {
            this.f4588a.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) a4.b.a0(aVar), str, v1(str2), u1(zzlVar), w1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, x1(zzlVar, str2), zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.f4592h), new p80(soVar, wnVar, 8, 0));
        } catch (Throwable th) {
            zzm.zzh("Adapter failed to render banner ad.", th);
            z3.a.c0(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.android.gms.internal.ads.i10, still in use, count: 1, list:
      (r0v0 com.google.android.gms.internal.ads.i10) from 0x00ae: INVOKE 
      (r10v1 com.google.android.gms.ads.mediation.rtb.RtbAdapter)
      (wrap:com.google.android.gms.ads.mediation.rtb.RtbSignalData:0x00ab: CONSTRUCTOR 
      (wrap:android.content.Context:0x009f: CHECK_CAST (android.content.Context) (wrap:java.lang.Object:0x009b: INVOKE (r5v0 a4.a) STATIC call: a4.b.a0(a4.a):java.lang.Object A[Catch: all -> 0x0073, MD:(a4.a):java.lang.Object (m), WRAPPED] (LINE:156)))
      (r6v16 java.util.ArrayList)
      (r7v0 android.os.Bundle)
      (wrap:com.google.android.gms.ads.AdSize:0x00a7: INVOKE 
      (wrap:int:0x00a1: IGET (r9v0 com.google.android.gms.ads.internal.client.zzq) A[Catch: all -> 0x0073, WRAPPED] (LINE:162) com.google.android.gms.ads.internal.client.zzq.zze int)
      (wrap:int:0x00a3: IGET (r9v0 com.google.android.gms.ads.internal.client.zzq) A[Catch: all -> 0x0073, WRAPPED] (LINE:164) com.google.android.gms.ads.internal.client.zzq.zzb int)
      (wrap:java.lang.String:0x00a5: IGET (r9v0 com.google.android.gms.ads.internal.client.zzq) A[Catch: all -> 0x0073, WRAPPED] (LINE:166) com.google.android.gms.ads.internal.client.zzq.zza java.lang.String)
     STATIC call: com.google.android.gms.ads.zzb.zzc(int, int, java.lang.String):com.google.android.gms.ads.AdSize A[Catch: all -> 0x0073, MD:(int, int, java.lang.String):com.google.android.gms.ads.AdSize (m), WRAPPED] (LINE:168))
     A[Catch: all -> 0x0073, MD:(android.content.Context, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration>, android.os.Bundle, com.google.android.gms.ads.AdSize):void (m), WRAPPED] (LINE:172) call: com.google.android.gms.ads.mediation.rtb.RtbSignalData.<init>(android.content.Context, java.util.List, android.os.Bundle, com.google.android.gms.ads.AdSize):void type: CONSTRUCTOR)
      (r0v0 com.google.android.gms.internal.ads.i10)
     VIRTUAL call: com.google.android.gms.ads.mediation.rtb.RtbAdapter.collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData, com.google.android.gms.ads.mediation.rtb.SignalCallbacks):void A[Catch: all -> 0x0073, MD:(com.google.android.gms.ads.mediation.rtb.RtbSignalData, com.google.android.gms.ads.mediation.rtb.SignalCallbacks):void (m), TRY_LEAVE] (LINE:175)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:271)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.markCodeForRemoval(SwitchOverStringVisitor.java:160)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:124)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:71)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    @Override // com.google.android.gms.internal.ads.bp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0(a4.a r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, com.google.android.gms.ads.internal.client.zzq r9, com.google.android.gms.internal.ads.dp r10) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fp.K0(a4.a, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.internal.ads.dp):void");
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final void M0(String str, String str2, zzl zzlVar, a4.a aVar, so soVar, wn wnVar, zzq zzqVar) throws RemoteException {
        try {
            this.f4588a.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) a4.b.a0(aVar), str, v1(str2), u1(zzlVar), w1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, x1(zzlVar, str2), zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.f4592h), new m20(soVar, wnVar, 10));
        } catch (Throwable th) {
            zzm.zzh("Adapter failed to render interscroller ad.", th);
            z3.a.c0(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final void T(String str, String str2, zzl zzlVar, a4.a aVar, zo zoVar, wn wnVar) throws RemoteException {
        try {
            this.f4588a.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) a4.b.a0(aVar), str, v1(str2), u1(zzlVar), w1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, x1(zzlVar, str2), this.f4592h), new ep(this, zoVar, wnVar, 0));
        } catch (Throwable th) {
            zzm.zzh("Adapter failed to render rewarded interstitial ad.", th);
            z3.a.c0(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.gms.internal.ads.zo] */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.google.android.gms.internal.ads.so] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.gms.internal.ads.so] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.gms.internal.ads.zo] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.fp] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.xo] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.xo] */
    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        dp cpVar;
        vo uoVar;
        qo poVar;
        IInterface woVar = null;
        if (i10 == 1) {
            a4.a aVarT = a4.b.t(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) qb.a(parcel, creator);
            Bundle bundle2 = (Bundle) qb.a(parcel, creator);
            zzq zzqVar = (zzq) qb.a(parcel, zzq.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                cpVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                cpVar = iInterfaceQueryLocalInterface instanceof dp ? (dp) iInterfaceQueryLocalInterface : new cp(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            }
            qb.b(parcel);
            K0(aVarT, string, bundle, bundle2, zzqVar, cpVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 2) {
            zzbra zzbraVarZzf = zzf();
            parcel2.writeNoException();
            qb.d(parcel2, zzbraVarZzf);
            return true;
        }
        if (i10 == 3) {
            zzbra zzbraVarZzg = zzg();
            parcel2.writeNoException();
            qb.d(parcel2, zzbraVarZzg);
            return true;
        }
        if (i10 == 5) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVarZze = zze();
            parcel2.writeNoException();
            qb.e(parcel2, zzdqVarZze);
            return true;
        }
        if (i10 == 10) {
            a4.b.t(parcel.readStrongBinder());
            qb.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 11) {
            parcel.createStringArray();
            qb.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i10) {
            case 13:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                zzl zzlVar = (zzl) qb.a(parcel, zzl.CREATOR);
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    woVar = iInterfaceQueryLocalInterface2 instanceof so ? (so) iInterfaceQueryLocalInterface2 : new ro(strongBinder2);
                }
                ?? r11 = woVar;
                wn wnVarU1 = vn.u1(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) qb.a(parcel, zzq.CREATOR);
                qb.b(parcel);
                J0(string2, string3, zzlVar, aVarT2, r11, wnVarU1, zzqVar2);
                parcel2.writeNoException();
                break;
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                zzl zzlVar2 = (zzl) qb.a(parcel, zzl.CREATOR);
                a4.a aVarT3 = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    uoVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    uoVar = iInterfaceQueryLocalInterface3 instanceof vo ? (vo) iInterfaceQueryLocalInterface3 : new uo(strongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                }
                wn wnVarU12 = vn.u1(parcel.readStrongBinder());
                qb.b(parcel);
                F(string4, string5, zzlVar2, aVarT3, uoVar, wnVarU12);
                parcel2.writeNoException();
                break;
            case 15:
                a4.a aVarT4 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                boolean zN = n(aVarT4);
                parcel2.writeNoException();
                parcel2.writeInt(zN ? 1 : 0);
                break;
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                zzl zzlVar3 = (zzl) qb.a(parcel, zzl.CREATOR);
                a4.a aVarT5 = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    woVar = iInterfaceQueryLocalInterface4 instanceof zo ? (zo) iInterfaceQueryLocalInterface4 : new yo(strongBinder4);
                }
                ?? r112 = woVar;
                wn wnVarU13 = vn.u1(parcel.readStrongBinder());
                qb.b(parcel);
                B0(string6, string7, zzlVar3, aVarT5, r112, wnVarU13);
                parcel2.writeNoException();
                break;
            case 17:
                a4.a aVarT6 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                boolean zA = A(aVarT6);
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                break;
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                zzl zzlVar4 = (zzl) qb.a(parcel, zzl.CREATOR);
                a4.a aVarT7 = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    woVar = iInterfaceQueryLocalInterface5 instanceof xo ? (xo) iInterfaceQueryLocalInterface5 : new wo(strongBinder5);
                }
                ?? r52 = woVar;
                wn wnVarU14 = vn.u1(parcel.readStrongBinder());
                qb.b(parcel);
                o0(string8, string9, zzlVar4, aVarT7, r52, wnVarU14, null);
                parcel2.writeNoException();
                break;
            case 19:
                String string10 = parcel.readString();
                qb.b(parcel);
                this.f4592h = string10;
                parcel2.writeNoException();
                break;
            case 20:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzl zzlVar5 = (zzl) qb.a(parcel, zzl.CREATOR);
                a4.a aVarT8 = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    woVar = iInterfaceQueryLocalInterface6 instanceof zo ? (zo) iInterfaceQueryLocalInterface6 : new yo(strongBinder6);
                }
                ?? r113 = woVar;
                wn wnVarU15 = vn.u1(parcel.readStrongBinder());
                qb.b(parcel);
                T(string11, string12, zzlVar5, aVarT8, r113, wnVarU15);
                parcel2.writeNoException();
                break;
            case sf.zzm /* 21 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                zzl zzlVar6 = (zzl) qb.a(parcel, zzl.CREATOR);
                a4.a aVarT9 = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    woVar = iInterfaceQueryLocalInterface7 instanceof so ? (so) iInterfaceQueryLocalInterface7 : new ro(strongBinder7);
                }
                ?? r114 = woVar;
                wn wnVarU16 = vn.u1(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) qb.a(parcel, zzq.CREATOR);
                qb.b(parcel);
                M0(string13, string14, zzlVar6, aVarT9, r114, wnVarU16, zzqVar3);
                parcel2.writeNoException();
                break;
            case 22:
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                zzl zzlVar7 = (zzl) qb.a(parcel, zzl.CREATOR);
                a4.a aVarT10 = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    woVar = iInterfaceQueryLocalInterface8 instanceof xo ? (xo) iInterfaceQueryLocalInterface8 : new wo(strongBinder8);
                }
                ?? r53 = woVar;
                wn wnVarU17 = vn.u1(parcel.readStrongBinder());
                zzbes zzbesVar = (zzbes) qb.a(parcel, zzbes.CREATOR);
                qb.b(parcel);
                o0(string15, string16, zzlVar7, aVarT10, r53, wnVarU17, zzbesVar);
                parcel2.writeNoException();
                break;
            case 23:
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                zzl zzlVar8 = (zzl) qb.a(parcel, zzl.CREATOR);
                a4.a aVarT11 = a4.b.t(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    poVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    poVar = iInterfaceQueryLocalInterface9 instanceof qo ? (qo) iInterfaceQueryLocalInterface9 : new po(strongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                }
                wn wnVarU18 = vn.u1(parcel.readStrongBinder());
                qb.b(parcel);
                g0(string17, string18, zzlVar8, aVarT11, poVar, wnVarU18);
                parcel2.writeNoException();
                break;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                a4.a aVarT12 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                boolean zR = r(aVarT12);
                parcel2.writeNoException();
                parcel2.writeInt(zR ? 1 : 0);
                break;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final void d1(String str) {
        this.f4592h = str;
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final void g0(String str, String str2, zzl zzlVar, a4.a aVar, qo qoVar, wn wnVar) throws RemoteException {
        try {
            this.f4588a.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) a4.b.a0(aVar), str, v1(str2), u1(zzlVar), w1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, x1(zzlVar, str2), this.f4592h), new ur0(this, qoVar, wnVar, 29));
        } catch (Throwable th) {
            zzm.zzh("Adapter failed to render app open ad.", th);
            z3.a.c0(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final void h1(String str, String str2, zzl zzlVar, a4.b bVar, ij0 ij0Var, wn wnVar) throws RemoteException {
        o0(str, str2, zzlVar, bVar, ij0Var, wnVar, null);
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final boolean n(a4.a aVar) {
        MediationInterstitialAd mediationInterstitialAd = this.f4589b;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) a4.b.a0(aVar));
            return true;
        } catch (Throwable th) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            z3.a.c0(aVar, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final void o0(String str, String str2, zzl zzlVar, a4.a aVar, xo xoVar, wn wnVar, zzbes zzbesVar) throws RemoteException {
        RtbAdapter rtbAdapter = this.f4588a;
        try {
            rtbAdapter.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) a4.b.a0(aVar), str, v1(str2), u1(zzlVar), w1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, x1(zzlVar, str2), this.f4592h, zzbesVar), new p80(xoVar, wnVar, 9, 0));
        } catch (Throwable th) {
            zzm.zzh("Adapter failed to render native ad.", th);
            z3.a.c0(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                rtbAdapter.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) a4.b.a0(aVar), str, v1(str2), u1(zzlVar), w1(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, x1(zzlVar, str2), this.f4592h, zzbesVar), new m20(xoVar, wnVar, 11));
            } catch (Throwable th2) {
                zzm.zzh("Adapter failed to render native ad.", th2);
                z3.a.c0(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final boolean r(a4.a aVar) {
        MediationAppOpenAd mediationAppOpenAd = this.f4591f;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((Context) a4.b.a0(aVar));
            return true;
        } catch (Throwable th) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            z3.a.c0(aVar, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    public final Bundle u1(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f4588a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f4588a;
        if (mediationExtrasReceiver instanceof zza) {
            try {
                return ((zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final zzbra zzf() {
        return zzbra.b(this.f4588a.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final zzbra zzg() {
        return zzbra.b(this.f4588a.getSDKVersionInfo());
    }
}
