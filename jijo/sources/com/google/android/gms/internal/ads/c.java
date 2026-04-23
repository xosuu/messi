package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class c extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fc0 f3133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f3134b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Error f3135d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RuntimeException f3136f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzaad f3137h;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    int i11 = message.arg1;
                    fc0 fc0Var = this.f3133a;
                    fc0Var.getClass();
                    fc0Var.a(i11);
                    SurfaceTexture surfaceTexture = this.f3133a.f4468q;
                    surfaceTexture.getClass();
                    this.f3137h = new zzaad(this, surfaceTexture, i11 != 0);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzdq e10) {
                    fg0.d("Failed to initialize placeholder surface", e10);
                    this.f3136f = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    fg0.d("Failed to initialize placeholder surface", e11);
                    this.f3135d = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    fg0.d("Failed to initialize placeholder surface", e12);
                    this.f3136f = e12;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    fc0 fc0Var2 = this.f3133a;
                    fc0Var2.getClass();
                    fc0Var2.b();
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
