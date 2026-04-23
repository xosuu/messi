package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class qn extends ob implements rn {
    @Override // com.google.android.gms.internal.ads.rn
    public final boolean a(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        Parcel parcelT = t(parcelM, 2);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.rn
    public final bp i(String str) {
        bp apVar;
        Parcel parcelM = m();
        parcelM.writeString(str);
        Parcel parcelT = t(parcelM, 3);
        IBinder strongBinder = parcelT.readStrongBinder();
        int i10 = fp.f4587q;
        if (strongBinder == null) {
            apVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            apVar = iInterfaceQueryLocalInterface instanceof bp ? (bp) iInterfaceQueryLocalInterface : new ap(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        }
        parcelT.recycle();
        return apVar;
    }

    @Override // com.google.android.gms.internal.ads.rn
    public final boolean v(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        Parcel parcelT = t(parcelM, 4);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.rn
    public final tn zzb(String str) {
        tn snVar;
        Parcel parcelM = m();
        parcelM.writeString(str);
        Parcel parcelT = t(parcelM, 1);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            snVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            snVar = iInterfaceQueryLocalInterface instanceof tn ? (tn) iInterfaceQueryLocalInterface : new sn(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
        parcelT.recycle();
        return snVar;
    }
}
