package j3;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.bq;
import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.dq;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public final class d extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rn f14308c;

    public d(Context context, rn rnVar) {
        this.f14307b = context;
        this.f14308c = rnVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzl(new a4.b(this.f14307b), this.f14308c, 242402000);
    }

    @Override // j3.o
    public final Object c() {
        Context context = this.f14307b;
        a4.b bVar = new a4.b(context);
        try {
            return ((bq) ((dq) zzq.zzb(context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzaf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    int i10 = cq.f3385a;
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    return iInterfaceQueryLocalInterface instanceof dq ? (dq) iInterfaceQueryLocalInterface : new bq(obj, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                }
            }))).v1(bVar, this.f14308c);
        } catch (RemoteException | zzp | NullPointerException unused) {
            return null;
        }
    }
}
