package j3;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rn f14304c;

    public b(Context context, rn rnVar) {
        this.f14303b = context;
        this.f14304c = rnVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14303b, "out_of_context_tester");
        return null;
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        Context context = this.f14303b;
        a4.b bVar = new a4.b(context);
        eg.a(context);
        if (((Boolean) zzba.zzc().a(eg.f4198z8)).booleanValue()) {
            return zzceVar.zzh(bVar, this.f14304c, 242402000);
        }
        return null;
    }

    @Override // j3.o
    public final Object c() {
        Context context = this.f14303b;
        a4.b bVar = new a4.b(context);
        eg.a(context);
        if (!((Boolean) zzba.zzc().a(eg.f4198z8)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdk) zzq.zzb(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzab
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return iInterfaceQueryLocalInterface instanceof zzdk ? (zzdk) iInterfaceQueryLocalInterface : new zzdk(obj, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                }
            })).zze(bVar, this.f14304c, 242402000);
        } catch (RemoteException | zzp | NullPointerException e10) {
            cr.a(context).e("ClientApiBroker.getOutOfContextTester", e10);
            return null;
        }
    }
}
