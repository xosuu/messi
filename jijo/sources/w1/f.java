package w1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import l.l3;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q {
    public static final String[] J = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final l3 K;
    public static final l3 L;
    public static final l3 M;
    public static final l3 N;
    public static final l3 O;

    static {
        new b(PointF.class, "boundsOrigin").f18074a = new Rect();
        K = new l3(PointF.class, "topLeft", 1);
        L = new l3(PointF.class, "bottomRight", 2);
        M = new l3(PointF.class, "bottomRight", 3);
        N = new l3(PointF.class, "topLeft", 4);
        O = new l3(PointF.class, "position", 5);
    }

    public static void H(x xVar) {
        View view = xVar.f18148b;
        WeakHashMap weakHashMap = v0.f16075a;
        if (!o0.g0.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = xVar.f18147a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", xVar.f18148b.getParent());
    }

    @Override // w1.q
    public final void d(x xVar) {
        H(xVar);
    }

    @Override // w1.q
    public final void g(x xVar) {
        H(xVar);
    }

    @Override // w1.q
    public final Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        int i10;
        f fVar;
        Animator animatorOfObject;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        HashMap map = xVar.f18147a;
        HashMap map2 = xVar2.f18147a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i10 = 0;
        } else {
            i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        int i23 = i10;
        if (i23 <= 0) {
            return null;
        }
        View view = xVar2.f18148b;
        y.a(view, i11, i13, i15, i17);
        if (i23 != 2) {
            fVar = this;
            if (i11 == i12 && i13 == i14) {
                fVar.F.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, M, (TypeConverter) null, d5.e.k(i15, i17, i16, i18));
            } else {
                fVar.F.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, N, (TypeConverter) null, d5.e.k(i11, i13, i12, i14));
            }
        } else if (i19 == i21 && i20 == i22) {
            fVar = this;
            fVar.F.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, O, (TypeConverter) null, d5.e.k(i11, i13, i12, i14));
        } else {
            fVar = this;
            e eVar = new e();
            eVar.f18083e = view;
            fVar.F.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(eVar, K, (TypeConverter) null, d5.e.k(i11, i13, i12, i14));
            fVar.F.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(eVar, L, (TypeConverter) null, d5.e.k(i15, i17, i16, i18));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new c(eVar));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            q7.b.u(viewGroup4, true);
            fVar.a(new d(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // w1.q
    public final String[] p() {
        return J;
    }
}
