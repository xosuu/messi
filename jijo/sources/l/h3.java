package l;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f14864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f14865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f14866c;

    public /* synthetic */ h3(Method method, Method method2, Method method3) {
        this.f14864a = method;
        this.f14865b = method2;
        this.f14866c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
