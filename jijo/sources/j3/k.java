package j3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.eg;

/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaw f14336c;

    public k(zzaw zzawVar, Context context) {
        this.f14335b = context;
        this.f14336c = zzawVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14335b, "mobile_ads_settings");
        return new zzey();
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzg(new a4.b(this.f14335b), 242402000);
    }

    @Override // j3.o
    public final Object c() {
        Context context = this.f14335b;
        eg.a(context);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.N9)).booleanValue();
        zzaw zzawVar = this.f14336c;
        if (!zBooleanValue) {
            return zzawVar.f1958c.zza(context);
        }
        try {
            IBinder iBinderZze = ((zzcp) zzq.zzb(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzap
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface : new zzcp(obj);
                }
            })).zze(new a4.b(context), 242402000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            dr drVarA = cr.a(context);
            zzawVar.getClass();
            drVarA.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (zzp e11) {
            e = e11;
            dr drVarA2 = cr.a(context);
            zzawVar.getClass();
            drVarA2.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            dr drVarA22 = cr.a(context);
            zzawVar.getClass();
            drVarA22.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }
}
