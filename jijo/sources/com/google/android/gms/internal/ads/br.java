package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import java.lang.Thread;

/* JADX INFO: loaded from: classes.dex */
public final class br implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f3081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cr f3082c;

    public /* synthetic */ br(cr crVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i10) {
        this.f3080a = i10;
        this.f3081b = uncaughtExceptionHandler;
        this.f3082c = crVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i10 = this.f3080a;
        cr crVar = this.f3082c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3081b;
        switch (i10) {
            case 0:
                try {
                    try {
                        crVar.g(th);
                        break;
                    } catch (Throwable unused) {
                        zzm.zzg("AdMob exception reporter failed reporting the exception.");
                        break;
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                } finally {
                }
            default:
                try {
                    try {
                        crVar.g(th);
                    } finally {
                    }
                    break;
                } catch (Throwable unused2) {
                    zzm.zzg("AdMob exception reporter failed reporting the exception.");
                    break;
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
        }
    }
}
