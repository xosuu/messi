package t8;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class g extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterstitialAdLoadCallback f17055b;

    static {
        NativeUtil.classesInit0(176);
    }

    public /* synthetic */ g(InterstitialAdLoadCallback interstitialAdLoadCallback, int i10) {
        this.f17054a = i10;
        this.f17055b = interstitialAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final native void onAdDismissedFullScreenContent();

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final native void onAdFailedToShowFullScreenContent(AdError adError);

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final native void onAdShowedFullScreenContent();
}
