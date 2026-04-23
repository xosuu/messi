package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class tl1 {
    public static hl1 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z9) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return hl1.f5340d;
        }
        gl1 gl1Var = new gl1();
        gl1Var.f4955a = true;
        gl1Var.f4957c = z9;
        return gl1Var.a();
    }
}
