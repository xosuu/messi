package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class pn extends pb implements rn {
    public pn() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static rn u1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof rn ? (rn) iInterfaceQueryLocalInterface : new qn(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.rn
    public final boolean a(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, pn.class.getClassLoader()));
        } catch (Throwable unused) {
            zzm.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            qb.b(parcel);
            tn tnVarZzb = zzb(string);
            parcel2.writeNoException();
            qb.e(parcel2, tnVarZzb);
            return true;
        }
        if (i10 == 2) {
            String string2 = parcel.readString();
            qb.b(parcel);
            boolean zA = a(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zA ? 1 : 0);
            return true;
        }
        if (i10 == 3) {
            String string3 = parcel.readString();
            qb.b(parcel);
            bp bpVarI = i(string3);
            parcel2.writeNoException();
            qb.e(parcel2, bpVarI);
            return true;
        }
        if (i10 != 4) {
            return false;
        }
        String string4 = parcel.readString();
        qb.b(parcel);
        boolean zV = v(string4);
        parcel2.writeNoException();
        parcel2.writeInt(zV ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rn
    public final bp i(String str) {
        return new fp((RtbAdapter) Class.forName(str, false, t3.i.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.rn
    public final boolean v(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, pn.class.getClassLoader()));
        } catch (Throwable unused) {
            zzm.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.rn
    public final tn zzb(String str) throws RemoteException {
        jo joVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, pn.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new jo((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new jo((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                zzm.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                zzm.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            zzm.zze("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    joVar = new jo(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            joVar = new jo(new AdMobAdapter());
            return joVar;
        }
    }
}
