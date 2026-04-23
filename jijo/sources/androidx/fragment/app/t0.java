package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f910g;

    public t0(v0 v0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f910g = v0Var;
        this.f904a = obj;
        this.f905b = arrayList;
        this.f906c = obj2;
        this.f907d = arrayList2;
        this.f908e = obj3;
        this.f909f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        v0 v0Var = this.f910g;
        Object obj = this.f904a;
        if (obj != null) {
            v0Var.v(obj, this.f905b, null);
        }
        Object obj2 = this.f906c;
        if (obj2 != null) {
            v0Var.v(obj2, this.f907d, null);
        }
        Object obj3 = this.f908e;
        if (obj3 != null) {
            v0Var.v(obj3, this.f909f, null);
        }
    }
}
