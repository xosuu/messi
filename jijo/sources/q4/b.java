package q4;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g4.d0;
import java.lang.ref.WeakReference;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f16432b;

    public b(BottomSheetBehavior bottomSheetBehavior) {
        this.f16432b = bottomSheetBehavior;
    }

    @Override // t3.i
    public final int e(View view, int i10) {
        return view.getLeft();
    }

    @Override // t3.i
    public final int f(View view, int i10) {
        return d0.d(i10, this.f16432b.x(), n());
    }

    @Override // t3.i
    public final int n() {
        BottomSheetBehavior bottomSheetBehavior = this.f16432b;
        return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
    }

    @Override // t3.i
    public final void s(int i10) {
        if (i10 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f16432b;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.B(1);
            }
        }
    }

    @Override // t3.i
    public final void t(View view, int i10, int i11) {
        this.f16432b.u(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // t3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.b.u(android.view.View, float, float):void");
    }

    @Override // t3.i
    public final boolean y(View view, int i10) {
        BottomSheetBehavior bottomSheetBehavior = this.f16432b;
        int i11 = bottomSheetBehavior.L;
        if (i11 == 1 || bottomSheetBehavior.f11767a0) {
            return false;
        }
        if (i11 == 3 && bottomSheetBehavior.Y == i10) {
            WeakReference weakReference = bottomSheetBehavior.V;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.U;
        return weakReference2 != null && weakReference2.get() == view;
    }
}
