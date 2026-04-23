package com.google.android.gms.ads.internal.client;

import a4.b;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.rn;
import f.h0;

/* JADX INFO: loaded from: classes.dex */
public final class zzi extends h0 {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // f.h0
    public final /* synthetic */ Object e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbr(iBinder);
    }

    public final zzbq zza(Context context, String str, rn rnVar) {
        try {
            IBinder iBinderZze = ((zzbr) f(context)).zze(new b(context), str, rnVar, 242402000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteCreator$RemoteCreatorException e11) {
            e = e11;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
