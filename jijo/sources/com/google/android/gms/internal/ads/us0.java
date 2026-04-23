package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class us0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m21 f9603d = tc1.d0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p21 f9604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f9605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vs0 f9606c;

    public us0(mu muVar, ScheduledExecutorService scheduledExecutorService, e70 e70Var) {
        this.f9604a = muVar;
        this.f9605b = scheduledExecutorService;
        this.f9606c = e70Var;
    }

    public final ep a(ws0 ws0Var, n5.a... aVarArr) {
        return new ep(this, ws0Var, Arrays.asList(aVarArr));
    }

    public final tl0 b(n5.a aVar, ws0 ws0Var) {
        return new tl0(this, ws0Var, null, aVar, Collections.singletonList(aVar), aVar);
    }
}
