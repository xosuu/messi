package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
public final class nv extends Thread implements SurfaceTexture.OnFrameAvailableListener, lv {
    public static final float[] N = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public SurfaceTexture A;
    public int B;
    public int C;
    public int D;
    public final FloatBuffer E;
    public final CountDownLatch F;
    public final Object G;
    public EGL10 H;
    public EGLDisplay I;
    public EGLContext J;
    public EGLSurface K;
    public volatile boolean L;
    public volatile boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mv f7393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f7394b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f7395d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f7396f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f7397h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f7398q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[] f7399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f7400t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f7401u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f7402v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f7403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7404x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7405y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SurfaceTexture f7406z;

    public nv(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.E = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(N).position(0);
        this.f7394b = new float[9];
        this.f7395d = new float[9];
        this.f7396f = new float[9];
        this.f7397h = new float[9];
        this.f7398q = new float[9];
        this.f7399s = new float[9];
        this.f7400t = new float[9];
        this.f7401u = Float.NaN;
        mv mvVar = new mv(context);
        this.f7393a = mvVar;
        mvVar.f7064h = this;
        this.F = new CountDownLatch(1);
        this.G = new Object();
    }

    public static final void f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr2[0] * fArr3[0];
        float f11 = fArr2[1];
        float f12 = fArr3[3];
        float f13 = fArr2[2];
        float f14 = fArr3[6];
        fArr[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr2[0];
        float f16 = fArr3[1] * f15;
        float f17 = fArr3[4];
        float f18 = fArr3[7];
        fArr[1] = f16 + (f11 * f17) + (f13 * f18);
        float f19 = f15 * fArr3[2];
        float f20 = fArr2[1];
        float f21 = fArr3[5];
        float f22 = fArr3[8];
        fArr[2] = f19 + (f20 * f21) + (f13 * f22);
        float f23 = fArr2[3];
        float f24 = fArr3[0];
        float f25 = fArr2[4];
        float f26 = fArr2[5];
        fArr[3] = (f23 * f24) + (f12 * f25) + (f26 * f14);
        float f27 = fArr2[3];
        float f28 = fArr3[1];
        fArr[4] = (f27 * f28) + (f25 * f17) + (f26 * f18);
        float f29 = fArr3[2];
        fArr[5] = (f27 * f29) + (fArr2[4] * f21) + (f26 * f22);
        float f30 = fArr2[6] * f24;
        float f31 = fArr2[7];
        float f32 = fArr3[3] * f31;
        float f33 = fArr2[8];
        fArr[6] = f30 + f32 + (f14 * f33);
        float f34 = fArr2[6];
        float f35 = f18 * f33;
        fArr[7] = f35 + (f31 * fArr3[4]) + (f28 * f34);
        fArr[8] = (f34 * f29) + (fArr2[7] * fArr3[5]) + (f33 * f22);
    }

    public static final void g(float[] fArr, float f10) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d10 = f10;
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = (float) (-Math.sin(d10));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d10);
        fArr[8] = (float) Math.cos(d10);
    }

    public static final void h(float[] fArr, float f10) {
        double d10 = f10;
        fArr[0] = (float) Math.cos(d10);
        fArr[1] = (float) (-Math.sin(d10));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d10);
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int i(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glGetError();
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glGetError();
            GLES20.glCompileShader(iGlCreateShader);
            GLES20.glGetError();
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            GLES20.glGetError();
            if (iArr[0] == 0) {
                GLES20.glGetShaderInfoLog(iGlCreateShader);
                GLES20.glDeleteShader(iGlCreateShader);
                GLES20.glGetError();
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final void a() {
        synchronized (this.G) {
            this.G.notifyAll();
        }
    }

    public final void b(int i10, int i11) {
        synchronized (this.G) {
            this.f7405y = i10;
            this.f7404x = i11;
            this.L = true;
            this.G.notifyAll();
        }
    }

    public final void c() {
        synchronized (this.G) {
            this.M = true;
            this.A = null;
            this.G.notifyAll();
        }
    }

    public final void d(float f10, float f11) {
        int i10 = this.f7405y;
        int i11 = this.f7404x;
        if (i10 <= i11) {
            i10 = i11;
        }
        float f12 = i10;
        this.f7402v -= (f10 * 1.7453293f) / f12;
        float f13 = this.f7403w - ((f11 * 1.7453293f) / f12);
        this.f7403w = f13;
        if (f13 < -1.5707964f) {
            this.f7403w = -1.5707964f;
            f13 = -1.5707964f;
        }
        if (f13 > 1.5707964f) {
            this.f7403w = 1.5707964f;
        }
    }

    public final void e() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.K;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.H.eglMakeCurrent(this.I, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.H.eglDestroySurface(this.I, this.K);
            this.K = null;
        }
        EGLContext eGLContext = this.J;
        if (eGLContext != null) {
            this.H.eglDestroyContext(this.I, eGLContext);
            this.J = null;
        }
        EGLDisplay eGLDisplay = this.I;
        if (eGLDisplay != null) {
            this.H.eglTerminate(eGLDisplay);
            this.I = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.D++;
        synchronized (this.G) {
            this.G.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nv.run():void");
    }
}
