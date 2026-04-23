package androidx.lifecycle;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class z extends e {
    final /* synthetic */ a0 this$1;

    public z(a0 a0Var) {
        this.this$1 = a0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        this.this$1.this$0.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        b0 b0Var = this.this$1.this$0;
        int i10 = b0Var.f948a + 1;
        b0Var.f948a = i10;
        if (i10 == 1 && b0Var.f951f) {
            b0Var.f953q.e(k.ON_START);
            b0Var.f951f = false;
        }
    }
}
