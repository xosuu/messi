package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class AdValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1883c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    public AdValue(int i10, String str, long j10) {
        this.f1881a = i10;
        this.f1882b = str;
        this.f1883c = j10;
    }

    public static AdValue zza(int i10, String str, long j10) {
        return new AdValue(i10, str, j10);
    }

    public String getCurrencyCode() {
        return this.f1882b;
    }

    public int getPrecisionType() {
        return this.f1881a;
    }

    public long getValueMicros() {
        return this.f1883c;
    }
}
