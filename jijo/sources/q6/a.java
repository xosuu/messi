package q6;

import g4.a0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f16438a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        a0.e(methods, "throwableMethods");
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (a0.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                a0.e(parameterTypes, "it.parameterTypes");
                if (a0.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f16438a = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !a0.b(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}
