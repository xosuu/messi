package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class zzac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2112a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2113b = 1.0f;

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    public final synchronized boolean a() {
        return this.f2113b >= 0.0f;
    }

    public final synchronized float zza() {
        if (!a()) {
            return 1.0f;
        }
        return this.f2113b;
    }

    public final synchronized void zzc(boolean z9) {
        this.f2112a = z9;
    }

    public final synchronized void zzd(float f10) {
        this.f2113b = f10;
    }

    public final synchronized boolean zze() {
        return this.f2112a;
    }
}
