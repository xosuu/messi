package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class n80 implements k40, f70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kt f7190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7191b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mt f7192d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f7193f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f7194h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final md f7195q;

    public n80(kt ktVar, Context context, mt mtVar, WebView webView, md mdVar) {
        this.f7190a = ktVar;
        this.f7191b = context;
        this.f7192d = mtVar;
        this.f7193f = webView;
        this.f7195q = mdVar;
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void n(as asVar, String str, String str2) {
        mt mtVar = this.f7192d;
        if (mtVar.g(this.f7191b)) {
            try {
                Context context = this.f7191b;
                mtVar.f(context, mtVar.a(context), this.f7190a.f6387d, ((yr) asVar).f11020a, ((yr) asVar).f11021b);
            } catch (RemoteException e10) {
                zzm.zzk("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zza() {
        this.f7190a.a(false);
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzc() {
        View view = this.f7193f;
        if (view != null && this.f7194h != null) {
            Context context = view.getContext();
            String str = this.f7194h;
            mt mtVar = this.f7192d;
            if (mtVar.g(context) && (context instanceof Activity)) {
                AtomicReference atomicReference = mtVar.f7050g;
                if (mtVar.n(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = mtVar.f7051h;
                    Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (declaredMethod == null) {
                        try {
                            declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", declaredMethod);
                        } catch (Exception unused) {
                            mtVar.m("setCurrentScreen", false);
                            declaredMethod = null;
                        }
                    }
                    try {
                        declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        mtVar.m("setCurrentScreen", false);
                    }
                }
            }
        }
        this.f7190a.a(true);
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.f70
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.f70
    public final void zzl() {
        md mdVar = md.APP_OPEN;
        md mdVar2 = this.f7195q;
        if (mdVar2 == mdVar) {
            return;
        }
        mt mtVar = this.f7192d;
        Context context = this.f7191b;
        boolean zG = mtVar.g(context);
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (zG) {
            AtomicReference atomicReference = mtVar.f7049f;
            if (mtVar.n(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str2 = (String) mtVar.j(context, "getCurrentScreenName").invoke(atomicReference.get(), new Object[0]);
                    if (str2 == null) {
                        str2 = (String) mtVar.j(context, "getCurrentScreenClass").invoke(atomicReference.get(), new Object[0]);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (Exception unused) {
                    mtVar.m("getCurrentScreenName", false);
                }
            }
        }
        this.f7194h = str;
        this.f7194h = String.valueOf(str).concat(mdVar2 == md.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
