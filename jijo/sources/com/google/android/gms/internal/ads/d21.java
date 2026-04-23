package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d21 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d21 f3541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d21[] f3542b;

    static {
        d21 d21Var = new d21("INSTANCE", 0);
        f3541a = d21Var;
        f3542b = new d21[]{d21Var};
    }

    public static d21[] values() {
        return (d21[]) f3542b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
