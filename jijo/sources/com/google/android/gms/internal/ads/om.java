package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm f7610b;

    public /* synthetic */ om(lm lmVar, int i10) {
        this.f7609a = i10;
        this.f7610b = lmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7609a;
        lm lmVar = this.f7610b;
        switch (i10) {
            case 0:
                lmVar.f6659a.destroy();
                break;
            default:
                lmVar.f6659a.destroy();
                break;
        }
    }
}
