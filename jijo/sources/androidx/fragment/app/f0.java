package androidx.fragment.app;

import android.content.Context;
import com.google.android.gms.internal.ads.fb1;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s.k f771b = new s.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f772a;

    public f0(j0 j0Var) {
        this.f772a = j0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        s.k kVar = f771b;
        s.k kVar2 = (s.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new s.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment$InstantiationException(fb1.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment$InstantiationException(fb1.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public final s a(String str) {
        Context context = this.f772a.f797p.f914y;
        Object obj = s.f880g0;
        try {
            return (s) c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new Fragment$InstantiationException(fb1.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new Fragment$InstantiationException(fb1.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new Fragment$InstantiationException(fb1.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new Fragment$InstantiationException(fb1.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
