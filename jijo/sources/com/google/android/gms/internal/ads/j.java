package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yq1 f5735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f5736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f5737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f5739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5751q;

    public j(Context context) {
        DisplayManager displayManager;
        yq1 yq1Var = new yq1();
        yq1Var.f11015a = new xq1();
        yq1Var.f11016b = new xq1();
        yq1Var.f11018d = -9223372036854775807L;
        this.f5735a = yq1Var;
        h hVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new h(this, displayManager);
        this.f5736b = hVar;
        this.f5737c = hVar != null ? i.f5444h : null;
        this.f5745k = -9223372036854775807L;
        this.f5746l = -9223372036854775807L;
        this.f5740f = -1.0f;
        this.f5743i = 1.0f;
        this.f5744j = 0;
    }

    public static /* bridge */ /* synthetic */ void a(j jVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            jVar.f5745k = refreshRate;
            jVar.f5746l = (refreshRate * 80) / 100;
        } else {
            fg0.f("Unable to query display refresh rate");
            jVar.f5745k = -9223372036854775807L;
            jVar.f5746l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (yn0.f10944a < 30 || (surface = this.f5739e) == null || this.f5744j == Integer.MIN_VALUE || this.f5742h == 0.0f) {
            return;
        }
        this.f5742h = 0.0f;
        g.a(surface, 0.0f);
    }

    public final void c() {
        float f10;
        if (yn0.f10944a < 30 || this.f5739e == null) {
            return;
        }
        yq1 yq1Var = this.f5735a;
        if (!yq1Var.f11015a.c()) {
            f10 = this.f5740f;
        } else if (yq1Var.f11015a.c()) {
            f10 = (float) (1.0E9d / (yq1Var.f11015a.f10639e != 0 ? r2.f10640f / r4 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f11 = this.f5741g;
        if (f10 != f11) {
            if (f10 != -1.0f && f11 != -1.0f) {
                float f12 = 1.0f;
                if (yq1Var.f11015a.c()) {
                    if ((yq1Var.f11015a.c() ? yq1Var.f11015a.f10640f : -9223372036854775807L) >= 5000000000L) {
                        f12 = 0.02f;
                    }
                }
                if (Math.abs(f10 - this.f5741g) < f12) {
                    return;
                }
            } else if (f10 == -1.0f && yq1Var.f11019e < 30) {
                return;
            }
            this.f5741g = f10;
            d(false);
        }
    }

    public final void d(boolean z9) {
        Surface surface;
        if (yn0.f10944a < 30 || (surface = this.f5739e) == null || this.f5744j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f5738d) {
            float f11 = this.f5741g;
            if (f11 != -1.0f) {
                f10 = this.f5743i * f11;
            }
        }
        if (z9 || this.f5742h != f10) {
            this.f5742h = f10;
            g.a(surface, f10);
        }
    }
}
