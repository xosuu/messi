package v5;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends r {
    public h D;
    public float E;

    @Override // v5.r
    public final void a(float f10) {
        this.E = this.D.q(f10);
    }

    @Override // v5.r
    /* JADX INFO: renamed from: b */
    public final r clone() {
        p pVar = (p) super.clone();
        pVar.D = (h) pVar.f17864q;
        return pVar;
    }

    @Override // v5.r
    public final Object c() {
        return Float.valueOf(this.E);
    }

    @Override // v5.r
    public final Object clone() {
        p pVar = (p) super.clone();
        pVar.D = (h) pVar.f17864q;
        return pVar;
    }

    @Override // v5.r
    public final void f(Object obj) {
        Object[] objArr = this.f17866t;
        w5.c cVar = this.f17860b;
        if (cVar != null) {
            cVar.b(obj, Float.valueOf(this.E));
            return;
        }
        if (this.f17861d != null) {
            try {
                objArr[0] = Float.valueOf(this.E);
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
