package d5;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import f7.e0;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import k.c0;
import l7.a0;

/* JADX INFO: loaded from: classes.dex */
public class e implements r1.c, o.a, m0, c0, v5.s, f7.b, f7.l, f7.m, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f12369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f12370b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f12371d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f12372f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f12373h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static e f12374q;

    public /* synthetic */ e(int i10) {
    }

    public static Socket f(f7.i iVar, f7.a aVar, i7.d dVar) {
        for (i7.b bVar : iVar.f13292d) {
            if (bVar.g(aVar, null) && bVar.f14187h != null && bVar != dVar.a()) {
                if (dVar.f14207l != null || dVar.f14204i.f14193n.size() != 1) {
                    throw new IllegalStateException();
                }
                Reference reference = (Reference) dVar.f14204i.f14193n.get(0);
                Socket socketB = dVar.b(true, false, false);
                dVar.f14204i = bVar;
                bVar.f14193n.add(reference);
                return socketB;
            }
        }
        return null;
    }

    public static void g(f7.i iVar, f7.a aVar, i7.d dVar, e0 e0Var) {
        for (i7.b bVar : iVar.f13292d) {
            if (bVar.g(aVar, e0Var)) {
                if (dVar.f14204i != null) {
                    throw new IllegalStateException();
                }
                dVar.f14204i = bVar;
                dVar.f14205j = true;
                bVar.f14193n.add(new i7.c(dVar, dVar.f14201f));
                return;
            }
        }
    }

    public static Path k(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0088, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0072 A[EDGE_INSN: B:91:0x0072->B:48:0x0072 BREAK  A[LOOP:2: B:49:0x0074->B:60:0x008b, LOOP_LABEL: LOOP:2: B:49:0x0074->B:60:0x008b], EDGE_INSN: B:94:0x0072->B:48:0x0072 BREAK  A[LOOP:2: B:49:0x0074->B:60:0x008b]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.e.m(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // androidx.lifecycle.m0
    public k0 a(Class cls) {
        return new androidx.fragment.app.k0(true);
    }

    @Override // o.a
    public Object apply() {
        return null;
    }

    @Override // k.c0
    public void b(k.o oVar, boolean z9) {
    }

    @Override // v5.s
    public Object c(float f10, Number number, Number number2) {
        return Integer.valueOf((int) ((f10 * (((Integer) number2).intValue() - r3)) + ((Integer) number).intValue()));
    }

    @Override // androidx.lifecycle.m0
    public k0 d(Class cls, c1.e eVar) {
        return a(cls);
    }

    @Override // r1.c
    public r1.d e(r1.b bVar) {
        return new s1.e(bVar.f16492a, bVar.f16493b, bVar.f16494c, bVar.f16495d);
    }

    public InputFilter[] h(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    @Override // k.c0
    public boolean i(k.o oVar) {
        return false;
    }

    public KeyListener j(KeyListener keyListener) {
        return keyListener;
    }

    public Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean n() {
        return false;
    }

    public boolean o(Spannable spannable) {
        return false;
    }

    public InputConnection p(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    public void q(boolean z9) {
    }

    public void r(boolean z9) {
    }

    public void s(boolean z9) {
    }

    public void t(boolean z9) {
    }

    public void u(View view, int i10, int i11, int i12, int i13) {
        if (!f12371d) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f12370b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f12371d = true;
        }
        Method method = f12370b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    public void v(f.f fVar, float f10) {
        r.a aVar = (r.a) ((Drawable) fVar.f12832b);
        boolean useCompatPadding = ((CardView) fVar.f12833d).getUseCompatPadding();
        boolean preventCornerOverlap = ((CardView) fVar.f12833d).getPreventCornerOverlap();
        if (f10 != aVar.f16478e || aVar.f16479f != useCompatPadding || aVar.f16480g != preventCornerOverlap) {
            aVar.f16478e = f10;
            aVar.f16479f = useCompatPadding;
            aVar.f16480g = preventCornerOverlap;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        if (!((CardView) fVar.f12833d).getUseCompatPadding()) {
            fVar.F(0, 0, 0, 0);
            return;
        }
        r.a aVar2 = (r.a) ((Drawable) fVar.f12832b);
        float f11 = aVar2.f16478e;
        float f12 = aVar2.f16474a;
        int iCeil = (int) Math.ceil(r.b.a(f11, f12, ((CardView) fVar.f12833d).getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(r.b.b(f11, f12, ((CardView) fVar.f12833d).getPreventCornerOverlap()));
        fVar.F(iCeil, iCeil2, iCeil, iCeil2);
    }

    public void w(View view, int i10) {
        if (!f12373h) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f12372f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f12373h = true;
        }
        Field field = f12372f;
        if (field != null) {
            try {
                f12372f.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public TransformationMethod x(TransformationMethod transformationMethod) {
        return transformationMethod;
    }
}
