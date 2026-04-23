package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements t1.b {
    @Override // t1.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // t1.b
    public final Object b(Context context) {
        if (!t1.a.c(context).f16817b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
        }
        if (!n.f988a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new m());
        }
        b0 b0Var = b0.f947u;
        b0Var.getClass();
        b0Var.f952h = new Handler();
        b0Var.f953q.e(k.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a0(b0Var));
        return b0Var;
    }
}
