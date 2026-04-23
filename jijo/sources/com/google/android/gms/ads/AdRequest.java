package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int MAX_CONTENT_URL_LENGTH = 512;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzdx f1872a;

    public static class Builder extends AbstractAdRequestBuilder<Builder> {
        public AdRequest build() {
            return new AdRequest(this);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public Builder self() {
            return this;
        }
    }

    public AdRequest(AbstractAdRequestBuilder abstractAdRequestBuilder) {
        this.f1872a = new zzdx(abstractAdRequestBuilder.f1859a, null);
    }

    public String getAdString() {
        return this.f1872a.zzj();
    }

    public String getContentUrl() {
        return this.f1872a.zzk();
    }

    @Deprecated
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f1872a.zzd(cls);
    }

    public Bundle getCustomTargeting() {
        return this.f1872a.zze();
    }

    public Set<String> getKeywords() {
        return this.f1872a.zzp();
    }

    public List<String> getNeighboringContentUrls() {
        return this.f1872a.zzn();
    }

    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f1872a.zzf(cls);
    }

    public String getRequestAgent() {
        return this.f1872a.zzm();
    }

    public boolean isTestDevice(Context context) {
        return this.f1872a.zzs(context);
    }

    public final zzdx zza() {
        return this.f1872a;
    }
}
