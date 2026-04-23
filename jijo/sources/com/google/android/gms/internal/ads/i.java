package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f5444h = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f5445a = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f5446b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Choreographer f5447d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5448f;

    public i() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f5446b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f5445a = j10;
        Choreographer choreographer = this.f5447d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            try {
                this.f5447d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                fg0.g("Vsync sampling disabled due to platform error", e10);
            }
            return true;
        }
        if (i10 == 1) {
            Choreographer choreographer = this.f5447d;
            if (choreographer != null) {
                int i11 = this.f5448f + 1;
                this.f5448f = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f5447d;
        if (choreographer2 != null) {
            int i12 = this.f5448f - 1;
            this.f5448f = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f5445a = -9223372036854775807L;
            }
        }
        return true;
    }
}
