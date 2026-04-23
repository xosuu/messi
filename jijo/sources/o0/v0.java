package o0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f16075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f16076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f16077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ThreadLocal f16078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f16079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f16080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f16081g;

    static {
        new AtomicInteger(1);
        f16075a = null;
        f16077c = false;
        f16079e = new int[]{R.id.v, R.id.w, R.id.a7, R.id.ah, R.id.ak, R.id.al, R.id.am, R.id.an, R.id.ao, R.id.ap, R.id.x, R.id.y, R.id.z, R.id.a0, R.id.a1, R.id.a2, R.id.a3, R.id.a4, R.id.a5, R.id.a6, R.id.a8, R.id.a9, R.id.a_, R.id.aa, R.id.ab, R.id.ac, R.id.ad, R.id.ae, R.id.af, R.id.ag, R.id.ai, R.id.aj};
        f16080f = new y();
        f16081g = new a0();
    }

    public static d1 a(View view) {
        if (f16075a == null) {
            f16075a = new WeakHashMap();
        }
        d1 d1Var = (d1) f16075a.get(view);
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1(view);
        f16075a.put(view, d1Var2);
        return d1Var2;
    }

    public static t1 b(View view, t1 t1Var) {
        WindowInsets windowInsetsG = t1Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = h0.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return t1.h(windowInsetsA, view);
            }
        }
        return t1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = u0.f16069d;
        u0 u0Var = (u0) view.getTag(R.id.ve);
        if (u0Var == null) {
            u0Var = new u0();
            u0Var.f16070a = null;
            u0Var.f16071b = null;
            u0Var.f16072c = null;
            view.setTag(R.id.ve, u0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = u0Var.f16070a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = u0.f16069d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (u0Var.f16070a == null) {
                            u0Var.f16070a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = u0.f16069d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                u0Var.f16070a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    u0Var.f16070a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = u0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (u0Var.f16071b == null) {
                    u0Var.f16071b = new SparseArray();
                }
                u0Var.f16071b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return p0.a(view);
        }
        if (f16077c) {
            return null;
        }
        if (f16076b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f16076b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f16077c = true;
                return null;
            }
        }
        try {
            Object obj = f16076b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f16077c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = o0.b(view);
        } else {
            tag = view.getTag(R.id.v8);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.v5);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.v5, arrayList2);
        return arrayList2;
    }

    public static Rect g() {
        if (f16078d == null) {
            f16078d = new ThreadLocal();
        }
        Rect rect = (Rect) f16078d.get();
        if (rect == null) {
            rect = new Rect();
            f16078d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] h(View view) {
        return Build.VERSION.SDK_INT >= 31 ? r0.a(view) : (String[]) view.getTag(R.id.va);
    }

    public static void i(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z9 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (g0.a(view) != 0 || z9) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z9 ? 32 : 2048);
                g0.g(accessibilityEventObtain, i10);
                if (z9) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (d0.c(view) == 0) {
                        d0.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        if (d0.c((View) parent) == 4) {
                            d0.s(view, 2);
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        g0.e(view.getParent(), view, view, i10);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            g0.g(accessibilityEventObtain2, i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void j(View view, int i10) {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        Rect rectG = g();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectG.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z9 = !rectG.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z9 = false;
        }
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            t(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                t((View) parent2);
            }
        }
        if (z9 && rectG.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectG);
        }
    }

    public static void k(View view, int i10) {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        Rect rectG = g();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectG.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z9 = !rectG.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z9 = false;
        }
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            t(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                t((View) parent2);
            }
        }
        if (z9 && rectG.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectG);
        }
    }

    public static t1 l(View view, t1 t1Var) {
        WindowInsets windowInsetsG = t1Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = h0.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return t1.h(windowInsetsB, view);
            }
        }
        return t1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h m(View view, h hVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(hVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return r0.b(view, hVar);
        }
        u uVar = (u) view.getTag(R.id.v_);
        v vVar = f16080f;
        if (uVar == null) {
            if (view instanceof v) {
                vVar = (v) view;
            }
            return vVar.a(hVar);
        }
        h hVarA = ((s0.t) uVar).a(view, hVar);
        if (hVarA == null) {
            return null;
        }
        if (view instanceof v) {
            vVar = (v) view;
        }
        return vVar.a(hVarA);
    }

    public static void n(View view, int i10) {
        ArrayList arrayListF = f(view);
        for (int i11 = 0; i11 < arrayListF.size(); i11++) {
            if (((p0.f) arrayListF.get(i11)).a() == i10) {
                arrayListF.remove(i11);
                return;
            }
        }
    }

    public static void o(View view, p0.f fVar, p0.t tVar) {
        if (tVar == null) {
            n(view, fVar.a());
            i(view, 0);
            return;
        }
        p0.f fVar2 = new p0.f(null, fVar.f16191b, null, tVar, fVar.f16192c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        c cVar = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof a ? ((a) accessibilityDelegateD).f16006a : new c(accessibilityDelegateD);
        if (cVar == null) {
            cVar = new c();
        }
        q(view, cVar);
        n(view, fVar2.a());
        f(view).add(fVar2);
        i(view, 0);
    }

    public static void p(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            p0.c(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void q(View view, c cVar) {
        if (cVar == null && (d(view) instanceof a)) {
            cVar = new c();
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.f16017b);
    }

    public static void r(View view, CharSequence charSequence) {
        new z(R.id.v8, 8, 28, 1 == true ? 1 : 0).b(view, charSequence);
        a0 a0Var = f16081g;
        if (charSequence == null) {
            a0Var.f16007a.remove(view);
            view.removeOnAttachStateChangeListener(a0Var);
            d0.o(view.getViewTreeObserver(), a0Var);
        } else {
            a0Var.f16007a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(a0Var);
            if (g0.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(a0Var);
            }
        }
    }

    public static void s(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        j0.q(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z9 = (j0.g(view) == null && j0.h(view) == null) ? false : true;
            if (background == null || !z9) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            d0.q(view, background);
        }
    }

    public static void t(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
