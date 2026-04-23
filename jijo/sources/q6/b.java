package q6;

import g4.a0;
import java.lang.reflect.Method;
import v6.d;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public void a(Throwable th, Throwable th2) {
        a0.f(th, "cause");
        a0.f(th2, "exception");
        Method method = a.f16438a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public d b() {
        return new v6.b();
    }
}
