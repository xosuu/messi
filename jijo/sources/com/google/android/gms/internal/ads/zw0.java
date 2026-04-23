package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IInterface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ek0 f11330b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f11331d;

    public /* synthetic */ zw0(ek0 ek0Var, Runnable runnable, int i10) {
        this.f11329a = i10;
        this.f11330b = ek0Var;
        this.f11331d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11329a) {
            case 0:
                Runnable runnable = this.f11331d;
                ek0 ek0Var = this.f11330b;
                ek0Var.getClass();
                try {
                    runnable.run();
                    return;
                } catch (RuntimeException e10) {
                    ((ou) ek0Var.f4215f).b("error caused by ", e10);
                    return;
                }
            default:
                ek0 ek0Var2 = this.f11330b;
                Runnable runnable2 = this.f11331d;
                if (((IInterface) ek0Var2.f4221v) != null || ek0Var2.f4213b) {
                    if (!ek0Var2.f4213b) {
                        runnable2.run();
                        return;
                    }
                    ((ou) ek0Var2.f4215f).d("Waiting to bind to the service.", new Object[0]);
                    synchronized (((List) ek0Var2.f4217q)) {
                        ((List) ek0Var2.f4217q).add(runnable2);
                        break;
                    }
                    return;
                }
                ((ou) ek0Var2.f4215f).d("Initiate binding to the service.", new Object[0]);
                synchronized (((List) ek0Var2.f4217q)) {
                    ((List) ek0Var2.f4217q).add(runnable2);
                    break;
                }
                ax0 ax0Var = new ax0(ek0Var2);
                ek0Var2.f4220u = ax0Var;
                ek0Var2.f4213b = true;
                if (ek0Var2.f4212a.bindService((Intent) ek0Var2.f4218s, ax0Var, 1)) {
                    return;
                }
                ((ou) ek0Var2.f4215f).d("Failed to bind to the service.", new Object[0]);
                ek0Var2.f4213b = false;
                synchronized (((List) ek0Var2.f4217q)) {
                    ((List) ek0Var2.f4217q).clear();
                    break;
                }
                return;
        }
    }
}
