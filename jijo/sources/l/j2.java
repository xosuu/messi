package l;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.y9;

/* JADX INFO: loaded from: classes.dex */
public final class j2 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14880b;

    public /* synthetic */ j2(int i10, Object obj) {
        this.f14879a = i10;
        this.f14880b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k2 k2Var;
        d0 d0Var;
        int i10 = this.f14879a;
        Object obj = this.f14880b;
        switch (i10) {
            case 0:
                int action = motionEvent.getAction();
                int x9 = (int) motionEvent.getX();
                int y8 = (int) motionEvent.getY();
                if (action == 0 && (d0Var = (k2Var = (k2) obj).L) != null && d0Var.isShowing() && x9 >= 0 && x9 < k2Var.L.getWidth() && y8 >= 0 && y8 < k2Var.L.getHeight()) {
                    k2Var.H.postDelayed(k2Var.D, 250L);
                } else if (action == 1) {
                    k2 k2Var2 = (k2) obj;
                    k2Var2.H.removeCallbacks(k2Var2.D);
                }
                break;
            default:
                y9 y9Var = ((zzt) obj).f2243t;
                if (y9Var != null) {
                    y9Var.f10801b.zzk(motionEvent);
                }
                break;
        }
        return false;
    }
}
