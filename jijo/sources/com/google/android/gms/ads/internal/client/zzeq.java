package com.google.android.gms.ads.internal.client;

import a4.b;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import f.h0;

/* JADX INFO: loaded from: classes.dex */
public final class zzeq extends h0 {
    public zzeq() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // f.h0
    public final /* synthetic */ Object e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface : new zzcp(iBinder);
    }

    public final zzco zza(Context context) {
        try {
            IBinder iBinderZze = ((zzcp) f(context)).zze(new b(context), 242402000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator$RemoteCreatorException e11) {
            e = e11;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
