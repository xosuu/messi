package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ld implements zc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ld f6575a = new ld();

    @Override // com.google.android.gms.internal.ads.zc1
    public final boolean a(int i10) {
        md mdVar;
        switch (i10) {
            case 0:
                mdVar = md.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                mdVar = md.BANNER;
                break;
            case 2:
                mdVar = md.DFP_BANNER;
                break;
            case 3:
                mdVar = md.INTERSTITIAL;
                break;
            case 4:
                mdVar = md.DFP_INTERSTITIAL;
                break;
            case 5:
                mdVar = md.NATIVE_EXPRESS;
                break;
            case 6:
                mdVar = md.AD_LOADER;
                break;
            case 7:
                mdVar = md.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                mdVar = md.BANNER_SEARCH_ADS;
                break;
            case 9:
                mdVar = md.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                mdVar = md.APP_OPEN;
                break;
            case 11:
                mdVar = md.REWARDED_INTERSTITIAL;
                break;
            default:
                mdVar = null;
                break;
        }
        return mdVar != null;
    }
}
