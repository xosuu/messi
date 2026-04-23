package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w90 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f10124k = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f10125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final or0 f10126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p90 f10127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n90 f10128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ba0 f10129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ea0 f10130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f10131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f10132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzbes f10133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k90 f10134j;

    public w90(zzj zzjVar, or0 or0Var, p90 p90Var, n90 n90Var, ba0 ba0Var, ea0 ea0Var, Executor executor, mu muVar, k90 k90Var) {
        this.f10125a = zzjVar;
        this.f10126b = or0Var;
        this.f10133i = or0Var.f7649i;
        this.f10127c = p90Var;
        this.f10128d = n90Var;
        this.f10129e = ba0Var;
        this.f10130f = ea0Var;
        this.f10131g = executor;
        this.f10132h = muVar;
        this.f10134j = k90Var;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(ga0 ga0Var) {
        if (ga0Var == null) {
            return;
        }
        Context context = ga0Var.zzf().getContext();
        if (zzbv.zzh(context, this.f10127c.f7838a)) {
            if (!(context instanceof Activity)) {
                zzm.zze("Activity context is needed for policy validator.");
                return;
            }
            ea0 ea0Var = this.f10130f;
            if (ea0Var == null || ga0Var.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(ea0Var.a(ga0Var.zzh(), windowManager), zzbv.zzb());
            } catch (zzcev e10) {
                zze.zzb("web view can not be obtained", e10);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z9) {
        View view;
        View viewE;
        if (z9) {
            viewE = this.f10128d.E();
        } else {
            n90 n90Var = this.f10128d;
            synchronized (n90Var) {
                view = n90Var.f7213p;
            }
            viewE = view;
        }
        if (viewE == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewE.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewE.getParent()).removeView(viewE);
        }
        viewGroup.addView(viewE, ((Boolean) zzba.zzc().a(eg.f4164w3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
