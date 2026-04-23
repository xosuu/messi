package com.google.android.gms.ads.internal.client;

import a4.b;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.rn;
import f.h0;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends h0 {
    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // f.h0
    public final /* synthetic */ Object e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface : new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzq zzqVar, String str, rn rnVar, int i10) {
        eg.a(context);
        if (!((Boolean) zzba.zzc().a(eg.N9)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzbv) f(context)).zze(new b(context), zzqVar, str, rnVar, 242402000, i10);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinderZze);
            } catch (RemoteException e10) {
                e = e10;
                com.google.android.gms.ads.internal.util.client.zzm.zzf("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteCreator$RemoteCreatorException e11) {
                e = e11;
                com.google.android.gms.ads.internal.util.client.zzm.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((zzbv) com.google.android.gms.ads.internal.util.client.zzq.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface2 : new zzbv(obj);
                }
            })).zze(new b(context), zzqVar, str, rnVar, 242402000, i10);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface2 : new zzbs(iBinderZze2);
        } catch (RemoteException e12) {
            e = e12;
            cr.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", e);
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzp e13) {
            e = e13;
            cr.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", e);
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            cr.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", e);
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
