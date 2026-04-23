package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class cb extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile String f3244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f3245i = new Object();

    public cb(ja jaVar, j8 j8Var, int i10) {
        super(jaVar, "+pOuZc4XP/KXmz3ZcR0Th/zrptiqFMKeADXdr6ffDtBODTAlpCvFIUU/DK0sXoAh", "l4qa5EABhdRHJHltXD4U8dy0wNZl4oyoZ9TbFONnMI4=", j8Var, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        j8 j8Var = this.f5555d;
        j8Var.d();
        x8.z0((x8) j8Var.f9462b, "E");
        if (f3244h == null) {
            synchronized (f3245i) {
                try {
                    if (f3244h == null) {
                        f3244h = (String) this.f5556e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f5555d) {
            j8 j8Var2 = this.f5555d;
            String str = f3244h;
            j8Var2.d();
            x8.z0((x8) j8Var2.f9462b, str);
        }
    }
}
