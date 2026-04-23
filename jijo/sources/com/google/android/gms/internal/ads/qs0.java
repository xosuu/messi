package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class qs0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8275a;

    public /* synthetic */ qs0(int i10) {
        this.f8275a = i10;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        p21 t21Var;
        int i10 = 21;
        switch (this.f8275a) {
            case 0:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (executorServiceUnconfigurableExecutorService instanceof p21) {
                    t21Var = (p21) executorServiceUnconfigurableExecutorService;
                } else {
                    t21Var = executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new t21((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new mu(executorServiceUnconfigurableExecutorService);
                }
                tp1.b0(t21Var);
                return t21Var;
            case 1:
                return new yb();
            case 2:
                return new yk();
            case 3:
                return zzu.zzo();
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String strZzd = zzay.zzd();
                tp1.b0(strZzd);
                return strZzd;
            case 6:
                return new ArrayDeque();
            case 7:
                return new k70(21);
            case 8:
                return new pe(17);
            case 9:
                return zza.zza();
            case 10:
                return new pe(5);
            case 11:
                return new pe(15);
            case 12:
                return new pe(19);
            case 13:
                return new lx();
            case 14:
                return new qz(21, (g1.a) null);
            case 15:
                return new qz(22, (g1.a) null);
            case 16:
                return new pe(20);
            case 17:
                return new pe(14);
            case 18:
                return new zt();
            case 19:
                return new pe(i10);
            case 20:
                return zzu.zzn();
            case sf.zzm /* 21 */:
                return new i00();
            case 22:
                return md.APP_OPEN;
            case 23:
                return "app_open_ad";
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return md.BANNER;
            case 25:
                return "banner";
            case 26:
                return new k30();
            case 27:
                return new d60();
            case 28:
                k60 k60Var = new k60();
                k60Var.f6202a = ((Integer) zzba.zzc().a(eg.X0)).intValue();
                k60Var.f6203b = ((Integer) zzba.zzc().a(eg.Sb)).intValue();
                return k60Var;
            default:
                Set setEmptySet = Collections.emptySet();
                tp1.b0(setEmptySet);
                return setEmptySet;
        }
    }

    public /* synthetic */ qs0(int i10, int i11) {
        this.f8275a = i10;
    }
}
