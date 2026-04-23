package e1;

import com.google.gson.internal.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor f12620a;

    public a(Constructor constructor) {
        this.f12620a = constructor;
    }

    @Override // com.google.gson.internal.l
    public final Object f() {
        Constructor constructor = this.f12620a;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            t.a aVar = q5.c.f16437a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + q5.c.b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + q5.c.b(constructor) + "' with no args", e12.getCause());
        }
    }
}
