package q5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import t.e;
import t.g;
import t.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends t.a {
    @Override // t.a
    public boolean d(h hVar, e eVar, e eVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f16794b != eVar) {
                    return false;
                }
                hVar.f16794b = eVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.a
    public boolean e(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f16793a != obj) {
                    return false;
                }
                hVar.f16793a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.a
    public boolean f(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f16795d != gVar) {
                    return false;
                }
                hVar.f16795d = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.a
    public Method g(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // t.a
    public Constructor h(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // t.a
    public String[] i(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // t.a
    public boolean j(Class cls) {
        return false;
    }

    @Override // t.a
    public void m(g gVar, g gVar2) {
        gVar.f16788b = gVar2;
    }

    @Override // t.a
    public void n(g gVar, Thread thread) {
        gVar.f16787a = thread;
    }
}
