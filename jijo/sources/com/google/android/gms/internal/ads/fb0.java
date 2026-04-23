package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final or0 f4440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f4441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kc0 f4442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xb0 f4443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f4444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ed0 f4445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vt0 f4446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lh0 f4447h;

    public fb0(or0 or0Var, Executor executor, kc0 kc0Var, Context context, ed0 ed0Var, vt0 vt0Var, lh0 lh0Var, xb0 xb0Var) {
        this.f4440a = or0Var;
        this.f4441b = executor;
        this.f4442c = kc0Var;
        this.f4444e = context;
        this.f4445f = ed0Var;
        this.f4446g = vt0Var;
        this.f4447h = lh0Var;
        this.f4443d = xb0Var;
    }

    public static final void b(nx nxVar) {
        nxVar.l0("/videoClicked", vk.f9884h);
        ix ixVarG = nxVar.g();
        synchronized (ixVarG.f5712f) {
            ixVarG.D = true;
        }
        nxVar.l0("/getNativeAdViewSignals", vk.f9895s);
        nxVar.l0("/getNativeClickMeta", vk.f9896t);
    }

    public final void a(nx nxVar) {
        b(nxVar);
        nxVar.l0("/video", vk.f9888l);
        nxVar.l0("/videoMeta", vk.f9889m);
        nxVar.l0("/precache", new rk(27));
        nxVar.l0("/delayPageLoaded", vk.f9892p);
        nxVar.l0("/instrument", vk.f9890n);
        nxVar.l0("/log", vk.f9883g);
        nxVar.l0("/click", new tk(null, 0, null));
        if (this.f4440a.f7642b != null) {
            ix ixVarG = nxVar.g();
            synchronized (ixVarG.f5712f) {
                ixVarG.E = true;
            }
            nxVar.l0("/open", new cl(null, null, null, null, null));
        } else {
            nxVar.g().b(false);
        }
        if (zzu.zzn().g(nxVar.getContext())) {
            Object map = new HashMap();
            if (nxVar.f7407a.i() != null) {
                map = nxVar.f7407a.i().f4645w0;
            }
            nxVar.l0("/logScionEvent", new tk(nxVar.getContext(), 1, map));
        }
    }
}
