package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicHeightSearchAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchAdRequest f2443a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zzb f2444a = new zzb();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f2445b = new Bundle();

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f2444a.zzb(cls, bundle);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f2444a.zzc(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f2444a.zzd(cls, bundle);
            return this;
        }

        public DynamicHeightSearchAdRequest build() {
            this.f2444a.zzd(AdMobAdapter.class, this.f2445b);
            return new DynamicHeightSearchAdRequest(this);
        }

        public Builder setAdBorderSelectors(String str) {
            this.f2445b.putString("csa_adBorderSelectors", str);
            return this;
        }

        public Builder setAdTest(boolean z9) {
            this.f2445b.putString("csa_adtest", true != z9 ? "off" : "on");
            return this;
        }

        public Builder setAdjustableLineHeight(int i10) {
            this.f2445b.putString("csa_adjustableLineHeight", Integer.toString(i10));
            return this;
        }

        public Builder setAdvancedOptionValue(String str, String str2) {
            this.f2445b.putString(str, str2);
            return this;
        }

        public Builder setAttributionSpacingBelow(int i10) {
            this.f2445b.putString("csa_attributionSpacingBelow", Integer.toString(i10));
            return this;
        }

        public Builder setBorderSelections(String str) {
            this.f2445b.putString("csa_borderSelections", str);
            return this;
        }

        public Builder setChannel(String str) {
            this.f2445b.putString("csa_channel", str);
            return this;
        }

        public Builder setColorAdBorder(String str) {
            this.f2445b.putString("csa_colorAdBorder", str);
            return this;
        }

        public Builder setColorAdSeparator(String str) {
            this.f2445b.putString("csa_colorAdSeparator", str);
            return this;
        }

        public Builder setColorAnnotation(String str) {
            this.f2445b.putString("csa_colorAnnotation", str);
            return this;
        }

        public Builder setColorAttribution(String str) {
            this.f2445b.putString("csa_colorAttribution", str);
            return this;
        }

        public Builder setColorBackground(String str) {
            this.f2445b.putString("csa_colorBackground", str);
            return this;
        }

        public Builder setColorBorder(String str) {
            this.f2445b.putString("csa_colorBorder", str);
            return this;
        }

        public Builder setColorDomainLink(String str) {
            this.f2445b.putString("csa_colorDomainLink", str);
            return this;
        }

        public Builder setColorText(String str) {
            this.f2445b.putString("csa_colorText", str);
            return this;
        }

        public Builder setColorTitleLink(String str) {
            this.f2445b.putString("csa_colorTitleLink", str);
            return this;
        }

        public Builder setCssWidth(int i10) {
            this.f2445b.putString("csa_width", Integer.toString(i10));
            return this;
        }

        public Builder setDetailedAttribution(boolean z9) {
            this.f2445b.putString("csa_detailedAttribution", Boolean.toString(z9));
            return this;
        }

        public Builder setFontFamily(String str) {
            this.f2445b.putString("csa_fontFamily", str);
            return this;
        }

        public Builder setFontFamilyAttribution(String str) {
            this.f2445b.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        public Builder setFontSizeAnnotation(int i10) {
            this.f2445b.putString("csa_fontSizeAnnotation", Integer.toString(i10));
            return this;
        }

        public Builder setFontSizeAttribution(int i10) {
            this.f2445b.putString("csa_fontSizeAttribution", Integer.toString(i10));
            return this;
        }

        public Builder setFontSizeDescription(int i10) {
            this.f2445b.putString("csa_fontSizeDescription", Integer.toString(i10));
            return this;
        }

        public Builder setFontSizeDomainLink(int i10) {
            this.f2445b.putString("csa_fontSizeDomainLink", Integer.toString(i10));
            return this;
        }

        public Builder setFontSizeTitle(int i10) {
            this.f2445b.putString("csa_fontSizeTitle", Integer.toString(i10));
            return this;
        }

        public Builder setHostLanguage(String str) {
            this.f2445b.putString("csa_hl", str);
            return this;
        }

        public Builder setIsClickToCallEnabled(boolean z9) {
            this.f2445b.putString("csa_clickToCall", Boolean.toString(z9));
            return this;
        }

        public Builder setIsLocationEnabled(boolean z9) {
            this.f2445b.putString("csa_location", Boolean.toString(z9));
            return this;
        }

        public Builder setIsPlusOnesEnabled(boolean z9) {
            this.f2445b.putString("csa_plusOnes", Boolean.toString(z9));
            return this;
        }

        public Builder setIsSellerRatingsEnabled(boolean z9) {
            this.f2445b.putString("csa_sellerRatings", Boolean.toString(z9));
            return this;
        }

        public Builder setIsSiteLinksEnabled(boolean z9) {
            this.f2445b.putString("csa_siteLinks", Boolean.toString(z9));
            return this;
        }

        public Builder setIsTitleBold(boolean z9) {
            this.f2445b.putString("csa_titleBold", Boolean.toString(z9));
            return this;
        }

        public Builder setIsTitleUnderlined(boolean z9) {
            this.f2445b.putString("csa_noTitleUnderline", Boolean.toString(!z9));
            return this;
        }

        public Builder setLocationColor(String str) {
            this.f2445b.putString("csa_colorLocation", str);
            return this;
        }

        public Builder setLocationFontSize(int i10) {
            this.f2445b.putString("csa_fontSizeLocation", Integer.toString(i10));
            return this;
        }

        public Builder setLongerHeadlines(boolean z9) {
            this.f2445b.putString("csa_longerHeadlines", Boolean.toString(z9));
            return this;
        }

        public Builder setNumber(int i10) {
            this.f2445b.putString("csa_number", Integer.toString(i10));
            return this;
        }

        public Builder setPage(int i10) {
            this.f2445b.putString("csa_adPage", Integer.toString(i10));
            return this;
        }

        public Builder setQuery(String str) {
            this.f2444a.zze(str);
            return this;
        }

        public Builder setStyleId(String str) {
            this.f2445b.putString("csa_styleId", str);
            return this;
        }

        public Builder setVerticalSpacing(int i10) {
            this.f2445b.putString("csa_verticalSpacing", Integer.toString(i10));
            return this;
        }
    }

    public /* synthetic */ DynamicHeightSearchAdRequest(Builder builder) {
        this.f2443a = new SearchAdRequest(builder.f2444a);
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f2443a.getCustomEventExtrasBundle(cls);
    }

    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f2443a.getNetworkExtrasBundle(cls);
    }

    public String getQuery() {
        return this.f2443a.getQuery();
    }

    public boolean isTestDevice(Context context) {
        return this.f2443a.isTestDevice(context);
    }
}
