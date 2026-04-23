package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j40 f10142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b50 f10143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i50 f10144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l50 f10145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j60 f10146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p70 f10147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ed0 f10148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vt0 f10149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lh0 f10150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n00 f10151j;

    public wb0(j40 j40Var, b50 b50Var, i50 i50Var, l50 l50Var, j60 j60Var, p70 p70Var, ed0 ed0Var, vt0 vt0Var, lh0 lh0Var, n00 n00Var) {
        this.f10142a = j40Var;
        this.f10143b = b50Var;
        this.f10144c = i50Var;
        this.f10145d = l50Var;
        this.f10146e = j60Var;
        this.f10147f = p70Var;
        this.f10148g = ed0Var;
        this.f10149h = vt0Var;
        this.f10150i = lh0Var;
        this.f10151j = n00Var;
    }

    public final void a(xb0 xb0Var, fx fxVar) {
        vb0 vb0Var = xb0Var.f10532a;
        b50 b50Var = this.f10143b;
        Objects.requireNonNull(b50Var);
        pb0 pb0Var = new pb0(1, b50Var);
        j40 j40Var = this.f10142a;
        i50 i50Var = this.f10144c;
        l50 l50Var = this.f10145d;
        j60 j60Var = this.f10146e;
        p70 p70Var = this.f10147f;
        synchronized (vb0Var) {
            vb0Var.b(j40Var, i50Var, l50Var, j60Var, pb0Var);
            vb0Var.f9829q = p70Var;
        }
        if (!((Boolean) zzba.zzc().a(eg.m9)).booleanValue() || fxVar == null || fxVar.g() == null) {
            return;
        }
        ix ixVarG = fxVar.g();
        ixVarG.h(this.f10151j, this.f10150i, this.f10149h);
        ixVarG.j(this.f10151j, this.f10150i, this.f10148g);
    }
}
