package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PublisherPrivacyPersonalizationState f1893e;
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1894a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1895b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1896c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f1897d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PublisherPrivacyPersonalizationState f1898e = PublisherPrivacyPersonalizationState.DEFAULT;

        public RequestConfiguration build() {
            return new RequestConfiguration(this.f1894a, this.f1895b, this.f1896c, this.f1897d, this.f1898e);
        }

        public Builder setMaxAdContentRating(String str) {
            if (str == null || RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str)) {
                this.f1896c = null;
            } else if (RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.f1896c = str;
            } else {
                zzm.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
            }
            return this;
        }

        public Builder setPublisherPrivacyPersonalizationState(PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.f1898e = publisherPrivacyPersonalizationState;
            return this;
        }

        public Builder setTagForChildDirectedTreatment(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f1894a = i10;
            } else {
                zzm.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i10);
            }
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f1895b = i10;
            } else {
                zzm.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i10);
            }
            return this;
        }

        public Builder setTestDeviceIds(List<String> list) {
            ArrayList arrayList = this.f1897d;
            arrayList.clear();
            if (list != null) {
                arrayList.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1900a;

        PublisherPrivacyPersonalizationState(int i10) {
            this.f1900a = i10;
        }

        public int getValue() {
            return this.f1900a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(int i10, int i11, String str, ArrayList arrayList, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
        this.f1889a = i10;
        this.f1890b = i11;
        this.f1891c = str;
        this.f1892d = arrayList;
        this.f1893e = publisherPrivacyPersonalizationState;
    }

    public String getMaxAdContentRating() {
        String str = this.f1891c;
        return str == null ? MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
    }

    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.f1893e;
    }

    public int getTagForChildDirectedTreatment() {
        return this.f1889a;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.f1890b;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.f1892d);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.f1889a);
        builder.setTagForUnderAgeOfConsent(this.f1890b);
        builder.setMaxAdContentRating(this.f1891c);
        builder.setTestDeviceIds(this.f1892d);
        return builder;
    }
}
