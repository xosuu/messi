package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.ew0;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HandlerThread f2148a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ew0 f2149b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2150c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2151d = new Object();

    public final Handler zza() {
        return this.f2149b;
    }

    public final Looper zzb() {
        Looper looper;
        synchronized (this.f2151d) {
            try {
                if (this.f2150c != 0) {
                    a.m(this.f2148a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f2148a == null) {
                    zze.zza("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f2148a = handlerThread;
                    handlerThread.start();
                    this.f2149b = new ew0(this.f2148a.getLooper());
                    zze.zza("Looper thread started.");
                } else {
                    zze.zza("Resuming the looper thread");
                    this.f2151d.notifyAll();
                }
                this.f2150c++;
                looper = this.f2148a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}
