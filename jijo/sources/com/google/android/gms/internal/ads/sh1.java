package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class sh1 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f8874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1 f8875b;

    public sh1(uh1 uh1Var, Handler handler) {
        this.f8875b = uh1Var;
        this.f8874a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f8874a.post(new k2.e(i10, 5, this));
    }
}
