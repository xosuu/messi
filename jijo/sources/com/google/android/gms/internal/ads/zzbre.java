package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzbre implements MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f11517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationInterstitialListener f11518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f11519c;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzm.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzm.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzm.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f11518b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzm.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            zzm.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f11518b.onAdFailedToLoad(this, 0);
            return;
        }
        if (!pg.a(context)) {
            zzm.zzj("Default browser does not support custom tabs. Bailing out.");
            this.f11518b.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            zzm.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f11518b.onAdFailedToLoad(this, 0);
        } else {
            this.f11517a = (Activity) context;
            this.f11519c = Uri.parse(string);
            this.f11518b.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        Intent intent = new Intent("android.intent.action.VIEW");
        Object obj = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            androidx.core.app.j.b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        f.f fVar = new f.f(intent, 3, obj);
        ((Intent) fVar.f12832b).setData(this.f11519c);
        zzt.zza.post(new vm(this, new AdOverlayInfoParcel(new zzc((Intent) fVar.f12832b, null), null, new gp(this), null, new VersionInfoParcel(0, 0, false), null, null), 10));
        fu fuVar = zzu.zzo().f5065l;
        fuVar.getClass();
        ((y3.b) zzu.zzB()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (fuVar.f4661a) {
            try {
                if (fuVar.f4663c == 3) {
                    if (fuVar.f4662b + ((Long) zzba.zzc().a(eg.f4099p5)).longValue() <= jCurrentTimeMillis) {
                        fuVar.f4663c = 1;
                    }
                }
            } finally {
            }
        }
        ((y3.b) zzu.zzB()).getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (fuVar.f4661a) {
            try {
                if (fuVar.f4663c != 2) {
                    return;
                }
                fuVar.f4663c = 3;
                if (fuVar.f4663c == 3) {
                    fuVar.f4662b = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
