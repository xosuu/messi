package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i90 extends r20 {
    public static final /* synthetic */ int G = 0;
    public final VersionInfoParcel A;
    public final Context B;
    public final k90 C;
    public final ll0 D;
    public final HashMap E;
    public final ArrayList F;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f5529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n90 f5530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q90 f5531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w90 f5532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p90 f5533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r90 f5534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eh1 f5535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final eh1 f5536q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final eh1 f5537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final eh1 f5538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final eh1 f5539t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ga0 f5540u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5541v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5542w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5543x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kt f5544y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y9 f5545z;

    static {
        zy0 zy0Var = bz0.f3132b;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        tp1.a0(6, objArr);
        bz0.j(6, objArr);
    }

    public i90(jt jtVar, Executor executor, n90 n90Var, q90 q90Var, w90 w90Var, p90 p90Var, r90 r90Var, eh1 eh1Var, eh1 eh1Var2, eh1 eh1Var3, eh1 eh1Var4, eh1 eh1Var5, kt ktVar, y9 y9Var, VersionInfoParcel versionInfoParcel, Context context, k90 k90Var, ll0 ll0Var) {
        super(jtVar);
        this.f5529j = executor;
        this.f5530k = n90Var;
        this.f5531l = q90Var;
        this.f5532m = w90Var;
        this.f5533n = p90Var;
        this.f5534o = r90Var;
        this.f5535p = eh1Var;
        this.f5536q = eh1Var2;
        this.f5537r = eh1Var3;
        this.f5538s = eh1Var4;
        this.f5539t = eh1Var5;
        this.f5544y = ktVar;
        this.f5545z = y9Var;
        this.A = versionInfoParcel;
        this.B = context;
        this.C = k90Var;
        this.D = ll0Var;
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static boolean m(View view) {
        if (!((Boolean) zzba.zzc().a(eg.J9)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        zzu.zzp();
        long jZzw = zzt.zzw(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jZzw >= ((Integer) zzba.zzc().a(eg.K9)).intValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.r20
    public final void a() {
        f90 f90Var = new f90(this, 0);
        Executor executor = this.f5529j;
        executor.execute(f90Var);
        if (this.f5530k.B() != 7) {
            q90 q90Var = this.f5531l;
            Objects.requireNonNull(q90Var);
            executor.execute(new s9(27, q90Var));
        }
        super.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f5542w     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L7
            goto L89
        L7:
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.A1     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.cg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.fr0 r0 = r3.f8358b     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.f4621k0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            java.util.HashMap r0 = r3.E     // Catch: java.lang.Throwable -> L44
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L44
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L44
            java.util.HashMap r2 = r3.E     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L29
            goto L89
        L44:
            r4 = move-exception
            goto L90
        L46:
            if (r7 != 0) goto L8b
            com.google.android.gms.internal.ads.xf r7 = com.google.android.gms.internal.ads.eg.f4184y3     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.cg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r7 = r0.a(r7)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L44
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L89
            if (r5 == 0) goto L89
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L44
        L64:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L89
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L44
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L44
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L44
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L64
            boolean r0 = m(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L64
            r3.r(r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return
        L89:
            monitor-exit(r3)
            return
        L8b:
            r3.r(r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return
        L90:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i90.b(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void c(View view, View view2, Map map, Map map2, boolean z9) {
        w90 w90Var = this.f5532m;
        ga0 ga0Var = this.f5540u;
        if (ga0Var != null) {
            ba0 ba0Var = w90Var.f10129e;
            if (ba0Var != null && ga0Var.zzh() != null && w90Var.f10127c.f()) {
                try {
                    ga0Var.zzh().addView(ba0Var.a());
                } catch (zzcev e10) {
                    zze.zzb("web view can not be obtained", e10);
                }
            }
        }
        w90Var.getClass();
        this.f5531l.o(view, view2, map, map2, z9, o());
        if (this.f5543x) {
            n90 n90Var = this.f5530k;
            if (n90Var.O() != null) {
                n90Var.O().j("onSdkAdUserInteractionClick", new s.b());
            }
        }
    }

    public final synchronized void d(final FrameLayout frameLayout, final int i10) {
        if (((Boolean) zzba.zzc().a(eg.Ea)).booleanValue()) {
            ga0 ga0Var = this.f5540u;
            if (ga0Var == null) {
                zzm.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z9 = ga0Var instanceof u90;
                this.f5529j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g90
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view = frameLayout;
                        boolean z10 = z9;
                        int i11 = i10;
                        i90 i90Var = this.f4849a;
                        i90Var.f5531l.e(view, i90Var.f5540u.zzf(), i90Var.f5540u.zzl(), i90Var.f5540u.zzm(), z10, i90Var.o(), i11);
                    }
                });
            }
        }
    }

    public final synchronized void e(Bundle bundle) {
        this.f5531l.p(bundle);
    }

    public final void f(View view) {
        qu quVar;
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.H4)).booleanValue();
        n90 n90Var = this.f5530k;
        if (!zBooleanValue) {
            s(view, n90Var.Q());
            return;
        }
        synchronized (n90Var) {
            quVar = n90Var.f7211n;
        }
        if (quVar == null) {
            return;
        }
        tc1.u0(quVar, new m20(this, view, 18, 0), this.f5529j);
    }

    public final synchronized void g(View view, MotionEvent motionEvent, View view2) {
        this.f5531l.i(motionEvent, view2);
    }

    public final synchronized void h(Bundle bundle) {
        this.f5531l.a(bundle);
    }

    public final synchronized void i(View view) {
        this.f5531l.h(view);
    }

    public final synchronized void j(ga0 ga0Var) {
        if (((Boolean) zzba.zzc().a(eg.f4182y1)).booleanValue()) {
            zzt.zza.post(new e90(this, ga0Var, 0));
        } else {
            t(ga0Var);
        }
    }

    public final synchronized void k(ga0 ga0Var) {
        if (((Boolean) zzba.zzc().a(eg.f4182y1)).booleanValue()) {
            zzt.zza.post(new e90(this, ga0Var, 1));
        } else {
            u(ga0Var);
        }
    }

    public final synchronized boolean l() {
        return this.f5531l.zzA();
    }

    public final synchronized boolean n(Bundle bundle) {
        if (this.f5542w) {
            return true;
        }
        boolean zG = this.f5531l.g(bundle);
        this.f5542w = zG;
        return zG;
    }

    public final synchronized ImageView.ScaleType o() {
        ga0 ga0Var = this.f5540u;
        if (ga0Var == null) {
            zzm.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        a4.a aVarZzj = ga0Var.zzj();
        if (aVarZzj != null) {
            return (ImageView.ScaleType) a4.b.a0(aVarZzj);
        }
        return w90.f10124k;
    }

    public final synchronized int p() {
        return this.f5531l.zza();
    }

    public final void q() {
        n5.a aVar;
        if (!((Boolean) zzba.zzc().a(eg.H4)).booleanValue()) {
            w("Google", true);
            return;
        }
        n90 n90Var = this.f5530k;
        synchronized (n90Var) {
            aVar = n90Var.f7210m;
        }
        if (aVar == null) {
            return;
        }
        tc1.u0(aVar, new p80(this), this.f5529j);
    }

    public final synchronized void r(View view, Map map, Map map2) {
        this.f5532m.a(this.f5540u);
        this.f5531l.f(view, map, map2, o());
        this.f5542w = true;
    }

    public final void s(View view, zh0 zh0Var) {
        fx fxVarN = this.f5530k.N();
        if (!this.f5533n.c() || zh0Var == null || fxVarN == null || view == null) {
            return;
        }
        ((k70) zzu.zzA()).d(zh0Var.f11241a, view);
    }

    public final synchronized void t(ga0 ga0Var) {
        Iterator<String> itKeys;
        View view;
        v9 v9Var;
        try {
            if (!this.f5541v) {
                this.f5540u = ga0Var;
                w90 w90Var = this.f5532m;
                w90Var.getClass();
                w90Var.f10131g.execute(new vm(w90Var, 24, ga0Var));
                this.f5531l.j(ga0Var.zzf(), ga0Var.zzm(), ga0Var.zzn(), ga0Var, ga0Var);
                if (((Boolean) zzba.zzc().a(eg.f4106q2)).booleanValue() && (v9Var = this.f5545z.f10801b) != null) {
                    v9Var.zzo(ga0Var.zzf());
                }
                if (((Boolean) zzba.zzc().a(eg.A1)).booleanValue()) {
                    fr0 fr0Var = this.f8358b;
                    if (fr0Var.f4621k0 && (itKeys = fr0Var.f4619j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            WeakReference weakReference = (WeakReference) this.f5540u.zzl().get(next);
                            this.E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                xb xbVar = new xb(this.B, view);
                                this.F.add(xbVar);
                                xbVar.f10529x.add(new h90(this, next));
                                xbVar.c(3);
                            }
                        }
                    }
                }
                if (ga0Var.zzi() != null) {
                    xb xbVarZzi = ga0Var.zzi();
                    xbVarZzi.f10529x.add(this.f5544y);
                    xbVarZzi.c(3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void u(ga0 ga0Var) {
        View viewZzf = ga0Var.zzf();
        ga0Var.zzl();
        this.f5531l.k(viewZzf);
        if (ga0Var.zzh() != null) {
            ga0Var.zzh().setClickable(false);
            ga0Var.zzh().removeAllViews();
        }
        if (ga0Var.zzi() != null) {
            ga0Var.zzi().f10529x.remove(this.f5544y);
        }
        this.f5540u = null;
    }

    public final synchronized void v() {
        int i10 = 1;
        this.f5541v = true;
        this.f5529j.execute(new f90(this, i10));
        z40 z40Var = this.f8359c;
        z40Var.getClass();
        z40Var.I0(new y40(null));
    }

    public final zh0 w(String str, boolean z9) {
        String str2;
        int i10;
        int i11;
        if (!this.f5533n.c() || TextUtils.isEmpty(str)) {
            return null;
        }
        n90 n90Var = this.f5530k;
        fx fxVarN = n90Var.N();
        fx fxVarO = n90Var.O();
        if (fxVarN == null && fxVarO == null) {
            zzm.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z10 = false;
        boolean z11 = fxVarN != null;
        boolean z12 = fxVarO != null;
        if (((Boolean) zzba.zzc().a(eg.F4)).booleanValue()) {
            this.f5533n.a();
            int iQ = this.f5533n.a().q();
            int i12 = iQ - 1;
            if (i12 != 0) {
                if (i12 != 1) {
                    zzm.zzj("Unknown omid media type: " + (iQ != 1 ? iQ != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return null;
                }
                if (fxVarN == null) {
                    zzm.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                z10 = true;
                z12 = false;
            } else {
                if (fxVarO == null) {
                    zzm.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
                z12 = true;
            }
        } else {
            z10 = z11;
        }
        if (z10) {
            str2 = null;
        } else {
            str2 = "javascript";
            fxVarN = fxVarO;
        }
        fxVarN.q();
        if (!((k70) zzu.zzA()).f(this.B)) {
            zzm.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        VersionInfoParcel versionInfoParcel = this.A;
        String str3 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
        if (z12) {
            i10 = 3;
            i11 = 2;
        } else if (this.f5530k.B() == 3) {
            i10 = 2;
            i11 = 4;
        } else {
            i10 = 2;
            i11 = 3;
        }
        xh0 xh0VarZzA = zzu.zzA();
        WebView webViewQ = fxVarN.q();
        String str4 = this.f8358b.f4623l0;
        ((k70) xh0VarZzA).getClass();
        zh0 zh0Var = (((Boolean) zzba.zzc().a(eg.f4194z4)).booleanValue() && tp1.f9254v.f1584b) ? (zh0) k70.l(new th0(str, str3, str2, i10, webViewQ, str4, i11)) : null;
        if (zh0Var == null) {
            zzm.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        n90 n90Var2 = this.f5530k;
        synchronized (n90Var2) {
            n90Var2.f7209l = zh0Var;
        }
        fxVarN.k0(zh0Var);
        if (z12) {
            ((k70) zzu.zzA()).d(zh0Var.f11241a, fxVarO.d());
            this.f5543x = true;
        }
        if (z9) {
            ((k70) zzu.zzA()).e(zh0Var.f11241a);
            fxVarN.j("onSdkLoaded", new s.b());
        }
        return zh0Var;
    }

    public final synchronized JSONObject x(FrameLayout frameLayout, Map map, Map map2) {
        return this.f5531l.b(frameLayout, map, map2, o());
    }

    public final synchronized JSONObject y(View view, Map map, Map map2) {
        return this.f5531l.n(view, map, map2, o());
    }

    public final synchronized void z() {
        this.f5531l.zzh();
    }
}
