package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wc0 implements ys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10153a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10154b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10155d;

    public wc0(kd kdVar, Map map) {
        this.f10154b = map;
        this.f10155d = kdVar;
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void E(ws0 ws0Var, String str, Throwable th) {
        int i10 = this.f10153a;
        Object obj = this.f10154b;
        switch (i10) {
            case 0:
                Map map = (Map) obj;
                if (map.containsKey(ws0Var)) {
                    ((kd) this.f10155d).b(((vc0) map.get(ws0Var)).f9832c);
                    return;
                }
                return;
            default:
                if (((Boolean) zzba.zzc().a(eg.B5)).booleanValue() && ws0.f10331h == ws0Var) {
                    dh0 dh0Var = (dh0) obj;
                    if (dh0Var.c() != 0) {
                        ((y3.b) zzu.zzB()).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - dh0Var.c();
                        synchronized (dh0Var) {
                            synchronized (dh0Var.f3668j) {
                                dh0Var.f3663e = jElapsedRealtime;
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void a(String str) {
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void j(ws0 ws0Var, String str) {
        switch (this.f10153a) {
            case 0:
                Map map = (Map) this.f10154b;
                if (map.containsKey(ws0Var)) {
                    ((kd) this.f10155d).b(((vc0) map.get(ws0Var)).f9830a);
                    return;
                }
                return;
            default:
                if (((Boolean) zzba.zzc().a(eg.B5)).booleanValue()) {
                    if (ws0.f10331h == ws0Var) {
                        dh0 dh0Var = (dh0) this.f10154b;
                        ((y3.b) zzu.zzB()).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (dh0Var) {
                            synchronized (dh0Var.f3667i) {
                                dh0Var.f3662d = jElapsedRealtime;
                                break;
                            }
                        }
                        return;
                    }
                    if (ws0.L == ws0Var || ws0.f10330f == ws0Var) {
                        dh0 dh0Var2 = (dh0) this.f10154b;
                        ((y3.b) zzu.zzB()).getClass();
                        dh0Var2.e(SystemClock.elapsedRealtime());
                        eh0 eh0Var = (eh0) this.f10155d;
                        ((m20) eh0Var.f12846b).e(new x1(eh0Var, ((dh0) this.f10154b).d(), 4));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.ys0
    public final void k(ws0 ws0Var, String str) {
        int i10 = this.f10153a;
        Object obj = this.f10154b;
        switch (i10) {
            case 0:
                Map map = (Map) obj;
                if (map.containsKey(ws0Var)) {
                    ((kd) this.f10155d).b(((vc0) map.get(ws0Var)).f9831b);
                    return;
                }
                return;
            default:
                if (((Boolean) zzba.zzc().a(eg.B5)).booleanValue() && ws0.f10331h == ws0Var) {
                    dh0 dh0Var = (dh0) obj;
                    if (dh0Var.c() != 0) {
                        ((y3.b) zzu.zzB()).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - dh0Var.c();
                        synchronized (dh0Var) {
                            synchronized (dh0Var.f3668j) {
                                dh0Var.f3663e = jElapsedRealtime;
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wc0(dh0 dh0Var, eh0 eh0Var) {
        this.f10154b = dh0Var;
        this.f10155d = eh0Var;
    }
}
