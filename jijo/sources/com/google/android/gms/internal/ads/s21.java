package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class s21 extends i11 implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f8776t;

    public s21(Runnable runnable) {
        runnable.getClass();
        this.f8776t = runnable;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final String d() {
        return fb1.i("task=[", this.f8776t.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f8776t.run();
        } catch (Throwable th) {
            g(th);
            throw th;
        }
    }
}
