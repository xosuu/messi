package r6;

import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public class b extends q6.b {
    @Override // q6.b
    public final void a(Throwable th, Throwable th2) {
        a0.f(th, "cause");
        a0.f(th2, "exception");
        Integer num = a.f16539a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
