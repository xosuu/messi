package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.Toolbar;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ur0 implements f.c, s0.k, r0.g, r1.c, o2.a, CustomEventInterstitialListener, i0, z3, h6, v3.b, MediationAdLoadCallback, MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static ur0 f9597h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static ur0 f9598q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9600b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9601d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9602f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ur0(androidx.lifecycle.n0 n0Var, androidx.lifecycle.m0 m0Var) {
        this(n0Var, m0Var, 0);
        this.f9599a = 11;
        g4.a0.f(n0Var, "store");
    }

    public static ur0 K(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new ur0(context, 5, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static final boolean R(String str) {
        if (!((Boolean) zzba.zzc().a(eg.f3943a9)).booleanValue()) {
            return false;
        }
        z3.a.l(str);
        if (str.length() > ((Integer) zzba.zzc().a(eg.f3965c9)).intValue()) {
            zzm.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri uri = Uri.parse(str);
        return "gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath());
    }

    public static ur0 S(Context context) {
        synchronized (ur0.class) {
            try {
                ur0 ur0Var = f9597h;
                if (ur0Var != null) {
                    return ur0Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) mh.f6939b.k()).longValue();
                com.google.android.gms.ads.internal.client.zzcl zzclVarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 242402501) {
                    try {
                        zzclVarAsInterface = zzck.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                        zzm.zzh("Failed to retrieve lite SDK info.", e10);
                    }
                }
                ur0 ur0Var2 = new ur0(applicationContext, zzclVarAsInterface);
                f9597h = ur0Var2;
                return ur0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static hj T(ur0 ur0Var, gj gjVar) {
        hj hjVar;
        synchronized (ur0Var) {
            hjVar = (hj) ur0Var.f9602f;
            if (hjVar == null) {
                hjVar = new hj(gjVar);
                ur0Var.f9602f = hjVar;
            }
        }
        return hjVar;
    }

    public final Typeface A(int i10, int i11, l.u0 u0Var) {
        int resourceId = ((TypedArray) this.f9601d).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f9602f) == null) {
            this.f9602f = new TypedValue();
        }
        Context context = (Context) this.f9600b;
        TypedValue typedValue = (TypedValue) this.f9602f;
        ThreadLocal threadLocal = f0.q.f13039a;
        if (context.isRestricted()) {
            return null;
        }
        return f0.q.c(context, resourceId, typedValue, i11, u0Var, true, false);
    }

    public final int B(int i10, int i11) {
        return ((TypedArray) this.f9601d).getInt(i10, i11);
    }

    public final Location C(String str) {
        try {
            if (((LocationManager) this.f9601d).isProviderEnabled(str)) {
                return ((LocationManager) this.f9601d).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int D(int i10, int i11) {
        return ((TypedArray) this.f9601d).getResourceId(i10, i11);
    }

    public final String E(int i10) {
        return ((TypedArray) this.f9601d).getString(i10);
    }

    public final l2.e F(String str) {
        n1.q qVarA = n1.q.a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            qVarA.A(1);
        } else {
            qVarA.D(1, str);
        }
        ((n1.p) this.f9600b).b();
        Cursor cursorG = ((n1.p) this.f9600b).g(qVarA);
        try {
            return cursorG.moveToFirst() ? new l2.e(cursorG.getString(g4.z.l(cursorG, "work_spec_id")), cursorG.getInt(g4.z.l(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            qVarA.E();
        }
    }

    public final CharSequence G(int i10) {
        return ((TypedArray) this.f9601d).getText(i10);
    }

    public final boolean H(int i10) {
        return ((TypedArray) this.f9601d).hasValue(i10);
    }

    public final void I(l2.e eVar) {
        ((n1.p) this.f9600b).b();
        ((n1.p) this.f9600b).c();
        try {
            ((n1.b) this.f9601d).e(eVar);
            ((n1.p) this.f9600b).h();
        } finally {
            ((n1.p) this.f9600b).f();
        }
    }

    public final boolean J(int i10, w.d dVar, x.n nVar) {
        x.b bVar = (x.b) this.f9601d;
        int[] iArr = dVar.f18013p0;
        bVar.f18211a = iArr[0];
        bVar.f18212b = iArr[1];
        bVar.f18213c = dVar.r();
        ((x.b) this.f9601d).f18214d = dVar.l();
        x.b bVar2 = (x.b) this.f9601d;
        bVar2.f18219i = false;
        bVar2.f18220j = i10;
        boolean z9 = bVar2.f18211a == 3;
        boolean z10 = bVar2.f18212b == 3;
        boolean z11 = z9 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        int[] iArr2 = dVar.f18017t;
        if (z11 && iArr2[0] == 4) {
            bVar2.f18211a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar2.f18212b = 1;
        }
        nVar.b(dVar, bVar2);
        dVar.P(((x.b) this.f9601d).f18215e);
        dVar.M(((x.b) this.f9601d).f18216f);
        x.b bVar3 = (x.b) this.f9601d;
        dVar.E = bVar3.f18218h;
        dVar.J(bVar3.f18217g);
        x.b bVar4 = (x.b) this.f9601d;
        bVar4.f18220j = 0;
        return bVar4.f18219i;
    }

    public final void L(androidx.lifecycle.k kVar) {
        Object obj = this.f9602f;
        if (((androidx.lifecycle.j0) obj) != null) {
            ((androidx.lifecycle.j0) obj).run();
        }
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0((androidx.lifecycle.s) this.f9600b, kVar);
        this.f9602f = j0Var;
        ((Handler) this.f9601d).postAtFrontOfQueue(j0Var);
    }

    public final void M() {
        ((TypedArray) this.f9601d).recycle();
    }

    public final void N(String str) {
        ((n1.p) this.f9600b).b();
        s1.g gVarA = ((n1.s) this.f9602f).a();
        if (str == null) {
            gVarA.u(1);
        } else {
            gVarA.A(1, str);
        }
        ((n1.p) this.f9600b).c();
        try {
            gVarA.D();
            ((n1.p) this.f9600b).h();
        } finally {
            ((n1.p) this.f9600b).f();
            ((n1.s) this.f9602f).c(gVarA);
        }
    }

    public final void O(w.e eVar, int i10, int i11, int i12) {
        int i13 = eVar.f17985b0;
        int i14 = eVar.f17987c0;
        eVar.f17985b0 = 0;
        eVar.f17987c0 = 0;
        eVar.P(i11);
        eVar.M(i12);
        if (i13 < 0) {
            eVar.f17985b0 = 0;
        } else {
            eVar.f17985b0 = i13;
        }
        if (i14 < 0) {
            eVar.f17987c0 = 0;
        } else {
            eVar.f17987c0 = i14;
        }
        w.e eVar2 = (w.e) this.f9602f;
        eVar2.f18026t0 = i10;
        eVar2.S();
    }

    public final void P(w.e eVar) {
        ((ArrayList) this.f9600b).clear();
        int size = eVar.f18070q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            w.d dVar = (w.d) eVar.f18070q0.get(i10);
            int[] iArr = dVar.f18013p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                ((ArrayList) this.f9600b).add(dVar);
            }
        }
        eVar.f18025s0.f18223a = true;
    }

    public final void Q() {
        switch (this.f9599a) {
            case 17:
                pg pgVar = (pg) this.f9601d;
                p.e eVar = pgVar.f7875b;
                Object obj = null;
                if (eVar == null) {
                    pgVar.f7874a = null;
                } else if (pgVar.f7874a == null) {
                    pgVar.f7874a = eVar.a(null);
                }
                p.g gVar = pgVar.f7874a;
                Intent intent = new Intent("android.intent.action.VIEW");
                if (gVar != null) {
                    intent.setPackage(gVar.f16174d.getPackageName());
                    IBinder iBinderAsBinder = gVar.f16173c.asBinder();
                    Bundle bundle = new Bundle();
                    androidx.core.app.j.b(bundle, "android.support.customtabs.extra.SESSION", iBinderAsBinder);
                    PendingIntent pendingIntent = gVar.f16175e;
                    if (pendingIntent != null) {
                        bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                    }
                    intent.putExtras(bundle);
                }
                if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle2 = new Bundle();
                    androidx.core.app.j.b(bundle2, "android.support.customtabs.extra.SESSION", null);
                    intent.putExtras(bundle2);
                }
                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent.putExtras(new Bundle());
                intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                f.f fVar = new f.f(intent, 3, obj);
                ((Intent) fVar.f12832b).setPackage(tc1.f((Context) this.f9600b));
                Context context = (Context) this.f9600b;
                ((Intent) fVar.f12832b).setData((Uri) this.f9602f);
                Intent intent2 = (Intent) fVar.f12832b;
                Bundle bundle3 = (Bundle) fVar.f12833d;
                Object obj2 = d0.f.f12287a;
                d0.a.b(context, intent2, bundle3);
                Context context2 = (Context) this.f9600b;
                pg pgVar2 = (pg) this.f9601d;
                Activity activity = (Activity) context2;
                rh1 rh1Var = pgVar2.f7876c;
                if (rh1Var == null) {
                    return;
                }
                activity.unbindService(rh1Var);
                pgVar2.f7875b = null;
                pgVar2.f7874a = null;
                pgVar2.f7876c = null;
                return;
            case 20:
                break;
            default:
                if (((Boolean) zzba.zzc().a(eg.f3943a9)).booleanValue()) {
                    if (((ml) this.f9602f) == null) {
                        this.f9602f = zzay.zza().zzl((Context) this.f9600b, new pn(), (OnH5AdsEventListener) this.f9601d);
                    }
                    ml mlVar = (ml) this.f9602f;
                    if (mlVar != null) {
                        try {
                            mlVar.zze();
                            return;
                        } catch (RemoteException e10) {
                            zzm.zzl("#007 Could not call remote method.", e10);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
        for (int i10 = 0; i10 < ((SparseArray) this.f9602f).size(); i10++) {
            c4 c4Var = ((f4) ((SparseArray) this.f9602f).valueAt(i10)).f4391g;
            if (c4Var != null) {
                c4Var.zzb();
            }
        }
    }

    public final void U(rn rnVar) {
        rn adapterCreator;
        if (!((Boolean) mh.f6938a.k()).booleanValue()) {
            AtomicReference atomicReference = (AtomicReference) this.f9602f;
            while (!atomicReference.compareAndSet(null, rnVar)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    return;
                }
            }
            return;
        }
        com.google.android.gms.ads.internal.client.zzcl zzclVar = (com.google.android.gms.ads.internal.client.zzcl) this.f9601d;
        if (zzclVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzclVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference2 = (AtomicReference) this.f9602f;
        if (adapterCreator == null) {
            adapterCreator = rnVar;
        }
        while (!atomicReference2.compareAndSet(null, adapterCreator)) {
            if (atomicReference2.get() != null && atomicReference2.get() != null) {
                return;
            }
        }
    }

    @Override // f.c
    public final void a(g.i iVar, int i10) {
        ((Toolbar) this.f9600b).setNavigationIcon(iVar);
        l(i10);
    }

    @Override // com.google.android.gms.internal.ads.h6
    public final void b(nn0 nn0Var, i0 i0Var, q2.d dVar) {
        this.f9601d = nn0Var;
        dVar.c();
        dVar.d();
        b1 b1VarJ = i0Var.j(dVar.f16414c, 5);
        this.f9602f = b1VarJ;
        b1VarJ.c((y1) this.f9600b);
    }

    @Override // com.google.android.gms.internal.ads.h6
    public final void c(ik0 ik0Var) {
        long jD;
        tc1.A((nn0) this.f9601d);
        int i10 = yn0.f10944a;
        nn0 nn0Var = (nn0) this.f9601d;
        synchronized (nn0Var) {
            try {
                long j10 = nn0Var.f7327c;
                jD = j10 != -9223372036854775807L ? j10 + nn0Var.f7326b : nn0Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        long jE = ((nn0) this.f9601d).e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        y1 y1Var = (y1) this.f9600b;
        if (jE != y1Var.f10718q) {
            q0 q0Var = new q0(y1Var);
            q0Var.f8056p = jE;
            y1 y1Var2 = new y1(q0Var);
            this.f9600b = y1Var2;
            ((b1) this.f9602f).c(y1Var2);
        }
        int iN = ik0Var.n();
        ((b1) this.f9602f).f(iN, ik0Var);
        ((b1) this.f9602f).e(jD, 1, iN, 0, null);
    }

    @Override // f.c
    public final boolean d() {
        return true;
    }

    @Override // r1.c
    public final r1.d e(r1.b bVar) {
        return new n1.r(bVar.f16492a, (String) this.f9600b, (File) this.f9601d, bVar.f16494c.f14789a, ((r1.c) this.f9602f).e(bVar));
    }

    @Override // r0.g
    public final Object f() {
        return null;
    }

    @Override // r0.g
    public final Uri g() {
        return (Uri) this.f9600b;
    }

    @Override // r0.g
    public final ClipDescription getDescription() {
        return (ClipDescription) this.f9601d;
    }

    @Override // r0.g
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final void i() {
        ((i0) this.f9600b).i();
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final b1 j(int i10, int i11) {
        if (i11 != 3) {
            return ((i0) this.f9600b).j(i10, i11);
        }
        f4 f4Var = (f4) ((SparseArray) this.f9602f).get(i10);
        if (f4Var != null) {
            return f4Var;
        }
        f4 f4Var2 = new f4(((i0) this.f9600b).j(i10, 3), (a4) this.f9601d);
        ((SparseArray) this.f9602f).put(i10, f4Var2);
        return f4Var2;
    }

    @Override // f.c
    public final Drawable k() {
        return (Drawable) this.f9601d;
    }

    @Override // f.c
    public final void l(int i10) {
        if (i10 == 0) {
            ((Toolbar) this.f9600b).setNavigationContentDescription((CharSequence) this.f9602f);
        } else {
            ((Toolbar) this.f9600b).setNavigationContentDescription(i10);
        }
    }

    @Override // v3.b
    public final void m(int i10) {
    }

    @Override // r0.g
    public final Uri n() {
        return (Uri) this.f9602f;
    }

    @Override // f.c
    public final Context o() {
        return ((Toolbar) this.f9600b).getContext();
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzm.zze("Custom event adapter called onAdClicked.");
        ((MediationInterstitialListener) this.f9601d).onAdClicked((CustomEventAdapter) this.f9600b);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzm.zze("Custom event adapter called onAdClosed.");
        ((MediationInterstitialListener) this.f9601d).onAdClosed((CustomEventAdapter) this.f9600b);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i10) {
        zzm.zze("Custom event adapter called onFailedToReceiveAd.");
        ((MediationInterstitialListener) this.f9601d).onAdFailedToLoad((CustomEventAdapter) this.f9600b, i10);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) this.f9601d;
        if (((hj) this.f9602f) == null) {
            if (unifiedNativeAdMapper == null) {
                zzm.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzm.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzm.zze("Adapter called onAdImpression.");
        try {
            ((wn) this.f9600b).zzm();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzm.zze("Custom event adapter called onAdLeftApplication.");
        ((MediationInterstitialListener) this.f9601d).onAdLeftApplication((CustomEventAdapter) this.f9600b);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onAdLoaded() {
        zzm.zze("Custom event adapter called onReceivedAd.");
        ((MediationInterstitialListener) this.f9601d).onAdLoaded((CustomEventAdapter) this.f9602f);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzm.zze("Custom event adapter called onAdOpened.");
        ((MediationInterstitialListener) this.f9601d).onAdOpened((CustomEventAdapter) this.f9600b);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        switch (this.f9599a) {
            case 26:
                try {
                    zzm.zze(((Adapter) this.f9601d).getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    ((wn) this.f9600b).X(adError.zza());
                    ((wn) this.f9600b).N(adError.getCode(), adError.getMessage());
                    ((wn) this.f9600b).c(adError.getCode());
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                    return;
                }
                break;
            case 27:
            default:
                try {
                    ((qo) this.f9600b).zzf(adError.zza());
                } catch (RemoteException e11) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                }
                break;
            case 28:
                try {
                    ((vo) this.f9600b).zzf(adError.zza());
                } catch (RemoteException e12) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        int i10 = 8;
        switch (this.f9599a) {
            case 26:
                try {
                    ((jo) this.f9602f).f6043v = (MediationInterscrollerAd) obj;
                    ((wn) this.f9600b).zzo();
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                }
                break;
            case 27:
            default:
                MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
                if (mediationAppOpenAd != null) {
                    try {
                        ((fp) this.f9602f).f4591f = mediationAppOpenAd;
                        ((qo) this.f9600b).zzg();
                    } catch (RemoteException e11) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                    }
                } else {
                    zzm.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        ((qo) this.f9600b).a("Adapter returned null.");
                    } catch (RemoteException e12) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
                        return null;
                    }
                }
                break;
            case 28:
                MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
                if (mediationInterstitialAd != null) {
                    try {
                        ((fp) this.f9602f).f4589b = mediationInterstitialAd;
                        ((vo) this.f9600b).zzg();
                    } catch (RemoteException e13) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e13);
                    }
                } else {
                    zzm.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        ((vo) this.f9600b).a("Adapter returned null.");
                    } catch (RemoteException e14) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e14);
                        return null;
                    }
                }
                break;
        }
        return new rk0(i10, (wn) this.f9601d);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onVideoEnd.");
        try {
            ((wn) this.f9600b).zzv();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final void p(v0 v0Var) {
        ((i0) this.f9600b).p(v0Var);
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final ArrayList q(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < ((List) this.f9600b).size(); i11++) {
            long[] jArr = (long[]) this.f9601d;
            int i12 = i11 + i11;
            if (jArr[i12] <= j10 && j10 < jArr[i12 + 1]) {
                d5 d5Var = (d5) ((List) this.f9600b).get(i11);
                c60 c60Var = d5Var.f3567a;
                if (c60Var.f3210e == -3.4028235E38f) {
                    arrayList2.add(d5Var);
                } else {
                    arrayList.add(c60Var);
                }
            }
        }
        Collections.sort(arrayList2, new e5(1));
        while (i10 < arrayList2.size()) {
            c60 c60Var2 = ((d5) arrayList2.get(i10)).f3567a;
            arrayList.add(new c60(c60Var2.f3206a, c60Var2.f3207b, c60Var2.f3208c, c60Var2.f3209d, (-1) - i10, 1, c60Var2.f3212g, c60Var2.f3213h, c60Var2.f3214i, c60Var2.f3217l, c60Var2.f3218m, c60Var2.f3215j, c60Var2.f3216k, c60Var2.f3219n, c60Var2.f3220o));
            i10++;
            arrayList2 = arrayList2;
        }
        return arrayList;
    }

    @Override // v3.b
    public final void r(Bundle bundle) {
        synchronized (((l7) this.f9602f).f6524b) {
            try {
                Object obj = this.f9602f;
                l7 l7Var = (l7) obj;
                if (l7Var.f6523a) {
                    return;
                }
                l7Var.f6523a = true;
                cd cdVar = (cd) ((l7) obj).f6525d;
                if (cdVar == null) {
                    return;
                }
                n5.a aVarA = nu.f7383a.a(new fd(this, cdVar, (zzbah) this.f9600b, (qu) this.f9601d, 0));
                qu quVar = (qu) this.f9601d;
                quVar.a(new vm(quVar, 6, aVarA), nu.f7388f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(Runnable runnable) {
        ((m2.i) this.f9600b).execute(runnable);
    }

    public final androidx.lifecycle.k0 t(Class cls, String str) {
        androidx.lifecycle.k0 k0VarA;
        g4.a0.f(str, "key");
        androidx.lifecycle.k0 k0Var = (androidx.lifecycle.k0) ((androidx.lifecycle.n0) this.f9600b).f989a.get(str);
        if (cls.isInstance(k0Var)) {
            if (k0Var != null) {
                return k0Var;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        c1.e eVar = new c1.e((c1.b) this.f9602f);
        eVar.f1498a.put(androidx.lifecycle.l0.f987b, str);
        try {
            k0VarA = ((androidx.lifecycle.m0) this.f9601d).d(cls, eVar);
        } catch (AbstractMethodError unused) {
            k0VarA = ((androidx.lifecycle.m0) this.f9601d).a(cls);
        }
        androidx.lifecycle.k0 k0Var2 = (androidx.lifecycle.k0) ((androidx.lifecycle.n0) this.f9600b).f989a.put(str, k0VarA);
        if (k0Var2 != null) {
            k0Var2.a();
        }
        return k0VarA;
    }

    public final String toString() {
        switch (this.f9599a) {
            case 6:
                String string = "[ ";
                if (((u.i) this.f9600b) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        StringBuilder sbS = g1.a.s(string);
                        sbS.append(((u.i) this.f9600b).f17502t[i10]);
                        sbS.append(" ");
                        string = sbS.toString();
                    }
                }
                StringBuilder sbK = l.a0.k(string, "] ");
                sbK.append((u.i) this.f9600b);
                return sbK.toString();
            default:
                return super.toString();
        }
    }

    public final boolean u(int i10, boolean z9) {
        return ((TypedArray) this.f9601d).getBoolean(i10, z9);
    }

    public final ColorStateList v(int i10) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!((TypedArray) this.f9601d).hasValue(i10) || (resourceId = ((TypedArray) this.f9601d).getResourceId(i10, 0)) == 0 || (colorStateListC = d0.f.c((Context) this.f9600b, resourceId)) == null) ? ((TypedArray) this.f9601d).getColorStateList(i10) : colorStateListC;
    }

    public final int w(int i10, int i11) {
        return ((TypedArray) this.f9601d).getDimensionPixelOffset(i10, i11);
    }

    public final int x(int i10, int i11) {
        return ((TypedArray) this.f9601d).getDimensionPixelSize(i10, i11);
    }

    public final Drawable y(int i10) {
        int resourceId;
        return (!((TypedArray) this.f9601d).hasValue(i10) || (resourceId = ((TypedArray) this.f9601d).getResourceId(i10, 0)) == 0) ? ((TypedArray) this.f9601d).getDrawable(i10) : p7.q.g((Context) this.f9600b, resourceId);
    }

    public final Drawable z(int i10) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f9601d).hasValue(i10) || (resourceId = ((TypedArray) this.f9601d).getResourceId(i10, 0)) == 0) {
            return null;
        }
        l.v vVarA = l.v.a();
        Context context = (Context) this.f9600b;
        synchronized (vVarA) {
            drawableG = vVarA.f15031a.g(context, resourceId, true);
        }
        return drawableG;
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final int zza() {
        return ((long[]) this.f9602f).length;
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final long zzb(int i10) {
        tc1.K(i10 >= 0);
        tc1.K(i10 < ((long[]) this.f9602f).length);
        return ((long[]) this.f9602f)[i10];
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzd(MediationNativeAdapter mediationNativeAdapter, hj hjVar) {
        String strZzi;
        z3.a.j("#008 Must be called on the main UI thread.");
        hjVar.getClass();
        try {
            strZzi = hjVar.f5309a.zzi();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            strZzi = null;
        }
        zzm.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(strZzi)));
        this.f9602f = hjVar;
        try {
            ((wn) this.f9600b).zzo();
        } catch (RemoteException e11) {
            zzm.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zze(MediationNativeAdapter mediationNativeAdapter, hj hjVar, String str) {
        try {
            ((wn) this.f9600b).y0(hjVar.f5309a, str);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public ur0(pg pgVar, Context context, Uri uri) {
        this.f9599a = 17;
        this.f9601d = pgVar;
        this.f9600b = context;
        this.f9602f = uri;
    }

    public ur0(wn wnVar) {
        this.f9599a = 27;
        this.f9600b = wnVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdClicked.");
        try {
            ((wn) this.f9600b).zze();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdClosed.");
        try {
            ((wn) this.f9600b).zzf();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i10) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdFailedToLoad with error. " + i10);
        try {
            ((wn) this.f9600b).c(i10);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdLeftApplication.");
        try {
            ((wn) this.f9600b).zzn();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdLoaded.");
        try {
            ((wn) this.f9600b).zzo();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdOpened.");
        try {
            ((wn) this.f9600b).zzp();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public /* synthetic */ ur0(Comparable comparable, Object obj, Object obj2) {
        this.f9599a = 9;
        this.f9600b = comparable;
        this.f9601d = obj;
        this.f9602f = obj2;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAppEvent.");
        try {
            ((wn) this.f9600b).u0(str, str2);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public /* synthetic */ ur0(Object obj, int i10, Object obj2) {
        this.f9599a = i10;
        this.f9600b = obj;
        this.f9601d = obj2;
    }

    public /* synthetic */ ur0(Object obj, Object obj2, Object obj3, int i10) {
        this.f9599a = i10;
        this.f9602f = obj;
        this.f9600b = obj2;
        this.f9601d = obj3;
    }

    public ur0(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.f9599a = 25;
        z3.a.l(context);
        z3.a.l(onH5AdsEventListener);
        this.f9600b = context;
        this.f9601d = onH5AdsEventListener;
        eg.a(context);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdClicked.");
        try {
            ((wn) this.f9600b).zze();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdClosed.");
        try {
            ((wn) this.f9600b).zzf();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzm.zze("Custom event adapter called onFailedToReceiveAd.");
        ((MediationInterstitialListener) this.f9601d).onAdFailedToLoad((CustomEventAdapter) this.f9600b, adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdLeftApplication.");
        try {
            ((wn) this.f9600b).zzn();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdLoaded.");
        try {
            ((wn) this.f9600b).zzo();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdOpened.");
        try {
            ((wn) this.f9600b).zzp();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            ((wn) this.f9600b).X(adError.zza());
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public ur0(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.f9599a = 0;
        this.f9602f = new AtomicReference();
        this.f9600b = context;
        this.f9601d = zzclVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) this.f9601d;
        if (((hj) this.f9602f) == null) {
            if (unifiedNativeAdMapper == null) {
                zzm.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzm.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzm.zze("Adapter called onAdClicked.");
        try {
            ((wn) this.f9600b).zze();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdClosed.");
        try {
            ((wn) this.f9600b).zzf();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdLeftApplication.");
        try {
            ((wn) this.f9600b).zzn();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdLoaded.");
        this.f9601d = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zzb(new fo());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zze(videoController);
            }
        }
        try {
            ((wn) this.f9600b).zzo();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdOpened.");
        try {
            ((wn) this.f9600b).zzp();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public ur0(i0 i0Var, a4 a4Var) {
        this.f9599a = 20;
        this.f9600b = i0Var;
        this.f9601d = a4Var;
        this.f9602f = new SparseArray();
    }

    public ur0(String str) {
        this.f9599a = 22;
        q0 q0Var = new q0();
        q0Var.f(str);
        this.f9600b = new y1(q0Var);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.f9599a) {
            case 26:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 27:
            default:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 28:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }

    public ur0(String str, w3.b bVar, c2.n nVar) {
        this.f9599a = 19;
        this.f9602f = str;
        this.f9600b = bVar;
        this.f9601d = nVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            ((wn) this.f9600b).c(i10);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public ur0(ArrayList arrayList) {
        this.f9599a = 21;
        this.f9600b = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f9601d = new long[size + size];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d5 d5Var = (d5) arrayList.get(i10);
            long[] jArr = (long[]) this.f9601d;
            int i11 = i10 + i10;
            jArr[i11] = d5Var.f3568b;
            jArr[i11 + 1] = d5Var.f3569c;
        }
        long[] jArr2 = (long[]) this.f9601d;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f9602f = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            ((wn) this.f9600b).X(adError.zza());
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public ur0(n1.p pVar) {
        this.f9599a = 14;
        this.f9600b = pVar;
        this.f9601d = new l2.b(this, pVar, 2);
        this.f9602f = new l2.h(this, pVar, 2);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i10) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            ((wn) this.f9600b).c(i10);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public ur0(ExecutorService executorService) {
        this.f9599a = 15;
        this.f9601d = new Handler(Looper.getMainLooper());
        this.f9602f = new r2.e(2, this);
        this.f9600b = new m2.i(executorService);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        z3.a.j("#008 Must be called on the main UI thread.");
        zzm.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            ((wn) this.f9600b).X(adError.zza());
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    public ur0(androidx.lifecycle.q qVar) {
        this.f9599a = 10;
        this.f9600b = new androidx.lifecycle.s(qVar);
        this.f9601d = new Handler();
    }

    public ur0(u.g gVar, u.g gVar2) {
        this.f9599a = 6;
        this.f9602f = gVar;
        this.f9601d = gVar2;
    }

    public ur0(androidx.lifecycle.n0 n0Var, androidx.lifecycle.m0 m0Var, c1.b bVar) {
        this.f9599a = 11;
        g4.a0.f(n0Var, "store");
        g4.a0.f(bVar, "defaultCreationExtras");
        this.f9600b = n0Var;
        this.f9601d = m0Var;
        this.f9602f = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur0(androidx.lifecycle.n0 n0Var, androidx.lifecycle.m0 m0Var, int i10) {
        this(n0Var, m0Var, c1.a.f1497b);
        this.f9599a = 11;
    }

    public ur0(Runnable runnable) {
        this.f9599a = 8;
        this.f9601d = new CopyOnWriteArrayList();
        this.f9602f = new HashMap();
        this.f9600b = runnable;
    }

    public ur0(Context context, LocationManager locationManager) {
        this.f9599a = 4;
        this.f9602f = new f.a1();
        this.f9600b = context;
        this.f9601d = locationManager;
    }

    public ur0(w.e eVar) {
        this.f9599a = 7;
        this.f9600b = new ArrayList();
        this.f9601d = new x.b();
        this.f9602f = eVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ur0(androidx.lifecycle.o0 o0Var, c1.c cVar) {
        c1.b bVarD;
        this.f9599a = 11;
        androidx.lifecycle.n0 n0VarF = o0Var.f();
        g4.a0.e(n0VarF, "owner.viewModelStore");
        if (o0Var instanceof androidx.lifecycle.h) {
            bVarD = ((androidx.lifecycle.h) o0Var).d();
            g4.a0.e(bVarD, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        } else {
            bVarD = c1.a.f1497b;
        }
        this(n0VarF, cVar, bVarD);
    }

    public ur0() {
        this.f9599a = 13;
        this.f9600b = Collections.emptyList();
        this.f9601d = Collections.emptyList();
    }

    public ur0(Toolbar toolbar) {
        this.f9599a = 1;
        this.f9600b = toolbar;
        this.f9601d = toolbar.getNavigationIcon();
        this.f9602f = toolbar.getNavigationContentDescription();
    }
}
