package f;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends b4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f12795d;

    public /* synthetic */ b1(d1 d1Var, int i10) {
        this.f12794c = i10;
        this.f12795d = d1Var;
    }

    @Override // o0.e1
    public final void a() {
        View view;
        int i10 = this.f12794c;
        d1 d1Var = this.f12795d;
        switch (i10) {
            case 0:
                if (d1Var.f12815q && (view = d1Var.f12807i) != null) {
                    view.setTranslationY(0.0f);
                    d1Var.f12804f.setTranslationY(0.0f);
                }
                d1Var.f12804f.setVisibility(8);
                d1Var.f12804f.setTransitioning(false);
                d1Var.f12819u = null;
                j.a aVar = d1Var.f12811m;
                if (aVar != null) {
                    aVar.e(d1Var.f12810l);
                    d1Var.f12810l = null;
                    d1Var.f12811m = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = d1Var.f12803e;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = o0.v0.f16075a;
                    o0.h0.c(actionBarOverlayLayout);
                }
                break;
            default:
                d1Var.f12819u = null;
                d1Var.f12804f.requestLayout();
                break;
        }
    }
}
