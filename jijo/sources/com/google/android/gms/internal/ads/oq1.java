package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class oq1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t6 f7636d = new t6(2, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t6 f7637e = new t6(3, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f7638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mq1 f7639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f7640c;

    public oq1() {
        int i10 = yn0.f10944a;
        this.f7638a = Executors.newSingleThreadExecutor(new lt("ExoPlayer:Loader:ProgressiveMediaPeriod"));
    }
}
