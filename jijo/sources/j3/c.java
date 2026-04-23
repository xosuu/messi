package j3;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.vt;
import com.google.android.gms.internal.ads.wt;
import com.google.android.gms.internal.ads.xt;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rn f14306c;

    public c(Context context, rn rnVar) {
        this.f14305b = context;
        this.f14306c = rnVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzp(new a4.b(this.f14305b), this.f14306c, 242402000);
    }

    @Override // j3.o
    public final Object c() {
        Context context = this.f14305b;
        a4.b bVar = new a4.b(context);
        try {
            return ((vt) ((xt) zzq.zzb(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzad
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    int i10 = wt.f10342a;
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    return iInterfaceQueryLocalInterface instanceof xt ? (xt) iInterfaceQueryLocalInterface : new vt(obj, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                }
            }))).v1(bVar, this.f14306c);
        } catch (RemoteException | zzp | NullPointerException unused) {
            return null;
        }
    }
}
