package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.ew0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.jasypt.digest.StandardStringDigester;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class px extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, fx {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f7981n0 = 0;
    public zzm A;
    public zh0 B;
    public yh0 C;
    public b4.c D;
    public final String E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public Boolean J;
    public boolean K;
    public final String L;
    public rx M;
    public boolean N;
    public boolean O;
    public gi P;
    public ei Q;
    public mc R;
    public int S;
    public int T;
    public jg U;
    public final jg V;
    public jg W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cy f7982a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final p80 f7983a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y9 f7984b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f7985b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public zzm f7986c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pr0 f7987d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f7988d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final zzck f7989e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ug f7990f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f7991f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f7992g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final VersionInfoParcel f7993h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f7994h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f7995i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public HashMap f7996j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final WindowManager f7997k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final kd f7998l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f7999m0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.google.android.gms.ads.internal.zzm f8000q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zza f8001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DisplayMetrics f8002t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f8003u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public fr0 f8004v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hr0 f8005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8006x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8007y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ix f8008z;

    public px(cy cyVar, b4.c cVar, String str, boolean z9, y9 y9Var, ug ugVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zzm zzmVar, zza zzaVar, kd kdVar, fr0 fr0Var, hr0 hr0Var, pr0 pr0Var) {
        hr0 hr0Var2;
        String str2;
        super(cyVar);
        this.f8006x = false;
        this.f8007y = false;
        this.K = true;
        this.L = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f7991f0 = -1;
        this.f7992g0 = -1;
        this.f7994h0 = -1;
        this.f7995i0 = -1;
        this.f7982a = cyVar;
        this.D = cVar;
        this.E = str;
        this.H = z9;
        this.f7984b = y9Var;
        this.f7987d = pr0Var;
        this.f7990f = ugVar;
        this.f7993h = versionInfoParcel;
        this.f8000q = zzmVar;
        this.f8001s = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f7997k0 = windowManager;
        zzu.zzp();
        DisplayMetrics displayMetricsZzt = zzt.zzt(windowManager);
        this.f8002t = displayMetricsZzt;
        this.f8003u = displayMetricsZzt.density;
        this.f7998l0 = kdVar;
        this.f8004v = fr0Var;
        this.f8005w = hr0Var;
        this.f7989e0 = new zzck(cyVar.f3465a, this, this, null);
        this.f7999m0 = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) zzba.zzc().a(eg.Ja)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(zzu.zzp().zzc(cyVar, versionInfoParcel.afmaVersion));
        zzu.zzp();
        final Context context = getContext();
        zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ew0 ew0Var = zzt.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.C0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        E0();
        addJavascriptInterface(new tx(this, new sx(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        p80 p80Var = this.f7983a0;
        if (p80Var != null) {
            lg lgVar = (lg) p80Var.f7835d;
            jt jtVarC = zzu.zzo().c();
            if (jtVarC != null) {
                ((BlockingQueue) jtVarC.f6072a).offer(lgVar);
            }
        }
        p80 p80Var2 = new p80(new lg(this.E));
        this.f7983a0 = p80Var2;
        synchronized (((lg) p80Var2.f7835d).f6605c) {
        }
        if (((Boolean) zzba.zzc().a(eg.G1)).booleanValue() && (hr0Var2 = this.f8005w) != null && (str2 = hr0Var2.f5371b) != null) {
            ((lg) p80Var2.f7835d).b("gqi", str2);
        }
        jg jgVarD = lg.d();
        this.V = jgVarD;
        ((Map) p80Var2.f7834b).put("native:view_create", jgVarD);
        this.W = null;
        this.U = null;
        zzcg.zza().zzb(cyVar);
        zzu.zzo().f5063j.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized boolean A() {
        return this.G;
    }

    public final /* synthetic */ void A0() {
        super.loadUrl("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void B(zzc zzcVar, boolean z9, boolean z10) {
        this.f8008z.A0(zzcVar, z9, z10);
    }

    public final synchronized void B0(String str) {
        if (A()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void C(boolean z9, int i10, String str, boolean z10, boolean z11) {
        ix ixVar = this.f8008z;
        fx fxVar = ixVar.f5709a;
        boolean zQ = fxVar.Q();
        boolean zU = ix.U(zQ, fxVar);
        boolean z12 = true;
        if (!zU && z10) {
            z12 = false;
        }
        ixVar.B0(new AdOverlayInfoParcel(zU ? null : ixVar.f5713h, zQ ? null : new hx(fxVar, ixVar.f5714q), ixVar.f5717u, ixVar.f5718v, ixVar.F, fxVar, z9, i10, str, fxVar.zzn(), z12 ? null : ixVar.f5719w, (fxVar.i() == null || !fxVar.i().f4617i0) ? null : ixVar.P, z11));
    }

    public final void C0(Boolean bool) {
        synchronized (this) {
            this.J = bool;
        }
        zzu.zzo().k(bool);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void D(boolean z9) {
        this.f8008z.N = z9;
    }

    public final boolean D0() {
        int iZzw;
        int iZzw2;
        if (this.f8008z.t() || this.f8008z.z()) {
            zzay.zzb();
            DisplayMetrics displayMetrics = this.f8002t;
            int iZzw3 = zzf.zzw(displayMetrics, displayMetrics.widthPixels);
            zzay.zzb();
            int iZzw4 = zzf.zzw(displayMetrics, displayMetrics.heightPixels);
            Activity activity = this.f7982a.f3465a;
            if (activity == null || activity.getWindow() == null) {
                iZzw = iZzw3;
                iZzw2 = iZzw4;
            } else {
                zzu.zzp();
                int[] iArrZzQ = zzt.zzQ(activity);
                zzay.zzb();
                iZzw = zzf.zzw(displayMetrics, iArrZzQ[0]);
                zzay.zzb();
                iZzw2 = zzf.zzw(displayMetrics, iArrZzQ[1]);
            }
            int i10 = this.f7992g0;
            if (i10 != iZzw3 || this.f7991f0 != iZzw4 || this.f7994h0 != iZzw || this.f7995i0 != iZzw2) {
                boolean z9 = (i10 == iZzw3 && this.f7991f0 == iZzw4) ? false : true;
                this.f7992g0 = iZzw3;
                this.f7991f0 = iZzw4;
                this.f7994h0 = iZzw;
                this.f7995i0 = iZzw2;
                new p80(this, 10, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).i(iZzw3, iZzw4, iZzw, iZzw2, displayMetrics.density, this.f7997k0.getDefaultDisplay().getRotation());
                return z9;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hm
    public final void E(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbL = l.a0.l("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat(sbL.toString()));
        x0(sbL.toString());
    }

    public final synchronized void E0() {
        fr0 fr0Var = this.f8004v;
        if (fr0Var != null && fr0Var.f4625m0) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Disabling hardware acceleration on an overlay.");
            G0();
            return;
        }
        if (!this.H && !this.D.b()) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Enabling hardware acceleration on an AdView.");
            I0();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Enabling hardware acceleration on an overlay.");
        I0();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void F() {
        setBackgroundColor(0);
    }

    public final synchronized void F0() {
        if (this.f7988d0) {
            return;
        }
        this.f7988d0 = true;
        zzu.zzo().f5063j.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void G(Context context) {
        cy cyVar = this.f7982a;
        cyVar.setBaseContext(context);
        this.f7989e0.zze(cyVar.f3465a);
    }

    public final synchronized void G0() {
        try {
            if (!this.I) {
                setLayerType(1, null);
            }
            this.I = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final boolean H(int i10, boolean z9) {
        destroy();
        c8.a aVar = new c8.a();
        aVar.f1584b = z9;
        aVar.f1583a = i10;
        kd kdVar = this.f7998l0;
        kdVar.a(aVar);
        kdVar.b(10003);
        return true;
    }

    public final void H0(boolean z9) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z9 ? "0" : "1");
        j("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized gi I() {
        return this.P;
    }

    public final synchronized void I0() {
        try {
            if (this.I) {
                setLayerType(0, null);
            }
            this.I = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void J() {
        this.f8008z.f5720x = false;
    }

    public final synchronized void J0() {
        try {
            if (((Boolean) zzba.zzc().a(eg.qa)).booleanValue()) {
                zzt.zza.post(new ox(this, "about:blank", 0));
            } else {
                super.loadUrl("about:blank");
            }
        } catch (Throwable th) {
            zzu.zzo().i("AdWebViewImpl.loadUrlUnsafe", th);
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized boolean K() {
        return this.F;
    }

    public final synchronized void K0() {
        try {
            HashMap map = this.f7996j0;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((lw) it.next()).i();
                }
            }
            this.f7996j0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void L() {
        ix ixVar = this.f8008z;
        if (ixVar != null) {
            ixVar.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void M(String str, wk wkVar) {
        ix ixVar = this.f8008z;
        if (ixVar != null) {
            synchronized (ixVar.f5712f) {
                try {
                    List list = (List) ixVar.f5711d.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(wkVar);
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void N() {
        this.f7989e0.zzb();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized String O() {
        return this.L;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void P(boolean z9) {
        try {
            boolean z10 = this.H;
            this.H = z9;
            E0();
            if (z9 != z10) {
                if (((Boolean) zzba.zzc().a(eg.J)).booleanValue()) {
                    if (!this.D.b()) {
                    }
                }
                try {
                    E(new JSONObject().put("state", true != z9 ? "default" : "expanded"), "onStateChanged");
                } catch (JSONException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching state change.", e10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized boolean Q() {
        return this.H;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void R() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void T(JSONObject jSONObject, String str) {
        a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void U(int i10) {
        this.f7985b0 = i10;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void V() {
        ix ixVar = this.f8008z;
        if (ixVar != null) {
            ixVar.V();
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void W(int i10) {
        p80 p80Var = this.f7983a0;
        jg jgVar = this.V;
        if (i10 == 0) {
            y3.c.i((lg) p80Var.f7835d, jgVar, "aebb2");
        }
        y3.c.i((lg) p80Var.f7835d, jgVar, "aeh2");
        p80Var.getClass();
        ((lg) p80Var.f7835d).b("close_type", String.valueOf(i10));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i10));
        map.put("version", this.f7993h.afmaVersion);
        j("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void X() {
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized boolean Y() {
        return this.S > 0;
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final void Z(vb vbVar) {
        boolean z9;
        synchronized (this) {
            z9 = vbVar.f9827j;
            this.N = z9;
        }
        H0(z9);
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void a(String str, String str2) {
        x0(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void a0() {
        this.f7999m0 = true;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void b() {
        ei eiVar = this.Q;
        if (eiVar != null) {
            zzt.zza.post(new s9(29, (jb0) eiVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void b0(zzm zzmVar) {
        this.A = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final synchronized void c(rx rxVar) {
        if (this.M != null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.M = rxVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final boolean c0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.xx
    public final View d() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized String d0() {
        return this.E;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fx
    public final synchronized void destroy() {
        try {
            p80 p80Var = this.f7983a0;
            if (p80Var != null) {
                lg lgVar = (lg) p80Var.f7835d;
                jt jtVarC = zzu.zzo().c();
                if (jtVarC != null) {
                    ((BlockingQueue) jtVarC.f6072a).offer(lgVar);
                }
            }
            this.f7989e0.zza();
            zzm zzmVar = this.A;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.A.zzm();
                this.A = null;
            }
            this.B = null;
            this.C = null;
            this.f8008z.w0();
            this.R = null;
            this.f8000q = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.G) {
                return;
            }
            zzu.zzy().b(this);
            K0();
            this.G = true;
            if (!((Boolean) zzba.zzc().a(eg.S9)).booleanValue()) {
                zze.zza("Destroying the WebView immediately...");
                zzX();
            } else {
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                J0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final synchronized b4.c e() {
        return this.D;
    }

    public final synchronized Boolean e0() {
        return this.J;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (A()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) zzba.zzc().a(eg.T9)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            nu.f7387e.a(new l0.a(this, str, valueCallback, 15, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final synchronized void f(String str, lw lwVar) {
        try {
            if (this.f7996j0 == null) {
                this.f7996j0 = new HashMap();
            }
            this.f7996j0.put(str, lwVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void f0(wp0 wp0Var) {
        this.R = wp0Var;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.G) {
                        this.f8008z.w0();
                        zzu.zzy().b(this);
                        K0();
                        F0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final /* synthetic */ ix g() {
        return this.f8008z;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void g0(boolean z9) {
        zzm zzmVar;
        int i10 = this.S + (true != z9 ? -1 : 1);
        this.S = i10;
        if (i10 > 0 || (zzmVar = this.A) == null) {
            return;
        }
        zzmVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized lw h(String str) {
        HashMap map = this.f7996j0;
        if (map == null) {
            return null;
        }
        return (lw) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void h0(int i10, String str, String str2, boolean z9, boolean z10) {
        ix ixVar = this.f8008z;
        fx fxVar = ixVar.f5709a;
        boolean zQ = fxVar.Q();
        boolean zU = ix.U(zQ, fxVar);
        boolean z11 = true;
        if (!zU && z10) {
            z11 = false;
        }
        ixVar.B0(new AdOverlayInfoParcel(zU ? null : ixVar.f5713h, zQ ? null : new hx(fxVar, ixVar.f5714q), ixVar.f5717u, ixVar.f5718v, ixVar.F, fxVar, z9, i10, str, str2, fxVar.zzn(), z11 ? null : ixVar.f5719w, (fxVar.i() == null || !fxVar.i().f4617i0) ? null : ixVar.P));
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final fr0 i() {
        return this.f8004v;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void i0(p80 p80Var) {
        this.P = p80Var;
    }

    @Override // com.google.android.gms.internal.ads.hm
    public final void j(String str, Map map) {
        try {
            E(zzay.zzb().zzj(map), str);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void j0(jb0 jb0Var) {
        this.Q = jb0Var;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void k(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void k0(zh0 zh0Var) {
        this.B = zh0Var;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void l(boolean z9) {
        if (z9) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        zzm zzmVar = this.A;
        if (zzmVar != null) {
            zzmVar.zzB(z9);
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void l0(String str, wk wkVar) {
        ix ixVar = this.f8008z;
        if (ixVar != null) {
            ixVar.a(str, wkVar);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fx
    public final synchronized void loadData(String str, String str2, String str3) {
        if (A()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fx
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (A()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fx
    public final synchronized void loadUrl(String str) {
        if (A()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            if (((Boolean) zzba.zzc().a(eg.qa)).booleanValue()) {
                zzt.zza.post(new ox(this, str, 1));
            } else {
                super.loadUrl(str);
            }
        } catch (Throwable th) {
            zzu.zzo().i("AdWebViewImpl.loadUrl", th);
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized mc m() {
        return this.R;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void m0(String str, String str2) {
        ix ixVar = this.f8008z;
        qh0 qh0Var = ixVar.P;
        fx fxVar = ixVar.f5709a;
        ixVar.B0(new AdOverlayInfoParcel(fxVar, fxVar.zzn(), str, str2, 14, qh0Var));
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void n0() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void o(boolean z9) {
        this.K = z9;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final ArrayList o0() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        ix ixVar = this.f8008z;
        if (ixVar != null) {
            ixVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!A()) {
                this.f7989e0.zzc();
            }
            if (this.f7999m0) {
                onResume();
                this.f7999m0 = false;
            }
            boolean z9 = this.N;
            ix ixVar = this.f8008z;
            if (ixVar != null && ixVar.z()) {
                if (!this.O) {
                    this.f8008z.X();
                    this.f8008z.Z();
                    this.O = true;
                }
                D0();
                z9 = true;
            }
            H0(z9);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ix ixVar;
        synchronized (this) {
            try {
                if (!A()) {
                    this.f7989e0.zzd();
                }
                super.onDetachedFromWindow();
                if (this.O && (ixVar = this.f8008z) != null && ixVar.z() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f8008z.X();
                    this.f8008z.Z();
                    this.O = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        H0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) zzba.zzc().a(eg.ea)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            zzu.zzp();
            zzt.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            zzu.zzo().i("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (A()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zD0 = D0();
        zzm zzmVarS = s();
        if (zzmVarS == null || !zD0) {
            return;
        }
        zzmVarS.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.px.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fx
    public final void onPause() {
        if (A()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) zzba.zzc().a(eg.Eb)).booleanValue() && b7.u.t("MUTE_AUDIO")) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Muting webview");
                int i10 = a2.c.f10a;
                if (!b2.n.f1251d.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                b2.o.f1252a.createWebView(this).setAudioMuted(true);
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not pause webview.", e10);
            if (((Boolean) zzba.zzc().a(eg.Hb)).booleanValue()) {
                zzu.zzo().i("AdWebViewImpl.onPause", e10);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fx
    public final void onResume() {
        if (A()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) zzba.zzc().a(eg.Eb)).booleanValue() && b7.u.t("MUTE_AUDIO")) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Unmuting webview");
                int i10 = a2.c.f10a;
                if (!b2.n.f1251d.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                b2.o.f1252a.createWebView(this).setAudioMuted(false);
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not resume webview.", e10);
            if (((Boolean) zzba.zzc().a(eg.Hb)).booleanValue()) {
                zzu.zzo().i("AdWebViewImpl.onResume", e10);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f8008z.z() && !this.f8008z.n()) {
            synchronized (this) {
                gi giVar = this.P;
                if (giVar != null) {
                    p80 p80Var = (p80) giVar;
                    switch (p80Var.f7833a) {
                        case 20:
                            ((ga0) p80Var.f7834b).onTouch(null, motionEvent);
                            break;
                    }
                }
            }
        } else {
            y9 y9Var = this.f7984b;
            if (y9Var != null) {
                y9Var.f10801b.zzk(motionEvent);
            }
            ug ugVar = this.f7990f;
            if (ugVar != null) {
                if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > ugVar.f9469a.getEventTime()) {
                    ugVar.f9469a = MotionEvent.obtain(motionEvent);
                } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > ugVar.f9470b.getEventTime()) {
                    ugVar.f9470b = MotionEvent.obtain(motionEvent);
                }
            }
        }
        if (A()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void p(fr0 fr0Var, hr0 hr0Var) {
        this.f8004v = fr0Var;
        this.f8005w = hr0Var;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void p0(boolean z9) {
        zzm zzmVar = this.A;
        if (zzmVar != null) {
            zzmVar.zzy(this.f8008z.t(), z9);
        } else {
            this.F = z9;
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final WebView q() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void q0(zzm zzmVar) {
        this.f7986c0 = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void r(int i10, boolean z9, boolean z10) {
        ix ixVar = this.f8008z;
        fx fxVar = ixVar.f5709a;
        boolean zU = ix.U(fxVar.Q(), fxVar);
        boolean z11 = true;
        if (!zU && z10) {
            z11 = false;
        }
        ixVar.B0(new AdOverlayInfoParcel(zU ? null : ixVar.f5713h, ixVar.f5714q, ixVar.F, fxVar, z9, i10, fxVar.zzn(), z11 ? null : ixVar.f5719w, (fxVar.i() == null || !fxVar.i().f4617i0) ? null : ixVar.P));
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void r0() {
        if (this.W == null) {
            p80 p80Var = this.f7983a0;
            p80Var.getClass();
            jg jgVarD = lg.d();
            this.W = jgVarD;
            ((Map) p80Var.f7834b).put("native:view_load", jgVarD);
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized zzm s() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void s0(String str, String str2) {
        String str3;
        try {
            if (A()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
                return;
            }
            String[] strArr = new String[1];
            String str4 = (String) zzba.zzc().a(eg.I);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str4);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to build MRAID_ENV", e10);
                str3 = null;
            }
            strArr[0] = str3;
            super.loadDataWithBaseURL(str, wx.b(str2, strArr), "text/html", StandardStringDigester.MESSAGE_CHARSET, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.fx
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof ix) {
            this.f8008z = (ix) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (A()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not stop loading webview.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void t(long j10, boolean z9) {
        HashMap map = new HashMap(2);
        map.put("success", true != z9 ? "0" : "1");
        map.put("duration", Long.toString(j10));
        j("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void t0(b4.c cVar) {
        this.D = cVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized zzm u() {
        return this.f7986c0;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized boolean u0() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void v(int i10) {
        zzm zzmVar = this.A;
        if (zzmVar != null) {
            zzmVar.zzA(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final y9 w() {
        return this.f7984b;
    }

    public final synchronized void w0(String str) {
        if (A()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void x(String str, i10 i10Var) {
        ix ixVar = this.f8008z;
        if (ixVar != null) {
            synchronized (ixVar.f5712f) {
                try {
                    List<wk> list = (List) ixVar.f5711d.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (wk wkVar : list) {
                        wk wkVar2 = wkVar;
                        if (wkVar2 instanceof km) {
                            if (((km) wkVar2).f6326a.equals((wk) i10Var.f5456b)) {
                                arrayList.add(wkVar);
                            }
                        }
                    }
                    list.removeAll(arrayList);
                } finally {
                }
            }
        }
    }

    public final void x0(String str) {
        if (e0() == null) {
            synchronized (this) {
                Boolean boolF = zzu.zzo().f();
                this.J = boolF;
                if (boolF == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        C0(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        C0(Boolean.FALSE);
                    }
                }
            }
        }
        if (e0().booleanValue()) {
            w0(str);
        } else {
            B0("javascript:".concat(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void y(yh0 yh0Var) {
        this.C = yh0Var;
    }

    public final /* synthetic */ void y0(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void z0(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final Context zzE() {
        return this.f7982a.f3467c;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final WebViewClient zzH() {
        return this.f8008z;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized yh0 zzP() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized zh0 zzQ() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final hr0 zzR() {
        return this.f8005w;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final pr0 zzS() {
        return this.f7987d;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final n5.a zzT() {
        ug ugVar = this.f7990f;
        return ugVar == null ? tc1.d0(null) : (h21) tc1.r0(h21.r(tc1.d0(null)), ((Long) kh.f6284c.k()).longValue(), TimeUnit.MILLISECONDS, ugVar.f9471c);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void zzX() {
        zze.zza("Destroying WebView!");
        F0();
        zzt.zza.post(new s9(18, this));
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void zzY() {
        y3.c.i((lg) this.f7983a0.f7835d, this.V, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.f7993h.afmaVersion);
        j("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void zzaa() {
        if (this.U == null) {
            p80 p80Var = this.f7983a0;
            y3.c.i((lg) p80Var.f7835d, this.V, "aes2");
            jg jgVarD = lg.d();
            this.U = jgVarD;
            ((Map) p80Var.f7834b).put("native:view_show", jgVarD);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f7993h.afmaVersion);
        j("onshow", map);
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdg() {
        com.google.android.gms.ads.internal.zzm zzmVar = this.f8000q;
        if (zzmVar != null) {
            zzmVar.zzdg();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdh() {
        com.google.android.gms.ads.internal.zzm zzmVar = this.f8000q;
        if (zzmVar != null) {
            zzmVar.zzdh();
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized int zzf() {
        return this.f7985b0;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.ux, com.google.android.gms.internal.ads.pv
    public final Activity zzi() {
        return this.f7982a.f3465a;
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final zza zzj() {
        return this.f8001s;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final jg zzk() {
        return this.V;
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final p80 zzm() {
        return this.f7983a0;
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final VersionInfoParcel zzn() {
        return this.f7993h;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final xq zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fx, com.google.android.gms.internal.ads.pv
    public final synchronized rx zzq() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized String zzr() {
        hr0 hr0Var = this.f8005w;
        if (hr0Var == null) {
            return null;
        }
        return hr0Var.f5371b;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final void zzu() {
        zzm zzmVarS = s();
        if (zzmVarS != null) {
            zzmVarS.zzd();
        }
    }
}
