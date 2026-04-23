package com.google.android.gms.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzdw f1859a;

    public AbstractAdRequestBuilder() {
        zzdw zzdwVar = new zzdw();
        this.f1859a = zzdwVar;
        zzdwVar.zzt("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public T addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
        this.f1859a.zzo(cls, bundle);
        return (T) self();
    }

    public T addKeyword(String str) {
        this.f1859a.zzq(str);
        return (T) self();
    }

    public T addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        zzdw zzdwVar = this.f1859a;
        zzdwVar.zzr(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            zzdwVar.zzu("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return (T) self();
    }

    public abstract AbstractAdRequestBuilder self();

    public T setAdString(String str) {
        this.f1859a.zzv(str);
        return (T) self();
    }

    public T setContentUrl(String str) {
        if (str == null) {
            throw new NullPointerException("Content URL must be non-null.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Content URL must be non-empty.");
        }
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (length > 512) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        this.f1859a.zzw(str);
        return (T) self();
    }

    public T setHttpTimeoutMillis(int i10) {
        this.f1859a.zzx(i10);
        return (T) self();
    }

    public T setNeighboringContentUrls(List<String> list) {
        if (list == null) {
            zzm.zzj("neighboring content URLs list should not be null");
            return (T) self();
        }
        this.f1859a.zzz(list);
        return (T) self();
    }

    public T setRequestAgent(String str) {
        this.f1859a.zzB(str);
        return (T) self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zza(String str) {
        this.f1859a.zzt(str);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzb(boolean z9) {
        this.f1859a.zzy(z9);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzc(boolean z9) {
        this.f1859a.zzC(z9);
        return self();
    }
}
