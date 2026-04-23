package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class em1 extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fm1 f4242a;

    public em1(fm1 fm1Var) {
        this.f4242a = fm1Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        audioTrack.equals(this.f4242a.f4575c.f4986q);
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f4242a.f4575c.f4986q)) {
            this.f4242a.f4575c.N = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.f4242a.f4575c.f4986q);
    }
}
