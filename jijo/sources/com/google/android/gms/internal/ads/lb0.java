package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lb0 extends pb implements ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i90 f6548b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n90 f6549d;

    public lb0(String str, i90 i90Var, n90 n90Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f6547a = str;
        this.f6548b = i90Var;
        this.f6549d = n90Var;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        pi piVar;
        switch (i10) {
            case 2:
                a4.b bVar = new a4.b(this.f6548b);
                parcel2.writeNoException();
                qb.e(parcel2, bVar);
                return true;
            case 3:
                String strB = this.f6549d.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 4:
                List listE = this.f6549d.e();
                parcel2.writeNoException();
                parcel2.writeList(listE);
                return true;
            case 5:
                String strU = this.f6549d.U();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 6:
                n90 n90Var = this.f6549d;
                synchronized (n90Var) {
                    piVar = n90Var.f7217t;
                }
                parcel2.writeNoException();
                qb.e(parcel2, piVar);
                return true;
            case 7:
                String strV = this.f6549d.V();
                parcel2.writeNoException();
                parcel2.writeString(strV);
                return true;
            case 8:
                String strT = this.f6549d.T();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case 9:
                Bundle bundleC = this.f6549d.C();
                parcel2.writeNoException();
                qb.d(parcel2, bundleC);
                return true;
            case 10:
                this.f6548b.v();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarG = this.f6549d.G();
                parcel2.writeNoException();
                qb.e(parcel2, zzdqVarG);
                return true;
            case 12:
                Bundle bundle = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                this.f6548b.e(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                boolean zN = this.f6548b.n(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zN ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                this.f6548b.h(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                ji jiVarI = this.f6549d.I();
                parcel2.writeNoException();
                qb.e(parcel2, jiVarI);
                return true;
            case 16:
                a4.a aVarR = this.f6549d.R();
                parcel2.writeNoException();
                qb.e(parcel2, aVarR);
                return true;
            case 17:
                String str = this.f6547a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
