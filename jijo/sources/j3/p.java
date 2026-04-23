package j3;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzea;

/* JADX INFO: loaded from: classes.dex */
public final class p extends zzaz {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzea f14349d;

    public p(zzea zzeaVar) {
        this.f14349d = zzeaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzea zzeaVar = this.f14349d;
        zzeaVar.f2012d.zzb(zzeaVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzea zzeaVar = this.f14349d;
        zzeaVar.f2012d.zzb(zzeaVar.zzi());
        super.onAdLoaded();
    }
}
