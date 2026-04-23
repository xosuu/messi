package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class ww0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ou f10364c = new ou("OverlayDisplayService", 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Intent f10365d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ek0 f10366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10367b;

    public ww0(Context context) {
        if (bx0.a(context)) {
            this.f10366a = new ek0(context.getApplicationContext(), f10364c, f10365d);
        } else {
            this.f10366a = null;
        }
        this.f10367b = context.getPackageName();
    }
}
