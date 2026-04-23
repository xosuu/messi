package j3;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.eq;
import com.google.android.gms.internal.ads.fq;
import com.google.android.gms.internal.ads.gq;
import com.google.android.gms.internal.ads.hq;
import com.google.android.gms.internal.ads.iq;
import com.google.android.gms.internal.ads.jq;
import com.google.android.gms.internal.ads.kq;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f14301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaw f14302c;

    public a(zzaw zzawVar, Activity activity) {
        this.f14301b = activity;
        this.f14302c = zzawVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14301b, "ad_overlay");
        return null;
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzm(new a4.b(this.f14301b));
    }

    @Override // j3.o
    public final Object c() {
        Activity activity = this.f14301b;
        eg.a(activity);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.N9)).booleanValue();
        zzaw zzawVar = this.f14302c;
        if (zBooleanValue) {
            try {
                a4.b bVar = new a4.b(activity);
                iq iqVar = (iq) ((kq) zzq.zzb(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzz
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        int i10 = jq.f6064a;
                        if (obj == 0) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                        return iInterfaceQueryLocalInterface instanceof kq ? (kq) iInterfaceQueryLocalInterface : new iq(obj);
                    }
                }));
                Parcel parcelM = iqVar.m();
                qb.e(parcelM, bVar);
                Parcel parcelT = iqVar.t(parcelM, 1);
                IBinder strongBinder = parcelT.readStrongBinder();
                parcelT.recycle();
                return gq.zzI(strongBinder);
            } catch (RemoteException | zzp | NullPointerException e10) {
                dr drVarA = cr.a(activity.getApplicationContext());
                zzawVar.getClass();
                drVarA.e("ClientApiBroker.createAdOverlay", e10);
                return null;
            }
        }
        eq eqVar = zzawVar.f1960e;
        eqVar.getClass();
        try {
            a4.b bVar2 = new a4.b(activity);
            iq iqVar2 = (iq) ((kq) eqVar.f(activity));
            Parcel parcelM2 = iqVar2.m();
            qb.e(parcelM2, bVar2);
            Parcel parcelT2 = iqVar2.t(parcelM2, 1);
            IBinder strongBinder2 = parcelT2.readStrongBinder();
            parcelT2.recycle();
            if (strongBinder2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof hq ? (hq) iInterfaceQueryLocalInterface : new fq(strongBinder2);
        } catch (RemoteException e11) {
            zzm.zzk("Could not create remote AdOverlay.", e11);
            return null;
        } catch (RemoteCreator$RemoteCreatorException e12) {
            zzm.zzk("Could not create remote AdOverlay.", e12);
            return null;
        }
    }
}
