package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class df implements zc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df f3642a = new df();

    @Override // com.google.android.gms.internal.ads.zc1
    public final boolean a(int i10) {
        ef efVar;
        switch (i10) {
            case 0:
                efVar = ef.AD_FORMAT_TYPE_UNSPECIFIED;
                break;
            case 1:
                efVar = ef.BANNER;
                break;
            case 2:
                efVar = ef.INTERSTITIAL;
                break;
            case 3:
                efVar = ef.NATIVE_EXPRESS;
                break;
            case 4:
                efVar = ef.NATIVE_CONTENT;
                break;
            case 5:
                efVar = ef.NATIVE_APP_INSTALL;
                break;
            case 6:
                efVar = ef.NATIVE_CUSTOM_TEMPLATE;
                break;
            case 7:
                efVar = ef.DFP_BANNER;
                break;
            case 8:
                efVar = ef.DFP_INTERSTITIAL;
                break;
            case 9:
                efVar = ef.REWARD_BASED_VIDEO_AD;
                break;
            case 10:
                efVar = ef.BANNER_SEARCH_ADS;
                break;
            default:
                efVar = null;
                break;
        }
        return efVar != null;
    }
}
