package j3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.si;
import com.google.android.gms.internal.ads.ti;
import com.google.android.gms.internal.ads.ui;
import com.google.android.gms.internal.ads.vi;
import com.google.android.gms.internal.ads.wi;

/* JADX INFO: loaded from: classes.dex */
public final class l extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f14337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f14338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f14339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzaw f14340e;

    public l(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f14337b = frameLayout;
        this.f14338c = frameLayout2;
        this.f14339d = context;
        this.f14340e = zzawVar;
    }

    @Override // j3.o
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.a(this.f14339d, "native_ad_view_delegate");
        return new zzez();
    }

    @Override // j3.o
    public final Object b(zzce zzceVar) {
        return zzceVar.zzi(new a4.b(this.f14337b), new a4.b(this.f14338c));
    }

    @Override // j3.o
    public final Object c() {
        Context context = this.f14339d;
        eg.a(context);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.N9)).booleanValue();
        FrameLayout frameLayout = this.f14338c;
        FrameLayout frameLayout2 = this.f14337b;
        zzaw zzawVar = this.f14340e;
        if (zBooleanValue) {
            try {
                a4.b bVar = new a4.b(context);
                a4.b bVar2 = new a4.b(frameLayout2);
                a4.b bVar3 = new a4.b(frameLayout);
                ui uiVar = (ui) ((wi) zzq.zzb(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzar
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        int i10 = vi.f9862a;
                        if (obj == 0) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                        return iInterfaceQueryLocalInterface instanceof wi ? (wi) iInterfaceQueryLocalInterface : new ui(obj);
                    }
                }));
                Parcel parcelM = uiVar.m();
                qb.e(parcelM, bVar);
                qb.e(parcelM, bVar2);
                qb.e(parcelM, bVar3);
                parcelM.writeInt(242402000);
                Parcel parcelT = uiVar.t(parcelM, 1);
                IBinder strongBinder = parcelT.readStrongBinder();
                parcelT.recycle();
                return si.zzdA(strongBinder);
            } catch (RemoteException | zzp | NullPointerException e10) {
                dr drVarA = cr.a(context);
                zzawVar.getClass();
                drVarA.e("ClientApiBroker.createNativeAdViewDelegate", e10);
                return null;
            }
        }
        ik ikVar = zzawVar.f1959d;
        ikVar.getClass();
        try {
            a4.b bVar4 = new a4.b(context);
            a4.b bVar5 = new a4.b(frameLayout2);
            a4.b bVar6 = new a4.b(frameLayout);
            ui uiVar2 = (ui) ((wi) ikVar.f(context));
            Parcel parcelM2 = uiVar2.m();
            qb.e(parcelM2, bVar4);
            qb.e(parcelM2, bVar5);
            qb.e(parcelM2, bVar6);
            parcelM2.writeInt(242402000);
            Parcel parcelT2 = uiVar2.t(parcelM2, 1);
            IBinder strongBinder2 = parcelT2.readStrongBinder();
            parcelT2.recycle();
            if (strongBinder2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof ti ? (ti) iInterfaceQueryLocalInterface : new ri(strongBinder2);
        } catch (RemoteException e11) {
            e = e11;
            zzm.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator$RemoteCreatorException e12) {
            e = e12;
            zzm.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
