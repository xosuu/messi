package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class qi1 {
    public static vk1 a(Context context, ui1 ui1Var, boolean z9, String str) {
        MediaMetricsManager mediaMetricsManagerE = a5.e.e(context.getSystemService("media_metrics"));
        sk1 sk1Var = mediaMetricsManagerE == null ? null : new sk1(context, mediaMetricsManagerE.createPlaybackSession());
        if (sk1Var == null) {
            fg0.f("MediaMetricsService unavailable.");
            return new vk1(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z9) {
            ui1Var.z(sk1Var);
        }
        return new vk1(sk1Var.f8906d.getSessionId(), str);
    }
}
