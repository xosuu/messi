package q5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b extends t.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f16433b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f16434d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f16435f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f16436h;

    public b() throws NoSuchMethodException {
        super((Object) null);
        this.f16433b = Class.class.getMethod("isRecord", new Class[0]);
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f16434d = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f16435f = componentType.getMethod("getName", new Class[0]);
        this.f16436h = componentType.getMethod("getType", new Class[0]);
    }

    @Override // t.a
    public final Method g(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // t.a
    public final Constructor h(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f16434d.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.f16436h.invoke(objArr[i10], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // t.a
    public final String[] i(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f16434d.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f16435f.invoke(objArr[i10], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // t.a
    public final boolean j(Class cls) {
        try {
            return ((Boolean) this.f16433b.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }
}
