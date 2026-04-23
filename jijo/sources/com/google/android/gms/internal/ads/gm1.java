package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class gm1 implements pl1 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Object f4967a0 = new Object();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static ExecutorService f4968b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static int f4969c0;
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public fi1 Q;
    public fl1 R;
    public long S;
    public boolean T;
    public Looper U;
    public long V;
    public long W;
    public Handler X;
    public final ep Y;
    public final ok0 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl1 f4971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nm1 f4972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wz0 f4973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wz0 f4974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c8.a f4975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rl1 f4976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f4977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fm1 f4978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x1 f4979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x1 f4980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public vk1 f4981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public im1 f4982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zl1 f4983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zl1 f4984o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w10 f4985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AudioTrack f4986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public bl1 f4987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ek0 f4988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public cm1 f4989t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ce1 f4990u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public am1 f4991v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public am1 f4992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public to f4993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4994y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f4995z;

    public gm1(u3.q qVar) {
        bl1 bl1VarB;
        Context context = (Context) qVar.f17608b;
        this.f4970a = context;
        ce1 ce1Var = ce1.f3257b;
        this.f4990u = ce1Var;
        if (context != null) {
            bl1 bl1Var = bl1.f3054c;
            int i10 = yn0.f10944a;
            bl1VarB = bl1.b(context, ce1Var, null);
        } else {
            bl1VarB = (bl1) qVar.f17609d;
        }
        this.f4987r = bl1VarB;
        this.Y = (ep) qVar.f17611h;
        int i11 = yn0.f10944a;
        ok0 ok0Var = (ok0) qVar.f17612q;
        ok0Var.getClass();
        this.Z = ok0Var;
        c8.a aVar = new c8.a(0);
        this.f4975f = aVar;
        aVar.c();
        this.f4976g = new rl1(new dm1(this));
        sl1 sl1Var = new sl1();
        this.f4971b = sl1Var;
        nm1 nm1Var = new nm1();
        nm1Var.f7321m = yn0.f10949f;
        this.f4972c = nm1Var;
        this.f4973d = bz0.p(new q40(), sl1Var, nm1Var);
        this.f4974e = bz0.n(new mm1());
        this.H = 1.0f;
        this.P = 0;
        this.Q = new fi1();
        to toVar = to.f9205d;
        this.f4992w = new am1(toVar, 0L, 0L);
        this.f4993x = toVar;
        this.f4994y = false;
        this.f4977h = new ArrayDeque();
        this.f4979j = new x1();
        this.f4980k = new x1();
    }

    public static boolean j(AudioTrack audioTrack) {
        return yn0.f10944a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final long a() {
        zl1 zl1Var = this.f4984o;
        return zl1Var.f11270c == 0 ? this.f4995z / ((long) zl1Var.f11269b) : this.A;
    }

    public final long b() {
        zl1 zl1Var = this.f4984o;
        if (zl1Var.f11270c != 0) {
            return this.C;
        }
        long j10 = this.B;
        long j11 = zl1Var.f11271d;
        int i10 = yn0.f10944a;
        return ((j10 + j11) - 1) / j11;
    }

    public final void c(long j10) {
        boolean z9;
        to toVar;
        zl1 zl1Var = this.f4984o;
        int i10 = zl1Var.f11270c;
        boolean z10 = false;
        if (i10 == 0) {
            int i11 = zl1Var.f11268a.B;
            z9 = true;
        } else {
            z9 = false;
        }
        ep epVar = this.Y;
        if (z9) {
            toVar = this.f4993x;
            y30 y30Var = (y30) epVar.f4271f;
            float f10 = toVar.f9206a;
            if (y30Var.f10738c != f10) {
                y30Var.f10738c = f10;
                y30Var.f10744i = true;
            }
            float f11 = y30Var.f10739d;
            float f12 = toVar.f9207b;
            if (f11 != f12) {
                y30Var.f10739d = f12;
                y30Var.f10744i = true;
            }
        } else {
            toVar = to.f9205d;
        }
        to toVar2 = toVar;
        this.f4993x = toVar2;
        if (i10 == 0) {
            int i12 = zl1Var.f11268a.B;
            z10 = this.f4994y;
            ((lm1) epVar.f4270d).f6663j = z10;
        }
        this.f4994y = z10;
        ArrayDeque arrayDeque = this.f4977h;
        long jMax = Math.max(0L, j10);
        zl1 zl1Var2 = this.f4984o;
        arrayDeque.add(new am1(toVar2, jMax, yn0.v(zl1Var2.f11272e, b())));
        w10 w10Var = this.f4984o.f11276i;
        this.f4985p = w10Var;
        w10Var.b();
        im1 im1Var = this.f4982m;
        if (im1Var != null) {
            boolean z11 = this.f4994y;
            cj0 cj0Var = im1Var.f5645a.J0;
            Handler handler = (Handler) cj0Var.f3301b;
            if (handler != null) {
                handler.post(new g3.h(cj0Var, z11, 3));
            }
        }
    }

    public final void d() {
        Context context;
        bl1 bl1VarC;
        dl1 dl1Var;
        if (this.f4988s != null || (context = this.f4970a) == null) {
            return;
        }
        this.U = Looper.myLooper();
        ek0 ek0Var = new ek0(context, new ks0(this), this.f4990u, this.R);
        this.f4988s = ek0Var;
        if (ek0Var.f4213b) {
            bl1VarC = (bl1) ek0Var.f4218s;
            bl1VarC.getClass();
        } else {
            ek0Var.f4213b = true;
            el1 el1Var = (el1) ek0Var.f4217q;
            if (el1Var != null) {
                el1Var.f4237a.registerContentObserver(el1Var.f4238b, false, el1Var);
            }
            int i10 = yn0.f10944a;
            Object obj = ek0Var.f4214d;
            Context context2 = ek0Var.f4212a;
            if (i10 >= 23 && (dl1Var = (dl1) ek0Var.f4215f) != null) {
                cl1.a(context2, dl1Var, (Handler) obj);
            }
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) ek0Var.f4216h;
            bl1VarC = bl1.c(context2, broadcastReceiver != null ? context2.registerReceiver(broadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, (Handler) obj) : null, (ce1) ek0Var.f4220u, (fl1) ek0Var.f4219t);
            ek0Var.f4218s = bl1VarC;
        }
        this.f4987r = bl1VarC;
    }

    public final void e() {
        if (this.M) {
            return;
        }
        this.M = true;
        long jB = b();
        rl1 rl1Var = this.f4976g;
        rl1Var.f8658z = rl1Var.d();
        rl1Var.f8656x = yn0.u(SystemClock.elapsedRealtime());
        rl1Var.A = jB;
        if (j(this.f4986q)) {
            this.N = false;
        }
        this.f4986q.stop();
    }

    public final void f(long j10) throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f4985p.e()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 == null) {
                byteBuffer2 = e30.f3848a;
            }
            g(byteBuffer2);
            return;
        }
        while (!this.f4985p.d()) {
            do {
                w10 w10Var = this.f4985p;
                if (w10Var.e()) {
                    ByteBuffer byteBuffer3 = w10Var.f10028c[w10Var.f()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        w10Var.g(e30.f3848a);
                        byteBuffer = w10Var.f10028c[w10Var.f()];
                    }
                } else {
                    byteBuffer = e30.f3848a;
                }
                if (byteBuffer.hasRemaining()) {
                    g(byteBuffer);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    w10 w10Var2 = this.f4985p;
                    ByteBuffer byteBuffer5 = this.I;
                    if (w10Var2.e() && !w10Var2.f10029d) {
                        w10Var2.g(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.nio.ByteBuffer r11) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r11.hasRemaining()
            if (r0 != 0) goto L8
            goto La8
        L8:
            java.nio.ByteBuffer r0 = r10.K
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            if (r0 != r11) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            com.google.android.gms.internal.ads.tc1.K(r0)
            goto L1b
        L17:
            r10.K = r11
            int r0 = com.google.android.gms.internal.ads.yn0.f10944a
        L1b:
            int r0 = r11.remaining()
            int r3 = com.google.android.gms.internal.ads.yn0.f10944a
            android.media.AudioTrack r3 = r10.f4986q
            int r3 = r3.write(r11, r0, r1)
            long r4 = android.os.SystemClock.elapsedRealtime()
            r10.S = r4
            com.google.android.gms.internal.ads.x1 r4 = r10.f4980k
            if (r3 >= 0) goto L78
            int r11 = com.google.android.gms.internal.ads.yn0.f10944a
            r0 = 24
            if (r11 < r0) goto L3a
            r11 = -6
            if (r3 == r11) goto L3e
        L3a:
            r11 = -32
            if (r3 != r11) goto L5a
        L3e:
            long r5 = r10.b()
            r7 = 0
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L49
            goto L5b
        L49:
            android.media.AudioTrack r11 = r10.f4986q
            boolean r11 = j(r11)
            if (r11 == 0) goto L5a
            com.google.android.gms.internal.ads.zl1 r11 = r10.f4984o
            int r11 = r11.f11270c
            if (r11 != r1) goto L5b
            r10.T = r1
            goto L5b
        L5a:
            r1 = 0
        L5b:
            com.google.android.gms.internal.ads.zzpk r11 = new com.google.android.gms.internal.ads.zzpk
            com.google.android.gms.internal.ads.zl1 r0 = r10.f4984o
            com.google.android.gms.internal.ads.y1 r0 = r0.f11268a
            r11.<init>(r3, r0, r1)
            com.google.android.gms.internal.ads.im1 r0 = r10.f4982m
            if (r0 == 0) goto L6b
            r0.a(r11)
        L6b:
            boolean r0 = r11.f11658b
            if (r0 != 0) goto L73
            r4.o(r11)
            return
        L73:
            com.google.android.gms.internal.ads.bl1 r0 = com.google.android.gms.internal.ads.bl1.f3054c
            r10.f4987r = r0
            throw r11
        L78:
            r5 = 0
            r4.f10400d = r5
            android.media.AudioTrack r4 = r10.f4986q
            j(r4)
            com.google.android.gms.internal.ads.zl1 r4 = r10.f4984o
            int r4 = r4.f11270c
            if (r4 != 0) goto L8c
            long r6 = r10.B
            long r8 = (long) r3
            long r6 = r6 + r8
            r10.B = r6
        L8c:
            if (r3 != r0) goto La8
            if (r4 == 0) goto La6
            java.nio.ByteBuffer r0 = r10.I
            if (r11 != r0) goto L95
            goto L96
        L95:
            r1 = 0
        L96:
            com.google.android.gms.internal.ads.tc1.W(r1)
            long r0 = r10.C
            int r11 = r10.D
            long r2 = (long) r11
            int r11 = r10.J
            long r6 = (long) r11
            long r2 = r2 * r6
            long r2 = r2 + r0
            r10.C = r2
        La6:
            r10.K = r5
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gm1.g(java.nio.ByteBuffer):void");
    }

    public final boolean h() throws Exception {
        if (!this.f4985p.e()) {
            ByteBuffer byteBuffer = this.K;
            if (byteBuffer == null) {
                return true;
            }
            g(byteBuffer);
            return this.K == null;
        }
        w10 w10Var = this.f4985p;
        if (w10Var.e() && !w10Var.f10029d) {
            w10Var.f10029d = true;
            ((e30) w10Var.f10027b.get(0)).zzd();
        }
        f(Long.MIN_VALUE);
        if (!this.f4985p.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.K;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    public final boolean i() {
        return this.f4986q != null;
    }

    public final int k(y1 y1Var) {
        d();
        if (!"audio/raw".equals(y1Var.f10714m)) {
            return this.f4987r.a(y1Var, this.f4990u) != null ? 2 : 0;
        }
        int i10 = y1Var.B;
        if (yn0.d(i10)) {
            return i10 != 2 ? 1 : 2;
        }
        fb1.u("Invalid PCM encoding: ", i10);
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(com.google.android.gms.internal.ads.y1 r23, int[] r24) throws com.google.android.gms.internal.ads.zzpg {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gm1.l(com.google.android.gms.internal.ads.y1, int[]):void");
    }

    public final void m() {
        cm1 cm1Var;
        if (i()) {
            this.f4995z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.D = 0;
            this.f4992w = new am1(this.f4993x, 0L, 0L);
            this.G = 0L;
            this.f4991v = null;
            this.f4977h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.f4972c.f7323o = 0L;
            w10 w10Var = this.f4984o.f11276i;
            this.f4985p = w10Var;
            w10Var.b();
            AudioTrack audioTrack = this.f4976g.f8635c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f4986q.pause();
            }
            if (j(this.f4986q)) {
                fm1 fm1Var = this.f4978i;
                fm1Var.getClass();
                fm1Var.b(this.f4986q);
            }
            int i10 = yn0.f10944a;
            this.f4984o.getClass();
            jk1 jk1Var = new jk1();
            zl1 zl1Var = this.f4983n;
            if (zl1Var != null) {
                this.f4984o = zl1Var;
                this.f4983n = null;
            }
            rl1 rl1Var = this.f4976g;
            rl1Var.f8643k = 0L;
            rl1Var.f8655w = 0;
            rl1Var.f8654v = 0;
            rl1Var.f8644l = 0L;
            rl1Var.C = 0L;
            rl1Var.F = 0L;
            rl1Var.f8642j = false;
            rl1Var.f8635c = null;
            rl1Var.f8637e = null;
            if (yn0.f10944a >= 24 && (cm1Var = this.f4989t) != null) {
                cm1Var.b();
                this.f4989t = null;
            }
            AudioTrack audioTrack2 = this.f4986q;
            c8.a aVar = this.f4975f;
            im1 im1Var = this.f4982m;
            aVar.b();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f4967a0) {
                try {
                    if (f4968b0 == null) {
                        f4968b0 = Executors.newSingleThreadExecutor(new lt("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f4969c0++;
                    f4968b0.execute(new kw(audioTrack2, im1Var, handler, jk1Var, aVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f4986q = null;
        }
        this.f4980k.f10400d = null;
        this.f4979j.f10400d = null;
        this.V = 0L;
        this.W = 0L;
        Handler handler2 = this.X;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final void n() {
        this.O = true;
        if (i()) {
            rl1 rl1Var = this.f4976g;
            if (rl1Var.f8656x != -9223372036854775807L) {
                rl1Var.f8656x = yn0.u(SystemClock.elapsedRealtime());
            }
            ql1 ql1Var = rl1Var.f8637e;
            ql1Var.getClass();
            ql1Var.b(0);
            this.f4986q.play();
        }
    }

    public final void o() {
        m();
        wz0 wz0Var = this.f4973d;
        int i10 = wz0Var.f10384f;
        for (int i11 = 0; i11 < i10; i11++) {
            ((e30) wz0Var.get(i11)).zzf();
        }
        wz0 wz0Var2 = this.f4974e;
        int i12 = wz0Var2.f10384f;
        for (int i13 = 0; i13 < i12; i13++) {
            ((e30) wz0Var2.get(i13)).zzf();
        }
        w10 w10Var = this.f4985p;
        if (w10Var != null) {
            w10Var.c();
        }
        this.O = false;
        this.T = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x054d A[Catch: zzph -> 0x00e9, TryCatch #5 {zzph -> 0x00e9, blocks: (B:35:0x0072, B:36:0x0074, B:38:0x0077, B:59:0x00d3, B:61:0x00db, B:63:0x00e1, B:66:0x00ec, B:67:0x00f6, B:69:0x00fc, B:71:0x0100, B:72:0x0105, B:76:0x011b, B:80:0x0132, B:84:0x013f, B:86:0x0148, B:89:0x0153, B:91:0x0157, B:92:0x0160, B:94:0x0167, B:96:0x017b, B:79:0x012b, B:54:0x0097, B:56:0x00a0, B:299:0x0543, B:300:0x0546, B:302:0x054d, B:303:0x054f, B:306:0x0552, B:307:0x0553, B:37:0x0075, B:58:0x00d1, B:294:0x053a, B:298:0x0542, B:297:0x053f, B:57:0x00c9, B:41:0x007b, B:46:0x008a, B:50:0x0092, B:49:0x008f, B:43:0x0080), top: B:320:0x0072, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:326:? A[Catch: zzph -> 0x00e9, SYNTHETIC, TryCatch #5 {zzph -> 0x00e9, blocks: (B:35:0x0072, B:36:0x0074, B:38:0x0077, B:59:0x00d3, B:61:0x00db, B:63:0x00e1, B:66:0x00ec, B:67:0x00f6, B:69:0x00fc, B:71:0x0100, B:72:0x0105, B:76:0x011b, B:80:0x0132, B:84:0x013f, B:86:0x0148, B:89:0x0153, B:91:0x0157, B:92:0x0160, B:94:0x0167, B:96:0x017b, B:79:0x012b, B:54:0x0097, B:56:0x00a0, B:299:0x0543, B:300:0x0546, B:302:0x054d, B:303:0x054f, B:306:0x0552, B:307:0x0553, B:37:0x0075, B:58:0x00d1, B:294:0x053a, B:298:0x0542, B:297:0x053f, B:57:0x00c9, B:41:0x007b, B:46:0x008a, B:50:0x0092, B:49:0x008f, B:43:0x0080), top: B:320:0x0072, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(java.nio.ByteBuffer r26, long r27, int r29) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gm1.p(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean q() {
        if (i()) {
            return !(yn0.f10944a >= 29 && this.f4986q.isOffloadedPlayback() && this.N) && this.f4976g.c(b());
        }
        return false;
    }
}
