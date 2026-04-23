package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class ul1 {
    public static hl1 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z9) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return hl1.f5340d;
        }
        gl1 gl1Var = new gl1();
        boolean z10 = false;
        if (yn0.f10944a > 32 && playbackOffloadSupport == 2) {
            z10 = true;
        }
        gl1Var.f4955a = true;
        gl1Var.f4956b = z10;
        gl1Var.f4957c = z9;
        return gl1Var.a();
    }
}
