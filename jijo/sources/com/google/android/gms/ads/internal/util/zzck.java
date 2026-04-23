package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.xu;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f2174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f2178f;

    public zzck(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f2174b = activity;
        this.f2173a = view;
        this.f2178f = onGlobalLayoutListener;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        if (this.f2175c) {
            return;
        }
        Activity activity = this.f2174b;
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f2178f;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        com.google.android.gms.ads.internal.zzu.zzx();
        xu xuVar = new xu(this.f2173a, onGlobalLayoutListener);
        View view = (View) ((WeakReference) xuVar.f7565a).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            xuVar.J0(viewTreeObserver2);
        }
        this.f2175c = true;
    }

    public final void zza() {
        View decorView;
        this.f2177e = false;
        Activity activity = this.f2174b;
        if (activity != null && this.f2175c) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f2178f);
            }
            this.f2175c = false;
        }
    }

    public final void zzb() {
        this.f2177e = true;
        if (this.f2176d) {
            a();
        }
    }

    public final void zzc() {
        this.f2176d = true;
        if (this.f2177e) {
            a();
        }
    }

    public final void zzd() {
        View decorView;
        this.f2176d = false;
        Activity activity = this.f2174b;
        if (activity != null && this.f2175c) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f2178f);
            }
            this.f2175c = false;
        }
    }

    public final void zze(Activity activity) {
        this.f2174b = activity;
    }
}
