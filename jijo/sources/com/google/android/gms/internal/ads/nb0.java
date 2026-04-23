package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class nb0 extends pb implements gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i90 f7238b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n90 f7239d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ed0 f7240f;

    public nb0(String str, i90 i90Var, n90 n90Var, ed0 ed0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f7237a = str;
        this.f7238b = i90Var;
        this.f7239d = n90Var;
        this.f7240f = ed0Var;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void E0(zzdg zzdgVar) {
        try {
            if (!zzdgVar.zzf()) {
                this.f7240f.b();
            }
        } catch (RemoteException e10) {
            zzm.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        i90 i90Var = this.f7238b;
        synchronized (i90Var) {
            i90Var.D.f6655a.set(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void P(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        i90 i90Var = this.f7238b;
        synchronized (i90Var) {
            i90Var.f5531l.d(zzcsVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        String strD;
        dk bkVar;
        n90 n90Var = this.f7239d;
        switch (i10) {
            case 2:
                String strB = n90Var.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 3:
                List listE = n90Var.e();
                parcel2.writeNoException();
                parcel2.writeList(listE);
                return true;
            case 4:
                String strU = n90Var.U();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 5:
                pi piVarK = n90Var.K();
                parcel2.writeNoException();
                qb.e(parcel2, piVarK);
                return true;
            case 6:
                String strV = n90Var.V();
                parcel2.writeNoException();
                parcel2.writeString(strV);
                return true;
            case 7:
                String strT = n90Var.T();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case 8:
                double dT = n90Var.t();
                parcel2.writeNoException();
                parcel2.writeDouble(dT);
                return true;
            case 9:
                String strC = n90Var.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 10:
                synchronized (n90Var) {
                    strD = n90Var.d("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarG = n90Var.G();
                parcel2.writeNoException();
                qb.e(parcel2, zzdqVarG);
                return true;
            case 12:
                parcel2.writeNoException();
                parcel2.writeString(this.f7237a);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                ji jiVarI = n90Var.I();
                parcel2.writeNoException();
                qb.e(parcel2, jiVarI);
                return true;
            case 15:
                Bundle bundle = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                n1(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                boolean zN = this.f7238b.n(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zN ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                b1(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                a4.a aVarZzm = zzm();
                parcel2.writeNoException();
                qb.e(parcel2, aVarZzm);
                return true;
            case 19:
                a4.a aVarR = n90Var.R();
                parcel2.writeNoException();
                qb.e(parcel2, aVarR);
                return true;
            case 20:
                Bundle bundleC = n90Var.C();
                parcel2.writeNoException();
                qb.d(parcel2, bundleC);
                return true;
            case sf.zzm /* 21 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    bkVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    bkVar = iInterfaceQueryLocalInterface instanceof dk ? (dk) iInterfaceQueryLocalInterface : new bk(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                }
                qb.b(parcel);
                j1(bkVar);
                parcel2.writeNoException();
                return true;
            case 22:
                b();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                ClassLoader classLoader = qb.f8146a;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 25:
                zzcw zzcwVarZzb = zzcv.zzb(parcel.readStrongBinder());
                qb.b(parcel);
                e0(zzcwVarZzb);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzcs zzcsVarZzb = zzcr.zzb(parcel.readStrongBinder());
                qb.b(parcel);
                P(zzcsVarZzb);
                parcel2.writeNoException();
                return true;
            case 27:
                x0();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                ni niVarZzj = zzj();
                parcel2.writeNoException();
                qb.e(parcel2, niVarZzj);
                return true;
            case 30:
                boolean zQ = q();
                parcel2.writeNoException();
                ClassLoader classLoader2 = qb.f8146a;
                parcel2.writeInt(zQ ? 1 : 0);
                return true;
            case 31:
                zzdn zzdnVarZzg = zzg();
                parcel2.writeNoException();
                qb.e(parcel2, zzdnVarZzg);
                return true;
            case NotificationCompat.FLAG_NO_CLEAR /* 32 */:
                zzdg zzdgVarZzb = zzdf.zzb(parcel.readStrongBinder());
                qb.b(parcel);
                E0(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void b() {
        this.f7238b.z();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void b1(Bundle bundle) {
        this.f7238b.h(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void e0(zzcw zzcwVar) {
        i90 i90Var = this.f7238b;
        synchronized (i90Var) {
            i90Var.f5531l.m(zzcwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void j1(dk dkVar) {
        i90 i90Var = this.f7238b;
        synchronized (i90Var) {
            i90Var.f5531l.c(dkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final boolean m0(Bundle bundle) {
        return this.f7238b.n(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void n1(Bundle bundle) {
        this.f7238b.e(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final boolean q() {
        boolean zZzB;
        i90 i90Var = this.f7238b;
        synchronized (i90Var) {
            zZzB = i90Var.f5531l.zzB();
        }
        return zZzB;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void x0() {
        i90 i90Var = this.f7238b;
        synchronized (i90Var) {
            i90Var.f5531l.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void zzA() {
        i90 i90Var = this.f7238b;
        synchronized (i90Var) {
            ga0 ga0Var = i90Var.f5540u;
            if (ga0Var == null) {
                zzm.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            } else {
                i90Var.f5529j.execute(new g3.h(i90Var, ga0Var instanceof u90, 2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final boolean zzH() {
        List list;
        n90 n90Var = this.f7239d;
        synchronized (n90Var) {
            list = n90Var.f7203f;
        }
        return (list.isEmpty() || n90Var.H() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final double zze() {
        double d10;
        n90 n90Var = this.f7239d;
        synchronized (n90Var) {
            d10 = n90Var.f7215r;
        }
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final Bundle zzf() {
        return this.f7239d.C();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final zzdn zzg() {
        if (((Boolean) zzba.zzc().a(eg.f3962c6)).booleanValue()) {
            return this.f7238b.f8362f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        return this.f7239d.G();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final ji zzi() {
        return this.f7239d.I();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final ni zzj() {
        return this.f7238b.C.a();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final pi zzk() {
        pi piVar;
        n90 n90Var = this.f7239d;
        synchronized (n90Var) {
            piVar = n90Var.f7216s;
        }
        return piVar;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final a4.a zzl() {
        return this.f7239d.R();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final a4.a zzm() {
        return new a4.b(this.f7238b);
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzn() {
        return this.f7239d.T();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzo() {
        return this.f7239d.U();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzp() {
        return this.f7239d.V();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzq() {
        return this.f7239d.b();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzs() {
        String strD;
        n90 n90Var = this.f7239d;
        synchronized (n90Var) {
            strD = n90Var.d("price");
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final String zzt() {
        String strD;
        n90 n90Var = this.f7239d;
        synchronized (n90Var) {
            strD = n90Var.d("store");
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final List zzu() {
        return this.f7239d.e();
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final List zzv() {
        List list;
        if (!zzH()) {
            return Collections.emptyList();
        }
        n90 n90Var = this.f7239d;
        synchronized (n90Var) {
            list = n90Var.f7203f;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.gk
    public final void zzx() {
        this.f7238b.v();
    }
}
