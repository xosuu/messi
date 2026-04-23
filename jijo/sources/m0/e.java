package m0;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f15384a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f15384a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.c(d.a(d.b(locale)));
        }
        try {
            return c.a((Locale) f15384a.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return c.a(locale);
        }
    }
}
