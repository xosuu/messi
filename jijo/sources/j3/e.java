package j3;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.hl;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.ol;
import com.google.android.gms.internal.ads.pl;
import com.google.android.gms.internal.ads.rl;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public final class e extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rn f14310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnH5AdsEventListener f14311d;

    public e(Context context, rn rnVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.f14309b = context;
        this.f14310c = rnVar;
        this.f14311d = onH5AdsEventListener;
    }

    @Override // j3.o
    public final Object a() {
        return new rl();
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzk(new a4.b(this.f14309b), this.f14310c, 242402000, new hl(this.f14311d));
    }

    @Override // j3.o
    public final Object c() {
        Context context = this.f14309b;
        a4.b bVar = new a4.b(context);
        try {
            return ((nl) ((pl) zzq.zzb(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzah
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    int i10 = ol.f7606a;
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof pl ? (pl) iInterfaceQueryLocalInterface : new nl(obj, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
                }
            }))).v1(bVar, this.f14310c, new hl(this.f14311d));
        } catch (RemoteException | zzp | NullPointerException unused) {
            return null;
        }
    }
}
