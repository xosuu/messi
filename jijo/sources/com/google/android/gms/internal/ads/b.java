package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class b extends jn1 implements d {

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int[] f2847j1 = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static boolean f2848k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static boolean f2849l1;
    public final Context I0;
    public final vq1 J0;
    public final m20 K0;
    public final boolean L0;
    public final e M0;
    public final androidx.emoji2.text.v N0;
    public boolean O0;
    public boolean P0;
    public b4.c Q0;
    public boolean R0;
    public boolean S0;
    public Surface T0;
    public zzaad U0;
    public boolean V0;
    public int W0;
    public long X0;
    public int Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f2850a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public long f2851b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f2852c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public long f2853d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public e10 f2854e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public e10 f2855f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f2856g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f2857h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f2858i1;

    public b(Context context, dg dgVar, Handler handler, ri1 ri1Var) {
        super(2, dgVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.I0 = applicationContext;
        this.K0 = new m20(handler, ri1Var);
        androidx.emoji2.text.r rVar = new androidx.emoji2.text.r(applicationContext, new e(applicationContext, this));
        tc1.W(!rVar.f631a);
        if (((tq1) rVar.f635h) == null) {
            if (((c00) rVar.f634f) == null) {
                rVar.f634f = new sq1();
            }
            rVar.f635h = new tq1((c00) rVar.f634f);
        }
        wq1 wq1Var = new wq1(rVar);
        rVar.f631a = true;
        this.J0 = wq1Var.f10303a;
        e eVar = wq1Var.f10304b;
        tc1.A(eVar);
        this.M0 = eVar;
        this.N0 = new androidx.emoji2.text.v(2);
        this.L0 = "NVIDIA".equals(yn0.f10946c);
        this.W0 = 1;
        this.f2854e1 = e10.f3801d;
        this.f2858i1 = 0;
        this.f2855f1 = null;
        this.f2857h1 = -1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean t0(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 2926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b.t0(java.lang.String):boolean");
    }

    public static List u0(Context context, y1 y1Var, boolean z9, boolean z10) {
        String str = y1Var.f10714m;
        if (str == null) {
            return wz0.f10382h;
        }
        if (yn0.f10944a >= 26 && "video/dolby-vision".equals(str) && !zq1.a(context)) {
            String strB = pn1.b(y1Var);
            List listC = strB == null ? wz0.f10382h : pn1.c(strB, z9, z10);
            if (!listC.isEmpty()) {
                return listC;
            }
        }
        return pn1.d(y1Var, z9, z10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int x0(com.google.android.gms.internal.ads.cn1 r10, com.google.android.gms.internal.ads.y1 r11) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b.x0(com.google.android.gms.internal.ads.cn1, com.google.android.gms.internal.ads.y1):int");
    }

    public static int y0(cn1 cn1Var, y1 y1Var) {
        int i10 = y1Var.f10715n;
        if (i10 == -1) {
            return x0(cn1Var, y1Var);
        }
        List list = y1Var.f10716o;
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return i10 + length;
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void A() {
        e eVar = this.M0;
        if (eVar.f3773d == 0) {
            eVar.f3773d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1, com.google.android.gms.internal.ads.vh1
    public final void B() {
        m20 m20Var = this.K0;
        this.f2855f1 = null;
        if (this.O0) {
            this.J0.f9948i.f10304b.e(0);
        } else {
            this.M0.e(0);
        }
        this.V0 = false;
        try {
            super.B();
            wh1 wh1Var = this.B0;
            m20Var.getClass();
            synchronized (wh1Var) {
            }
            Handler handler = (Handler) m20Var.f6809b;
            if (handler != null) {
                handler.post(new o(m20Var, wh1Var, 1));
            }
            m20Var.i(e10.f3801d);
        } catch (Throwable th) {
            m20Var.g(this.B0);
            m20Var.i(e10.f3801d);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void C(boolean z9, boolean z10) {
        this.B0 = new wh1();
        x();
        wh1 wh1Var = this.B0;
        m20 m20Var = this.K0;
        Handler handler = (Handler) m20Var.f6809b;
        if (handler != null) {
            handler.post(new o(m20Var, wh1Var, 0));
        }
        if (!this.P0) {
            this.O0 = this.f2856g1;
            this.P0 = true;
        }
        if (this.O0) {
            this.J0.f9948i.f10304b.f3773d = z10 ? 1 : 0;
        } else {
            this.M0.f3773d = z10 ? 1 : 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void D() {
        u();
    }

    @Override // com.google.android.gms.internal.ads.jn1, com.google.android.gms.internal.ads.vh1
    public final void E(long j10, boolean z9) throws zzhw {
        vq1 vq1Var = this.J0;
        vq1Var.a();
        long j11 = this.C0.f5655c;
        vq1Var.getClass();
        super.E(j10, z9);
        e eVar = this.M0;
        j jVar = eVar.f3771b;
        jVar.f5747m = 0L;
        jVar.f5750p = -1L;
        jVar.f5748n = -1L;
        eVar.f3776g = -9223372036854775807L;
        eVar.f3774e = -9223372036854775807L;
        eVar.e(1);
        eVar.f3777h = -9223372036854775807L;
        if (z9) {
            eVar.f3778i = false;
            eVar.f3777h = -9223372036854775807L;
        }
        this.Z0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final float F(float f10, y1[] y1VarArr) {
        float fMax = -1.0f;
        for (y1 y1Var : y1VarArr) {
            float f11 = y1Var.f10721t;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void H(long j10) {
        super.H(j10);
        this.f2850a1--;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void I() {
        this.f2850a1++;
        int i10 = yn0.f10944a;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void J(y1 y1Var) throws zzhw {
        if (this.O0) {
            try {
                vq1 vq1Var = this.J0;
                l90 l90Var = this.f9854s;
                l90Var.getClass();
                wq1.a(vq1Var.f9948i, y1Var, l90Var);
                throw null;
            } catch (zzabb e10) {
                throw v(7000, y1Var, e10, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void L() {
        super.L();
        this.f2850a1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final boolean O(cn1 cn1Var) {
        return this.T0 != null || w0(cn1Var);
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final int V(kn1 kn1Var, y1 y1Var) {
        boolean z9;
        boolean zG = xm.g(y1Var.f10714m);
        int i10 = NotificationCompat.FLAG_HIGH_PRIORITY;
        if (!zG) {
            return NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        int i11 = 1;
        int i12 = 0;
        boolean z10 = y1Var.f10717p != null;
        Context context = this.I0;
        List listU0 = u0(context, y1Var, z10, false);
        if (z10 && listU0.isEmpty()) {
            listU0 = u0(context, y1Var, false, false);
        }
        if (!listU0.isEmpty()) {
            if (y1Var.G == 0) {
                cn1 cn1Var = (cn1) listU0.get(0);
                boolean zC = cn1Var.c(y1Var);
                if (zC) {
                    z9 = true;
                } else {
                    for (int i13 = 1; i13 < listU0.size(); i13++) {
                        cn1 cn1Var2 = (cn1) listU0.get(i13);
                        if (cn1Var2.c(y1Var)) {
                            cn1Var = cn1Var2;
                            z9 = false;
                            zC = true;
                            break;
                        }
                    }
                    z9 = true;
                }
                int i14 = true != zC ? 3 : 4;
                int i15 = true != cn1Var.d(y1Var) ? 8 : 16;
                int i16 = true != cn1Var.f3349g ? 0 : 64;
                if (true != z9) {
                    i10 = 0;
                }
                if (yn0.f10944a >= 26 && "video/dolby-vision".equals(y1Var.f10714m) && !zq1.a(context)) {
                    i10 = NotificationCompat.FLAG_LOCAL_ONLY;
                }
                if (zC) {
                    List listU02 = u0(context, y1Var, z10, true);
                    if (!listU02.isEmpty()) {
                        Pattern pattern = pn1.f7924a;
                        ArrayList arrayList = new ArrayList(listU02);
                        Collections.sort(arrayList, new ln1(new mx0(y1Var)));
                        cn1 cn1Var3 = (cn1) arrayList.get(0);
                        if (cn1Var3.c(y1Var) && cn1Var3.d(y1Var)) {
                            i12 = 32;
                        }
                    }
                }
                return i14 | i15 | i12 | i16 | i10;
            }
            i11 = 2;
        }
        return i11 | NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final xh1 W(cn1 cn1Var, y1 y1Var, y1 y1Var2) {
        int i10;
        int i11;
        xh1 xh1VarA = cn1Var.a(y1Var, y1Var2);
        b4.c cVar = this.Q0;
        cVar.getClass();
        int i12 = cVar.f1309a;
        int i13 = y1Var2.f10719r;
        int i14 = xh1VarA.f10560e;
        if (i13 > i12 || y1Var2.f10720s > cVar.f1310b) {
            i14 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (y0(cn1Var, y1Var2) > cVar.f1311c) {
            i14 |= 64;
        }
        String str = cn1Var.f3343a;
        if (i14 != 0) {
            i11 = i14;
            i10 = 0;
        } else {
            i10 = xh1VarA.f10559d;
            i11 = 0;
        }
        return new xh1(str, y1Var, y1Var2, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final xh1 X(cj0 cj0Var) throws zzhw {
        xh1 xh1VarX = super.X(cj0Var);
        y1 y1Var = (y1) cj0Var.f3301b;
        y1Var.getClass();
        m20 m20Var = this.K0;
        Handler handler = (Handler) m20Var.f6809b;
        if (handler != null) {
            handler.post(new l0.a(m20Var, y1Var, xh1VarX, 11, 0));
        }
        return xh1VarX;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final ym1 a0(cn1 cn1Var, y1 y1Var, float f10) {
        int iMax;
        int iMax2;
        boolean z9;
        int i10;
        wk1 wk1Var;
        int i11;
        Point pointF;
        int i12;
        boolean z10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z11;
        int i13;
        int i14;
        Pair pairA;
        int iX0;
        zzaad zzaadVar = this.U0;
        boolean z12 = cn1Var.f3348f;
        if (zzaadVar != null && zzaadVar.f11386a != z12) {
            v0();
        }
        y1[] y1VarArr = this.f9857v;
        y1VarArr.getClass();
        int iY0 = y0(cn1Var, y1Var);
        int length = y1VarArr.length;
        int i15 = y1Var.f10719r;
        float f11 = y1Var.f10721t;
        wk1 wk1Var2 = y1Var.f10726y;
        int i16 = y1Var.f10720s;
        if (length == 1) {
            if (iY0 != -1 && (iX0 = x0(cn1Var, y1Var)) != -1) {
                iY0 = Math.min((int) (iY0 * 1.5f), iX0);
            }
            z9 = z12;
            iMax = i15;
            i10 = iMax;
            wk1Var = wk1Var2;
            iMax2 = i16;
            i11 = iMax2;
        } else {
            iMax = i15;
            iMax2 = i16;
            int i17 = 0;
            boolean z13 = false;
            while (i17 < length) {
                y1 y1Var2 = y1VarArr[i17];
                y1[] y1VarArr2 = y1VarArr;
                if (wk1Var2 != null && y1Var2.f10726y == null) {
                    q0 q0Var = new q0(y1Var2);
                    q0Var.f8064x = wk1Var2;
                    y1Var2 = new y1(q0Var);
                }
                if (cn1Var.a(y1Var, y1Var2).f10559d != 0) {
                    int i18 = y1Var2.f10720s;
                    i13 = length;
                    int i19 = y1Var2.f10719r;
                    z11 = z12;
                    z13 |= i19 == -1 || i18 == -1;
                    iMax = Math.max(iMax, i19);
                    iMax2 = Math.max(iMax2, i18);
                    iY0 = Math.max(iY0, y0(cn1Var, y1Var2));
                } else {
                    z11 = z12;
                    i13 = length;
                }
                i17++;
                y1VarArr = y1VarArr2;
                length = i13;
                z12 = z11;
            }
            z9 = z12;
            if (z13) {
                fg0.f("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z14 = i16 > i15;
                int i20 = z14 ? i16 : i15;
                int i21 = true == z14 ? i15 : i16;
                int[] iArr = f2847j1;
                wk1Var = wk1Var2;
                int i22 = 0;
                while (true) {
                    if (i22 >= 9) {
                        i10 = i15;
                        i11 = i16;
                        break;
                    }
                    float f12 = i21;
                    i11 = i16;
                    float f13 = i20;
                    i10 = i15;
                    int i23 = iArr[i22];
                    int[] iArr2 = iArr;
                    float f14 = i23;
                    if (i23 <= i20 || (i12 = (int) ((f12 / f13) * f14)) <= i21) {
                        break;
                    }
                    int i24 = yn0.f10944a;
                    int i25 = true != z14 ? i23 : i12;
                    if (true != z14) {
                        i23 = i12;
                    }
                    MediaCodecInfo.CodecCapabilities codecCapabilities = cn1Var.f3346d;
                    pointF = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? null : cn1.f(videoCapabilities, i25, i23);
                    if (pointF != null) {
                        z10 = z14;
                        if (cn1Var.e(pointF.x, pointF.y, f11)) {
                            break;
                        }
                    } else {
                        z10 = z14;
                    }
                    i22++;
                    i16 = i11;
                    i15 = i10;
                    iArr = iArr2;
                    z14 = z10;
                }
                pointF = null;
                if (pointF != null) {
                    iMax = Math.max(iMax, pointF.x);
                    iMax2 = Math.max(iMax2, pointF.y);
                    q0 q0Var2 = new q0(y1Var);
                    q0Var2.f8057q = iMax;
                    q0Var2.f8058r = iMax2;
                    iY0 = Math.max(iY0, x0(cn1Var, new y1(q0Var2)));
                    fg0.f("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                i10 = i15;
                wk1Var = wk1Var2;
                i11 = i16;
            }
        }
        b4.c cVar = new b4.c(iMax, iMax2, iY0, 4);
        this.Q0 = cVar;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", cn1Var.f3345c);
        mediaFormat.setInteger("width", i10);
        mediaFormat.setInteger("height", i11);
        tc1.x(mediaFormat, y1Var.f10716o);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        tc1.i(mediaFormat, "rotation-degrees", y1Var.f10722u);
        if (wk1Var != null) {
            wk1 wk1Var3 = wk1Var;
            tc1.i(mediaFormat, "color-transfer", wk1Var3.f10220c);
            tc1.i(mediaFormat, "color-standard", wk1Var3.f10218a);
            tc1.i(mediaFormat, "color-range", wk1Var3.f10219b);
            byte[] bArr = wk1Var3.f10221d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(y1Var.f10714m) && (pairA = pn1.a(y1Var)) != null) {
            tc1.i(mediaFormat, "profile", ((Integer) pairA.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar.f1309a);
        mediaFormat.setInteger("max-height", cVar.f1310b);
        tc1.i(mediaFormat, "max-input-size", cVar.f1311c);
        int i26 = yn0.f10944a;
        if (i26 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.L0) {
            mediaFormat.setInteger("no-post-process", 1);
            i14 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i14 = 0;
        }
        if (i26 >= 35) {
            mediaFormat.setInteger("importance", Math.max(i14, -this.f2857h1));
        }
        if (this.T0 == null) {
            if (!w0(cn1Var)) {
                throw new IllegalStateException();
            }
            if (this.U0 == null) {
                this.U0 = zzaad.b(this.I0, z9);
            }
            this.T0 = this.U0;
        }
        if (this.O0 && !yn0.e(this.J0.f9940a)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (!this.O0) {
            return new ym1(cn1Var, mediaFormat, y1Var, this.T0);
        }
        tc1.W(false);
        tc1.A(null);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.an1] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14, types: [com.google.android.gms.internal.ads.zzaad] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.uj1
    public final void b(int i10, Object obj) throws zzhw {
        Handler handler;
        e eVar = this.M0;
        vq1 vq1Var = this.J0;
        if (i10 != 1) {
            if (i10 == 7) {
                obj.getClass();
                vq1Var.f9948i.f10310h = (si1) obj;
                return;
            }
            if (i10 == 10) {
                obj.getClass();
                int iIntValue = ((Integer) obj).intValue();
                if (this.f2858i1 != iIntValue) {
                    this.f2858i1 = iIntValue;
                    return;
                }
                return;
            }
            if (i10 == 16) {
                obj.getClass();
                this.f2857h1 = ((Integer) obj).intValue();
                an1 an1Var = this.R;
                if (an1Var == null || yn0.f10944a < 35) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f2857h1));
                an1Var.e(bundle);
                return;
            }
            if (i10 == 4) {
                obj.getClass();
                int iIntValue2 = ((Integer) obj).intValue();
                this.W0 = iIntValue2;
                an1 an1Var2 = this.R;
                if (an1Var2 != null) {
                    an1Var2.d(iIntValue2);
                    return;
                }
                return;
            }
            if (i10 == 5) {
                obj.getClass();
                int iIntValue3 = ((Integer) obj).intValue();
                j jVar = eVar.f3771b;
                if (jVar.f5744j == iIntValue3) {
                    return;
                }
                jVar.f5744j = iIntValue3;
                jVar.d(true);
                return;
            }
            if (i10 == 13) {
                obj.getClass();
                ArrayList arrayList = vq1Var.f9941b;
                arrayList.clear();
                arrayList.addAll((List) obj);
                vq1Var.c();
                this.f2856g1 = true;
                return;
            }
            if (i10 != 14) {
                if (i10 == 11) {
                    this.P = (wi1) obj;
                    return;
                }
                return;
            }
            obj.getClass();
            vk0 vk0Var = (vk0) obj;
            if (vk0Var.f9904a == 0 || vk0Var.f9905b == 0) {
                return;
            }
            Surface surface = this.T0;
            tc1.A(surface);
            wq1 wq1Var = vq1Var.f9948i;
            Pair pair = wq1Var.f10312j;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((vk0) wq1Var.f10312j.second).equals(vk0Var)) {
                return;
            }
            wq1Var.f10312j = Pair.create(surface, vk0Var);
            return;
        }
        ?? B = obj instanceof Surface ? (Surface) obj : 0;
        if (B == 0) {
            zzaad zzaadVar = this.U0;
            if (zzaadVar != null) {
                B = zzaadVar;
            } else {
                cn1 cn1Var = this.Y;
                if (cn1Var != null && w0(cn1Var)) {
                    B = zzaad.b(this.I0, cn1Var.f3348f);
                    this.U0 = B;
                }
            }
        }
        Surface surface2 = this.T0;
        m20 m20Var = this.K0;
        if (surface2 == B) {
            if (B == 0 || B == this.U0) {
                return;
            }
            e10 e10Var = this.f2855f1;
            if (e10Var != null) {
                m20Var.i(e10Var);
            }
            Surface surface3 = this.T0;
            if (surface3 == null || !this.V0 || (handler = (Handler) m20Var.f6809b) == null) {
                return;
            }
            handler.post(new n(m20Var, surface3, SystemClock.elapsedRealtime()));
            return;
        }
        this.T0 = B;
        if (!this.O0) {
            j jVar2 = eVar.f3771b;
            jVar2.getClass();
            ?? r62 = true == (B instanceof zzaad) ? 0 : B;
            if (jVar2.f5739e != r62) {
                jVar2.b();
                jVar2.f5739e = r62;
                jVar2.d(true);
            }
            eVar.e(1);
        }
        this.V0 = false;
        int i11 = this.f9855t;
        ?? r02 = this.R;
        ?? r10 = B;
        if (r02 != 0) {
            r10 = B;
            if (!this.O0) {
                ?? r102 = B;
                if (yn0.f10944a < 23) {
                    K();
                    G();
                    r10 = r102;
                } else {
                    if (B != 0) {
                        r102 = B;
                        if (!this.R0) {
                            r02.h(B);
                            r10 = B;
                        }
                    } else {
                        r102 = 0;
                    }
                    K();
                    G();
                    r10 = r102;
                }
            }
        }
        if (r10 == 0 || r10 == this.U0) {
            this.f2855f1 = null;
            if (this.O0) {
                wq1 wq1Var2 = vq1Var.f9948i;
                wq1Var2.getClass();
                vk0.f9903c.getClass();
                wq1Var2.f10312j = null;
                return;
            }
            return;
        }
        e10 e10Var2 = this.f2855f1;
        if (e10Var2 != null) {
            m20Var.i(e10Var2);
        }
        if (i11 == 2) {
            eVar.f3778i = true;
            eVar.f3777h = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final ArrayList b0(kn1 kn1Var, y1 y1Var) {
        List listU0 = u0(this.I0, y1Var, false, false);
        Pattern pattern = pn1.f7924a;
        ArrayList arrayList = new ArrayList(listU0);
        Collections.sort(arrayList, new ln1(new mx0(y1Var)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void e() {
        wq1 wq1Var = this.J0.f9948i;
        if (wq1Var.f10314l == 2) {
            return;
        }
        tm0 tm0Var = wq1Var.f10311i;
        if (tm0Var != null) {
            tm0Var.f9195a.removeCallbacksAndMessages(null);
        }
        wq1Var.f10312j = null;
        wq1Var.f10314l = 2;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void e0(wf1 wf1Var) {
        if (this.S0) {
            ByteBuffer byteBuffer = wf1Var.f10174h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s9 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s9 == 60 && s10 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        an1 an1Var = this.R;
                        an1Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        an1Var.e(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void f() {
        try {
            try {
                Y();
                K();
                this.P0 = false;
                if (this.U0 != null) {
                    v0();
                }
            } finally {
                this.G0 = null;
            }
        } catch (Throwable th) {
            this.P0 = false;
            if (this.U0 != null) {
                v0();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void f0(Exception exc) {
        fg0.d("Video codec error", exc);
        m20 m20Var = this.K0;
        Handler handler = (Handler) m20Var.f6809b;
        if (handler != null) {
            handler.post(new vm(m20Var, 2, exc));
        }
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void g() {
        this.Y0 = 0;
        u();
        this.X0 = SystemClock.elapsedRealtime();
        this.f2851b1 = 0L;
        this.f2852c1 = 0;
        if (this.O0) {
            this.J0.f9948i.f10304b.b();
        } else {
            this.M0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void g0(String str, long j10, long j11) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        m20 m20Var = this.K0;
        Handler handler = (Handler) m20Var.f6809b;
        if (handler != null) {
            handler.post(new l(m20Var, str, j10, j11, 0));
        }
        this.R0 = t0(str);
        cn1 cn1Var = this.Y;
        cn1Var.getClass();
        boolean z9 = false;
        if (yn0.f10944a >= 29 && "video/x-vnd.on2.vp9".equals(cn1Var.f3344b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = cn1Var.f3346d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i10].profile == 16384) {
                    z9 = true;
                    break;
                }
                i10++;
            }
        }
        this.S0 = z9;
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void h() {
        int i10 = this.Y0;
        m20 m20Var = this.K0;
        if (i10 > 0) {
            u();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.X0;
            int i11 = this.Y0;
            Handler handler = (Handler) m20Var.f6809b;
            if (handler != null) {
                handler.post(new m(m20Var, i11, j10));
            }
            this.Y0 = 0;
            this.X0 = jElapsedRealtime;
        }
        int i12 = this.f2852c1;
        if (i12 != 0) {
            long j11 = this.f2851b1;
            Handler handler2 = (Handler) m20Var.f6809b;
            if (handler2 != null) {
                handler2.post(new m(m20Var, j11, i12));
            }
            this.f2851b1 = 0L;
            this.f2852c1 = 0;
        }
        if (this.O0) {
            this.J0.f9948i.f10304b.c();
        } else {
            this.M0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void h0(String str) {
        m20 m20Var = this.K0;
        Handler handler = (Handler) m20Var.f6809b;
        if (handler != null) {
            handler.post(new vm(m20Var, 3, str));
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void i0(y1 y1Var, MediaFormat mediaFormat) {
        an1 an1Var = this.R;
        if (an1Var != null) {
            an1Var.d(this.W0);
        }
        mediaFormat.getClass();
        boolean z9 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z9 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z9 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = y1Var.f10723v;
        int i10 = yn0.f10944a;
        int i11 = y1Var.f10722u;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer2;
            integer2 = integer;
            integer = i12;
        }
        this.f2854e1 = new e10(f10, integer, integer2);
        if (!this.O0) {
            this.M0.d(y1Var.f10721t);
            return;
        }
        q0 q0Var = new q0(y1Var);
        q0Var.f8057q = integer;
        q0Var.f8058r = integer2;
        q0Var.f8060t = 0;
        q0Var.f8061u = f10;
        y1 y1Var2 = new y1(q0Var);
        vq1 vq1Var = this.J0;
        vq1Var.getClass();
        tc1.W(false);
        vq1Var.f9948i.f10304b.d(y1Var2.f10721t);
        vq1Var.f9942c = y1Var2;
        if (vq1Var.f9944e) {
            tc1.W(vq1Var.f9943d != -9223372036854775807L);
            vq1Var.f9945f = vq1Var.f9943d;
        } else {
            vq1Var.c();
            vq1Var.f9944e = true;
            vq1Var.f9945f = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void k0() {
        if (!this.O0) {
            this.M0.e(2);
        } else {
            long j10 = this.C0.f5655c;
            this.J0.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1, com.google.android.gms.internal.ads.vh1
    public final void l(float f10, float f11) throws zzhw {
        super.l(f10, f11);
        e eVar = this.M0;
        eVar.f3779j = f10;
        j jVar = eVar.f3771b;
        jVar.f5743i = f10;
        jVar.f5747m = 0L;
        jVar.f5750p = -1L;
        jVar.f5748n = -1L;
        jVar.d(false);
        if (this.O0) {
            k kVar = this.J0.f9948i.f10305c;
            kVar.getClass();
            tc1.K(f10 > 0.0f);
            e eVar2 = kVar.f6120a;
            eVar2.f3779j = f10;
            j jVar2 = eVar2.f3771b;
            jVar2.f5743i = f10;
            jVar2.f5747m = 0L;
            jVar2.f5750p = -1L;
            jVar2.f5748n = -1L;
            jVar2.d(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final boolean m0(long j10, long j11, an1 an1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z9, boolean z10, y1 y1Var) throws zzhw {
        vq1 vq1Var = this.J0;
        an1Var.getClass();
        in1 in1Var = this.C0;
        long j13 = in1Var.f5655c;
        int iA = this.M0.a(j12, j10, j11, in1Var.f5654b, z10, this.N0);
        if (iA != 4) {
            if (z9 && !z10) {
                q0(an1Var, i10);
                return true;
            }
            Surface surface = this.T0;
            zzaad zzaadVar = this.U0;
            androidx.emoji2.text.v vVar = this.N0;
            if (surface != zzaadVar || this.O0) {
                if (this.O0) {
                    try {
                        vq1Var.b(j10, j11);
                        tc1.W(false);
                        long j14 = vq1Var.f9945f;
                        if (j14 != -9223372036854775807L) {
                            wq1 wq1Var = vq1Var.f9948i;
                            if (wq1Var.f10313k == 0) {
                                long j15 = wq1Var.f10305c.f6128i;
                                if (j15 != -9223372036854775807L && j15 >= j14) {
                                    vq1Var.c();
                                    vq1Var.f9945f = -9223372036854775807L;
                                }
                            }
                        }
                        tc1.A(null);
                        throw null;
                    } catch (zzabb e10) {
                        throw v(7001, e10.f11389a, e10, false);
                    }
                }
                if (iA == 0) {
                    u();
                    long jNanoTime = System.nanoTime();
                    int i13 = yn0.f10944a;
                    z0(an1Var, i10, jNanoTime);
                    s0(vVar.f648a);
                    return true;
                }
                if (iA == 1) {
                    long j16 = vVar.f649b;
                    long j17 = vVar.f648a;
                    int i14 = yn0.f10944a;
                    if (j16 == this.f2853d1) {
                        q0(an1Var, i10);
                    } else {
                        z0(an1Var, i10, j16);
                    }
                    s0(j17);
                    this.f2853d1 = j16;
                    return true;
                }
                if (iA == 2) {
                    Trace.beginSection("dropVideoBuffer");
                    an1Var.b(i10);
                    Trace.endSection();
                    r0(0, 1);
                    s0(vVar.f648a);
                    return true;
                }
                if (iA == 3) {
                    q0(an1Var, i10);
                    s0(vVar.f648a);
                    return true;
                }
                if (iA != 5) {
                    throw new IllegalStateException(String.valueOf(iA));
                }
            } else if (vVar.f648a < 30000) {
                q0(an1Var, i10);
                s0(vVar.f648a);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final String o() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void o0() {
        int i10 = yn0.f10944a;
    }

    @Override // com.google.android.gms.internal.ads.jn1, com.google.android.gms.internal.ads.vh1
    public final void p(long j10, long j11) throws zzhw {
        super.p(j10, j11);
        if (this.O0) {
            try {
                this.J0.b(j10, j11);
            } catch (zzabb e10) {
                throw v(7001, e10.f11389a, e10, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final zzse p0(IllegalStateException illegalStateException, cn1 cn1Var) {
        Surface surface = this.T0;
        zzzw zzzwVar = new zzzw(illegalStateException, cn1Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return zzzwVar;
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final boolean q() {
        return this.f6033z0 && !this.O0;
    }

    public final void q0(an1 an1Var, int i10) {
        Trace.beginSection("skipVideoBuffer");
        an1Var.b(i10);
        Trace.endSection();
        this.B0.f10189f++;
    }

    @Override // com.google.android.gms.internal.ads.jn1, com.google.android.gms.internal.ads.vh1
    public final boolean r() {
        zzaad zzaadVar;
        boolean z9 = true;
        boolean z10 = super.r() && !this.O0;
        if (z10 && (((zzaadVar = this.U0) != null && this.T0 == zzaadVar) || this.R == null)) {
            return true;
        }
        e eVar = this.M0;
        if (!z10 || eVar.f3773d != 3) {
            if (eVar.f3777h == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < eVar.f3777h) {
                return true;
            }
            z9 = false;
        }
        eVar.f3777h = -9223372036854775807L;
        return z9;
    }

    public final void r0(int i10, int i11) {
        wh1 wh1Var = this.B0;
        wh1Var.f10191h += i10;
        int i12 = i10 + i11;
        wh1Var.f10190g += i12;
        this.Y0 += i12;
        int i13 = this.Z0 + i12;
        this.Z0 = i13;
        wh1Var.f10192i = Math.max(i13, wh1Var.f10192i);
    }

    public final void s0(long j10) {
        wh1 wh1Var = this.B0;
        wh1Var.f10194k += j10;
        wh1Var.f10195l++;
        this.f2851b1 += j10;
        this.f2852c1++;
    }

    public final void v0() {
        Surface surface = this.T0;
        zzaad zzaadVar = this.U0;
        if (surface == zzaadVar) {
            this.T0 = null;
        }
        if (zzaadVar != null) {
            zzaadVar.release();
            this.U0 = null;
        }
    }

    public final boolean w0(cn1 cn1Var) {
        if (yn0.f10944a < 23 || t0(cn1Var.f3343a)) {
            return false;
        }
        return !cn1Var.f3348f || zzaad.c(this.I0);
    }

    public final void z0(an1 an1Var, int i10, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        an1Var.k(i10, j10);
        Trace.endSection();
        this.B0.f10188e++;
        this.Z0 = 0;
        if (this.O0) {
            return;
        }
        e10 e10Var = this.f2854e1;
        boolean zEquals = e10Var.equals(e10.f3801d);
        m20 m20Var = this.K0;
        if (!zEquals && !e10Var.equals(this.f2855f1)) {
            this.f2855f1 = e10Var;
            m20Var.i(e10Var);
        }
        e eVar = this.M0;
        int i11 = eVar.f3773d;
        eVar.f3773d = 3;
        eVar.f3775f = yn0.u(SystemClock.elapsedRealtime());
        if (i11 == 3 || (surface = this.T0) == null) {
            return;
        }
        Handler handler = (Handler) m20Var.f6809b;
        if (handler != null) {
            handler.post(new n(m20Var, surface, SystemClock.elapsedRealtime()));
        }
        this.V0 = true;
    }
}
