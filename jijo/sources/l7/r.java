package l7;

import com.google.android.gms.internal.ads.gp0;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Closeable {
    public static final ThreadPoolExecutor G;
    public final gp0 A;
    public boolean B;
    public final Socket C;
    public final y D;
    public final p E;
    public final LinkedHashSet F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f15303b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15305f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15306h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15307q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f15309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ThreadPoolExecutor f15310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d5.e f15311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15312w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f15314y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final gp0 f15315z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f15304d = new LinkedHashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f15313x = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = g7.b.f13888a;
        G = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new g7.a("OkHttp Http2Connection", true));
    }

    public r(l lVar) {
        gp0 gp0Var = new gp0(16);
        this.f15315z = gp0Var;
        gp0 gp0Var2 = new gp0(16);
        this.A = gp0Var2;
        this.B = false;
        this.F = new LinkedHashSet();
        this.f15311v = a0.f15240r;
        boolean z9 = lVar.f15291f;
        this.f15302a = z9;
        this.f15303b = lVar.f15290e;
        int i10 = z9 ? 1 : 2;
        this.f15307q = i10;
        if (z9) {
            this.f15307q = i10 + 2;
        }
        if (z9) {
            gp0Var.l(7, 16777216);
        }
        String str = lVar.f15287b;
        this.f15305f = str;
        byte[] bArr = g7.b.f13888a;
        Locale locale = Locale.US;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new g7.a(String.format(locale, "OkHttp %s Writer", str), false));
        this.f15309t = scheduledThreadPoolExecutor;
        if (lVar.f15292g != 0) {
            o oVar = new o(this, false, 0, 0);
            long j10 = lVar.f15292g;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(oVar, j10, j10, TimeUnit.MILLISECONDS);
        }
        this.f15310u = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new g7.a(String.format(locale, "OkHttp %s Push Observer", str), true));
        gp0Var2.l(7, 65535);
        gp0Var2.l(5, 16384);
        this.f15314y = gp0Var2.j();
        this.C = lVar.f15286a;
        this.D = new y(lVar.f15289d, z9);
        this.E = new p(this, new t(lVar.f15288c, z9));
    }

    public final synchronized x A(int i10) {
        x xVar;
        xVar = (x) this.f15304d.remove(Integer.valueOf(i10));
        notifyAll();
        return xVar;
    }

    public final void D(a aVar) {
        synchronized (this.D) {
            synchronized (this) {
                if (this.f15308s) {
                    return;
                }
                this.f15308s = true;
                this.D.u(this.f15306h, aVar, g7.b.f13888a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.D.f15354f);
        r6 = r3;
        r8.f15314y -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(int r9, boolean r10, p7.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            l7.y r12 = r8.D
            r12.c(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L5e
            monitor-enter(r8)
        L12:
            long r3 = r8.f15314y     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L32
            java.util.LinkedHashMap r3 = r8.f15304d     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            goto L12
        L28:
            r9 = move-exception
            goto L5c
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
        L32:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L28
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L28
            l7.y r3 = r8.D     // Catch: java.lang.Throwable -> L28
            int r3 = r3.f15354f     // Catch: java.lang.Throwable -> L28
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f15314y     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f15314y = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            l7.y r4 = r8.D
            if (r10 == 0) goto L51
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            r4.c(r5, r9, r11, r3)
            goto Ld
        L56:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L5c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.r.E(int, boolean, p7.e, long):void");
    }

    public final void F(int i10, a aVar) {
        try {
            this.f15309t.execute(new h(this, "OkHttp %s stream %d", new Object[]{this.f15305f, Integer.valueOf(i10)}, i10, aVar, 0));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void G(int i10, long j10) {
        try {
            this.f15309t.execute(new i(this, new Object[]{this.f15305f, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void a(a aVar, a aVar2) throws IOException {
        x[] xVarArr = null;
        try {
            D(aVar);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            try {
                if (!this.f15304d.isEmpty()) {
                    xVarArr = (x[]) this.f15304d.values().toArray(new x[this.f15304d.size()]);
                    this.f15304d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xVarArr != null) {
            for (x xVar : xVarArr) {
                try {
                    xVar.c(aVar2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        try {
            this.D.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.C.close();
        } catch (IOException e13) {
            e = e13;
        }
        this.f15309t.shutdown();
        this.f15310u.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void c() {
        try {
            a aVar = a.PROTOCOL_ERROR;
            a(aVar, aVar);
        } catch (IOException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(a.NO_ERROR, a.CANCEL);
    }

    public final synchronized x e(int i10) {
        return (x) this.f15304d.get(Integer.valueOf(i10));
    }

    public final void flush() {
        this.D.flush();
    }

    public final synchronized int u() {
        gp0 gp0Var;
        gp0Var = this.A;
        return (gp0Var.f5025b & 16) != 0 ? ((int[]) gp0Var.f5026d)[4] : Integer.MAX_VALUE;
    }
}
