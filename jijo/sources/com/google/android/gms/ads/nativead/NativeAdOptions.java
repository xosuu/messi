package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VideoOptions f2338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2342i;

    public @interface AdChoicesPlacement {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public VideoOptions f2346d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2343a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2344b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2345c = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2347e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2348f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2349g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2350h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2351i = 1;

        public NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        public Builder enableCustomClickGestureDirection(@SwipeGestureDirection int i10, boolean z9) {
            this.f2349g = z9;
            this.f2350h = i10;
            return this;
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i10) {
            this.f2347e = i10;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i10) {
            this.f2344b = i10;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z9) {
            this.f2348f = z9;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z9) {
            this.f2345c = z9;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z9) {
            this.f2343a = z9;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions) {
            this.f2346d = videoOptions;
            return this;
        }

        public final Builder zzi(int i10) {
            this.f2351i = i10;
            return this;
        }
    }

    public @interface NativeMediaAspectRatio {
    }

    public @interface SwipeGestureDirection {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.f2334a = builder.f2343a;
        this.f2335b = builder.f2344b;
        this.f2336c = builder.f2345c;
        this.f2337d = builder.f2347e;
        this.f2338e = builder.f2346d;
        this.f2339f = builder.f2348f;
        this.f2340g = builder.f2349g;
        this.f2341h = builder.f2350h;
        this.f2342i = builder.f2351i;
    }

    public int getAdChoicesPlacement() {
        return this.f2337d;
    }

    public int getMediaAspectRatio() {
        return this.f2335b;
    }

    public VideoOptions getVideoOptions() {
        return this.f2338e;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f2336c;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f2334a;
    }

    public final int zza() {
        return this.f2341h;
    }

    public final boolean zzb() {
        return this.f2340g;
    }

    public final boolean zzc() {
        return this.f2339f;
    }

    public final int zzd() {
        return this.f2342i;
    }
}
