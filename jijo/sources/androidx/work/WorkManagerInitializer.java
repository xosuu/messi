package androidx.work;

import android.content.Context;
import c2.n;
import d2.k;
import d5.e;
import java.util.Collections;
import java.util.List;
import t1.b;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {
    static {
        n.l("WrkMgrInitializer");
    }

    @Override // t1.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // t1.b
    public final Object b(Context context) {
        n.i().g(new Throwable[0]);
        k.t0(context, new c2.b(new e()));
        return k.s0(context);
    }
}
