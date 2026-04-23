package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class fi extends pb implements pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f4529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f4530b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f4531d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4532f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4533h;

    public fi(Drawable drawable, Uri uri, double d10, int i10, int i11) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f4529a = drawable;
        this.f4530b = uri;
        this.f4531d = d10;
        this.f4532f = i10;
        this.f4533h = i11;
    }

    public static pi u1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof pi ? (pi) iInterfaceQueryLocalInterface : new oi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            a4.a aVarZzf = zzf();
            parcel2.writeNoException();
            qb.e(parcel2, aVarZzf);
            return true;
        }
        if (i10 == 2) {
            parcel2.writeNoException();
            qb.d(parcel2, this.f4530b);
            return true;
        }
        if (i10 == 3) {
            parcel2.writeNoException();
            parcel2.writeDouble(this.f4531d);
            return true;
        }
        if (i10 == 4) {
            parcel2.writeNoException();
            parcel2.writeInt(this.f4532f);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f4533h);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final double zzb() {
        return this.f4531d;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final int zzc() {
        return this.f4533h;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final int zzd() {
        return this.f4532f;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final Uri zze() {
        return this.f4530b;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final a4.a zzf() {
        return new a4.b(this.f4529a);
    }
}
