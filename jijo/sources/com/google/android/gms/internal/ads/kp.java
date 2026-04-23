package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class kp extends p80 {
    public b4.c A;
    public ImageView B;
    public LinearLayout C;
    public final i10 D;
    public PopupWindow E;
    public RelativeLayout F;
    public ViewGroup G;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6352f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6353h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6354q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6355s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6356t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6357u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6358v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f6360x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fx f6361y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Activity f6362z;

    static {
        s.c cVar = new s.c(7);
        Collections.addAll(cVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(cVar);
    }

    public kp(fx fxVar, i10 i10Var) {
        super(fxVar, 10, "resize");
        this.f6352f = "top-right";
        this.f6353h = true;
        this.f6354q = 0;
        this.f6355s = 0;
        this.f6356t = -1;
        this.f6357u = 0;
        this.f6358v = 0;
        this.f6359w = -1;
        this.f6360x = new Object();
        this.f6361y = fxVar;
        this.f6362z = fxVar.zzi();
        this.D = i10Var;
    }

    public final void l(boolean z9) {
        synchronized (this.f6360x) {
            try {
                if (this.E != null) {
                    if (!((Boolean) zzba.zzc().a(eg.U9)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        n(z9);
                    } else {
                        nu.f7387e.a(new g3.h(this, z9, 1));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(boolean z9) {
        this.E.dismiss();
        RelativeLayout relativeLayout = this.F;
        fx fxVar = this.f6361y;
        View view = (View) fxVar;
        relativeLayout.removeView(view);
        ViewGroup viewGroup = this.G;
        if (viewGroup != null) {
            viewGroup.removeView(this.B);
            this.G.addView(view);
            fxVar.t0(this.A);
        }
        if (z9) {
            k("default");
            i10 i10Var = this.D;
            if (i10Var != null) {
                b50 b50Var = ((jc0) i10Var.f5456b).f5889c;
                b50Var.getClass();
                b50Var.I0(new m30(8));
            }
        }
        this.E = null;
        this.F = null;
        this.G = null;
        this.C = null;
    }
}
