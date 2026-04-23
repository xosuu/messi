package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes.dex */
public final class dl1 extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ek0 f3699a;

    public /* synthetic */ dl1(ek0 ek0Var) {
        this.f3699a = ek0Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        ek0 ek0Var = this.f3699a;
        this.f3699a.b(bl1.b(ek0Var.f4212a, (ce1) ek0Var.f4220u, (fl1) ek0Var.f4219t));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        fl1 fl1Var = (fl1) this.f3699a.f4219t;
        int i10 = yn0.f10944a;
        int length = audioDeviceInfoArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (yn0.c(audioDeviceInfoArr[i11], fl1Var)) {
                this.f3699a.f4219t = null;
                break;
            }
            i11++;
        }
        ek0 ek0Var = this.f3699a;
        ek0Var.b(bl1.b(ek0Var.f4212a, (ce1) ek0Var.f4220u, (fl1) ek0Var.f4219t));
    }
}
