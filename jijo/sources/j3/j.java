package j3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.rn;

/* JADX INFO: loaded from: classes.dex */
public final class j extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn f14333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzaw f14334e;

    public j(zzaw zzawVar, Context context, String str, rn rnVar) {
        this.f14331b = context;
        this.f14332c = str;
        this.f14333d = rnVar;
        this.f14334e = zzawVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14331b, "native_ad");
        return new zzeu();
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzb(new a4.b(this.f14331b), this.f14332c, this.f14333d, 242402000);
    }

    @Override // j3.o
    public final Object c() {
        Context context = this.f14331b;
        eg.a(context);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.N9)).booleanValue();
        rn rnVar = this.f14333d;
        String str = this.f14332c;
        zzaw zzawVar = this.f14334e;
        if (!zBooleanValue) {
            return zzawVar.f1957b.zza(context, str, rnVar);
        }
        try {
            IBinder iBinderZze = ((zzbr) zzq.zzb(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzan
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbr(obj);
                }
            })).zze(new a4.b(context), str, rnVar, 242402000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            dr drVarA = cr.a(context);
            zzawVar.getClass();
            drVarA.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (zzp e11) {
            e = e11;
            dr drVarA2 = cr.a(context);
            zzawVar.getClass();
            drVarA2.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            dr drVarA22 = cr.a(context);
            zzawVar.getClass();
            drVarA22.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }
}
