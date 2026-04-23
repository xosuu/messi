package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAd.Image f2303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Double f2306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VideoController f2309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f2311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f2312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f2313n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f2314o = new Bundle();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f2317r;

    public View getAdChoicesContent() {
        return this.f2311l;
    }

    public final String getAdvertiser() {
        return this.f2305f;
    }

    public final String getBody() {
        return this.f2302c;
    }

    public final String getCallToAction() {
        return this.f2304e;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.f2314o;
    }

    public final String getHeadline() {
        return this.f2300a;
    }

    public final NativeAd.Image getIcon() {
        return this.f2303d;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f2301b;
    }

    public float getMediaContentAspectRatio() {
        return this.f2317r;
    }

    public final boolean getOverrideClickHandling() {
        return this.f2316q;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f2315p;
    }

    public final String getPrice() {
        return this.f2308i;
    }

    public final Double getStarRating() {
        return this.f2306g;
    }

    public final String getStore() {
        return this.f2307h;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.f2310k;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.f2311l = view;
    }

    public final void setAdvertiser(String str) {
        this.f2305f = str;
    }

    public final void setBody(String str) {
        this.f2302c = str;
    }

    public final void setCallToAction(String str) {
        this.f2304e = str;
    }

    public final void setExtras(Bundle bundle) {
        this.f2314o = bundle;
    }

    public void setHasVideoContent(boolean z9) {
        this.f2310k = z9;
    }

    public final void setHeadline(String str) {
        this.f2300a = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.f2303d = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.f2301b = list;
    }

    public void setMediaContentAspectRatio(float f10) {
        this.f2317r = f10;
    }

    public void setMediaView(View view) {
        this.f2312m = view;
    }

    public final void setOverrideClickHandling(boolean z9) {
        this.f2316q = z9;
    }

    public final void setOverrideImpressionRecording(boolean z9) {
        this.f2315p = z9;
    }

    public final void setPrice(String str) {
        this.f2308i = str;
    }

    public final void setStarRating(Double d10) {
        this.f2306g = d10;
    }

    public final void setStore(String str) {
        this.f2307h = str;
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final View zza() {
        return this.f2312m;
    }

    public final VideoController zzb() {
        return this.f2309j;
    }

    public final Object zzc() {
        return this.f2313n;
    }

    public final void zzd(Object obj) {
        this.f2313n = obj;
    }

    public final void zze(VideoController videoController) {
        this.f2309j = videoController;
    }
}
