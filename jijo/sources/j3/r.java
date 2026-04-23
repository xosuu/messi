package j3;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzej;

/* JADX INFO: loaded from: classes.dex */
public final class r extends zzcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14350a;

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zzeVar) {
        switch (this.f14350a) {
            case 0:
                OnAdInspectorClosedListener onAdInspectorClosedListener = zzej.zzf().f2032g;
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
                }
                break;
        }
    }
}
