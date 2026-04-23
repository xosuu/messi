package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.cu0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.ew0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.gq;
import com.google.android.gms.internal.ads.k70;
import com.google.android.gms.internal.ads.kh0;
import com.google.android.gms.internal.ads.q70;
import com.google.android.gms.internal.ads.rh0;
import com.google.android.gms.internal.ads.s40;
import com.google.android.gms.internal.ads.sh0;
import com.google.android.gms.internal.ads.vh0;
import com.google.android.gms.internal.ads.xt0;
import com.google.android.gms.internal.ads.yh0;
import com.google.android.gms.internal.ads.yt0;
import com.google.android.gms.internal.ads.zh0;
import java.util.Collections;
import k3.a;
import k3.b;
import k3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzm extends gq implements zzae {
    public static final int I = Color.argb(0, 0, 0, 0);
    public zzd A;
    public boolean B;
    public boolean C;
    public Toolbar G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f2071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdOverlayInfoParcel f2072b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fx f2073d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zzi f2074f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzs f2075h;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FrameLayout f2077s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f2078t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f2081w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2076q = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2079u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2080v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2082x = false;
    public int H = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f2083y = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f.b f2084z = new f.b(5, this);
    public boolean D = false;
    public boolean E = false;
    public boolean F = true;

    public zzm(Activity activity) {
        this.f2071a = activity;
    }

    public static final void x1(View view, zh0 zh0Var) {
        if (zh0Var == null || view == null) {
            return;
        }
        if (((Boolean) zzba.zzc().a(eg.B4)).booleanValue() && ((xt0) zh0Var.f11242b.f14815s) == xt0.f10647b) {
            return;
        }
        ((k70) com.google.android.gms.ads.internal.zzu.zzA()).d(zh0Var.f11241a, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.gms.ads.internal.overlay.zzd, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzp zzpVar;
        if (!this.f2071a.isFinishing() || this.D) {
            return;
        }
        this.D = true;
        fx fxVar = this.f2073d;
        if (fxVar != null) {
            fxVar.W(this.H - 1);
            synchronized (this.f2083y) {
                try {
                    if (!this.B && this.f2073d.Y()) {
                        if (((Boolean) zzba.zzc().a(eg.f4079n4)).booleanValue() && !this.E && (adOverlayInfoParcel = this.f2072b) != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
                            zzpVar.zzdq();
                        }
                        ?? r12 = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzc();
                            }
                        };
                        this.A = r12;
                        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(r12, ((Long) zzba.zzc().a(eg.O0)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u1(boolean r28) throws k3.a {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.u1(boolean):void");
    }

    public final void v1(ViewGroup viewGroup) {
        zh0 zh0VarZzQ;
        yh0 yh0VarZzP;
        if (((Boolean) zzba.zzc().a(eg.C4)).booleanValue() && (yh0VarZzP = this.f2073d.zzP()) != null) {
            synchronized (yh0VarZzP) {
                cu0 cu0Var = yh0VarZzP.f10888e;
                if (cu0Var != null) {
                    ((k70) com.google.android.gms.ads.internal.zzu.zzA()).getClass();
                    k70.m(new vh0(cu0Var, 1, viewGroup));
                }
            }
            return;
        }
        if (((Boolean) zzba.zzc().a(eg.B4)).booleanValue() && (zh0VarZzQ = this.f2073d.zzQ()) != null && ((xt0) zh0VarZzQ.f11242b.f14815s) == xt0.f10647b) {
            k70 k70Var = (k70) com.google.android.gms.ads.internal.zzu.zzA();
            yt0 yt0Var = zh0VarZzQ.f11241a;
            k70Var.getClass();
            k70.m(new sh0(yt0Var, viewGroup, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w1(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f2072b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzk r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.gms.ads.internal.util.zzab r3 = com.google.android.gms.ads.internal.zzu.zzq()
            android.app.Activity r4 = r5.f2071a
            boolean r6 = r3.zzd(r4, r6)
            boolean r3 = r5.f2080v
            if (r3 == 0) goto L36
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.f4171x0
            com.google.android.gms.internal.ads.cg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L36
        L34:
            r1 = 0
            goto L57
        L36:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.xf r6 = com.google.android.gms.internal.ads.eg.f4162w0
            com.google.android.gms.internal.ads.cg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r6 = r0.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L34
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f2072b
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzk r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = 1
        L57:
            android.view.Window r6 = r4.getWindow()
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.V0
            com.google.android.gms.internal.ads.cg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L81
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7b
            if (r2 == 0) goto L78
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7d
        L78:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7d
        L7b:
            r0 = 256(0x100, float:3.59E-43)
        L7d:
            r6.setSystemUiVisibility(r0)
            return
        L81:
            r0 = 2048(0x800, float:2.87E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L99
            r6.addFlags(r3)
            r6.clearFlags(r0)
            if (r2 == 0) goto L98
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L98:
            return
        L99:
            r6.addFlags(r0)
            r6.clearFlags(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.w1(android.content.res.Configuration):void");
    }

    public final void zzA(int i10) {
        Activity activity = this.f2071a;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().a(eg.f4109q5)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().a(eg.f4119r5)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzba.zzc().a(eg.f4129s5)).intValue()) {
                    if (i11 <= ((Integer) zzba.zzc().a(eg.f4139t5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i10);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().h("AdOverlay.setRequestedOrientation", th);
        }
    }

    public final void zzB(boolean z9) {
        if (z9) {
            this.f2081w.setBackgroundColor(0);
        } else {
            this.f2081w.setBackgroundColor(-16777216);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.f2071a;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f2077s = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f2077s.addView(view, -1, -1);
        activity.setContentView(this.f2077s);
        this.C = true;
        this.f2078t = customViewCallback;
        this.f2076q = true;
    }

    public final void zzE() {
        synchronized (this.f2083y) {
            try {
                this.B = true;
                zzd zzdVar = this.A;
                if (zzdVar != null) {
                    ew0 ew0Var = com.google.android.gms.ads.internal.util.zzt.zza;
                    ew0Var.removeCallbacks(zzdVar);
                    ew0Var.post(this.A);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzG(String str) {
        Toolbar toolbar = this.G;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final boolean zzH() {
        this.H = 1;
        if (this.f2073d == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().a(eg.f3942a8)).booleanValue() && this.f2073d.canGoBack()) {
            this.f2073d.goBack();
            return false;
        }
        boolean zU0 = this.f2073d.u0();
        if (!zU0) {
            this.f2073d.j("onbackblocked", Collections.emptyMap());
        }
        return zU0;
    }

    public final void zzb() {
        this.H = 3;
        Activity activity = this.f2071a;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2072b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    public final void zzc() {
        fx fxVar;
        zzp zzpVar;
        if (this.E) {
            return;
        }
        this.E = true;
        fx fxVar2 = this.f2073d;
        if (fxVar2 != null) {
            this.f2081w.removeView(fxVar2.d());
            zzi zziVar = this.f2074f;
            if (zziVar != null) {
                this.f2073d.G(zziVar.zzd);
                this.f2073d.P(false);
                if (((Boolean) zzba.zzc().a(eg.Jb)).booleanValue() && this.f2073d.getParent() != null) {
                    ((ViewGroup) this.f2073d.getParent()).removeView(this.f2073d.d());
                }
                ViewGroup viewGroup = this.f2074f.zzc;
                View viewD = this.f2073d.d();
                zzi zziVar2 = this.f2074f;
                viewGroup.addView(viewD, zziVar2.zza, zziVar2.zzb);
                this.f2074f = null;
            } else {
                Activity activity = this.f2071a;
                if (activity.getApplicationContext() != null) {
                    this.f2073d.G(activity.getApplicationContext());
                }
            }
            this.f2073d = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2072b;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
            zzpVar.zzdu(this.H);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2072b;
        if (adOverlayInfoParcel2 == null || (fxVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        x1(this.f2072b.zzd.d(), fxVar.zzQ());
    }

    public final void zzd() {
        this.f2081w.f14667b = true;
    }

    public final void zzf(rh0 rh0Var) throws a {
        aq aqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2072b;
        if (adOverlayInfoParcel == null || (aqVar = adOverlayInfoParcel.zzv) == null) {
            throw new a("noioou");
        }
        aqVar.j(new a4.b(rh0Var));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2072b;
        if (adOverlayInfoParcel != null && this.f2076q) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.f2077s != null) {
            this.f2071a.setContentView(this.f2081w);
            this.C = true;
            this.f2077s.removeAllViews();
            this.f2077s = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f2078t;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f2078t = null;
        }
        this.f2076q = false;
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzh(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzi() {
        this.H = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzae
    public final void zzj() {
        this.H = 2;
        this.f2071a.finish();
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzk(a4.a aVar) {
        w1((Configuration) a4.b.a0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.hq
    public void zzl(Bundle bundle) {
        boolean z9 = this.C;
        Activity activity = this.f2071a;
        if (!z9) {
            activity.requestWindowFeature(1);
        }
        this.f2079u = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.f2072b = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new a("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.f2072b.zzm.clientJarVersion > 7500000) {
                this.H = 4;
            }
            if (activity.getIntent() != null) {
                this.F = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f2072b;
            com.google.android.gms.ads.internal.zzk zzkVar = adOverlayInfoParcel.zzo;
            if (zzkVar != null) {
                boolean z10 = zzkVar.zza;
                this.f2080v = z10;
                if (z10) {
                    if (adOverlayInfoParcel.zzk != 5 && zzkVar.zzf != -1) {
                        new c(this).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.f2080v = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new c(this).zzb();
                }
            } else {
                this.f2080v = false;
            }
            if (bundle == null) {
                if (this.F) {
                    s40 s40Var = this.f2072b.zzt;
                    if (s40Var != null) {
                        s40Var.zze();
                    }
                    zzp zzpVar = this.f2072b.zzc;
                    if (zzpVar != null) {
                        zzpVar.zzdr();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2072b;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    q70 q70Var = this.f2072b.zzu;
                    if (q70Var != null) {
                        q70Var.L();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f2072b;
            b bVar = new b(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.afmaVersion, adOverlayInfoParcel3.zzs);
            this.f2081w = bVar;
            bVar.setId(1000);
            com.google.android.gms.ads.internal.zzu.zzq().zzk(activity);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f2072b;
            int i10 = adOverlayInfoParcel4.zzk;
            if (i10 == 1) {
                u1(false);
                return;
            }
            if (i10 == 2) {
                this.f2074f = new zzi(adOverlayInfoParcel4.zzd);
                u1(false);
            } else if (i10 == 3) {
                u1(true);
            } else {
                if (i10 != 5) {
                    throw new a("Could not determine ad overlay type.");
                }
                u1(false);
            }
        } catch (a e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e10.getMessage());
            this.H = 4;
            activity.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzm() {
        fx fxVar = this.f2073d;
        if (fxVar != null) {
            try {
                this.f2081w.removeView(fxVar.d());
            } catch (NullPointerException unused) {
            }
        }
        d();
    }

    public final void zzn() {
        if (this.f2082x) {
            this.f2082x = false;
            this.f2073d.zzaa();
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzo() {
        zzp zzpVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2072b;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
            zzpVar.zzdk();
        }
        if (!((Boolean) zzba.zzc().a(eg.f4098p4)).booleanValue() && this.f2073d != null && (!this.f2071a.isFinishing() || this.f2074f == null)) {
            this.f2073d.onPause();
        }
        d();
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.f2071a;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            try {
                this.f2072b.zzv.l1(strArr, iArr, new a4.b(new kh0(activity, this.f2072b.zzk == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzr() {
        zzp zzpVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2072b;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
            zzpVar.zzdH();
        }
        w1(this.f2071a.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().a(eg.f4098p4)).booleanValue()) {
            return;
        }
        fx fxVar = this.f2073d;
        if (fxVar == null || fxVar.A()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.f2073d.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2079u);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzt() {
        if (((Boolean) zzba.zzc().a(eg.f4098p4)).booleanValue()) {
            fx fxVar = this.f2073d;
            if (fxVar == null || fxVar.A()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.f2073d.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzu() {
        if (((Boolean) zzba.zzc().a(eg.f4098p4)).booleanValue() && this.f2073d != null && (!this.f2071a.isFinishing() || this.f2074f == null)) {
            this.f2073d.onPause();
        }
        d();
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzv() {
        zzp zzpVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2072b;
        if (adOverlayInfoParcel == null || (zzpVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzpVar.zzdt();
    }

    public final void zzw(boolean z9) {
        if (this.f2072b.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzba.zzc().a(eg.f4128s4)).intValue();
        boolean z10 = ((Boolean) zzba.zzc().a(eg.R0)).booleanValue() || z9;
        zzr zzrVar = new zzr();
        zzrVar.zzd = 50;
        zzrVar.zza = true != z10 ? 0 : iIntValue;
        zzrVar.zzb = true != z10 ? iIntValue : 0;
        zzrVar.zzc = iIntValue;
        this.f2075h = new zzs(this.f2071a, zzrVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z10 ? 9 : 11);
        zzy(z9, this.f2072b.zzg);
        this.f2081w.addView(this.f2075h, layoutParams);
        v1(this.f2075h);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzx() {
        this.C = true;
    }

    public final void zzy(boolean z9, boolean z10) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzk zzkVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzk zzkVar2;
        boolean z11 = true;
        boolean z12 = ((Boolean) zzba.zzc().a(eg.P0)).booleanValue() && (adOverlayInfoParcel2 = this.f2072b) != null && (zzkVar2 = adOverlayInfoParcel2.zzo) != null && zzkVar2.zzh;
        boolean z13 = ((Boolean) zzba.zzc().a(eg.Q0)).booleanValue() && (adOverlayInfoParcel = this.f2072b) != null && (zzkVar = adOverlayInfoParcel.zzo) != null && zzkVar.zzi;
        if (z9 && z10 && z12 && !z13) {
            fx fxVar = this.f2073d;
            try {
                JSONObject jSONObjectPut = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                fx fxVar2 = fxVar;
                if (fxVar2 != null) {
                    fxVar2.E(jSONObjectPut, "onError");
                }
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error occurred while dispatching error event.", e10);
            }
        }
        zzs zzsVar = this.f2075h;
        if (zzsVar != null) {
            if (!z13 && (!z10 || z12)) {
                z11 = false;
            }
            zzsVar.zzb(z11);
        }
    }

    public final void zzz() {
        this.f2081w.removeView(this.f2075h);
        zzw(true);
    }
}
