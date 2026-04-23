package l3;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzay;

/* JADX INFO: loaded from: classes.dex */
public final class a extends zzcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f15173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzay f15174b;

    public a(zzay zzayVar, Context context) {
        this.f15173a = context;
        this.f15174b = zzayVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        String str = zzeVar.zzb;
        this.f15174b.getClass();
        zzay.a(this.f15173a, str, true, true);
    }
}
