package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends e {
    final /* synthetic */ b0 this$0;

    public a0(b0 b0Var) {
        this.this$0 = b0Var;
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = d0.f959b;
            ((d0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f960a = this.this$0.f955t;
        }
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        b0 b0Var = this.this$0;
        int i10 = b0Var.f949b - 1;
        b0Var.f949b = i10;
        if (i10 == 0) {
            b0Var.f952h.postDelayed(b0Var.f954s, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new z(this));
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b0 b0Var = this.this$0;
        int i10 = b0Var.f948a - 1;
        b0Var.f948a = i10;
        if (i10 == 0 && b0Var.f950d) {
            b0Var.f953q.e(k.ON_STOP);
            b0Var.f951f = true;
        }
    }
}
