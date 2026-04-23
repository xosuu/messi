package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
public abstract class gn1 {
    public static void a(ym1 ym1Var, vk1 vk1Var) {
        uk1 uk1Var = vk1Var.f9907b;
        uk1Var.getClass();
        LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = uk1Var.f9528a;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        ym1Var.f10941b.setString("log-session-id", logSessionId2.getStringId());
    }
}
