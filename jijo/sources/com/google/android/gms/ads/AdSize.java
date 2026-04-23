package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1880h;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i10, int i11) {
        this(i10, i11, (i10 == -1 ? "FULL" : String.valueOf(i10)) + "x" + (i11 == -2 ? "AUTO" : String.valueOf(i11)) + "_as");
    }

    public static AdSize a(int i10, int i11) {
        if (i11 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i10, 0);
        adSize.f1880h = i11;
        adSize.f1879g = true;
        return adSize;
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i10, 50, 0);
        adSizeZzd.f1876d = true;
        return adSizeZzd;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0);
        if (iZza == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i10, 0);
        adSize.f1878f = iZza;
        adSize.f1877e = true;
        return adSize;
    }

    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context, int i10) {
        return a(i10, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0));
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        AdSize adSize = new AdSize(i10, 0);
        adSize.f1878f = i11;
        adSize.f1877e = true;
        if (i11 < 32) {
            zzm.zzj("The maximum height set for the inline adaptive ad size was " + i11 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i10, 50, 2);
        adSizeZzd.f1876d = true;
        return adSizeZzd;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2);
        AdSize adSize = new AdSize(i10, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.f1878f = iZza;
        adSize.f1877e = true;
        return adSize;
    }

    public static AdSize getLandscapeInterscrollerAdSize(Context context, int i10) {
        return a(i10, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2));
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i10, 50, 1);
        adSizeZzd.f1876d = true;
        return adSizeZzd;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1);
        AdSize adSize = new AdSize(i10, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.f1878f = iZza;
        adSize.f1877e = true;
        return adSize;
    }

    public static AdSize getPortraitInterscrollerAdSize(Context context, int i10) {
        return a(i10, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f1873a == adSize.f1873a && this.f1874b == adSize.f1874b && this.f1875c.equals(adSize.f1875c);
    }

    public int getHeight() {
        return this.f1874b;
    }

    public int getHeightInPixels(Context context) {
        int i10 = this.f1874b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return zzq.zza(context.getResources().getDisplayMetrics());
        }
        zzay.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i10);
    }

    public int getWidth() {
        return this.f1873a;
    }

    public int getWidthInPixels(Context context) {
        int i10 = this.f1873a;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            zzay.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzq> creator = zzq.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.f1875c.hashCode();
    }

    public boolean isAutoHeight() {
        return this.f1874b == -2;
    }

    public boolean isFluid() {
        return this.f1873a == -3 && this.f1874b == -4;
    }

    public boolean isFullWidth() {
        return this.f1873a == -1;
    }

    public String toString() {
        return this.f1875c;
    }

    public AdSize(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException(fb1.g("Invalid width for AdSize: ", i10));
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException(fb1.g("Invalid height for AdSize: ", i11));
        }
        this.f1873a = i10;
        this.f1874b = i11;
        this.f1875c = str;
    }
}
