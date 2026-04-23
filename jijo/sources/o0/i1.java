package o0;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f16034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f16035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Constructor f16036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f16037f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsets f16038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0.c f16039b;

    public i1() {
        this.f16038a = e();
    }

    private static WindowInsets e() {
        if (!f16035d) {
            try {
                f16034c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f16035d = true;
        }
        Field field = f16034c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f16037f) {
            try {
                f16036e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f16037f = true;
        }
        Constructor constructor = f16036e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // o0.l1
    public t1 b() {
        a();
        t1 t1VarH = t1.h(this.f16038a, null);
        r1 r1Var = t1VarH.f16068a;
        r1Var.o(null);
        r1Var.q(this.f16039b);
        return t1VarH;
    }

    @Override // o0.l1
    public void c(g0.c cVar) {
        this.f16039b = cVar;
    }

    @Override // o0.l1
    public void d(g0.c cVar) {
        WindowInsets windowInsets = this.f16038a;
        if (windowInsets != null) {
            this.f16038a = windowInsets.replaceSystemWindowInsets(cVar.f13601a, cVar.f13602b, cVar.f13603c, cVar.f13604d);
        }
    }

    public i1(t1 t1Var) {
        super(t1Var);
        this.f16038a = t1Var.g();
    }
}
