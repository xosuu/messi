package t8;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class h extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.s f17057b;

    static {
        NativeUtil.classesInit0(174);
    }

    public /* synthetic */ h(int i10, androidx.fragment.app.s sVar) {
        this.f17056a = i10;
        this.f17057b = sVar;
    }

    public final native void a(InterstitialAd interstitialAd);

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final native void onAdFailedToLoad(LoadAdError loadAdError);

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        switch (this.f17056a) {
            case 0:
                a(interstitialAd);
                break;
            default:
                a(interstitialAd);
                break;
        }
    }
}
