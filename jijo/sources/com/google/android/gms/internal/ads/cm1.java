package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class cm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f3339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ek0 f3340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bm1 f3341c = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.bm1
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            this.f3061a.c(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.bm1] */
    public cm1(AudioTrack audioTrack, ek0 ek0Var) {
        this.f3339a = audioTrack;
        this.f3340b = ek0Var;
        audioTrack.addOnRoutingChangedListener(this.f3341c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AudioRouting audioRouting) {
        if (this.f3341c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.f3340b.a(audioRouting.getRoutedDevice());
    }

    public void b() {
        bm1 bm1Var = this.f3341c;
        bm1Var.getClass();
        this.f3339a.removeOnRoutingChangedListener(bm1Var);
        this.f3341c = null;
    }
}
