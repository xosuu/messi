package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7082a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7083b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7084d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7085f;

    public n(i7 i7Var, String str, long j10) {
        this.f7084d = str;
        this.f7083b = j10;
        this.f7085f = i7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7082a;
        long j10 = this.f7083b;
        Object obj = this.f7084d;
        Object obj2 = this.f7085f;
        switch (i10) {
            case 0:
                m20 m20Var = (m20) obj;
                m20Var.getClass();
                int i11 = yn0.f10944a;
                ui1 ui1Var = ((ri1) m20Var.f6810d).f8608a;
                ui1Var.f9512p.n(j10, obj2);
                if (ui1Var.F == obj2) {
                    mb1 mb1Var = new mb1(10);
                    x.e eVar = ui1Var.f9507k;
                    eVar.j(26, mb1Var);
                    eVar.i();
                }
                break;
            default:
                i7 i7Var = (i7) obj2;
                i7Var.f5511a.a(j10, (String) obj);
                i7Var.f5511a.b(i7Var.toString());
                break;
        }
    }

    public /* synthetic */ n(m20 m20Var, Surface surface, long j10) {
        this.f7084d = m20Var;
        this.f7085f = surface;
        this.f7083b = j10;
    }
}
