package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAdMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAd.Image f2287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Double f2290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f2294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f2295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f2296m = new Bundle();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2298o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2299p;

    public View getAdChoicesContent() {
        return this.f2294k;
    }

    public final String getAdvertiser() {
        return this.f2289f;
    }

    public final String getBody() {
        return this.f2286c;
    }

    public final String getCallToAction() {
        return this.f2288e;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.f2296m;
    }

    public final String getHeadline() {
        return this.f2284a;
    }

    public final NativeAd.Image getIcon() {
        return this.f2287d;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f2285b;
    }

    public float getMediaContentAspectRatio() {
        return this.f2299p;
    }

    public final boolean getOverrideClickHandling() {
        return this.f2298o;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f2297n;
    }

    public final String getPrice() {
        return this.f2292i;
    }

    public final Double getStarRating() {
        return this.f2290g;
    }

    public final String getStore() {
        return this.f2291h;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.f2293j;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.f2294k = view;
    }

    public final void setAdvertiser(String str) {
        this.f2289f = str;
    }

    public final void setBody(String str) {
        this.f2286c = str;
    }

    public final void setCallToAction(String str) {
        this.f2288e = str;
    }

    public final void setExtras(Bundle bundle) {
        this.f2296m = bundle;
    }

    public void setHasVideoContent(boolean z9) {
        this.f2293j = z9;
    }

    public final void setHeadline(String str) {
        this.f2284a = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.f2287d = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.f2285b = list;
    }

    public void setMediaContentAspectRatio(float f10) {
        this.f2299p = f10;
    }

    public void setMediaView(View view) {
        this.f2295l = view;
    }

    public final void setOverrideClickHandling(boolean z9) {
        this.f2298o = z9;
    }

    public final void setOverrideImpressionRecording(boolean z9) {
        this.f2297n = z9;
    }

    public final void setPrice(String str) {
        this.f2292i = str;
    }

    public final void setStarRating(Double d10) {
        this.f2290g = d10;
    }

    public final void setStore(String str) {
        this.f2291h = str;
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final View zza() {
        return this.f2295l;
    }
}
