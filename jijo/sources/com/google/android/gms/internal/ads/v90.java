package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v90 extends si implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ga0 {
    public static final wz0 A = bz0.p("2011", "1009", "3010");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9801a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FrameLayout f9803d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FrameLayout f9804f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mu f9805h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f9806q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i90 f9808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public xb f9809u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ni f9811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9812x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public GestureDetector f9814z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f9802b = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a4.a f9810v = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9813y = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9807s = 242402000;

    public v90(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f9803d = frameLayout;
        this.f9804f = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f9801a = str;
        zzu.zzx();
        xu xuVar = new xu(frameLayout, this);
        View view = (View) ((WeakReference) xuVar.f7565a).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            xuVar.J0(viewTreeObserver3);
        }
        zzu.zzx();
        yu yuVar = new yu(frameLayout, this);
        View view2 = (View) ((WeakReference) yuVar.f7565a).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            yuVar.J0(viewTreeObserver2);
        }
        this.f9805h = nu.f7387e;
        this.f9809u = new xb(this.f9803d.getContext(), this.f9803d);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized void m(String str, View view) {
        if (!this.f9813y) {
            if (view == null) {
                this.f9802b.remove(str);
                return;
            }
            this.f9802b.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (zzbv.zzi(this.f9807s)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized View o(String str) {
        WeakReference weakReference;
        if (!this.f9813y && (weakReference = (WeakReference) this.f9802b.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        i90 i90Var = this.f9808t;
        if (i90Var == null || !i90Var.l()) {
            return;
        }
        this.f9808t.z();
        this.f9808t.c(view, this.f9803d, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        i90 i90Var = this.f9808t;
        if (i90Var != null) {
            FrameLayout frameLayout = this.f9803d;
            i90Var.b(frameLayout, zzl(), zzm(), i90.m(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        i90 i90Var = this.f9808t;
        if (i90Var != null) {
            FrameLayout frameLayout = this.f9803d;
            i90Var.b(frameLayout, zzl(), zzm(), i90.m(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        i90 i90Var = this.f9808t;
        if (i90Var != null) {
            i90Var.g(view, motionEvent, this.f9803d);
            if (((Boolean) zzba.zzc().a(eg.Ea)).booleanValue() && this.f9814z != null && this.f9808t.p() != 0) {
                this.f9814z.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    public final synchronized void u1(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f9804f.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f9804f.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e10) {
                        zzm.zzk("Encountered invalid base64 watermark.", e10);
                    }
                }
            }
            this.f9804f.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void v1() {
        this.f9805h.execute(new s9(28, this));
    }

    public final synchronized void w1() {
        if (!((Boolean) zzba.zzc().a(eg.Ea)).booleanValue() || this.f9808t.p() == 0) {
            return;
        }
        this.f9814z = new GestureDetector(this.f9803d.getContext(), new y90(this.f9808t, this));
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final synchronized a4.a zzb(String str) {
        return new a4.b(o(str));
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final synchronized void zzc() {
        try {
            if (this.f9813y) {
                return;
            }
            i90 i90Var = this.f9808t;
            if (i90Var != null) {
                i90Var.k(this);
                this.f9808t = null;
            }
            this.f9802b.clear();
            this.f9803d.removeAllViews();
            this.f9804f.removeAllViews();
            this.f9802b = null;
            this.f9803d = null;
            this.f9804f = null;
            this.f9806q = null;
            this.f9809u = null;
            this.f9813y = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final void zzd(a4.a aVar) {
        onTouch(this.f9803d, (MotionEvent) a4.b.a0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final synchronized void zzdv(String str, a4.a aVar) {
        m(str, (View) a4.b.a0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final synchronized void zzdw(a4.a aVar) {
        this.f9808t.i((View) a4.b.a0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final synchronized void zzdx(ni niVar) {
        if (!this.f9813y) {
            this.f9812x = true;
            this.f9811w = niVar;
            i90 i90Var = this.f9808t;
            if (i90Var != null) {
                i90Var.C.b(niVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final synchronized void zzdy(a4.a aVar) {
        if (this.f9813y) {
            return;
        }
        this.f9810v = aVar;
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final synchronized void zzdz(a4.a aVar) {
        if (this.f9813y) {
            return;
        }
        Object objA0 = a4.b.a0(aVar);
        if (!(objA0 instanceof i90)) {
            zzm.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        i90 i90Var = this.f9808t;
        if (i90Var != null) {
            i90Var.k(this);
        }
        v1();
        i90 i90Var2 = (i90) objA0;
        this.f9808t = i90Var2;
        i90Var2.j(this);
        this.f9808t.f(this.f9803d);
        i90 i90Var3 = this.f9808t;
        FrameLayout frameLayout = this.f9804f;
        zh0 zh0VarQ = i90Var3.f5530k.Q();
        if (i90Var3.f5533n.c() && zh0VarQ != null && frameLayout != null) {
            k70 k70Var = (k70) zzu.zzA();
            yt0 yt0Var = zh0VarQ.f11241a;
            k70Var.getClass();
            k70.m(new sh0(yt0Var, frameLayout, 0));
        }
        if (this.f9812x) {
            this.f9808t.C.b(this.f9811w);
        }
        if (((Boolean) zzba.zzc().a(eg.f4193z3)).booleanValue() && !TextUtils.isEmpty(this.f9808t.f5533n.b())) {
            u1(this.f9808t.f5533n.b());
        }
        w1();
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final synchronized void zze(a4.a aVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final /* synthetic */ View zzf() {
        return this.f9803d;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final FrameLayout zzh() {
        return this.f9804f;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final xb zzi() {
        return this.f9809u;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final a4.a zzj() {
        return this.f9810v;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized String zzk() {
        return this.f9801a;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized Map zzl() {
        return this.f9802b;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized Map zzm() {
        return this.f9802b;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized JSONObject zzo() {
        i90 i90Var = this.f9808t;
        if (i90Var == null) {
            return null;
        }
        return i90Var.x(this.f9803d, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized JSONObject zzp() {
        i90 i90Var = this.f9808t;
        if (i90Var == null) {
            return null;
        }
        return i90Var.y(this.f9803d, zzl(), zzm());
    }
}
