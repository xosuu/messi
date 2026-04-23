package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class w20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f10035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f10036c = true;

    public w20(mu muVar, ScheduledExecutorService scheduledExecutorService, ts0 ts0Var) {
        this.f10034a = muVar;
        this.f10035b = scheduledExecutorService;
    }
}
