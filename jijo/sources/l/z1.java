package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class z1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f15091b;

    public /* synthetic */ z1(a2 a2Var, int i10) {
        this.f15090a = i10;
        this.f15091b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15090a;
        a2 a2Var = this.f15091b;
        switch (i10) {
            case 0:
                ViewParent parent = a2Var.f14769f.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                a2Var.a();
                View view = a2Var.f14769f;
                if (view.isEnabled() && !view.isLongClickable() && a2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    a2Var.f14772s = true;
                    break;
                }
                break;
        }
    }
}
