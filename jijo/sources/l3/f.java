package l3;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.gg;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.xq;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends zzb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15183b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15184c;

    public f(Context context) {
        this.f15184c = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean isAdIdFakeForDebugLogging;
        switch (this.f15183b) {
            case 0:
                try {
                    isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging((Context) this.f15184c);
                    break;
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
                    zzm.zzh("Fail to get isAdIdFakeForDebugLogging", e10);
                    isAdIdFakeForDebugLogging = false;
                }
                zzl.zzj(isAdIdFakeForDebugLogging);
                zzm.zzj("Update ad debug logging enablement as " + isAdIdFakeForDebugLogging);
                return;
            default:
                gu guVar = (gu) this.f15184c;
                xq xqVar = new xq(guVar.f5058e, guVar.f5059f.afmaVersion);
                synchronized (((gu) this.f15184c).f5054a) {
                    try {
                        zzu.zze();
                        gg.a(((gu) this.f15184c).f5061h, xqVar);
                    } catch (IllegalArgumentException e11) {
                        zzm.zzk("Cannot config CSI reporter.", e11);
                    }
                    break;
                }
                return;
        }
    }

    public f(gu guVar) {
        this.f15184c = guVar;
    }
}
