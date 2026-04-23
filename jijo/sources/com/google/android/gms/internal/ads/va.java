package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class va extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9815h;

    public va(ja jaVar, j8 j8Var, long j10, int i10) {
        super(jaVar, "Rx5KxmHu63h8QT7T4cYR2mu7F4LQnYkocG/Azb9HP8ZHyjUHnRxxCuB99BIp3kbl", "3fysZeGzwX+hqd2f4+qtlSho+oF+DeFl9kzKrTFOSWo=", j8Var, i10, 25);
        this.f9815h = j10;
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        long jLongValue = ((Long) this.f5556e.invoke(null, new Object[0])).longValue();
        synchronized (this.f5555d) {
            try {
                j8 j8Var = this.f5555d;
                j8Var.d();
                x8.i0((x8) j8Var.f9462b, jLongValue);
                long j10 = this.f9815h;
                if (j10 != 0) {
                    j8 j8Var2 = this.f5555d;
                    j8Var2.d();
                    x8.J0((x8) j8Var2.f9462b, jLongValue - j10);
                    j8 j8Var3 = this.f5555d;
                    long j11 = this.f9815h;
                    j8Var3.d();
                    x8.M0((x8) j8Var3.f9462b, j11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
