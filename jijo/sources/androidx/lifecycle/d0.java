package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f959b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m2.f f960a;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, k kVar) {
        if (activity instanceof q) {
            s sVarH = ((q) activity).h();
            if (sVarH instanceof s) {
                sVarH.e(kVar);
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            c0.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new d0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(k kVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), kVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(k.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        b(k.ON_DESTROY);
        this.f960a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        b(k.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        m2.f fVar = this.f960a;
        if (fVar != null) {
            ((b0) fVar.f15701b).b();
        }
        b(k.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        m2.f fVar = this.f960a;
        if (fVar != null) {
            b0 b0Var = (b0) fVar.f15701b;
            int i10 = b0Var.f948a + 1;
            b0Var.f948a = i10;
            if (i10 == 1 && b0Var.f951f) {
                b0Var.f953q.e(k.ON_START);
                b0Var.f951f = false;
            }
        }
        b(k.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        b(k.ON_STOP);
    }
}
