package f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y extends b4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12987d;

    public /* synthetic */ y(int i10, Object obj) {
        this.f12986c = i10;
        this.f12987d = obj;
    }

    @Override // o0.e1
    public final void a() {
        int i10 = this.f12986c;
        Object obj = this.f12987d;
        switch (i10) {
            case 0:
                v vVar = (v) obj;
                vVar.f12980b.H.setAlpha(1.0f);
                k0 k0Var = vVar.f12980b;
                k0Var.K.d(null);
                k0Var.K = null;
                break;
            case 1:
                k0 k0Var2 = (k0) obj;
                k0Var2.H.setAlpha(1.0f);
                k0Var2.K.d(null);
                k0Var2.K = null;
                break;
            default:
                z zVar = (z) obj;
                zVar.f12997b.H.setVisibility(8);
                k0 k0Var3 = zVar.f12997b;
                PopupWindow popupWindow = k0Var3.I;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (k0Var3.H.getParent() instanceof View) {
                    View view = (View) k0Var3.H.getParent();
                    WeakHashMap weakHashMap = o0.v0.f16075a;
                    o0.h0.c(view);
                }
                k0Var3.H.e();
                k0Var3.K.d(null);
                k0Var3.K = null;
                ViewGroup viewGroup = k0Var3.M;
                WeakHashMap weakHashMap2 = o0.v0.f16075a;
                o0.h0.c(viewGroup);
                break;
        }
    }

    @Override // b4.f, o0.e1
    public final void c() {
        int i10 = this.f12986c;
        Object obj = this.f12987d;
        switch (i10) {
            case 0:
                ((v) obj).f12980b.H.setVisibility(0);
                break;
            case 1:
                k0 k0Var = (k0) obj;
                k0Var.H.setVisibility(0);
                if (k0Var.H.getParent() instanceof View) {
                    View view = (View) k0Var.H.getParent();
                    WeakHashMap weakHashMap = o0.v0.f16075a;
                    o0.h0.c(view);
                }
                break;
        }
    }
}
