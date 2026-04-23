package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tm0 implements ld0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f9194b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f9195a;

    public tm0(Handler handler) {
        this.f9195a = handler;
    }

    public static /* bridge */ /* synthetic */ void d(fm0 fm0Var) {
        ArrayList arrayList = f9194b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(fm0Var);
            }
        }
    }

    public static fm0 e() {
        fm0 fm0Var;
        ArrayList arrayList = f9194b;
        synchronized (arrayList) {
            try {
                fm0Var = arrayList.isEmpty() ? new fm0() : (fm0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fm0Var;
    }

    public final fm0 a(int i10, Object obj) {
        fm0 fm0VarE = e();
        fm0VarE.f4572a = this.f9195a.obtainMessage(i10, obj);
        return fm0VarE;
    }

    public final boolean b(Runnable runnable) {
        return this.f9195a.post(runnable);
    }

    public final boolean c(int i10) {
        return this.f9195a.sendEmptyMessage(i10);
    }
}
