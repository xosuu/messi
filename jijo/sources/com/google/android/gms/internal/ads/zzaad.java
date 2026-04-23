package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class zzaad extends Surface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f11384f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f11385h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f11387b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11388d;

    public /* synthetic */ zzaad(c cVar, SurfaceTexture surfaceTexture, boolean z9) {
        super(surfaceTexture);
        this.f11387b = cVar;
        this.f11386a = z9;
    }

    public static zzaad b(Context context, boolean z9) {
        boolean z10 = false;
        tc1.W(!z9 || c(context));
        c cVar = new c("ExoPlayer:PlaceholderSurface");
        int i10 = z9 ? f11384f : 0;
        cVar.start();
        Handler handler = new Handler(cVar.getLooper(), cVar);
        cVar.f3134b = handler;
        cVar.f3133a = new fc0(handler);
        synchronized (cVar) {
            cVar.f3134b.obtainMessage(1, i10, 0).sendToTarget();
            while (cVar.f3137h == null && cVar.f3136f == null && cVar.f3135d == null) {
                try {
                    cVar.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = cVar.f3136f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = cVar.f3135d;
        if (error != null) {
            throw error;
        }
        zzaad zzaadVar = cVar.f3137h;
        zzaadVar.getClass();
        return zzaadVar;
    }

    public static synchronized boolean c(Context context) {
        String strEglQueryString;
        int i10;
        try {
            if (!f11385h) {
                int i11 = yn0.f10944a;
                if (i11 >= 24 && ((i11 >= 26 || !("samsung".equals(yn0.f10946c) || "XT1650".equals(yn0.f10947d))) && ((i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i10 = (strEglQueryString2 == null || !strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 2 : 1;
                } else {
                    i10 = 0;
                }
                f11384f = i10;
                f11385h = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11384f != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f11387b) {
            try {
                if (!this.f11388d) {
                    Handler handler = this.f11387b.f3134b;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f11388d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
