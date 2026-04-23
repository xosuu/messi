package com.google.android.gms.ads.rewarded;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class ServerSideVerificationOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2440b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2441a = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2442b = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }

        public Builder setCustomData(String str) {
            this.f2442b = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.f2441a = str;
            return this;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder) {
        this.f2439a = builder.f2441a;
        this.f2440b = builder.f2442b;
    }

    public String getCustomData() {
        return this.f2440b;
    }

    public String getUserId() {
        return this.f2439a;
    }
}
