package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class jc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j40 f5887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p70 f5888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b50 f5889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i50 f5890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l50 f5891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j60 f5892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f5893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o70 f5894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y00 f5895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzb f5896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final dt f5897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y9 f5898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e60 f5899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lh0 f5900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vt0 f5901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ed0 f5902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n00 f5903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nc0 f5904r;

    public jc0(j40 j40Var, b50 b50Var, i50 i50Var, l50 l50Var, j60 j60Var, Executor executor, o70 o70Var, y00 y00Var, zzb zzbVar, dt dtVar, y9 y9Var, e60 e60Var, lh0 lh0Var, vt0 vt0Var, ed0 ed0Var, p70 p70Var, n00 n00Var, nc0 nc0Var) {
        this.f5887a = j40Var;
        this.f5889c = b50Var;
        this.f5890d = i50Var;
        this.f5891e = l50Var;
        this.f5892f = j60Var;
        this.f5893g = executor;
        this.f5894h = o70Var;
        this.f5895i = y00Var;
        this.f5896j = zzbVar;
        this.f5897k = dtVar;
        this.f5898l = y9Var;
        this.f5899m = e60Var;
        this.f5900n = lh0Var;
        this.f5901o = vt0Var;
        this.f5902p = ed0Var;
        this.f5888b = p70Var;
        this.f5903q = n00Var;
        this.f5904r = nc0Var;
    }

    public static final qu b(nx nxVar, String str, String str2) {
        qu quVar = new qu();
        nxVar.g().f5715s = new ul(quVar);
        nxVar.s0(str, str2);
        return quVar;
    }

    public final void a(nx nxVar, boolean z9, yk ykVar) {
        v9 v9Var;
        nxVar.g().E(new zza() { // from class: com.google.android.gms.internal.ads.gc0
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.f4872a.f5887a.onAdClicked();
            }
        }, this.f5890d, this.f5891e, new qk() { // from class: com.google.android.gms.internal.ads.hc0
            @Override // com.google.android.gms.internal.ads.qk
            public final void a(String str, String str2) {
                this.f5253a.f5892f.a(str, str2);
            }
        }, new pb0(2, this), z9, ykVar, this.f5896j, new i10(18, this), this.f5897k, this.f5900n, this.f5901o, this.f5902p, null, this.f5888b, null, null, null, this.f5903q);
        nxVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.ic0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                jc0 jc0Var = this.f5560a;
                jc0Var.getClass();
                if (((Boolean) zzba.zzc().a(eg.f4010g9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    jc0Var.f5904r.f7243a = motionEvent;
                }
                jc0Var.f5896j.zza();
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        nxVar.setOnClickListener(new jp(1, this));
        if (((Boolean) zzba.zzc().a(eg.f4106q2)).booleanValue() && (v9Var = this.f5898l.f10801b) != null) {
            v9Var.zzo(nxVar);
        }
        o70 o70Var = this.f5894h;
        Executor executor = this.f5893g;
        o70Var.H0(nxVar, executor);
        o70Var.H0(new cb0(nxVar, 2), executor);
        o70Var.J0(nxVar);
        nxVar.l0("/trackActiveViewUnit", new tk(this, 4, nxVar));
        y00 y00Var = this.f5895i;
        y00Var.getClass();
        y00Var.f10701v = new WeakReference(nxVar);
    }
}
