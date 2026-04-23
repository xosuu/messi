package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xv extends cv implements TextureView.SurfaceTextureListener, iv {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public float E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pv f10655d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qv f10656f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ov f10657h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public bv f10658q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Surface f10659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public yw f10660t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f10661u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String[] f10662v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10664x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public nv f10665y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f10666z;

    public xv(Context context, ov ovVar, pv pvVar, qv qvVar, boolean z9) {
        super(context);
        this.f10664x = 1;
        this.f10655d = pvVar;
        this.f10656f = qvVar;
        this.f10666z = z9;
        this.f10657h = ovVar;
        setSurfaceTextureListener(this);
        jg jgVar = qvVar.f8285d;
        lg lgVar = qvVar.f8286e;
        y3.c.i(lgVar, jgVar, "vpc2");
        qvVar.f8290i = true;
        lgVar.b("vpn", r());
        qvVar.f8295n = this;
    }

    public static String D(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void A(int i10) {
        yw ywVar = this.f10660t;
        if (ywVar != null) {
            tw twVar = ywVar.f11053b;
            synchronized (twVar) {
                twVar.f9293d = ((long) i10) * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void B(int i10) {
        yw ywVar = this.f10660t;
        if (ywVar != null) {
            tw twVar = ywVar.f11053b;
            synchronized (twVar) {
                twVar.f9294e = ((long) i10) * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void C(int i10) {
        yw ywVar = this.f10660t;
        if (ywVar != null) {
            tw twVar = ywVar.f11053b;
            synchronized (twVar) {
                twVar.f9292c = ((long) i10) * 1000;
            }
        }
    }

    public final void E() {
        if (this.A) {
            return;
        }
        this.A = true;
        zzt.zza.post(new tv(this, 7));
        zzn();
        qv qvVar = this.f10656f;
        if (qvVar.f8290i && !qvVar.f8291j) {
            y3.c.i(qvVar.f8286e, qvVar.f8285d, "vfr2");
            qvVar.f8291j = true;
        }
        if (this.B) {
            t();
        }
    }

    public final void F(boolean z9, Integer num) {
        yw ywVar = this.f10660t;
        if (ywVar != null && !z9) {
            ywVar.C = num;
            return;
        }
        if (this.f10661u == null || this.f10659s == null) {
            return;
        }
        if (z9) {
            if (!J()) {
                zzm.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                ywVar.f11058s.k();
                G();
            }
        }
        if (this.f10661u.startsWith("cache:")) {
            lw lwVarH = this.f10655d.h(this.f10661u);
            if (lwVarH instanceof qw) {
                qw qwVar = (qw) lwVarH;
                synchronized (qwVar) {
                    qwVar.f8302s = true;
                    qwVar.notify();
                }
                yw ywVar2 = qwVar.f8299f;
                ywVar2.f11061v = null;
                qwVar.f8299f = null;
                this.f10660t = ywVar2;
                ywVar2.C = num;
                if (ywVar2.f11058s == null) {
                    zzm.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(lwVarH instanceof pw)) {
                    zzm.zzj("Stream cache miss: ".concat(String.valueOf(this.f10661u)));
                    return;
                }
                pw pwVar = (pw) lwVarH;
                zzt zztVarZzp = zzu.zzp();
                pv pvVar = this.f10655d;
                zztVarZzp.zzc(pvVar.getContext(), pvVar.zzn().afmaVersion);
                ByteBuffer byteBufferU = pwVar.u();
                boolean z10 = pwVar.f7980z;
                String str = pwVar.f7970f;
                if (str == null) {
                    zzm.zzj("Stream cache URL is null.");
                    return;
                }
                pv pvVar2 = this.f10655d;
                yw ywVar3 = new yw(pvVar2.getContext(), this.f10657h, pvVar2, num);
                zzm.zzi("ExoPlayerAdapter initialized.");
                this.f10660t = ywVar3;
                ywVar3.r(new Uri[]{Uri.parse(str)}, byteBufferU, z10);
            }
        } else {
            pv pvVar3 = this.f10655d;
            yw ywVar4 = new yw(pvVar3.getContext(), this.f10657h, pvVar3, num);
            zzm.zzi("ExoPlayerAdapter initialized.");
            this.f10660t = ywVar4;
            zzt zztVarZzp2 = zzu.zzp();
            pv pvVar4 = this.f10655d;
            zztVarZzp2.zzc(pvVar4.getContext(), pvVar4.zzn().afmaVersion);
            Uri[] uriArr = new Uri[this.f10662v.length];
            int i10 = 0;
            while (true) {
                String[] strArr = this.f10662v;
                if (i10 >= strArr.length) {
                    break;
                }
                uriArr[i10] = Uri.parse(strArr[i10]);
                i10++;
            }
            yw ywVar5 = this.f10660t;
            ywVar5.getClass();
            ywVar5.r(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f10660t.f11061v = this;
        H(this.f10659s);
        bk1 bk1Var = this.f10660t.f11058s;
        if (bk1Var != null) {
            int iZzf = bk1Var.zzf();
            this.f10664x = iZzf;
            if (iZzf == 3) {
                E();
            }
        }
    }

    public final void G() {
        if (this.f10660t != null) {
            H(null);
            yw ywVar = this.f10660t;
            if (ywVar != null) {
                ywVar.f11061v = null;
                bk1 bk1Var = ywVar.f11058s;
                if (bk1Var != null) {
                    bk1Var.c(ywVar);
                    ywVar.f11058s.n();
                    ywVar.f11058s = null;
                    yw.H.decrementAndGet();
                }
                this.f10660t = null;
            }
            this.f10664x = 1;
            this.f10663w = false;
            this.A = false;
            this.B = false;
        }
    }

    public final void H(Surface surface) {
        yw ywVar = this.f10660t;
        if (ywVar == null) {
            zzm.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            bk1 bk1Var = ywVar.f11058s;
            if (bk1Var != null) {
                bk1Var.i(surface);
            }
        } catch (IOException e10) {
            zzm.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    public final boolean I() {
        return J() && this.f10664x != 1;
    }

    public final boolean J() {
        yw ywVar = this.f10660t;
        return (ywVar == null || ywVar.f11058s == null || this.f10663w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void a(int i10) {
        yw ywVar = this.f10660t;
        if (ywVar != null) {
            tw twVar = ywVar.f11053b;
            synchronized (twVar) {
                twVar.f9291b = ((long) i10) * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void b(int i10) {
        yw ywVar = this.f10660t;
        if (ywVar != null) {
            Iterator it = ywVar.F.iterator();
            while (it.hasNext()) {
                sw swVar = (sw) ((WeakReference) it.next()).get();
                if (swVar != null) {
                    swVar.D = i10;
                    for (Socket socket : swVar.E) {
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(swVar.D);
                            } catch (SocketException e10) {
                                zzm.zzk("Failed to update receive buffer size.", e10);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void c() {
        zzt.zza.post(new tv(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void d(int i10) {
        yw ywVar;
        if (this.f10664x != i10) {
            this.f10664x = i10;
            if (i10 == 3) {
                E();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (this.f10657h.f7671a && (ywVar = this.f10660t) != null) {
                ywVar.s(false);
            }
            this.f10656f.f8294m = false;
            sv svVar = this.f3455b;
            svVar.f8971d = false;
            svVar.a();
            zzt.zza.post(new tv(this, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void e(int i10, int i11) {
        this.C = i10;
        this.D = i11;
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.E != f10) {
            this.E = f10;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void f(long j10, boolean z9) {
        if (this.f10655d != null) {
            nu.f7387e.execute(new uv(this, z9, j10, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void g(Exception exc) {
        String strD = D("onLoadException", exc);
        zzm.zzj("ExoPlayerAdapter exception: ".concat(strD));
        zzu.zzo().h("AdExoPlayerView.onException", exc);
        zzt.zza.post(new vv(this, strD, 0));
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void h(String str, Exception exc) {
        yw ywVar;
        String strD = D(str, exc);
        zzm.zzj("ExoPlayerAdapter error: ".concat(strD));
        int i10 = 1;
        this.f10663w = true;
        if (this.f10657h.f7671a && (ywVar = this.f10660t) != null) {
            ywVar.s(false);
        }
        zzt.zza.post(new vv(this, strD, i10));
        zzu.zzo().h("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void i(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f10662v = new String[]{str};
        } else {
            this.f10662v = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f10661u;
        boolean z9 = false;
        if (this.f10657h.f7681k && str2 != null && !str.equals(str2) && this.f10664x == 4) {
            z9 = true;
        }
        this.f10661u = str;
        F(z9, num);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int j() {
        if (I()) {
            return (int) this.f10660t.f11058s.zzk();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int k() {
        yw ywVar = this.f10660t;
        if (ywVar != null) {
            return ywVar.f11063x;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int l() {
        if (I()) {
            return (int) this.f10660t.f11058s.f();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int m() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int n() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final long o() {
        yw ywVar = this.f10660t;
        if (ywVar != null) {
            return ywVar.u();
        }
        return -1L;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.E;
        if (f10 != 0.0f && this.f10665y == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        nv nvVar = this.f10665y;
        if (nvVar != null) {
            nvVar.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        yw ywVar;
        float f10;
        int i12;
        SurfaceTexture surfaceTexture2;
        if (this.f10666z) {
            nv nvVar = new nv(getContext());
            this.f10665y = nvVar;
            nvVar.f7405y = i10;
            nvVar.f7404x = i11;
            nvVar.A = surfaceTexture;
            nvVar.start();
            nv nvVar2 = this.f10665y;
            if (nvVar2.A == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    nvVar2.F.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = nvVar2.f7406z;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f10665y.c();
                this.f10665y = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f10659s = surface;
        if (this.f10660t == null) {
            F(false, null);
        } else {
            H(surface);
            if (!this.f10657h.f7671a && (ywVar = this.f10660t) != null) {
                ywVar.s(true);
            }
        }
        int i13 = this.C;
        if (i13 == 0 || (i12 = this.D) == 0) {
            f10 = i11 > 0 ? i10 / i11 : 1.0f;
            if (this.E != f10) {
                this.E = f10;
                requestLayout();
            }
        } else {
            f10 = i12 > 0 ? i13 / i12 : 1.0f;
            if (this.E != f10) {
                this.E = f10;
                requestLayout();
            }
        }
        zzt.zza.post(new tv(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        s();
        nv nvVar = this.f10665y;
        if (nvVar != null) {
            nvVar.c();
            this.f10665y = null;
        }
        yw ywVar = this.f10660t;
        if (ywVar != null) {
            if (ywVar != null) {
                ywVar.s(false);
            }
            Surface surface = this.f10659s;
            if (surface != null) {
                surface.release();
            }
            this.f10659s = null;
            H(null);
        }
        zzt.zza.post(new tv(this, 3));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        nv nvVar = this.f10665y;
        if (nvVar != null) {
            nvVar.b(i10, i11);
        }
        zzt.zza.post(new b3.m(this, i10, i11, 2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f10656f.b(this);
        this.f3454a.a(surfaceTexture, this.f10658q);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i10);
        zzt.zza.post(new k2.e(i10, 4, this));
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final long p() {
        yw ywVar = this.f10660t;
        if (ywVar == null) {
            return -1L;
        }
        if (ywVar.E == null || !ywVar.E.A) {
            return ywVar.f11062w;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final long q() {
        yw ywVar = this.f10660t;
        if (ywVar != null) {
            return ywVar.q();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final String r() {
        return "ExoPlayer/2".concat(true != this.f10666z ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void s() {
        yw ywVar;
        if (I()) {
            if (this.f10657h.f7671a && (ywVar = this.f10660t) != null) {
                ywVar.s(false);
            }
            this.f10660t.f11058s.h(false);
            this.f10656f.f8294m = false;
            sv svVar = this.f3455b;
            svVar.f8971d = false;
            svVar.a();
            zzt.zza.post(new tv(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void t() {
        yw ywVar;
        int i10 = 1;
        if (!I()) {
            this.B = true;
            return;
        }
        if (this.f10657h.f7671a && (ywVar = this.f10660t) != null) {
            ywVar.s(true);
        }
        this.f10660t.f11058s.h(true);
        qv qvVar = this.f10656f;
        qvVar.f8294m = true;
        if (qvVar.f8291j && !qvVar.f8292k) {
            y3.c.i(qvVar.f8286e, qvVar.f8285d, "vfp2");
            qvVar.f8292k = true;
        }
        sv svVar = this.f3455b;
        svVar.f8971d = true;
        svVar.a();
        this.f3454a.f6395c = true;
        zzt.zza.post(new tv(this, i10));
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void u(int i10) {
        if (I()) {
            long j10 = i10;
            bk1 bk1Var = this.f10660t.f11058s;
            bk1Var.a(bk1Var.zzd(), j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void v(bv bvVar) {
        this.f10658q = bvVar;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void w(String str) {
        if (str != null) {
            i(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void x() {
        if (J()) {
            this.f10660t.f11058s.k();
            G();
        }
        qv qvVar = this.f10656f;
        qvVar.f8294m = false;
        sv svVar = this.f3455b;
        svVar.f8971d = false;
        svVar.a();
        qvVar.a();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void y(float f10, float f11) {
        nv nvVar = this.f10665y;
        if (nvVar != null) {
            nvVar.d(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final Integer z() {
        yw ywVar = this.f10660t;
        if (ywVar != null) {
            return ywVar.C;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rv
    public final void zzn() {
        zzt.zza.post(new tv(this, 2));
    }
}
