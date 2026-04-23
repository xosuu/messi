package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m20 f3621b;

    public /* synthetic */ dd0(m20 m20Var, int i10) {
        this.f3620a = i10;
        this.f3621b = m20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3620a;
        m20 m20Var = this.f3621b;
        switch (i10) {
            case 0:
                ((ed0) m20Var.f6810d).f3907a.a((Map) m20Var.f6809b, false);
                break;
            default:
                ((ed0) m20Var.f6810d).f3907a.a((Map) m20Var.f6809b, true);
                break;
        }
    }
}
