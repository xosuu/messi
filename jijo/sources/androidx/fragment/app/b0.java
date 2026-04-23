package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f729a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f730b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f731d;

    public b0(c0 c0Var, m0 m0Var) {
        this.f731d = c0Var;
        this.f730b = m0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f729a;
        Object obj = this.f731d;
        switch (i10) {
            case 0:
                m0 m0Var = this.f730b;
                s sVar = m0Var.f836c;
                m0Var.k();
                c1.f((ViewGroup) sVar.S.getParent(), ((c0) obj).f745a.D()).e();
                break;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = o0.v0.f16075a;
                o0.h0.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public b0(m0 m0Var, View view) {
        this.f730b = m0Var;
        this.f731d = view;
    }
}
