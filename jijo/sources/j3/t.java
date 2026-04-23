package j3;

import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class t extends zzbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzeu f14353a;

    public /* synthetic */ t(zzeu zzeuVar) {
        this.f14353a = zzeuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) {
        zzh(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzlVar, int i10) {
        zzm.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzf.zza.post(new androidx.activity.e(18, this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() {
        return false;
    }
}
