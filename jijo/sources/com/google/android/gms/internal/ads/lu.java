package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class lu implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6702b;

    public /* synthetic */ lu(int i10, Object obj) {
        this.f6701a = i10;
        this.f6702b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f6701a;
        Object obj = this.f6702b;
        switch (i10) {
            case 0:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((Handler) obj).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    zzu.zzp();
                    zzt.zzM(zzu.zzo().f5058e, th);
                    throw th;
                }
            case 1:
                ((Handler) obj).post(runnable);
                return;
            case 2:
                ((Handler) obj).post(runnable);
                return;
            default:
                ((tm0) ((ld0) obj)).b(runnable);
                return;
        }
    }

    public lu() {
        this.f6701a = 0;
        this.f6702b = new zzf(Looper.getMainLooper());
    }
}
