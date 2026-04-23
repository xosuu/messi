package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class sv implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f8968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rv f8969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8973f = 1.0f;

    public sv(Context context, rv rvVar) {
        this.f8968a = (AudioManager) context.getSystemService("audio");
        this.f8969b = rvVar;
    }

    public final void a() {
        boolean z9 = this.f8971d;
        rv rvVar = this.f8969b;
        AudioManager audioManager = this.f8968a;
        if (!z9 || this.f8972e || this.f8973f <= 0.0f) {
            if (this.f8970c) {
                if (audioManager != null) {
                    this.f8970c = audioManager.abandonAudioFocus(this) == 0;
                }
                rvVar.zzn();
                return;
            }
            return;
        }
        if (this.f8970c) {
            return;
        }
        if (audioManager != null) {
            this.f8970c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        rvVar.zzn();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f8970c = i10 > 0;
        this.f8969b.zzn();
    }
}
