package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class mq1 extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to1 f7029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7030b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lq1 f7031d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IOException f7032f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7033h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Thread f7034q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f7036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ oq1 f7037u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq1(oq1 oq1Var, Looper looper, to1 to1Var, lq1 lq1Var, long j10) {
        super(looper);
        this.f7037u = oq1Var;
        this.f7029a = to1Var;
        this.f7031d = lq1Var;
        this.f7030b = j10;
    }

    public final void a(boolean z9) {
        this.f7036t = z9;
        this.f7032f = null;
        if (hasMessages(0)) {
            this.f7035s = true;
            removeMessages(0);
            if (!z9) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f7035s = true;
                    this.f7029a.f9215g = true;
                    Thread thread = this.f7034q;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z9) {
            this.f7037u.f7639b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            lq1 lq1Var = this.f7031d;
            lq1Var.getClass();
            ((wo1) lq1Var).c(this.f7029a, jElapsedRealtime, jElapsedRealtime - this.f7030b, true);
            this.f7031d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        t6 t6Var;
        v0 v0Var;
        if (this.f7036t) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f7032f = null;
            oq1 oq1Var = this.f7037u;
            ExecutorService executorService = oq1Var.f7638a;
            mq1 mq1Var = oq1Var.f7639b;
            mq1Var.getClass();
            executorService.execute(mq1Var);
            return;
        }
        if (i10 == 3) {
            throw ((Error) message.obj);
        }
        this.f7037u.f7639b = null;
        long j10 = this.f7030b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - j10;
        lq1 lq1Var = this.f7031d;
        lq1Var.getClass();
        if (this.f7035s) {
            ((wo1) lq1Var).c(this.f7029a, jElapsedRealtime, j11, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            try {
                ((wo1) lq1Var).e(this.f7029a, jElapsedRealtime, j11);
                return;
            } catch (RuntimeException e10) {
                fg0.d("Unexpected exception handling load completed", e10);
                this.f7037u.f7640c = new zzyw(e10);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f7032f = iOException;
        int i12 = this.f7033h;
        this.f7033h = i12 + 1;
        to1 to1Var = this.f7029a;
        wo1 wo1Var = (wo1) lq1Var;
        Uri uri = to1Var.f9210b.f3243d;
        bo1 bo1Var = new bo1();
        int i13 = yn0.f10944a;
        if ((iOException instanceof zzbo) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgk) || (iOException instanceof zzyw)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzft) && ((zzft) cause).f11643a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min(i12 * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            t6Var = oq1.f7637e;
        } else {
            int iL = wo1Var.l();
            int i14 = iL > wo1Var.T ? 1 : 0;
            if (wo1Var.P || !((v0Var = wo1Var.I) == null || v0Var.zza() == -9223372036854775807L)) {
                wo1Var.T = iL;
            } else {
                boolean z9 = wo1Var.E;
                if (!z9 || wo1Var.v()) {
                    wo1Var.N = z9;
                    wo1Var.Q = 0L;
                    wo1Var.T = 0;
                    for (cp1 cp1Var : wo1Var.B) {
                        cp1Var.o(false);
                    }
                    to1Var.f9214f.f6130a = 0L;
                    to1Var.f9217i = 0L;
                    to1Var.f9216h = true;
                    to1Var.f9220l = false;
                } else {
                    wo1Var.S = true;
                    t6Var = oq1.f7636d;
                }
            }
            t6Var = new t6(i14, jMin, 0);
        }
        int i15 = t6Var.f9057a;
        wo1Var.f10262f.d(bo1Var, new gk1(-1, (y1) null, yn0.x(to1Var.f9217i), yn0.x(wo1Var.J)), iOException, !(i15 == 0 || i15 == 1));
        int i16 = t6Var.f9057a;
        if (i16 == 3) {
            this.f7037u.f7640c = this.f7032f;
            return;
        }
        if (i16 != 2) {
            if (i16 == 1) {
                this.f7033h = 1;
            }
            long jMin2 = t6Var.f9058b;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.f7033h - 1) * 1000, 5000);
            }
            oq1 oq1Var2 = this.f7037u;
            tc1.W(oq1Var2.f7639b == null);
            oq1Var2.f7639b = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(0, jMin2);
            } else {
                this.f7032f = null;
                oq1Var2.f7638a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        try {
            synchronized (this) {
                z9 = !this.f7035s;
                this.f7034q = Thread.currentThread();
            }
            if (z9) {
                Trace.beginSection("load:".concat(this.f7029a.getClass().getSimpleName()));
                try {
                    this.f7029a.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f7034q = null;
                Thread.interrupted();
            }
            if (this.f7036t) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.f7036t) {
                return;
            }
            obtainMessage(2, e10).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.f7036t) {
                return;
            }
            fg0.d("OutOfMemory error loading stream", e11);
            obtainMessage(2, new zzyw(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.f7036t) {
                fg0.d("Unexpected error loading stream", e12);
                obtainMessage(3, e12).sendToTarget();
            }
            throw e12;
        } catch (Exception e13) {
            if (this.f7036t) {
                return;
            }
            fg0.d("Unexpected exception loading stream", e13);
            obtainMessage(2, new zzyw(e13)).sendToTarget();
        }
    }
}
