package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import android.view.View;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class m20 implements x, h6, qx0, su, MediationAdLoadCallback, cw0, k21, yx, x11, wh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6809b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6810d;

    public m20(int i10) {
        this.f6808a = i10;
        if (i10 == 7) {
            this.f6809b = new ByteArrayOutputStream(NotificationCompat.FLAG_BUBBLE);
            this.f6810d = new Base64OutputStream((ByteArrayOutputStream) this.f6809b, 10);
        } else {
            if (i10 != 12) {
                return;
            }
            this.f6810d = new HashMap();
        }
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        switch (this.f6808a) {
            case 16:
                ((k21) this.f6809b).E(th);
                nu.f7387e.execute(new s9(22, (w20) this.f6810d));
                return;
            case 17:
            case 19:
            case 20:
            case 23:
            case 25:
            default:
                synchronized (((jt) this.f6810d)) {
                    try {
                        ((jj0) ((jt) this.f6810d).f6079h).b((fr0) this.f6809b);
                        fr0 fr0VarA = ((jj0) ((jt) this.f6810d).f6079h).a();
                        if (((fr0) this.f6809b).f4643v0) {
                            while (fr0VarA != null) {
                                ((jt) this.f6810d).h(fr0VarA);
                                fr0VarA = ((jj0) ((jt) this.f6810d).f6079h).a();
                            }
                        } else if (fr0VarA != null) {
                            ((jt) this.f6810d).h(fr0VarA);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 18:
                if (((Boolean) zzba.zzc().a(eg.I4)).booleanValue()) {
                    zzu.zzo().h("omid native display exp", th);
                    return;
                }
                return;
            case sf.zzm /* 21 */:
            case 22:
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return;
            case 26:
                try {
                    ((pr) this.f6809b).p(zzbb.zzb(th));
                    return;
                } catch (RemoteException e10) {
                    zze.zzb("Service can't call client", e10);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        switch (this.f6808a) {
            case 16:
                List list = ((u20) obj).f9353a;
                k21 k21Var = (k21) this.f6809b;
                w20 w20Var = (w20) this.f6810d;
                if (list == null || list.isEmpty()) {
                    w20Var.f10034a.execute(new s9(23, k21Var));
                    return;
                }
                n5.a aVarD0 = tc1.d0(null);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aVarD0 = tc1.q0(tc1.V(aVarD0, Throwable.class, new if0(4, k21Var), w20Var.f10034a), new v20(w20Var, k21Var, (n5.a) it.next(), 0), w20Var.f10034a);
                }
                tc1.u0(aVarD0, new p80(w20Var, k21Var, 17), w20Var.f10034a);
                return;
            case 17:
            case 19:
            case 20:
            case 23:
            case 25:
            default:
                uj0 uj0Var = (uj0) obj;
                synchronized (((jt) this.f6810d)) {
                    ((jj0) ((jt) this.f6810d).f6079h).c(uj0Var, (fr0) this.f6809b);
                    fr0 fr0VarA = ((jj0) ((jt) this.f6810d).f6079h).a();
                    if (fr0VarA != null) {
                        ((jt) this.f6810d).h(fr0VarA);
                    }
                    break;
                }
                return;
            case 18:
                int i10 = i90.G;
                ((i90) this.f6810d).s((View) this.f6809b, (zh0) obj);
                return;
            case sf.zzm /* 21 */:
                ((fx) obj).l0((String) this.f6809b, (wk) this.f6810d);
                return;
            case 22:
                ((fx) obj).j((String) this.f6809b, (Map) this.f6810d);
                return;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                ((fe0) obj).f4505z = true;
                ((te0) this.f6810d).f9145f.b((String) this.f6809b);
                return;
            case 26:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue()) {
                        ((pr) this.f6809b).q1(parcelFileDescriptor, (zzbvb) this.f6810d);
                    } else {
                        ((pr) this.f6809b).h(parcelFileDescriptor);
                    }
                    return;
                } catch (RemoteException e10) {
                    zze.zzb("Service can't call client", e10);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.h6
    public final void b(nn0 nn0Var, i0 i0Var, q2.d dVar) {
    }

    @Override // com.google.android.gms.internal.ads.h6
    public final void c(ik0 ik0Var) {
        if (ik0Var.v() == 0 && (ik0Var.v() & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            ik0Var.j(6);
            int iN = ik0Var.n() / 4;
            for (int i10 = 0; i10 < iN; i10++) {
                d1 d1Var = (d1) this.f6809b;
                ik0Var.e(0, d1Var.f3531c, 4);
                d1Var.k(0);
                d1 d1Var2 = (d1) this.f6809b;
                int iE = d1Var2.e(16);
                d1Var2.m(3);
                if (iE == 0) {
                    ((d1) this.f6809b).m(13);
                } else {
                    int iE2 = ((d1) this.f6809b).e(13);
                    if (((l6) this.f6810d).f6511f.get(iE2) == null) {
                        l6 l6Var = (l6) this.f6810d;
                        l6Var.f6511f.put(iE2, new i6(new k6(l6Var, iE2)));
                        ((l6) this.f6810d).f6517l++;
                    }
                }
            }
            ((l6) this.f6810d).f6511f.remove(0);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x00f6
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.google.android.gms.internal.ads.x
    public final com.google.android.gms.internal.ads.w d(com.google.android.gms.internal.ads.h0 r17, long r18) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m20.d(com.google.android.gms.internal.ads.h0, long):com.google.android.gms.internal.ads.w");
    }

    public final void e(rs0 rs0Var) {
        zg0 zg0Var = (zg0) this.f6809b;
        Objects.requireNonNull(zg0Var);
        tc1.u0(((q11) ((p21) this.f6810d)).b(new du(4, zg0Var)), new jp0(19, rs0Var, 0), (p21) this.f6810d);
    }

    public final void f(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((Map) this.f6809b).put(str, str2);
    }

    public final void g(wh1 wh1Var) {
        synchronized (wh1Var) {
        }
        Handler handler = (Handler) this.f6809b;
        if (handler != null) {
            handler.post(new o(this, wh1Var, 1));
        }
    }

    public final void h() {
        ((ed0) this.f6810d).f3908b.execute(new dd0(this, 0));
    }

    public final void i(e10 e10Var) {
        Handler handler = (Handler) this.f6809b;
        if (handler != null) {
            handler.post(new vm(this, 1, e10Var));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        switch (this.f6808a) {
            case 10:
                try {
                    ((so) this.f6809b).zzf(adError.zza());
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                    return;
                }
                break;
            default:
                try {
                    ((xo) this.f6809b).zzf(adError.zza());
                } catch (RemoteException e11) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        int i10 = 8;
        switch (this.f6808a) {
            case 10:
                MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
                if (mediationInterscrollerAd != null) {
                    try {
                        ((so) this.f6809b).D(new ko(mediationInterscrollerAd));
                    } catch (RemoteException e10) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                    }
                } else {
                    zzm.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        ((so) this.f6809b).a("Adapter returned null.");
                    } catch (RemoteException e11) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                        return null;
                    }
                }
                break;
            default:
                UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
                if (unifiedNativeAdMapper != null) {
                    try {
                        ((xo) this.f6809b).i1(new oo(unifiedNativeAdMapper));
                    } catch (RemoteException e12) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
                    }
                } else {
                    zzm.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        ((xo) this.f6809b).a("Adapter returned null.");
                    } catch (RemoteException e13) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e13);
                        return null;
                    }
                }
                break;
        }
        return new rk0(i10, (wn) this.f6810d);
    }

    public final String toString() {
        String string;
        switch (this.f6808a) {
            case 7:
                try {
                    ((Base64OutputStream) this.f6810d).close();
                } catch (IOException e10) {
                    zzm.zzh("HashManager: Unable to convert to Base64.", e10);
                }
                try {
                    try {
                        ((ByteArrayOutputStream) this.f6809b).close();
                        string = ((ByteArrayOutputStream) this.f6809b).toString();
                        break;
                    } catch (IOException e11) {
                        zzm.zzh("HashManager: Unable to convert to Base64.", e11);
                        string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    return string;
                } finally {
                    this.f6809b = null;
                    this.f6810d = null;
                }
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final hw0 mo3zza() {
        yw ywVar = (yw) this.f6809b;
        cw0 cw0Var = (cw0) this.f6810d;
        ywVar.getClass();
        hw0 hw0VarZza = cw0Var.zza();
        i10 i10Var = new i10(12, ywVar);
        return new uw(ywVar.f11052a, hw0VarZza, ywVar.f11065z, ywVar.A, ywVar, i10Var);
    }

    @Override // com.google.android.gms.internal.ads.x
    public final void zzb() {
        byte[] bArr = yn0.f10949f;
        int length = bArr.length;
        ((ik0) this.f6810d).g(bArr, 0);
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final Object mo3zza() {
        switch (this.f6808a) {
            case 8:
                cg cgVar = (cg) this.f6809b;
                yf yfVar = (yf) this.f6810d;
                SharedPreferences sharedPreferences = cgVar.f3264e;
                xf xfVar = (xf) yfVar;
                int i10 = xfVar.f10545e;
                String str = xfVar.f10865b;
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) xfVar.g()).booleanValue()));
                    case 1:
                        return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) xfVar.g()).intValue()));
                    case 2:
                        return Long.valueOf(sharedPreferences.getLong(str, ((Long) xfVar.g()).longValue()));
                    case 3:
                        return Float.valueOf(sharedPreferences.getFloat(str, ((Float) xfVar.g()).floatValue()));
                    default:
                        return sharedPreferences.getString(str, (String) xfVar.g());
                }
            default:
                VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.f6809b;
                return new cu0(kg.a("Google", versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion), (WebView) this.f6810d);
        }
    }

    public m20(Handler handler, ri1 ri1Var) {
        this.f6808a = 1;
        this.f6809b = handler;
        this.f6810d = ri1Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.f6808a) {
            case 10:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }

    public /* synthetic */ m20(VersionInfoParcel versionInfoParcel, WebView webView) {
        this.f6808a = 28;
        this.f6809b = versionInfoParcel;
        this.f6810d = webView;
    }

    public m20(l6 l6Var) {
        this.f6808a = 5;
        this.f6810d = l6Var;
        this.f6809b = new d1(new byte[4], 4);
    }

    public /* synthetic */ m20(zy zyVar) {
        this.f6808a = 14;
        this.f6809b = zyVar;
    }

    public /* synthetic */ m20(Object obj, int i10, Object obj2) {
        this.f6808a = i10;
        this.f6809b = obj;
        this.f6810d = obj2;
    }

    public /* synthetic */ m20(Object obj, Object obj2, int i10) {
        this.f6808a = i10;
        this.f6809b = obj;
        this.f6810d = obj2;
    }

    public /* synthetic */ m20(Object obj, Object obj2, int i10, int i11) {
        this.f6808a = i10;
        this.f6809b = obj2;
        this.f6810d = obj;
    }

    public /* synthetic */ m20(String str, zzapq zzapqVar) {
        this.f6808a = 6;
        this.f6809b = str;
        this.f6810d = zzapqVar;
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final n5.a mo3zza() {
        n5.a aVarR0;
        ep epVar = (ep) this.f6809b;
        zzbuc zzbucVar = (zzbuc) this.f6810d;
        epVar.getClass();
        long jLongValue = ((Long) zzba.zzc().a(eg.Ga)).longValue();
        hg0 hg0Var = (hg0) epVar.f4271f;
        synchronized (hg0Var) {
            if (hg0Var.f6607b) {
                aVarR0 = tc1.r0(hg0Var.f6606a, jLongValue, TimeUnit.MILLISECONDS, hg0Var.f6612s);
            } else {
                hg0Var.f6607b = true;
                hg0Var.f5280u = zzbucVar;
                hg0Var.a();
                aVarR0 = tc1.r0(hg0Var.f6606a, jLongValue, TimeUnit.MILLISECONDS, hg0Var.f6612s);
                aVarR0.a(new yd0(4, hg0Var), nu.f7388f);
            }
        }
        return aVarR0;
    }

    public m20(Map map) {
        this.f6808a = 22;
        this.f6809b = "sendMessageToNativeJs";
        this.f6810d = map;
    }

    public m20(ed0 ed0Var) {
        this.f6808a = 23;
        this.f6810d = ed0Var;
        this.f6809b = new ConcurrentHashMap();
    }

    public /* synthetic */ m20(nn0 nn0Var) {
        this.f6808a = 4;
        this.f6809b = nn0Var;
        this.f6810d = new ik0();
    }

    @Override // com.google.android.gms.internal.ads.su, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: zza */
    public final void mo1zza() {
        zze.zza("callJs > getEngine: Promise rejected");
        ((qu) this.f6809b).c(new zzbnd("Unable to obtain a JavascriptEngine."));
        ((tm) this.f6810d).o();
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void zza(boolean z9, int i10, String str, String str2) {
        ba0 ba0Var = (ba0) this.f6809b;
        Map map = (Map) this.f6810d;
        ba0Var.getClass();
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        ba0Var.f2946b.b(map2);
    }
}
