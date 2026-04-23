package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4670b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gv f4671d;

    public fv(gv gvVar) {
        this.f4669a = 2;
        this.f4670b = false;
        this.f4671d = gvVar;
    }

    public final void a() {
        this.f4670b = true;
        this.f4671d.j();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4669a;
        gv gvVar = this.f4671d;
        switch (i10) {
            case 0:
                boolean z9 = this.f4670b;
                gvVar.getClass();
                gvVar.c("windowFocusChanged", "hasWindowFocus", String.valueOf(z9));
                break;
            case 1:
                gvVar.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f4670b));
                break;
            default:
                if (!this.f4670b) {
                    gvVar.j();
                    ew0 ew0Var = zzt.zza;
                    ew0Var.removeCallbacks(this);
                    ew0Var.postDelayed(this, 250L);
                }
                break;
        }
    }

    public /* synthetic */ fv(gv gvVar, boolean z9, int i10) {
        this.f4669a = i10;
        this.f4671d = gvVar;
        this.f4670b = z9;
    }
}
