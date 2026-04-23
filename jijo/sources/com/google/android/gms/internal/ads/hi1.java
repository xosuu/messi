package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class hi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jl0 f5290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final di1 f5291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ei1 f5292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qx0 f5293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public qx0 f5294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gi1 f5295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b3 f5296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Looper f5297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ce1 f5299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f5301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ak1 f5302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f5303o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f5304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f5305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yh1 f5308t;

    public hi1(Context context, aa aaVar) {
        di1 di1Var = new di1(aaVar);
        ei1 ei1Var = new ei1(context);
        mu0 mu0Var = new mu0(context, 0);
        mb1 mb1Var = new mb1(7);
        gi1 gi1Var = new gi1(context);
        b3 b3Var = new b3(22);
        context.getClass();
        this.f5289a = context;
        this.f5291c = di1Var;
        this.f5292d = ei1Var;
        this.f5293e = mu0Var;
        this.f5294f = mb1Var;
        this.f5295g = gi1Var;
        this.f5296h = b3Var;
        int i10 = yn0.f10944a;
        Looper looperMyLooper = Looper.myLooper();
        this.f5297i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f5299k = ce1.f3257b;
        this.f5300l = 1;
        this.f5301m = true;
        this.f5302n = ak1.f2720c;
        this.f5308t = new yh1(yn0.u(20L), yn0.u(500L));
        this.f5290b = l90.f6542a;
        this.f5303o = 500L;
        this.f5304p = 2000L;
        this.f5305q = true;
        this.f5307s = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f5298j = -1000;
    }
}
