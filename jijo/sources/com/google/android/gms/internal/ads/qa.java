package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qa extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8140h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f8141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f8142j;

    public qa(ja jaVar, j8 j8Var, int i10, Context context) {
        super(jaVar, "/W2ZEuHT/JiI5/Zhh6jV6ATrrvF8IBtmITl+4IJczntAr46Ow/LitCqqOR0RyWN9", "0yxvRSsGg+/BBPRqwe1F54W0T+vv1NRnE+jebtT36Vo=", j8Var, i10, 31);
        this.f8141i = null;
        this.f8142j = context;
    }

    private final void c() {
        if (((View) this.f8142j) == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f4097p2)).booleanValue();
        Object[] objArr = (Object[]) this.f5556e.invoke(null, (View) this.f8142j, (Activity) this.f8141i, Boolean.valueOf(zBooleanValue));
        synchronized (this.f5555d) {
            try {
                j8 j8Var = this.f5555d;
                long jLongValue = ((Long) objArr[0]).longValue();
                j8Var.d();
                x8.X((x8) j8Var.f9462b, jLongValue);
                j8 j8Var2 = this.f5555d;
                long jLongValue2 = ((Long) objArr[1]).longValue();
                j8Var2.d();
                x8.Y((x8) j8Var2.f9462b, jLongValue2);
                if (zBooleanValue) {
                    j8 j8Var3 = this.f5555d;
                    String str = (String) objArr[2];
                    j8Var3.d();
                    x8.Z((x8) j8Var3.f9462b, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        switch (this.f8140h) {
            case 0:
                c();
                return;
            default:
                j8 j8Var = this.f5555d;
                j8Var.d();
                x8.P0((x8) j8Var.f9462b, -1L);
                j8 j8Var2 = this.f5555d;
                j8Var2.d();
                x8.Q0((x8) j8Var2.f9462b, -1L);
                Context context = (Context) this.f8142j;
                if (context == null) {
                    context = this.f5552a.f5850a;
                }
                if (((List) this.f8141i) == null) {
                    this.f8141i = (List) this.f5556e.invoke(null, context);
                }
                List list = (List) this.f8141i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (this.f5555d) {
                    j8 j8Var3 = this.f5555d;
                    long jLongValue = ((Long) ((List) this.f8141i).get(0)).longValue();
                    j8Var3.d();
                    x8.P0((x8) j8Var3.f9462b, jLongValue);
                    j8 j8Var4 = this.f5555d;
                    long jLongValue2 = ((Long) ((List) this.f8141i).get(1)).longValue();
                    j8Var4.d();
                    x8.Q0((x8) j8Var4.f9462b, jLongValue2);
                    break;
                }
                return;
        }
    }

    public qa(ja jaVar, j8 j8Var, int i10, View view, Activity activity) {
        super(jaVar, "GC4CZUnPsyUcm5NrWw7C8gSktjb/gtBCDrSKBLlqImuOnQy7zHyo6XlIzkH3EMVH", "Kx8fghNUQq+sA+EfmK6qh0KjuKvw753ECuaCFV8szVM=", j8Var, i10, 62);
        this.f8142j = view;
        this.f8141i = activity;
    }
}
