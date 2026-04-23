package l;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l3 extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14933a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(Class cls, String str, int i10) {
        super(cls, str);
        this.f14933a = i10;
    }

    public final Float a(View view) {
        switch (this.f14933a) {
            case 6:
                return Float.valueOf(w1.y.f18150a.y(view));
            case 7:
            default:
                WeakHashMap weakHashMap = o0.v0.f16075a;
                return Float.valueOf(o0.e0.e(view));
            case 8:
                return Float.valueOf(view.getLayoutParams().width);
            case 9:
                return Float.valueOf(view.getLayoutParams().height);
            case 10:
                WeakHashMap weakHashMap2 = o0.v0.f16075a;
                return Float.valueOf(o0.e0.f(view));
        }
    }

    public final void b(View view, PointF pointF) {
        switch (this.f14933a) {
            case 3:
                w1.y.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                break;
            case 4:
                w1.y.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                break;
            default:
                int iRound = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                w1.y.a(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
                break;
        }
    }

    public final void c(View view, Float f10) {
        switch (this.f14933a) {
            case 6:
                w1.y.f18150a.z(view, f10.floatValue());
                break;
            case 7:
            default:
                WeakHashMap weakHashMap = o0.v0.f16075a;
                o0.e0.k(view, o0.e0.f(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
                break;
            case 8:
                view.getLayoutParams().width = f10.intValue();
                view.requestLayout();
                break;
            case 9:
                view.getLayoutParams().height = f10.intValue();
                view.requestLayout();
                break;
            case 10:
                int iIntValue = f10.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = o0.v0.f16075a;
                o0.e0.k(view, iIntValue, paddingTop, o0.e0.e(view), view.getPaddingBottom());
                break;
        }
    }

    public final void d(w1.e eVar, PointF pointF) {
        switch (this.f14933a) {
            case 1:
                eVar.getClass();
                eVar.f18079a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                eVar.f18080b = iRound;
                int i10 = eVar.f18084f + 1;
                eVar.f18084f = i10;
                if (i10 == eVar.f18085g) {
                    w1.y.a(eVar.f18083e, eVar.f18079a, iRound, eVar.f18081c, eVar.f18082d);
                    eVar.f18084f = 0;
                    eVar.f18085g = 0;
                }
                break;
            default:
                eVar.getClass();
                eVar.f18081c = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                eVar.f18082d = iRound2;
                int i11 = eVar.f18085g + 1;
                eVar.f18085g = i11;
                if (eVar.f18084f == i11) {
                    w1.y.a(eVar.f18083e, eVar.f18079a, eVar.f18080b, eVar.f18081c, iRound2);
                    eVar.f18084f = 0;
                    eVar.f18085g = 0;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f14933a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 7:
                WeakHashMap weakHashMap = o0.v0.f16075a;
                break;
        }
        return a((View) obj);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f14933a) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 1:
                d((w1.e) obj, (PointF) obj2);
                break;
            case 2:
                d((w1.e) obj, (PointF) obj2);
                break;
            case 3:
                b((View) obj, (PointF) obj2);
                break;
            case 4:
                b((View) obj, (PointF) obj2);
                break;
            case 5:
                b((View) obj, (PointF) obj2);
                break;
            case 6:
                c((View) obj, (Float) obj2);
                break;
            case 7:
                WeakHashMap weakHashMap = o0.v0.f16075a;
                o0.f0.c((View) obj, (Rect) obj2);
                break;
            case 8:
                c((View) obj, (Float) obj2);
                break;
            case 9:
                c((View) obj, (Float) obj2);
                break;
            case 10:
                c((View) obj, (Float) obj2);
                break;
            default:
                c((View) obj, (Float) obj2);
                break;
        }
    }
}
