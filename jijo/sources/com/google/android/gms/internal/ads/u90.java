package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u90 extends yi implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ga0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f9424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9425b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f9426d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f9427f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i90 f9428h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xb f9429q;

    public u90(View view, HashMap map, HashMap map2) {
        ViewTreeObserver viewTreeObserver;
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzu.zzx();
        xu xuVar = new xu(view, this);
        View view2 = (View) ((WeakReference) xuVar.f7565a).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            xuVar.J0(viewTreeObserver3);
        }
        zzu.zzx();
        yu yuVar = new yu(view, this);
        View view3 = (View) ((WeakReference) yuVar.f7565a).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            yuVar.J0(viewTreeObserver2);
        }
        this.f9424a = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f9425b.put(str, new WeakReference(view4));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f9427f.putAll(this.f9425b);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f9426d.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f9427f.putAll(this.f9426d);
        this.f9429q = new xb(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized void m(String str, View view) {
        this.f9427f.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.f9425b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized View o(String str) {
        WeakReference weakReference = (WeakReference) this.f9427f.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        i90 i90Var = this.f9428h;
        if (i90Var != null) {
            i90Var.c(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        i90 i90Var = this.f9428h;
        if (i90Var != null) {
            i90Var.b(zzf(), zzl(), zzm(), i90.m(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        i90 i90Var = this.f9428h;
        if (i90Var != null) {
            i90Var.b(zzf(), zzl(), zzm(), i90.m(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        i90 i90Var = this.f9428h;
        if (i90Var != null) {
            i90Var.g(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final synchronized void zzb(a4.a aVar) {
        try {
            if (this.f9428h != null) {
                Object objA0 = a4.b.a0(aVar);
                if (!(objA0 instanceof View)) {
                    zzm.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.f9428h.i((View) objA0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final synchronized void zzc(a4.a aVar) {
        Object objA0 = a4.b.a0(aVar);
        if (!(objA0 instanceof i90)) {
            zzm.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        i90 i90Var = this.f9428h;
        if (i90Var != null) {
            i90Var.k(this);
        }
        i90 i90Var2 = (i90) objA0;
        if (!i90Var2.f5533n.d()) {
            zzm.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f9428h = i90Var2;
        i90Var2.j(this);
        this.f9428h.f(zzf());
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final synchronized void zzd() {
        i90 i90Var = this.f9428h;
        if (i90Var != null) {
            i90Var.k(this);
            this.f9428h = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final View zzf() {
        return (View) this.f9424a.get();
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final xb zzi() {
        return this.f9429q;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized a4.a zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized Map zzl() {
        return this.f9427f;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized Map zzm() {
        return this.f9425b;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized Map zzn() {
        return this.f9426d;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ga0
    public final synchronized JSONObject zzp() {
        i90 i90Var = this.f9428h;
        if (i90Var == null) {
            return null;
        }
        return i90Var.y(zzf(), zzl(), zzm());
    }
}
