package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes.dex */
public final class kg0 extends pb implements nr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lg0 f6281a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg0(lg0 lg0Var) {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
        this.f6281a = lg0Var;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) qb.a(parcel, ParcelFileDescriptor.CREATOR);
            qb.b(parcel);
            h(parcelFileDescriptor);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzbb zzbbVar = (zzbb) qb.a(parcel, zzbb.CREATOR);
            qb.b(parcel);
            p(zzbbVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6281a.f6606a.b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void p(zzbb zzbbVar) {
        this.f6281a.f6606a.c(zzbbVar.zza());
    }
}
