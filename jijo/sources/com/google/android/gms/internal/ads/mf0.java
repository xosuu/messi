package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes.dex */
public final class mf0 extends pb implements pr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of0 f6930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf0(of0 of0Var) {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
        this.f6930a = of0Var;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) qb.a(parcel, ParcelFileDescriptor.CREATOR);
            qb.b(parcel);
            h(parcelFileDescriptor);
        } else if (i10 == 2) {
            zzbb zzbbVar = (zzbb) qb.a(parcel, zzbb.CREATOR);
            qb.b(parcel);
            p(zzbbVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) qb.a(parcel, ParcelFileDescriptor.CREATOR);
            zzbvb zzbvbVar = (zzbvb) qb.a(parcel, zzbvb.CREATOR);
            qb.b(parcel);
            q1(parcelFileDescriptor2, zzbvbVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final void h(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        of0 of0Var = this.f6930a;
        of0Var.f7566a.b(new yf0(of0Var.f7570h, autoCloseInputStream));
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final void p(zzbb zzbbVar) {
        this.f6930a.f7566a.c(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final void q1(ParcelFileDescriptor parcelFileDescriptor, zzbvb zzbvbVar) {
        this.f6930a.f7566a.b(new yf0(zzbvbVar, new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor)));
    }
}
