package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ix extends WebViewClient implements zza, q70 {
    public static final /* synthetic */ int R = 0;
    public boolean C;
    public boolean D;
    public boolean E;
    public zzaa F;
    public np G;
    public zzb H;
    public dt J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean N;
    public final qh0 P;
    public gx Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx f5709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd f5710b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zza f5713h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public zzp f5714q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public yx f5715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ay f5716t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public pk f5717u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public qk f5718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q70 f5719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5721y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f5711d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5712f = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5722z = 0;
    public String A = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String B = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public kp I = null;
    public final HashSet O = new HashSet(Arrays.asList(((String) zzba.zzc().a(eg.f3950b5)).split(",")));

    public ix(fx fxVar, kd kdVar, boolean z9, np npVar, qh0 qh0Var) {
        this.f5710b = kdVar;
        this.f5709a = fxVar;
        this.C = z9;
        this.G = npVar;
        this.P = qh0Var;
    }

    public static WebResourceResponse J() {
        if (((Boolean) zzba.zzc().a(eg.B0)).booleanValue()) {
            return new WebResourceResponse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean U(boolean z9, fx fxVar) {
        return (!z9 || fxVar.e().b() || fxVar.d0().equals("interstitial_mb")) ? false : true;
    }

    public final void A0(zzc zzcVar, boolean z9, boolean z10) {
        fx fxVar = this.f5709a;
        boolean zQ = fxVar.Q();
        boolean z11 = U(zQ, fxVar) || z10;
        B0(new AdOverlayInfoParcel(zzcVar, z11 ? null : this.f5713h, zQ ? null : this.f5714q, this.F, fxVar.zzn(), fxVar, z11 || !z9 ? null : this.f5719w));
    }

    public final void B0(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        kp kpVar = this.I;
        if (kpVar != null) {
            synchronized (kpVar.f6360x) {
                z = kpVar.E != null;
            }
        }
        zzu.zzi();
        zzn.zza(this.f5709a.getContext(), adOverlayInfoParcel, !z);
        dt dtVar = this.J;
        if (dtVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            ((ct) dtVar).c(str);
        }
    }

    public final void E(zza zzaVar, pk pkVar, zzp zzpVar, qk qkVar, zzaa zzaaVar, boolean z9, yk ykVar, zzb zzbVar, i10 i10Var, dt dtVar, lh0 lh0Var, vt0 vt0Var, ed0 ed0Var, xk xkVar, q70 q70Var, ok okVar, ok okVar2, xk xkVar2, n00 n00Var) {
        fx fxVar = this.f5709a;
        zzb zzbVar2 = zzbVar == null ? new zzb(fxVar.getContext(), dtVar, null) : zzbVar;
        this.I = new kp(fxVar, i10Var);
        this.J = dtVar;
        int i10 = 0;
        if (((Boolean) zzba.zzc().a(eg.I0)).booleanValue()) {
            a("/adMetadata", new ok(i10, pkVar));
        }
        int i11 = 1;
        if (qkVar != null) {
            a("/appEvent", new ok(i11, qkVar));
        }
        a("/backButton", vk.f9886j);
        a("/refresh", vk.f9887k);
        a("/canOpenApp", vk.f9878b);
        a("/canOpenURLs", vk.f9877a);
        a("/canOpenIntents", vk.f9879c);
        a("/close", vk.f9880d);
        a("/customClose", vk.f9881e);
        a("/instrument", vk.f9890n);
        a("/delayPageLoaded", vk.f9892p);
        a("/delayPageClosed", vk.f9893q);
        a("/getLocationInfo", vk.f9894r);
        a("/log", vk.f9883g);
        a("/mraid", new zk(zzbVar2, this.I, i10Var));
        np npVar = this.G;
        if (npVar != null) {
            a("/mraidLoaded", npVar);
        }
        int i12 = 0;
        zzb zzbVar3 = zzbVar2;
        a("/open", new cl(zzbVar2, this.I, lh0Var, ed0Var, n00Var));
        a("/precache", new rk(27));
        a("/touch", vk.f9885i);
        a("/video", vk.f9888l);
        a("/videoMeta", vk.f9889m);
        if (lh0Var == null || vt0Var == null) {
            a("/click", new tk(q70Var, i12, n00Var));
            a("/httpTrack", vk.f9882f);
        } else {
            a("/click", new sb0(q70Var, n00Var, vt0Var, lh0Var));
            a("/httpTrack", new tk(vt0Var, 5, lh0Var));
        }
        if (zzu.zzn().g(fxVar.getContext())) {
            Object map = new HashMap();
            if (fxVar.i() != null) {
                map = fxVar.i().f4645w0;
            }
            a("/logScionEvent", new tk(fxVar.getContext(), 1, map));
        }
        if (ykVar != null) {
            a("/setInterstitialProperties", new ok(2, ykVar));
        }
        if (xkVar != null) {
            if (((Boolean) zzba.zzc().a(eg.f3942a8)).booleanValue()) {
                a("/inspectorNetworkExtras", xkVar);
            }
        }
        if (((Boolean) zzba.zzc().a(eg.f4141t8)).booleanValue() && okVar != null) {
            a("/shareSheet", okVar);
        }
        if (((Boolean) zzba.zzc().a(eg.y8)).booleanValue() && okVar2 != null) {
            a("/inspectorOutOfContextTest", okVar2);
        }
        if (((Boolean) zzba.zzc().a(eg.C8)).booleanValue() && xkVar2 != null) {
            a("/inspectorStorage", xkVar2);
        }
        if (((Boolean) zzba.zzc().a(eg.Da)).booleanValue()) {
            a("/bindPlayStoreOverlay", vk.f9897u);
            a("/presentPlayStoreOverlay", vk.f9898v);
            a("/expandPlayStoreOverlay", vk.f9899w);
            a("/collapsePlayStoreOverlay", vk.f9900x);
            a("/closePlayStoreOverlay", vk.f9901y);
        }
        if (((Boolean) zzba.zzc().a(eg.T2)).booleanValue()) {
            a("/setPAIDPersonalizationEnabled", vk.A);
            a("/resetPAID", vk.f9902z);
        }
        if (((Boolean) zzba.zzc().a(eg.Ua)).booleanValue() && fxVar.i() != null && fxVar.i().f4635r0) {
            a("/writeToLocalStorage", vk.B);
            a("/clearLocalStorageKeys", vk.C);
        }
        this.f5713h = zzaVar;
        this.f5714q = zzpVar;
        this.f5717u = pkVar;
        this.f5718v = qkVar;
        this.F = zzaaVar;
        this.H = zzbVar3;
        this.f5719w = q70Var;
        this.f5720x = z9;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void L() {
        q70 q70Var = this.f5719w;
        if (q70Var != null) {
            q70Var.L();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f0, code lost:
    
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.zzu.zzp();
        r15 = r4.getContentType();
        r0 = android.text.TextUtils.isEmpty(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
    
        r2 = com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0102, code lost:
    
        if (r0 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        r6 = com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0106, code lost:
    
        r6 = r15.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
    
        com.google.android.gms.ads.internal.zzu.zzp();
        r15 = r4.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011c, code lost:
    
        if (android.text.TextUtils.isEmpty(r15) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        r15 = r15.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0125, code lost:
    
        if (r15.length != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
    
        if (r0 >= r15.length) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0138, code lost:
    
        if (r15[r0].trim().startsWith("charset") == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013a, code lost:
    
        r1 = r15[r0].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0147, code lost:
    
        if (r1.length <= 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0149, code lost:
    
        r2 = r1[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0150, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0153, code lost:
    
        r15 = r4.getHeaderFields();
        r10 = new java.util.HashMap(r15.size());
        r15 = r15.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016c, code lost:
    
        if (r15.hasNext() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016e, code lost:
    
        r0 = r15.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0178, code lost:
    
        if (r0.getKey() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        if (r0.getValue() == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018a, code lost:
    
        if (r0.getValue().isEmpty() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018c, code lost:
    
        r10.put(r0.getKey(), r0.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a2, code lost:
    
        r6 = com.google.android.gms.ads.internal.zzu.zzq().zzb(r6, r7, r4.getResponseCode(), r4.getResponseMessage(), r10, r4.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse O(java.lang.String r14, java.util.Map r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ix.O(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void S(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((wk) it.next()).b(this.f5709a, map);
        }
    }

    public final void T(View view, dt dtVar, int i10) throws Throwable {
        boolean z9;
        Bitmap bitmapCreateBitmap;
        ct ctVar = (ct) dtVar;
        boolean z10 = ctVar.f3417g.f11595d;
        if (!z10 || (z9 = ctVar.f3420j) || i10 <= 0) {
            return;
        }
        if (z10 && !z9) {
            zzu.zzp();
            Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e10) {
                        e = e10;
                        zzm.zzh("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            zzm.zzj("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e12) {
                        zzm.zzh("Fail to capture the webview", e12);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                y3.c.j("Failed to capture the webview bitmap.");
            } else {
                ctVar.f3420j = true;
                vm vmVar = new vm(ctVar, 13, bitmap);
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    vmVar.run();
                } else {
                    nu.f7383a.execute(vmVar);
                }
            }
        }
        if (!ctVar.f3417g.f11595d || ctVar.f3420j) {
            return;
        }
        zzt.zza.postDelayed(new iw(this, view, ctVar, i10), 100L);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void V() {
        q70 q70Var = this.f5719w;
        if (q70Var != null) {
            q70Var.V();
        }
    }

    public final void X() {
        synchronized (this.f5712f) {
        }
    }

    public final void Z() {
        synchronized (this.f5712f) {
        }
    }

    public final void a(String str, wk wkVar) {
        synchronized (this.f5712f) {
            try {
                List copyOnWriteArrayList = (List) this.f5711d.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.f5711d.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(wkVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z9) {
        synchronized (this.f5712f) {
            this.E = z9;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ca A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #13 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000e, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x0049, B:18:0x0065, B:20:0x007f, B:22:0x0096, B:23:0x0099, B:25:0x009c, B:28:0x00b6, B:31:0x00be, B:33:0x00ca, B:35:0x00e3, B:51:0x0149, B:103:0x02ca, B:90:0x0216, B:81:0x01ee, B:80:0x01c1, B:91:0x0244, B:92:0x0274, B:34:0x00d7, B:93:0x0275, B:95:0x027f, B:97:0x0285, B:99:0x02b8, B:105:0x02dd, B:107:0x02e3, B:109:0x02f1), top: B:118:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e3 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #13 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000e, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x0049, B:18:0x0065, B:20:0x007f, B:22:0x0096, B:23:0x0099, B:25:0x009c, B:28:0x00b6, B:31:0x00be, B:33:0x00ca, B:35:0x00e3, B:51:0x0149, B:103:0x02ca, B:90:0x0216, B:81:0x01ee, B:80:0x01c1, B:91:0x0244, B:92:0x0274, B:34:0x00d7, B:93:0x0275, B:95:0x027f, B:97:0x0285, B:99:0x02b8, B:105:0x02dd, B:107:0x02e3, B:109:0x02f1), top: B:118:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f6 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01af A[Catch: all -> 0x01f5, TryCatch #11 {all -> 0x01f5, blocks: (B:86:0x01f9, B:88:0x020b, B:89:0x0212, B:76:0x019d, B:78:0x01af, B:79:0x01b6), top: B:115:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020b A[Catch: all -> 0x01f5, TryCatch #11 {all -> 0x01f5, blocks: (B:86:0x01f9, B:88:0x020b, B:89:0x0212, B:76:0x019d, B:78:0x01af, B:79:0x01b6), top: B:115:0x00e3 }] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.zzbah] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse e0(java.lang.String r23, java.util.Map r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ix.e0(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void h(n00 n00Var, lh0 lh0Var, vt0 vt0Var) {
        k("/click");
        if (lh0Var == null || vt0Var == null) {
            a("/click", new tk(this.f5719w, 0, n00Var));
        } else {
            a("/click", new sb0(this.f5719w, n00Var, vt0Var, lh0Var));
        }
    }

    public final void j(n00 n00Var, lh0 lh0Var, ed0 ed0Var) {
        k("/open");
        a("/open", new cl(this.H, this.I, lh0Var, ed0Var, n00Var));
    }

    public final void k(String str) {
        synchronized (this.f5712f) {
            try {
                List list = (List) this.f5711d.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n() {
        boolean z9;
        synchronized (this.f5712f) {
            z9 = this.E;
        }
        return z9;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zzaVar = this.f5713h;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            x0(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f5712f) {
            try {
                if (this.f5709a.A()) {
                    zze.zza("Blank page loaded, 1...");
                    this.f5709a.zzX();
                    return;
                }
                this.K = true;
                ay ayVar = this.f5716t;
                if (ayVar != null) {
                    ayVar.mo1zza();
                    this.f5716t = null;
                }
                v0();
                if (this.f5709a.s() != null) {
                    if (((Boolean) zzba.zzc().a(eg.Va)).booleanValue()) {
                        this.f5709a.s().zzG(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.f5721y = true;
        this.f5722z = i10;
        this.A = str;
        this.B = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean zDidCrash = renderProcessGoneDetail.didCrash();
        return this.f5709a.H(renderProcessGoneDetail.rendererPriorityAtExit(), zDidCrash);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return e0(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case NotificationCompat.FLAG_HIGH_PRIORITY /* 128 */:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriA = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriA.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriA.getHost())) {
            x0(uriA);
        } else {
            boolean z9 = this.f5720x;
            fx fxVar = this.f5709a;
            if (z9 && webView == fxVar.q()) {
                String scheme = uriA.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zza zzaVar = this.f5713h;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        dt dtVar = this.J;
                        if (dtVar != null) {
                            ((ct) dtVar).c(str);
                        }
                        this.f5713h = null;
                    }
                    q70 q70Var = this.f5719w;
                    if (q70Var != null) {
                        q70Var.L();
                        this.f5719w = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (fxVar.q().willNotDraw()) {
                zzm.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    y9 y9VarW = fxVar.w();
                    pr0 pr0VarZzS = fxVar.zzS();
                    if (!((Boolean) zzba.zzc().a(eg.ab)).booleanValue() || pr0VarZzS == null) {
                        if (y9VarW != null && y9VarW.c(uriA)) {
                            uriA = y9VarW.a(uriA, fxVar.getContext(), (View) fxVar, fxVar.zzi());
                        }
                    } else if (y9VarW != null && y9VarW.c(uriA)) {
                        uriA = pr0VarZzS.a(uriA, fxVar.getContext(), (View) fxVar, fxVar.zzi());
                    }
                } catch (zzaup unused) {
                    zzm.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                zzb zzbVar = this.H;
                if (zzbVar == null || zzbVar.zzc()) {
                    A0(new zzc("android.intent.action.VIEW", uriA.toString(), null, null, null, null, null, null), true, false);
                } else {
                    this.H.zzb(str);
                }
            }
        }
        return true;
    }

    public final boolean t() {
        boolean z9;
        synchronized (this.f5712f) {
            z9 = this.C;
        }
        return z9;
    }

    public final void v0() {
        yx yxVar = this.f5715s;
        fx fxVar = this.f5709a;
        if (yxVar != null && ((this.K && this.M <= 0) || this.L || this.f5721y)) {
            if (((Boolean) zzba.zzc().a(eg.G1)).booleanValue() && fxVar.zzm() != null) {
                y3.c.i((lg) fxVar.zzm().f7835d, fxVar.zzk(), "awfllc");
            }
            yx yxVar2 = this.f5715s;
            boolean z9 = false;
            if (!this.L && !this.f5721y) {
                z9 = true;
            }
            yxVar2.zza(z9, this.f5722z, this.A, this.B);
            this.f5715s = null;
        }
        fxVar.r0();
    }

    public final void w0() {
        dt dtVar = this.J;
        if (dtVar != null) {
            ((ct) dtVar).b();
            this.J = null;
        }
        gx gxVar = this.Q;
        if (gxVar != null) {
            ((View) this.f5709a).removeOnAttachStateChangeListener(gxVar);
        }
        synchronized (this.f5712f) {
            try {
                this.f5711d.clear();
                this.f5713h = null;
                this.f5714q = null;
                this.f5715s = null;
                this.f5716t = null;
                this.f5717u = null;
                this.f5718v = null;
                this.f5720x = false;
                this.C = false;
                this.D = false;
                this.F = null;
                this.H = null;
                this.G = null;
                kp kpVar = this.I;
                if (kpVar != null) {
                    kpVar.l(true);
                    this.I = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x0(Uri uri) {
        zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.f5711d;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) zzba.zzc().a(eg.f3951b6)).booleanValue() || zzu.zzo().c() == null) {
                return;
            }
            nu.f7383a.execute(new s9(16, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzba.zzc().a(eg.f3939a5)).booleanValue() && this.O.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzba.zzc().a(eg.f3961c5)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                tc1.u0(zzu.zzp().zzb(uri), new xq(this, list, path, uri), nu.f7387e);
                return;
            }
        }
        zzu.zzp();
        S(zzt.zzP(uri), list, path);
    }

    public final void y0(int i10, int i11) {
        np npVar = this.G;
        if (npVar != null) {
            npVar.l(i10, i11);
        }
        kp kpVar = this.I;
        if (kpVar != null) {
            synchronized (kpVar.f6360x) {
                kpVar.f6354q = i10;
                kpVar.f6355s = i11;
            }
        }
    }

    public final boolean z() {
        boolean z9;
        synchronized (this.f5712f) {
            z9 = this.D;
        }
        return z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z0() {
        dt dtVar = this.J;
        if (dtVar != null) {
            fx fxVar = this.f5709a;
            WebView webViewQ = fxVar.q();
            WeakHashMap weakHashMap = o0.v0.f16075a;
            if (o0.g0.b(webViewQ)) {
                T(webViewQ, dtVar, 10);
                return;
            }
            gx gxVar = this.Q;
            if (gxVar != null) {
                ((View) fxVar).removeOnAttachStateChangeListener(gxVar);
            }
            gx gxVar2 = new gx(this, dtVar);
            this.Q = gxVar2;
            ((View) fxVar).addOnAttachStateChangeListener(gxVar2);
        }
    }
}
