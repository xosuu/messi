package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public abstract class vl1 {
    public static void a(AudioTrack audioTrack, fl1 fl1Var) {
        audioTrack.setPreferredDevice(fl1Var == null ? null : fl1Var.f4571a);
    }
}
