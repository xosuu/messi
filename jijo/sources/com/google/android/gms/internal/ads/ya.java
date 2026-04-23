package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ya extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10804h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f10805i;

    public ya(ja jaVar, j8 j8Var, int i10, View view) {
        super(jaVar, "fHaUCxrr3fcbpdQPVJw6OSoHeHoizr6wmxmAsnLvDUhuNG2u8ebKX4VPxAoXSx4W", "K/sgHSTVeE1LLZ4HP+m5KF6ND+k7W4ID3M3VTul8bAI=", j8Var, i10, 57);
        this.f10805i = view;
    }

    private final void c() {
        long[] jArr = (long[]) this.f5556e.invoke(null, Long.valueOf(((u) this.f10805i).f9323d), Long.valueOf(((u) this.f10805i).f9324e), Long.valueOf(((u) this.f10805i).f9325f), Long.valueOf(((u) this.f10805i).f9326g));
        synchronized (this.f5555d) {
            j8 j8Var = this.f5555d;
            long j10 = jArr[0];
            j8Var.d();
            x8.d0((x8) j8Var.f9462b, j10);
            j8 j8Var2 = this.f5555d;
            long j11 = jArr[1];
            j8Var2.d();
            x8.e0((x8) j8Var2.f9462b, j11);
        }
    }

    private final void d() {
        Method method = this.f5556e;
        c1.d dVar = (c1.d) this.f10805i;
        List list = dVar.f1500a;
        dVar.f1500a = Collections.emptyList();
        int iIntValue = ((Integer) method.invoke(null, list)).intValue();
        synchronized (this.f5555d) {
            j8 j8Var = this.f5555d;
            int iZ = z3.a.Z(iIntValue);
            j8Var.d();
            x8.s0((x8) j8Var.f9462b, iZ);
        }
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        int i10 = 2;
        switch (this.f10804h) {
            case 0:
                c();
                return;
            case 1:
                d();
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.f10805i;
                if (stackTraceElementArr != null) {
                    z9 z9Var = new z9((String) this.f5556e.invoke(null, stackTraceElementArr), 1);
                    synchronized (this.f5555d) {
                        try {
                            j8 j8Var = this.f5555d;
                            long jLongValue = z9Var.f11185b.longValue();
                            j8Var.d();
                            x8.K((x8) j8Var.f9462b, jLongValue);
                            if (((Boolean) z9Var.f11186c).booleanValue()) {
                                j8 j8Var2 = this.f5555d;
                                if (true == ((Boolean) z9Var.f11187d).booleanValue()) {
                                    i10 = 1;
                                }
                                j8Var2.d();
                                x8.p0((x8) j8Var2.f9462b, i10);
                            } else {
                                j8 j8Var3 = this.f5555d;
                                j8Var3.d();
                                x8.p0((x8) j8Var3.f9462b, 3);
                            }
                        } finally {
                        }
                        break;
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.f10805i;
                if (view != null) {
                    Boolean bool = (Boolean) zzba.zzc().a(eg.f3937a3);
                    Boolean bool2 = (Boolean) zzba.zzc().a(eg.Z9);
                    String str = (String) this.f5556e.invoke(null, view, this.f5552a.f5850a.getResources().getDisplayMetrics(), bool, bool2);
                    ma maVar = new ma();
                    HashMap mapA = i9.a(str);
                    if (mapA != null) {
                        maVar.f6888a = (Long) mapA.get(0);
                        maVar.f6889b = (Long) mapA.get(1);
                        maVar.f6890c = (Long) mapA.get(2);
                        maVar.f6891d = (Long) mapA.get(3);
                        maVar.f6892e = (Long) mapA.get(4);
                    }
                    v8 v8VarA = w8.A();
                    long jLongValue2 = maVar.f6888a.longValue();
                    v8VarA.d();
                    w8.C((w8) v8VarA.f9462b, jLongValue2);
                    long jLongValue3 = maVar.f6889b.longValue();
                    v8VarA.d();
                    w8.D((w8) v8VarA.f9462b, jLongValue3);
                    long jLongValue4 = maVar.f6890c.longValue();
                    v8VarA.d();
                    w8.E((w8) v8VarA.f9462b, jLongValue4);
                    if (bool2.booleanValue()) {
                        long jLongValue5 = maVar.f6892e.longValue();
                        v8VarA.d();
                        w8.B((w8) v8VarA.f9462b, jLongValue5);
                    }
                    if (bool.booleanValue()) {
                        long jLongValue6 = maVar.f6891d.longValue();
                        v8VarA.d();
                        w8.F((w8) v8VarA.f9462b, jLongValue6);
                    }
                    w8 w8Var = (w8) v8VarA.b();
                    j8 j8Var4 = this.f5555d;
                    j8Var4.d();
                    x8.T((x8) j8Var4.f9462b, w8Var);
                    return;
                }
                return;
        }
    }

    public ya(ja jaVar, j8 j8Var, int i10, c1.d dVar) {
        super(jaVar, "QcEEfK1PwFv2Eb+NZQ+4kWKAUUVvycYqoBzmAjBexJV/sKEjaFlajeD5MAZYWXy5", "361aY1ErIwpwsXwpamiiDSCpkl/IcdBM93dd8sW9a/Y=", j8Var, i10, 94);
        this.f10805i = dVar;
    }

    public ya(ja jaVar, j8 j8Var, int i10, u uVar) {
        super(jaVar, "ZdMwT5n8r4APV4u4GhQlb1VCwOIVHkTm7kF7LnArEpyZnsv+C3G3q6fVFgtTcqcc", "O+vmm8flr2e7ZrTWUx/T8ClWwcEwLlJlfjM8sMGjZbg=", j8Var, i10, 85);
        this.f10805i = uVar;
    }

    public ya(ja jaVar, j8 j8Var, int i10, StackTraceElement[] stackTraceElementArr) {
        super(jaVar, "9douHjmTTjq3N4YYUdzzHaKyxIqsB5K92p8t26vKQB1HahpVak+32YHan4LmgLPE", "q6oLc2ULDKRAR1VDdX5lO9/kb0NHjx7PMACMr/7cZL8=", j8Var, i10, 45);
        this.f10805i = stackTraceElementArr;
    }
}
