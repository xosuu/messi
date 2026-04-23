package n4;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0.a f15954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f15955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public VelocityTracker f15960i;

    @Override // b0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int iFindPointerIndex;
        if (this.f15959h < 0) {
            this.f15959h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f15956e) {
            int i10 = this.f15957f;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y8 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y8 - this.f15958g) > this.f15959h) {
                this.f15958g = y8;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f15957f = -1;
            int x9 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f11712n;
            boolean z9 = (weakReference == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.n(view, x9, y9);
            this.f15956e = z9;
            if (z9) {
                this.f15958g = y9;
                this.f15957f = motionEvent.getPointerId(0);
                if (this.f15960i == null) {
                    this.f15960i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f15955d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f15955d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f15960i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // b0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.e.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int u();

    public abstract int v(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    public final void w(CoordinatorLayout coordinatorLayout, View view, int i10) {
        v(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
