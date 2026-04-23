package j3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.aj;
import com.google.android.gms.internal.ads.bj;
import com.google.android.gms.internal.ads.cj;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.xi;
import com.google.android.gms.internal.ads.yi;
import com.google.android.gms.internal.ads.zi;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap f14342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f14343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzaw f14344e;

    public m(zzaw zzawVar, View view, HashMap map, HashMap map2) {
        this.f14341b = view;
        this.f14342c = map;
        this.f14343d = map2;
        this.f14344e = zzawVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14341b.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzj(new a4.b(this.f14341b), new a4.b(this.f14342c), new a4.b(this.f14343d));
    }

    @Override // j3.o
    public final Object c() {
        View view = this.f14341b;
        eg.a(view.getContext());
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.N9)).booleanValue();
        HashMap map = this.f14343d;
        HashMap map2 = this.f14342c;
        zzaw zzawVar = this.f14344e;
        if (zBooleanValue) {
            try {
                a4.b bVar = new a4.b(view);
                a4.b bVar2 = new a4.b(map2);
                a4.b bVar3 = new a4.b(map);
                aj ajVar = (aj) ((cj) zzq.zzb(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzat
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        int i10 = bj.f3026a;
                        if (obj == 0) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
                        return iInterfaceQueryLocalInterface instanceof cj ? (cj) iInterfaceQueryLocalInterface : new aj(obj);
                    }
                }));
                Parcel parcelM = ajVar.m();
                qb.e(parcelM, bVar);
                qb.e(parcelM, bVar2);
                qb.e(parcelM, bVar3);
                Parcel parcelT = ajVar.t(parcelM, 1);
                IBinder strongBinder = parcelT.readStrongBinder();
                parcelT.recycle();
                return yi.zze(strongBinder);
            } catch (RemoteException | zzp | NullPointerException e10) {
                dr drVarA = cr.a(view.getContext());
                zzawVar.getClass();
                drVarA.e("ClientApiBroker.createNativeAdViewHolderDelegate", e10);
                return null;
            }
        }
        jk jkVar = zzawVar.f1961f;
        jkVar.getClass();
        try {
            a4.b bVar4 = new a4.b(view);
            a4.b bVar5 = new a4.b(map2);
            a4.b bVar6 = new a4.b(map);
            aj ajVar2 = (aj) ((cj) jkVar.f(view.getContext()));
            Parcel parcelM2 = ajVar2.m();
            qb.e(parcelM2, bVar4);
            qb.e(parcelM2, bVar5);
            qb.e(parcelM2, bVar6);
            Parcel parcelT2 = ajVar2.t(parcelM2, 1);
            IBinder strongBinder2 = parcelT2.readStrongBinder();
            parcelT2.recycle();
            if (strongBinder2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof zi ? (zi) iInterfaceQueryLocalInterface : new xi(strongBinder2);
        } catch (RemoteException e11) {
            e = e11;
            zzm.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (RemoteCreator$RemoteCreatorException e12) {
            e = e12;
            zzm.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
