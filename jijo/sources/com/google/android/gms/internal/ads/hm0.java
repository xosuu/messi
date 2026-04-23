package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class hm0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5347d;

    public hm0(gu guVar, ScheduledExecutorService scheduledExecutorService, mu muVar) {
        this.f5344a = 4;
        this.f5345b = guVar;
        this.f5347d = scheduledExecutorService;
        this.f5346c = muVar;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        switch (this.f5344a) {
            case 0:
                return 6;
            case 1:
                return 27;
            case 2:
                return 34;
            case 3:
                return 43;
            default:
                return 44;
        }
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        int i10 = this.f5344a;
        Object obj = this.f5345b;
        int i11 = 20;
        Object obj2 = this.f5347d;
        Object obj3 = this.f5346c;
        switch (i10) {
            case 0:
                Executor executor = (Executor) obj3;
                n5.a aVarQ0 = tc1.q0((n5.a) obj, new f00(16), executor);
                if (((Integer) zzba.zzc().a(eg.zb)).intValue() > 0) {
                    aVarQ0 = tc1.r0(aVarQ0, ((Integer) zzba.zzc().a(r1)).intValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                }
                return tc1.V(aVarQ0, Throwable.class, new f00(17), executor);
            case 1:
                return ((q11) ((p21) obj)).b(new du(20, this));
            case 2:
                return ((q11) ((p21) obj3)).b(new du(22, this));
            case 3:
                if (((Boolean) zzba.zzc().a(eg.w2)).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(eg.B2)).booleanValue()) {
                        k4.l lVar = new k4.l();
                        lVar.f(null);
                        p21 p21Var = (p21) obj3;
                        n5.a aVarQ02 = tc1.q0(en1.R(lVar), new f00(i11), p21Var);
                        if (((Boolean) zg.f11230a.k()).booleanValue()) {
                            aVarQ02 = tc1.r0(aVarQ02, ((Long) zg.f11231b.k()).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                        }
                        return tc1.P(aVarQ02, Exception.class, new qr(6, this), p21Var);
                    }
                }
                return tc1.d0(new vm0(null, -1, 2));
            default:
                Executor executor2 = (Executor) obj3;
                return tc1.P((h21) tc1.r0(tc1.o0(h21.r(tc1.k0(new il0(8, 0), executor2)), new b3(15), executor2), ((Long) zzba.zzc().a(eg.M0)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2), Exception.class, new qr(7, this), d21.f3541a);
        }
    }

    public hm0(gu guVar, ScheduledExecutorService scheduledExecutorService, mu muVar, int i10) {
        this.f5344a = 3;
        this.f5345b = guVar;
        this.f5347d = scheduledExecutorService;
        this.f5346c = muVar;
    }

    public /* synthetic */ hm0(Object obj, Object obj2, Object obj3, int i10) {
        this.f5344a = i10;
        this.f5345b = obj;
        this.f5346c = obj2;
        this.f5347d = obj3;
    }
}
