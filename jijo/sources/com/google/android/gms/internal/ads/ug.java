package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MotionEvent f9469a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MotionEvent f9470b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f9471c;

    public ug(ScheduledExecutorService scheduledExecutorService) {
        this.f9471c = scheduledExecutorService;
    }
}
