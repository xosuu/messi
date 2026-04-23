package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
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

    @Deprecated
    public static final int ORIENTATION_ANY = 0;

    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;

    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final VideoOptions f1924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1925g;

    public @interface AdChoicesPlacement {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public VideoOptions f1930e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1926a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1927b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1928c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1929d = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1931f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1932g = false;

        public NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i10) {
            this.f1931f = i10;
            return this;
        }

        @Deprecated
        public Builder setImageOrientation(int i10) {
            this.f1927b = i10;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i10) {
            this.f1928c = i10;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z9) {
            this.f1932g = z9;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z9) {
            this.f1929d = z9;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z9) {
            this.f1926a = z9;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions) {
            this.f1930e = videoOptions;
            return this;
        }
    }

    public @interface NativeMediaAspectRatio {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.f1919a = builder.f1926a;
        this.f1920b = builder.f1927b;
        this.f1921c = builder.f1928c;
        this.f1922d = builder.f1929d;
        this.f1923e = builder.f1931f;
        this.f1924f = builder.f1930e;
        this.f1925g = builder.f1932g;
    }

    public int getAdChoicesPlacement() {
        return this.f1923e;
    }

    @Deprecated
    public int getImageOrientation() {
        return this.f1920b;
    }

    public int getMediaAspectRatio() {
        return this.f1921c;
    }

    public VideoOptions getVideoOptions() {
        return this.f1924f;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f1922d;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f1919a;
    }

    public final boolean zza() {
        return this.f1925g;
    }
}
