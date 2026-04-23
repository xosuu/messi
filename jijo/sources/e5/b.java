package e5;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.material.sidesheet.SideSheetBehavior;
import g4.d0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f12721b;

    public b(SideSheetBehavior sideSheetBehavior) {
        this.f12721b = sideSheetBehavior;
    }

    @Override // t3.i
    public final int e(View view, int i10) {
        SideSheetBehavior sideSheetBehavior = this.f12721b;
        return d0.d(i10, sideSheetBehavior.f11931a.e(), sideSheetBehavior.f11943m);
    }

    @Override // t3.i
    public final int f(View view, int i10) {
        return view.getTop();
    }

    @Override // t3.i
    public final int m(View view) {
        return this.f12721b.f11943m;
    }

    @Override // t3.i
    public final void s(int i10) {
        if (i10 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f12721b;
            if (sideSheetBehavior.f11937g) {
                sideSheetBehavior.s(1);
            }
        }
    }

    @Override // t3.i
    public final void t(View view, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f12721b;
        WeakReference weakReference = sideSheetBehavior.f11945o;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            x4.a aVar = sideSheetBehavior.f11931a;
            int left = view.getLeft();
            view.getRight();
            int i12 = ((SideSheetBehavior) aVar.f18391b).f11943m;
            if (left <= i12) {
                marginLayoutParams.rightMargin = i12 - left;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f11949s;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        x4.a aVar2 = sideSheetBehavior.f11931a;
        aVar2.h();
        aVar2.e();
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    @Override // t3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r8, float r9, float r10) {
        /*
            r7 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r7.f12721b
            x4.a r1 = r0.f11931a
            r1.getClass()
            r2 = 3
            r3 = 0
            int r4 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r4 >= 0) goto Lf
            goto L87
        Lf:
            int r4 = r8.getRight()
            float r4 = (float) r4
            java.lang.Object r5 = r1.f18391b
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            float r5 = r5.f11941k
            float r5 = r5 * r9
            float r5 = r5 + r4
            float r4 = java.lang.Math.abs(r5)
            java.lang.Object r5 = r1.f18391b
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            r5.getClass()
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            float r9 = java.lang.Math.abs(r9)
            float r3 = java.lang.Math.abs(r10)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 <= 0) goto L4a
            java.lang.Object r9 = r1.f18391b
            com.google.android.material.sidesheet.SideSheetBehavior r9 = (com.google.android.material.sidesheet.SideSheetBehavior) r9
            r9.getClass()
            r9 = 500(0x1f4, float:7.0E-43)
            float r9 = (float) r9
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 <= 0) goto L4a
            goto L5b
        L4a:
            int r9 = r8.getLeft()
            int r10 = r1.h()
            int r1 = r1.e()
            int r10 = r10 - r1
            int r10 = r10 / 2
            if (r9 <= r10) goto L87
        L5b:
            r2 = 5
            goto L87
        L5d:
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 == 0) goto L6e
            float r9 = java.lang.Math.abs(r9)
            float r10 = java.lang.Math.abs(r10)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L6e
            goto L5b
        L6e:
            int r9 = r8.getLeft()
            int r10 = r1.e()
            int r10 = r9 - r10
            int r10 = java.lang.Math.abs(r10)
            int r1 = r1.h()
            int r9 = r9 - r1
            int r9 = java.lang.Math.abs(r9)
            if (r10 >= r9) goto L5b
        L87:
            r9 = 1
            r0.u(r2, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.b.u(android.view.View, float, float):void");
    }

    @Override // t3.i
    public final boolean y(View view, int i10) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f12721b;
        return (sideSheetBehavior.f11938h == 1 || (weakReference = sideSheetBehavior.f11944n) == null || weakReference.get() != view) ? false : true;
    }
}
