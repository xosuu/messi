package t;

import android.graphics.Typeface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16771a;

    public /* synthetic */ a(int i10) {
        this.f16771a = i10;
    }

    public abstract boolean d(h hVar, e eVar, e eVar2);

    public abstract boolean e(h hVar, Object obj, Object obj2);

    public abstract boolean f(h hVar, g gVar, g gVar2);

    public abstract Method g(Class cls, Field field);

    public abstract Constructor h(Class cls);

    public abstract String[] i(Class cls);

    public abstract boolean j(Class cls);

    public abstract void k(int i10);

    public abstract void l(Typeface typeface, boolean z9);

    public abstract void m(g gVar, g gVar2);

    public abstract void n(g gVar, Thread thread);

    public abstract Object o();

    public abstract n5.a p();

    public final String toString() {
        switch (this.f16771a) {
            case 2:
                return o().toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj) {
        this(5);
        this.f16771a = 5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a() {
        this(0);
        this.f16771a = 0;
    }
}
