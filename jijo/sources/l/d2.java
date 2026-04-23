package l;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f14843b;

    public /* synthetic */ d2(k2 k2Var, int i10) {
        this.f14842a = i10;
        this.f14843b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14842a;
        k2 k2Var = this.f14843b;
        switch (i10) {
            case 1:
                x1 x1Var = k2Var.f14910d;
                if (x1Var != null) {
                    x1Var.setListSelectionHidden(true);
                    x1Var.requestLayout();
                }
                break;
            default:
                x1 x1Var2 = k2Var.f14910d;
                if (x1Var2 != null) {
                    WeakHashMap weakHashMap = o0.v0.f16075a;
                    if (o0.g0.b(x1Var2) && k2Var.f14910d.getCount() > k2Var.f14910d.getChildCount() && k2Var.f14910d.getChildCount() <= k2Var.f14920y) {
                        k2Var.L.setInputMethodMode(2);
                        k2Var.e();
                        break;
                    }
                }
                break;
        }
    }
}
