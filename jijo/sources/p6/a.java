package p6;

import com.google.android.gms.internal.ads.en1;
import g4.a0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import l.h3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements n6.e, d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6.e f16253a;

    public a(n6.e eVar) {
        this.f16253a = eVar;
    }

    @Override // p6.d
    public final d a() {
        n6.e eVar = this.f16253a;
        if (eVar instanceof d) {
            return (d) eVar;
        }
        return null;
    }

    @Override // n6.e
    public final void d(Object obj) {
        n6.e eVar = this;
        while (true) {
            a aVar = (a) eVar;
            n6.e eVar2 = aVar.f16253a;
            a0.c(eVar2);
            try {
                obj = aVar.g(obj);
                if (obj == o6.a.f16110a) {
                    return;
                }
            } catch (Throwable th) {
                obj = en1.m(th);
            }
            aVar.h();
            if (!(eVar2 instanceof a)) {
                eVar2.d(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public n6.e e(n6.e eVar) {
        a0.f(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final StackTraceElement f() {
        int iIntValue;
        String strC;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        h3 h3Var = f.f16258b;
        h3 h3Var2 = f.f16257a;
        if (h3Var == null) {
            try {
                h3 h3Var3 = new h3(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f.f16258b = h3Var3;
                h3Var = h3Var3;
            } catch (Exception unused2) {
                f.f16258b = h3Var2;
                h3Var = h3Var2;
            }
        }
        if (h3Var != h3Var2) {
            Method method = h3Var.f14864a;
            Object objInvoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
            if (objInvoke != null) {
                Method method2 = h3Var.f14865b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
                if (objInvoke2 != null) {
                    Method method3 = h3Var.f14866c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i10);
    }

    public abstract Object g(Object obj);

    public abstract void h();

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objF = f();
        if (objF == null) {
            objF = getClass().getName();
        }
        sb.append(objF);
        return sb.toString();
    }
}
