package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sn extends ob implements tn {
    @Override // com.google.android.gms.internal.ads.tn
    public final void C(a4.a aVar, zzl zzlVar, String str, wn wnVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzlVar);
        parcelM.writeString(str);
        qb.e(parcelM, wnVar);
        a0(parcelM, 32);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void C0(zzl zzlVar, String str) {
        Parcel parcelM = m();
        qb.c(parcelM, zzlVar);
        parcelM.writeString(str);
        a0(parcelM, 11);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void D0(a4.a aVar, zzl zzlVar, String str, wn wnVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzlVar);
        parcelM.writeString(str);
        qb.e(parcelM, wnVar);
        a0(parcelM, 38);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void F0(a4.a aVar, wl wlVar, List list) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, wlVar);
        parcelM.writeTypedList(list);
        a0(parcelM, 31);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void N0(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 30);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void O0(a4.a aVar, hs hsVar, List list) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, hsVar);
        parcelM.writeStringList(list);
        a0(parcelM, 23);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void Q(a4.a aVar, zzl zzlVar, hs hsVar, String str) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzlVar);
        parcelM.writeString(null);
        qb.e(parcelM, hsVar);
        parcelM.writeString(str);
        a0(parcelM, 10);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void R0(a4.a aVar, zzq zzqVar, zzl zzlVar, String str, String str2, wn wnVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzqVar);
        qb.c(parcelM, zzlVar);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        qb.e(parcelM, wnVar);
        a0(parcelM, 6);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void S(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 21);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void V0(a4.a aVar, zzl zzlVar, String str, wn wnVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzlVar);
        parcelM.writeString(str);
        qb.e(parcelM, wnVar);
        a0(parcelM, 28);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void W(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 39);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void b0(boolean z9) {
        Parcel parcelM = m();
        ClassLoader classLoader = qb.f8146a;
        parcelM.writeInt(z9 ? 1 : 0);
        a0(parcelM, 25);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void d() {
        a0(m(), 9);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final ao e() {
        ao aoVar;
        Parcel parcelT = t(m(), 15);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            aoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            aoVar = iInterfaceQueryLocalInterface instanceof ao ? (ao) iInterfaceQueryLocalInterface : new ao(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        }
        parcelT.recycle();
        return aoVar;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final boolean g() {
        Parcel parcelT = t(m(), 13);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void m1(a4.a aVar, zzl zzlVar, String str, String str2, wn wnVar, zzbes zzbesVar, ArrayList arrayList) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzlVar);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        qb.e(parcelM, wnVar);
        qb.c(parcelM, zzbesVar);
        parcelM.writeStringList(arrayList);
        a0(parcelM, 14);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void o1(a4.a aVar, zzq zzqVar, zzl zzlVar, String str, String str2, wn wnVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzqVar);
        qb.c(parcelM, zzlVar);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        qb.e(parcelM, wnVar);
        a0(parcelM, 35);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void p0(a4.a aVar, zzl zzlVar, String str, String str2, wn wnVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzlVar);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        qb.e(parcelM, wnVar);
        a0(parcelM, 7);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void p1(a4.a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        a0(parcelM, 37);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void s() {
        a0(m(), 12);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final boolean u() {
        Parcel parcelT = t(m(), 22);
        ClassLoader classLoader = qb.f8146a;
        boolean z9 = parcelT.readInt() != 0;
        parcelT.recycle();
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void w() {
        a0(m(), 4);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void zzE() {
        a0(m(), 8);
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final bo zzP() {
        bo boVar;
        Parcel parcelT = t(m(), 16);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            boVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            boVar = iInterfaceQueryLocalInterface instanceof bo ? (bo) iInterfaceQueryLocalInterface : new bo(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        }
        parcelT.recycle();
        return boVar;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Parcel parcelT = t(m(), 26);
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = zzdp.zzb(parcelT.readStrongBinder());
        parcelT.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final yn zzj() {
        yn xnVar;
        Parcel parcelT = t(m(), 36);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            xnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            xnVar = iInterfaceQueryLocalInterface instanceof yn ? (yn) iInterfaceQueryLocalInterface : new xn(strongBinder);
        }
        parcelT.recycle();
        return xnVar;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final eo zzk() {
        eo coVar;
        Parcel parcelT = t(m(), 27);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            coVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            coVar = iInterfaceQueryLocalInterface instanceof eo ? (eo) iInterfaceQueryLocalInterface : new co(strongBinder);
        }
        parcelT.recycle();
        return coVar;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final zzbra zzl() {
        Parcel parcelT = t(m(), 33);
        zzbra zzbraVar = (zzbra) qb.a(parcelT, zzbra.CREATOR);
        parcelT.recycle();
        return zzbraVar;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final zzbra zzm() {
        Parcel parcelT = t(m(), 34);
        zzbra zzbraVar = (zzbra) qb.a(parcelT, zzbra.CREATOR);
        parcelT.recycle();
        return zzbraVar;
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final a4.a zzn() {
        return fb1.f(t(m(), 2));
    }

    @Override // com.google.android.gms.internal.ads.tn
    public final void zzo() {
        a0(m(), 5);
    }
}
