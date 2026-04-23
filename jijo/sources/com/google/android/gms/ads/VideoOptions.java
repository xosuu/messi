package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfk;

/* JADX INFO: loaded from: classes.dex */
public final class VideoOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1912c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1913a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1914b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1915c = false;

        public VideoOptions build() {
            return new VideoOptions(this);
        }

        public Builder setClickToExpandRequested(boolean z9) {
            this.f1915c = z9;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z9) {
            this.f1914b = z9;
            return this;
        }

        public Builder setStartMuted(boolean z9) {
            this.f1913a = z9;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder) {
        this.f1910a = builder.f1913a;
        this.f1911b = builder.f1914b;
        this.f1912c = builder.f1915c;
    }

    public boolean getClickToExpandRequested() {
        return this.f1912c;
    }

    public boolean getCustomControlsRequested() {
        return this.f1911b;
    }

    public boolean getStartMuted() {
        return this.f1910a;
    }

    public VideoOptions(zzfk zzfkVar) {
        this.f1910a = zzfkVar.zza;
        this.f1911b = zzfkVar.zzb;
        this.f1912c = zzfkVar.zzc;
    }
}
