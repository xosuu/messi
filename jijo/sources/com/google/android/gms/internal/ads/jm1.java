package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jm1 extends jn1 implements gj1 {
    public final Context I0;
    public final cj0 J0;
    public final pl1 K0;
    public int L0;
    public boolean M0;
    public boolean N0;
    public y1 O0;
    public y1 P0;
    public long Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public int U0;

    public jm1(Context context, dg dgVar, Handler handler, ri1 ri1Var, gm1 gm1Var) {
        super(1, dgVar, 44100.0f);
        this.I0 = context.getApplicationContext();
        this.K0 = gm1Var;
        this.U0 = -1000;
        this.J0 = new cj0(handler, ri1Var);
        gm1Var.f4982m = new im1(this);
    }

    @Override // com.google.android.gms.internal.ads.jn1, com.google.android.gms.internal.ads.vh1
    public final void B() {
        cj0 cj0Var = this.J0;
        this.S0 = true;
        this.O0 = null;
        try {
            ((gm1) this.K0).m();
            super.B();
        } catch (Throwable th) {
            super.B();
            throw th;
        } finally {
            cj0Var.c(this.B0);
        }
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void C(boolean z9, boolean z10) {
        wh1 wh1Var = new wh1();
        this.B0 = wh1Var;
        cj0 cj0Var = this.J0;
        Handler handler = (Handler) cj0Var.f3301b;
        if (handler != null) {
            handler.post(new il1(cj0Var, wh1Var, 0));
        }
        x();
        vk1 vk1Var = this.f9853q;
        vk1Var.getClass();
        ((gm1) this.K0).f4981l = vk1Var;
        u();
    }

    @Override // com.google.android.gms.internal.ads.jn1, com.google.android.gms.internal.ads.vh1
    public final void E(long j10, boolean z9) throws zzhw {
        super.E(j10, z9);
        ((gm1) this.K0).m();
        this.Q0 = j10;
        this.T0 = false;
        this.R0 = true;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final float F(float f10, y1[] y1VarArr) {
        int iMax = -1;
        for (y1 y1Var : y1VarArr) {
            int i10 = y1Var.A;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.wz0, java.util.AbstractCollection] */
    @Override // com.google.android.gms.internal.ads.jn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int V(com.google.android.gms.internal.ads.kn1 r18, com.google.android.gms.internal.ads.y1 r19) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jm1.V(com.google.android.gms.internal.ads.kn1, com.google.android.gms.internal.ads.y1):int");
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final xh1 W(cn1 cn1Var, y1 y1Var, y1 y1Var2) {
        int i10;
        int i11;
        xh1 xh1VarA = cn1Var.a(y1Var, y1Var2);
        boolean z9 = this.G0 == null && n0(y1Var2);
        int i12 = xh1VarA.f10560e;
        if (z9) {
            i12 |= 32768;
        }
        if (q0(cn1Var, y1Var2) > this.L0) {
            i12 |= 64;
        }
        String str = cn1Var.f3343a;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = xh1VarA.f10559d;
            i11 = 0;
        }
        return new xh1(str, y1Var, y1Var2, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final xh1 X(cj0 cj0Var) throws zzhw {
        y1 y1Var = (y1) cj0Var.f3301b;
        y1Var.getClass();
        this.O0 = y1Var;
        xh1 xh1VarX = super.X(cj0Var);
        cj0 cj0Var2 = this.J0;
        Handler handler = (Handler) cj0Var2.f3301b;
        if (handler != null) {
            handler.post(new l0.a(cj0Var2, y1Var, xh1VarX, 23, 0));
        }
        return xh1VarX;
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final to a() {
        return ((gm1) this.K0).f4993x;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    @Override // com.google.android.gms.internal.ads.jn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.ym1 a0(com.google.android.gms.internal.ads.cn1 r10, com.google.android.gms.internal.ads.y1 r11, float r12) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jm1.a0(com.google.android.gms.internal.ads.cn1, com.google.android.gms.internal.ads.y1, float):com.google.android.gms.internal.ads.ym1");
    }

    @Override // com.google.android.gms.internal.ads.uj1
    public final void b(int i10, Object obj) {
        pl1 pl1Var = this.K0;
        if (i10 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            gm1 gm1Var = (gm1) pl1Var;
            if (gm1Var.H != fFloatValue) {
                gm1Var.H = fFloatValue;
                if (gm1Var.i()) {
                    int i11 = yn0.f10944a;
                    gm1Var.f4986q.setVolume(gm1Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            ce1 ce1Var = (ce1) obj;
            ce1Var.getClass();
            gm1 gm1Var2 = (gm1) pl1Var;
            if (gm1Var2.f4990u.equals(ce1Var)) {
                return;
            }
            gm1Var2.f4990u = ce1Var;
            ek0 ek0Var = gm1Var2.f4988s;
            if (ek0Var != null) {
                ek0Var.f4220u = ce1Var;
                ek0Var.b(bl1.b(ek0Var.f4212a, ce1Var, (fl1) ek0Var.f4219t));
            }
            gm1Var2.m();
            return;
        }
        if (i10 == 6) {
            fi1 fi1Var = (fi1) obj;
            fi1Var.getClass();
            gm1 gm1Var3 = (gm1) pl1Var;
            if (gm1Var3.Q.equals(fi1Var)) {
                return;
            }
            if (gm1Var3.f4986q != null) {
                gm1Var3.Q.getClass();
            }
            gm1Var3.Q = fi1Var;
            return;
        }
        if (i10 == 12) {
            if (yn0.f10944a >= 23) {
                hm1.a(pl1Var, obj);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.U0 = ((Integer) obj).intValue();
            an1 an1Var = this.R;
            if (an1Var != null && yn0.f10944a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.U0));
                an1Var.e(bundle);
                return;
            }
            return;
        }
        if (i10 == 9) {
            obj.getClass();
            gm1 gm1Var4 = (gm1) pl1Var;
            gm1Var4.f4994y = ((Boolean) obj).booleanValue();
            am1 am1Var = new am1(gm1Var4.f4993x, -9223372036854775807L, -9223372036854775807L);
            if (gm1Var4.i()) {
                gm1Var4.f4991v = am1Var;
                return;
            } else {
                gm1Var4.f4992w = am1Var;
                return;
            }
        }
        if (i10 != 10) {
            if (i10 == 11) {
                this.P = (wi1) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        gm1 gm1Var5 = (gm1) pl1Var;
        if (gm1Var5.P != iIntValue) {
            gm1Var5.P = iIntValue;
            gm1Var5.m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // com.google.android.gms.internal.ads.jn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList b0(com.google.android.gms.internal.ads.kn1 r3, com.google.android.gms.internal.ads.y1 r4) {
        /*
            r2 = this;
            java.lang.String r3 = r4.f10714m
            if (r3 != 0) goto L7
            com.google.android.gms.internal.ads.wz0 r3 = com.google.android.gms.internal.ads.wz0.f10382h
            goto L31
        L7:
            com.google.android.gms.internal.ads.pl1 r3 = r2.K0
            com.google.android.gms.internal.ads.gm1 r3 = (com.google.android.gms.internal.ads.gm1) r3
            int r3 = r3.k(r4)
            r0 = 0
            if (r3 == 0) goto L2d
            java.lang.String r3 = "audio/raw"
            java.util.List r3 = com.google.android.gms.internal.ads.pn1.c(r3, r0, r0)
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L20
            r3 = 0
            goto L26
        L20:
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.internal.ads.cn1 r3 = (com.google.android.gms.internal.ads.cn1) r3
        L26:
            if (r3 == 0) goto L2d
            com.google.android.gms.internal.ads.wz0 r3 = com.google.android.gms.internal.ads.bz0.n(r3)
            goto L31
        L2d:
            com.google.android.gms.internal.ads.wz0 r3 = com.google.android.gms.internal.ads.pn1.d(r4, r0, r0)
        L31:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.pn1.f7924a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            com.google.android.gms.internal.ads.mx0 r3 = new com.google.android.gms.internal.ads.mx0
            r3.<init>(r4)
            com.google.android.gms.internal.ads.ln1 r4 = new com.google.android.gms.internal.ads.ln1
            r4.<init>(r3)
            java.util.Collections.sort(r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jm1.b0(com.google.android.gms.internal.ads.kn1, com.google.android.gms.internal.ads.y1):java.util.ArrayList");
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final void c(to toVar) {
        gm1 gm1Var = (gm1) this.K0;
        gm1Var.getClass();
        gm1Var.f4993x = new to(Math.max(0.1f, Math.min(toVar.f9206a, 8.0f)), Math.max(0.1f, Math.min(toVar.f9207b, 8.0f)));
        am1 am1Var = new am1(toVar, -9223372036854775807L, -9223372036854775807L);
        if (gm1Var.i()) {
            gm1Var.f4991v = am1Var;
        } else {
            gm1Var.f4992w = am1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final boolean d() {
        boolean z9 = this.T0;
        this.T0 = false;
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void e() {
        dl1 dl1Var;
        ek0 ek0Var = ((gm1) this.K0).f4988s;
        if (ek0Var == null || !ek0Var.f4213b) {
            return;
        }
        ek0Var.f4218s = null;
        int i10 = yn0.f10944a;
        Context context = ek0Var.f4212a;
        if (i10 >= 23 && (dl1Var = (dl1) ek0Var.f4215f) != null) {
            cl1.b(context, dl1Var);
        }
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) ek0Var.f4216h;
        if (broadcastReceiver != null) {
            context.unregisterReceiver(broadcastReceiver);
        }
        el1 el1Var = (el1) ek0Var.f4217q;
        if (el1Var != null) {
            el1Var.f4237a.unregisterContentObserver(el1Var);
        }
        ek0Var.f4213b = false;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void e0(wf1 wf1Var) {
        y1 y1Var;
        if (yn0.f10944a < 29 || (y1Var = wf1Var.f10169c) == null || !Objects.equals(y1Var.f10714m, "audio/opus") || !this.f6020m0) {
            return;
        }
        ByteBuffer byteBuffer = wf1Var.f10174h;
        byteBuffer.getClass();
        wf1Var.f10169c.getClass();
        if (byteBuffer.remaining() == 8) {
            long j10 = (byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000;
            AudioTrack audioTrack = ((gm1) this.K0).f4986q;
            if (audioTrack != null) {
                gm1.j(audioTrack);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void f() {
        pl1 pl1Var = this.K0;
        this.T0 = false;
        try {
            try {
                Y();
                K();
                if (this.S0) {
                    this.S0 = false;
                    ((gm1) pl1Var).o();
                }
            } finally {
                this.G0 = null;
            }
        } catch (Throwable th) {
            if (this.S0) {
                this.S0 = false;
                ((gm1) pl1Var).o();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void f0(Exception exc) {
        fg0.d("Audio codec error", exc);
        cj0 cj0Var = this.J0;
        Handler handler = (Handler) cj0Var.f3301b;
        if (handler != null) {
            handler.post(new ml1(cj0Var, exc, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void g() {
        ((gm1) this.K0).n();
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void g0(String str, long j10, long j11) {
        cj0 cj0Var = this.J0;
        Handler handler = (Handler) cj0Var.f3301b;
        if (handler != null) {
            handler.post(new l(cj0Var, str, j10, j11, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final void h() {
        r0();
        gm1 gm1Var = (gm1) this.K0;
        gm1Var.O = false;
        if (gm1Var.i()) {
            rl1 rl1Var = gm1Var.f4976g;
            rl1Var.f8643k = 0L;
            rl1Var.f8655w = 0;
            rl1Var.f8654v = 0;
            rl1Var.f8644l = 0L;
            rl1Var.C = 0L;
            rl1Var.F = 0L;
            rl1Var.f8642j = false;
            if (rl1Var.f8656x == -9223372036854775807L) {
                ql1 ql1Var = rl1Var.f8637e;
                ql1Var.getClass();
                ql1Var.b(0);
            } else {
                rl1Var.f8658z = rl1Var.d();
                if (!gm1.j(gm1Var.f4986q)) {
                    return;
                }
            }
            gm1Var.f4986q.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void h0(String str) {
        cj0 cj0Var = this.J0;
        Handler handler = (Handler) cj0Var.f3301b;
        if (handler != null) {
            handler.post(new vh0(cj0Var, 17, str));
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void i0(y1 y1Var, MediaFormat mediaFormat) throws zzhw {
        int i10;
        y1 y1Var2 = this.P0;
        boolean z9 = true;
        int[] iArr = null;
        if (y1Var2 != null) {
            y1Var = y1Var2;
        } else if (this.R != null) {
            mediaFormat.getClass();
            int iR = "audio/raw".equals(y1Var.f10714m) ? y1Var.B : (yn0.f10944a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? yn0.r(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            q0 q0Var = new q0();
            q0Var.f("audio/raw");
            q0Var.A = iR;
            q0Var.B = y1Var.C;
            q0Var.C = y1Var.D;
            q0Var.f8050j = y1Var.f10712k;
            q0Var.f8041a = y1Var.f10702a;
            q0Var.f8042b = y1Var.f10703b;
            q0Var.f8043c = bz0.k(y1Var.f10704c);
            q0Var.f8044d = y1Var.f10705d;
            q0Var.f8045e = y1Var.f10706e;
            q0Var.f8046f = y1Var.f10707f;
            q0Var.f8065y = mediaFormat.getInteger("channel-count");
            q0Var.f8066z = mediaFormat.getInteger("sample-rate");
            y1 y1Var3 = new y1(q0Var);
            boolean z10 = this.M0;
            int i11 = y1Var3.f10727z;
            if (z10 && i11 == 6 && (i10 = y1Var.f10727z) < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.N0) {
                if (i11 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i11 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i11 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i11 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i11 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            y1Var = y1Var3;
        }
        try {
            int i13 = yn0.f10944a;
            if (i13 >= 29) {
                if (this.f6020m0) {
                    x();
                }
                if (i13 < 29) {
                    z9 = false;
                }
                tc1.W(z9);
            }
            ((gm1) this.K0).l(y1Var, iArr);
        } catch (zzpg e10) {
            throw v(5001, e10.f11654a, e10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void k0() {
        ((gm1) this.K0).E = true;
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final void l0() throws zzhw {
        try {
            gm1 gm1Var = (gm1) this.K0;
            if (!gm1Var.L && gm1Var.i() && gm1Var.h()) {
                gm1Var.e();
                gm1Var.L = true;
            }
        } catch (zzpk e10) {
            throw v(true != this.f6020m0 ? 5002 : 5003, e10.f11659d, e10, e10.f11658b);
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final boolean m0(long j10, long j11, an1 an1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z9, boolean z10, y1 y1Var) throws zzhw {
        byteBuffer.getClass();
        if (this.P0 != null && (i11 & 2) != 0) {
            an1Var.getClass();
            an1Var.b(i10);
            return true;
        }
        pl1 pl1Var = this.K0;
        if (z9) {
            if (an1Var != null) {
                an1Var.b(i10);
            }
            this.B0.f10189f += i12;
            ((gm1) pl1Var).E = true;
            return true;
        }
        try {
            if (!((gm1) pl1Var).p(byteBuffer, j12, i12)) {
                return false;
            }
            if (an1Var != null) {
                an1Var.b(i10);
            }
            this.B0.f10188e += i12;
            return true;
        } catch (zzph e10) {
            y1 y1Var2 = this.O0;
            if (this.f6020m0) {
                x();
            }
            throw v(5001, y1Var2, e10, e10.f11656b);
        } catch (zzpk e11) {
            if (this.f6020m0) {
                x();
            }
            throw v(5002, y1Var, e11, e11.f11658b);
        }
    }

    @Override // com.google.android.gms.internal.ads.jn1
    public final boolean n0(y1 y1Var) {
        x();
        return ((gm1) this.K0).k(y1Var) != 0;
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final String o() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final boolean q() {
        if (!this.f6033z0) {
            return false;
        }
        gm1 gm1Var = (gm1) this.K0;
        if (gm1Var.i()) {
            return gm1Var.L && !gm1Var.q();
        }
        return true;
    }

    public final int q0(cn1 cn1Var, y1 y1Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(cn1Var.f3343a) || (i10 = yn0.f10944a) >= 24 || (i10 == 23 && yn0.f(this.I0))) {
            return y1Var.f10715n;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.jn1, com.google.android.gms.internal.ads.vh1
    public final boolean r() {
        return ((gm1) this.K0).q() || super.r();
    }

    public final void r0() {
        long jMax;
        ArrayDeque arrayDeque;
        long jT;
        long jW;
        boolean zQ = q();
        gm1 gm1Var = (gm1) this.K0;
        if (!gm1Var.i() || gm1Var.F) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(gm1Var.f4976g.a(zQ), yn0.v(gm1Var.f4984o.f11272e, gm1Var.b()));
            while (true) {
                arrayDeque = gm1Var.f4977h;
                if (arrayDeque.isEmpty() || jMin < ((am1) arrayDeque.getFirst()).f2738c) {
                    break;
                } else {
                    gm1Var.f4992w = (am1) arrayDeque.remove();
                }
            }
            long j10 = jMin - gm1Var.f4992w.f2738c;
            boolean zIsEmpty = arrayDeque.isEmpty();
            ep epVar = gm1Var.Y;
            if (zIsEmpty) {
                if (((y30) epVar.f4271f).zzg()) {
                    y30 y30Var = (y30) epVar.f4271f;
                    long j11 = y30Var.f10750o;
                    if (j11 >= 1024) {
                        long j12 = y30Var.f10749n;
                        o30 o30Var = y30Var.f10745j;
                        o30Var.getClass();
                        int i10 = o30Var.f7488k * o30Var.f7479b;
                        long j13 = j12 - ((long) (i10 + i10));
                        int i11 = y30Var.f10743h.f3818a;
                        int i12 = y30Var.f10742g.f3818a;
                        jW = i11 == i12 ? yn0.w(j10, j13, j11, RoundingMode.FLOOR) : yn0.w(j10, j13 * ((long) i11), j11 * ((long) i12), RoundingMode.FLOOR);
                    } else {
                        jW = (long) (((double) y30Var.f10738c) * j10);
                    }
                    j10 = jW;
                }
                jT = gm1Var.f4992w.f2737b + j10;
            } else {
                am1 am1Var = (am1) arrayDeque.getFirst();
                jT = am1Var.f2737b - yn0.t(am1Var.f2738c - jMin, gm1Var.f4992w.f2736a.f9206a);
            }
            long jF = epVar.f();
            jMax = yn0.v(gm1Var.f4984o.f11272e, jF) + jT;
            long j14 = gm1Var.V;
            if (jF > j14) {
                long jV = yn0.v(gm1Var.f4984o.f11272e, jF - j14);
                gm1Var.V = jF;
                gm1Var.W += jV;
                if (gm1Var.X == null) {
                    gm1Var.X = new Handler(Looper.myLooper());
                }
                gm1Var.X.removeCallbacksAndMessages(null);
                gm1Var.X.postDelayed(new yd0(21, gm1Var), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.R0) {
                jMax = Math.max(this.Q0, jMax);
            }
            this.Q0 = jMax;
            this.R0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.vh1
    public final gj1 w() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final long zza() {
        if (this.f9855t == 2) {
            r0();
        }
        return this.Q0;
    }
}
