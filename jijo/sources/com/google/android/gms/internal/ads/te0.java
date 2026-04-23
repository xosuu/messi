package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class te0 extends zzdi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9142a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9143b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f9144d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final me0 f9145f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p21 f9146h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public le0 f9147q;

    public te0(Context context, WeakReference weakReference, me0 me0Var, mu muVar) {
        this.f9143b = context;
        this.f9144d = weakReference;
        this.f9145f = me0Var;
        this.f9146h = muVar;
    }

    public static AdRequest x1() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    public static String y1(Object obj) {
        ResponseInfo responseInfo;
        zzdn zzdnVarZzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzdnVarZzc = responseInfo.zzc()) == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            return zzdnVarZzc.zzh();
        } catch (RemoteException unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public final synchronized void A1(String str, String str2) {
        try {
            tc1.u0(this.f9147q.a(str), new m20(this, str2, 24, 0), this.f9146h);
        } catch (NullPointerException e10) {
            zzu.zzo().i("OutOfContextTester.setAdAsShown", e10);
            this.f9145f.b(str2);
        }
    }

    public final synchronized void u1(Object obj, String str, String str2) {
        this.f9142a.put(str, obj);
        z1(y1(obj), str2);
    }

    public final synchronized void v1(String str, String str2) {
        Object obj;
        try {
            me0 me0Var = this.f9145f;
            nx nxVar = me0Var.f6924f;
            Activity activityZzi = (nxVar == null || nxVar.f7407a.A()) ? null : me0Var.f6924f.f7407a.zzi();
            if (activityZzi != null && (obj = this.f9142a.get(str)) != null) {
                xf xfVar = eg.f4198z8;
                if (!((Boolean) zzba.zzc().a(xfVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                    this.f9142a.remove(str);
                }
                A1(y1(obj), str2);
                if (obj instanceof AppOpenAd) {
                    ((AppOpenAd) obj).show(activityZzi);
                    return;
                }
                if (obj instanceof InterstitialAd) {
                    ((InterstitialAd) obj).show(activityZzi);
                    return;
                }
                if (obj instanceof RewardedAd) {
                    ((RewardedAd) obj).show(activityZzi, new k70(13));
                    return;
                }
                if (obj instanceof RewardedInterstitialAd) {
                    ((RewardedInterstitialAd) obj).show(activityZzi, new k70(14));
                    return;
                }
                if (((Boolean) zzba.zzc().a(xfVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextW1 = w1();
                    intent.setClassName(contextW1, OutOfContextTestingActivity.CLASS_NAME);
                    intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                    zzu.zzp();
                    zzt.zzT(contextW1, intent);
                }
            }
        } finally {
        }
    }

    public final Context w1() {
        Context context = (Context) this.f9144d.get();
        return context == null ? this.f9143b : context;
    }

    public final synchronized void z1(String str, String str2) {
        try {
            tc1.u0(this.f9147q.a(str), new p80(this, str2, 25), this.f9146h);
        } catch (NullPointerException e10) {
            zzu.zzo().i("OutOfContextTester.setAdAsOutOfContext", e10);
            this.f9145f.b(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, a4.a aVar, a4.a aVar2) {
        Context context = (Context) a4.b.a0(aVar);
        ViewGroup viewGroup = (ViewGroup) a4.b.a0(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.f9142a;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            AdView adView = (AdView) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            ue0.b(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(adView);
            adView.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            ue0.b(nativeAdView, -1, -1);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            ue0.b(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources resourcesB = zzu.zzo().b();
            linearLayout2.addView(ue0.a(context, resourcesB == null ? "Headline" : resourcesB.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String headline = nativeAd.getHeadline();
            View viewA = ue0.a(context, headline == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : headline, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(viewA);
            linearLayout2.addView(viewA);
            linearLayout2.addView(ue0.a(context, resourcesB == null ? "Body" : resourcesB.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String body = nativeAd.getBody();
            View viewA2 = ue0.a(context, body == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : body, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(viewA2);
            linearLayout2.addView(viewA2);
            linearLayout2.addView(ue0.a(context, resourcesB == null ? "Media View" : resourcesB.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }
}
