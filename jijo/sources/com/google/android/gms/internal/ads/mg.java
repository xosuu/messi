package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.zzg;

/* JADX INFO: loaded from: classes.dex */
public final class mg extends pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f6931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6932b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6933d;

    public mg(zzg zzgVar, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f6931a = zzgVar;
        this.f6932b = str;
        this.f6933d = str2;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f6932b);
            return true;
        }
        if (i10 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f6933d);
            return true;
        }
        zzg zzgVar = this.f6931a;
        if (i10 == 3) {
            a4.a aVarT = a4.b.t(parcel.readStrongBinder());
            qb.b(parcel);
            if (aVarT != null) {
                zzgVar.mo8zza((View) a4.b.a0(aVarT));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 4) {
            zzgVar.zzb();
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        zzgVar.zzc();
        parcel2.writeNoException();
        return true;
    }
}
