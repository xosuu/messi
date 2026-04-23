package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class c90 extends pb implements ni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n90 f3233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a4.a f3234b;

    public c90(n90 n90Var) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f3233a = n90Var;
    }

    public static float u1(a4.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) a4.b.a0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        sj sjVar;
        switch (i10) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                this.f3234b = aVarT;
                parcel2.writeNoException();
                return true;
            case 4:
                a4.a aVarZzi = zzi();
                parcel2.writeNoException();
                qb.e(parcel2, aVarZzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarG = this.f3233a.G();
                parcel2.writeNoException();
                qb.e(parcel2, zzdqVarG);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                ClassLoader classLoader = qb.f8146a;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    sjVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    sjVar = iInterfaceQueryLocalInterface instanceof sj ? (sj) iInterfaceQueryLocalInterface : new sj(strongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                }
                qb.b(parcel);
                if (this.f3233a.G() instanceof rx) {
                    rx rxVar = (rx) this.f3233a.G();
                    synchronized (rxVar.f8706b) {
                        rxVar.f8718z = sjVar;
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                ClassLoader classLoader2 = qb.f8146a;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final float zze() {
        float f10;
        n90 n90Var = this.f3233a;
        synchronized (n90Var) {
            f10 = n90Var.f7221x;
        }
        if (f10 != 0.0f) {
            return n90Var.A();
        }
        if (n90Var.G() != null) {
            try {
                return n90Var.G().zze();
            } catch (RemoteException e10) {
                zzm.zzh("Remote exception getting video controller aspect ratio.", e10);
                return 0.0f;
            }
        }
        a4.a aVar = this.f3234b;
        if (aVar != null) {
            return u1(aVar);
        }
        pi piVarJ = n90Var.J();
        if (piVarJ == null) {
            return 0.0f;
        }
        float fZzd = (piVarJ.zzd() == -1 || piVarJ.zzc() == -1) ? 0.0f : piVarJ.zzd() / piVarJ.zzc();
        return fZzd == 0.0f ? u1(piVarJ.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final float zzf() {
        n90 n90Var = this.f3233a;
        if (n90Var.G() != null) {
            return n90Var.G().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final float zzg() {
        n90 n90Var = this.f3233a;
        if (n90Var.G() != null) {
            return n90Var.G().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        return this.f3233a.G();
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final a4.a zzi() {
        a4.a aVar = this.f3234b;
        if (aVar != null) {
            return aVar;
        }
        pi piVarJ = this.f3233a.J();
        if (piVarJ == null) {
            return null;
        }
        return piVarJ.zzf();
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final void zzj(a4.a aVar) {
        this.f3234b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final boolean zzk() {
        fx fxVar;
        n90 n90Var = this.f3233a;
        synchronized (n90Var) {
            fxVar = n90Var.f7207j;
        }
        return fxVar != null;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final boolean zzl() {
        return this.f3233a.G() != null;
    }
}
