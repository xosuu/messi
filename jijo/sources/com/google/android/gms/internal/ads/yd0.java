package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10856b;

    public /* synthetic */ yd0(int i10, Object obj) {
        this.f10855a = i10;
        this.f10856b = obj;
    }

    private final void a() {
        tj0 tj0Var = (tj0) this.f10856b;
        synchronized (tj0Var) {
            ((y3.b) tj0Var.f9171a).getClass();
            tj0Var.f9178h = SystemClock.elapsedRealtime() - tj0Var.f9179i;
        }
    }

    private final void b() {
        bl0 bl0Var = (bl0) this.f10856b;
        synchronized (bl0Var) {
            bl0Var.u1(3, "Signal collection timeout.");
        }
    }

    private final void c() {
        ek0 ek0Var = (ek0) this.f10856b;
        if (((IInterface) ek0Var.f4221v) != null) {
            ((ou) ek0Var.f4215f).d("Unbind from service.", new Object[0]);
            Context context = ek0Var.f4212a;
            ServiceConnection serviceConnection = (ServiceConnection) ek0Var.f4220u;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            ek0Var.f4213b = false;
            ek0Var.f4221v = null;
            ek0Var.f4220u = null;
            synchronized (((List) ek0Var.f4217q)) {
                ((List) ek0Var.f4217q).clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        n5.a aVar;
        int i10 = 0;
        switch (this.f10855a) {
            case 0:
                String str = zzu.zzo().d().zzh().f3444e;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                qu quVar = (qu) this.f10856b;
                if (zIsEmpty) {
                    quVar.c(new Exception());
                    return;
                } else {
                    quVar.b(str);
                    return;
                }
            case 1:
                ((kf0) this.f10856b).a();
                return;
            case 2:
                ((kf0) this.f10856b).a();
                return;
            case 3:
                ((hg0) this.f10856b).b();
                return;
            case 4:
                ((hg0) this.f10856b).b();
                return;
            case 5:
                a();
                return;
            case 6:
                ((kl0) ((ep) ((tl0) ((qp0) this.f10856b).f8255q).f9188f).f4270d).zzs();
                return;
            case 7:
                b();
                return;
            case 8:
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.A9)).booleanValue();
                Throwable th = (Throwable) this.f10856b;
                if (zBooleanValue) {
                    zzu.zzo().j("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    zzu.zzo().h("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case 9:
                tp0 tp0Var = (tp0) this.f10856b;
                tp0Var.getClass();
                tp0Var.f9226f.t(en1.u0(6, null, null));
                return;
            case 10:
                ((kl0) this.f10856b).zzs();
                return;
            case 11:
                uq0 uq0Var = (uq0) this.f10856b;
                uq0Var.getClass();
                uq0Var.f9575f.t(en1.u0(6, null, null));
                return;
            case 12:
                yq0 yq0Var = (yq0) this.f10856b;
                yq0Var.getClass();
                yq0Var.f11009f.t(en1.u0(6, null, null));
                return;
            case 13:
                ((wq0) this.f10856b).zzs();
                return;
            case 14:
                ok0 ok0Var = ((wu0) this.f10856b).f10353e;
                ok0Var.getClass();
                ((xq) ok0Var.f7598d).m(new zu0(ok0Var));
                return;
            case 15:
                ((k4.e) this.f10856b).f14669a.f(new xv0(new aw0()));
                return;
            case 16:
                c();
                return;
            case 17:
                ax0 ax0Var = (ax0) this.f10856b;
                ((ou) ax0Var.f2817a.f4215f).d("unlinkToDeath", new Object[0]);
                ek0 ek0Var = ax0Var.f2817a;
                IInterface iInterface = (IInterface) ek0Var.f4221v;
                iInterface.getClass();
                iInterface.asBinder().unlinkToDeath((IBinder.DeathRecipient) ek0Var.f4219t, 0);
                ek0Var.f4221v = null;
                ek0Var.f4213b = false;
                return;
            case 18:
                w21 w21Var = (w21) this.f10856b;
                if (w21Var == null || (aVar = w21Var.f10037t) == null) {
                    return;
                }
                this.f10856b = null;
                if (aVar.isDone()) {
                    w21Var.l(aVar);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = w21Var.f10038u;
                    w21Var.f10038u = null;
                    String str2 = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str2 = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (Throwable th2) {
                            w21Var.g(new v21(str2));
                            throw th2;
                        }
                    }
                    w21Var.g(new v21(str2 + ": " + aVar.toString()));
                    return;
                } finally {
                    aVar.cancel(true);
                }
            case 19:
                try {
                    aj1.G((vj1) this.f10856b);
                    return;
                } catch (zzhw e10) {
                    fg0.d("Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 20:
                nk1 nk1Var = (nk1) this.f10856b;
                nk1Var.G(nk1Var.a(), 1028, new mb1(12, i10));
                nk1Var.f7294q.k();
                return;
            case sf.zzm /* 21 */:
                gm1 gm1Var = (gm1) this.f10856b;
                if (gm1Var.W >= 300000) {
                    gm1Var.f4982m.f5645a.T0 = true;
                    gm1Var.W = 0L;
                    return;
                }
                return;
            case 22:
                wm1 wm1Var = (wm1) this.f10856b;
                synchronized (wm1Var.f10234a) {
                    try {
                        if (wm1Var.f10246m) {
                            return;
                        }
                        long j10 = wm1Var.f10245l - 1;
                        wm1Var.f10245l = j10;
                        if (j10 > 0) {
                            return;
                        }
                        if (j10 >= 0) {
                            wm1Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (wm1Var.f10234a) {
                            wm1Var.f10247n = illegalStateException;
                            break;
                        }
                        return;
                    } finally {
                    }
                }
            case 23:
                wo1 wo1Var = (wo1) ((nq1) this.f10856b);
                cp1[] cp1VarArr = wo1Var.B;
                int length = cp1VarArr.length;
                while (i10 < length) {
                    cp1 cp1Var = cp1VarArr[i10];
                    cp1Var.o(true);
                    if (cp1Var.A != null) {
                        cp1Var.A = null;
                        cp1Var.f3364f = null;
                    }
                    i10++;
                }
                ep epVar = wo1Var.f10267u;
                g0 g0Var = (g0) epVar.f4270d;
                if (g0Var != null) {
                    g0Var.zzf();
                    epVar.f4270d = null;
                }
                epVar.f4271f = null;
                return;
            default:
                wq1 wq1Var = (wq1) this.f10856b;
                int i11 = wq1Var.f10313k - 1;
                wq1Var.f10313k = i11;
                if (i11 > 0) {
                    return;
                }
                if (i11 < 0) {
                    throw new IllegalStateException(String.valueOf(i11));
                }
                wq1Var.f10305c.a();
                return;
        }
    }

    public /* synthetic */ yd0(int i10, Object obj, int i11) {
        this.f10855a = i10;
        this.f10856b = obj;
    }
}
