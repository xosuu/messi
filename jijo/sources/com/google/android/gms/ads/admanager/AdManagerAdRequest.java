package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdRequest extends AdRequest {

    public static final class Builder extends AbstractAdRequestBuilder<Builder> {
        public Builder addCategoryExclusion(String str) {
            this.f1859a.zzn(str);
            return this;
        }

        public Builder addCustomTargeting(String str, String str2) {
            this.f1859a.zzp(str, str2);
            return this;
        }

        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ AbstractAdRequestBuilder self() {
            return this;
        }

        public Builder setPublisherProvidedId(String str) {
            this.f1859a.zzA(str);
            return this;
        }

        public Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.f1859a.zzp(str, TextUtils.join(",", list));
            }
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public Builder self() {
            return this;
        }
    }

    @Override // com.google.android.gms.ads.AdRequest
    public Bundle getCustomTargeting() {
        return this.f1872a.zze();
    }

    public String getPublisherProvidedId() {
        return this.f1872a.zzl();
    }
}
