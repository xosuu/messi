package f;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends ContentFrameLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k0 f12850u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, j.e eVar) {
        super(eVar, null);
        this.f12850u = k0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f12850u.w(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (x9 < -5 || y8 < -5 || x9 > getWidth() + 5 || y8 > getHeight() + 5) {
                k0 k0Var = this.f12850u;
                k0Var.u(k0Var.D(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(p7.q.g(getContext(), i10));
    }
}
