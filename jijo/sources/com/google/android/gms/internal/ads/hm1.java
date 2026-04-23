package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public abstract class hm1 {
    public static void a(pl1 pl1Var, Object obj) {
        fl1 fl1Var;
        AudioDeviceInfo audioDeviceInfoG = android.support.v4.media.c.g(obj);
        gm1 gm1Var = (gm1) pl1Var;
        if (audioDeviceInfoG == null) {
            fl1Var = null;
        } else {
            gm1Var.getClass();
            fl1Var = new fl1(audioDeviceInfoG);
        }
        gm1Var.R = fl1Var;
        ek0 ek0Var = gm1Var.f4988s;
        if (ek0Var != null) {
            ek0Var.a(audioDeviceInfoG);
        }
        AudioTrack audioTrack = gm1Var.f4986q;
        if (audioTrack != null) {
            vl1.a(audioTrack, gm1Var.R);
        }
    }
}
