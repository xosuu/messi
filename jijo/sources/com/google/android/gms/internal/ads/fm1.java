package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f4573a = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final em1 f4574b = new em1(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gm1 f4575c;

    public fm1(gm1 gm1Var) {
        this.f4575c = gm1Var;
    }

    public void a(AudioTrack audioTrack) {
        Handler handler = this.f4573a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new lu(1, handler), this.f4574b);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f4574b);
        this.f4573a.removeCallbacksAndMessages(null);
    }
}
