package v5;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {
    public int D;

    @Override // v5.r
    public final void a(float f10) {
        throw null;
    }

    @Override // v5.r
    /* JADX INFO: renamed from: b */
    public final r clone() {
        q qVar = (q) super.clone();
        qVar.getClass();
        return qVar;
    }

    @Override // v5.r
    public final Object c() {
        return Integer.valueOf(this.D);
    }

    @Override // v5.r
    public final Object clone() {
        q qVar = (q) super.clone();
        qVar.getClass();
        return qVar;
    }

    @Override // v5.r
    public final void f(Object obj) {
        Object[] objArr = this.f17866t;
        w5.c cVar = this.f17860b;
        if (cVar != null) {
            cVar.b(obj, Integer.valueOf(this.D));
            return;
        }
        if (this.f17861d != null) {
            try {
                objArr[0] = Integer.valueOf(this.D);
                this.f17861d.invoke(obj, objArr);
            } catch (IllegalAccessException e10) {
                e10.toString();
            } catch (InvocationTargetException e11) {
                e11.toString();
            }
        }
    }

    @Override // v5.r
    public final void g(Class cls) {
        if (this.f17860b != null) {
            return;
        }
        super.g(cls);
    }
}
