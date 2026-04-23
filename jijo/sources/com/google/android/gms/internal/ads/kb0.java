package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kb0 extends pb implements dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i90 f6242b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n90 f6243d;

    public kb0(String str, i90 i90Var, n90 n90Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f6241a = str;
        this.f6242b = i90Var;
        this.f6243d = n90Var;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        String strD;
        i90 i90Var = this.f6242b;
        n90 n90Var = this.f6243d;
        switch (i10) {
            case 2:
                a4.b bVar = new a4.b(i90Var);
                parcel2.writeNoException();
                qb.e(parcel2, bVar);
                return true;
            case 3:
                String strB = n90Var.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 4:
                List listE = n90Var.e();
                parcel2.writeNoException();
                parcel2.writeList(listE);
                return true;
            case 5:
                String strU = n90Var.U();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 6:
                pi piVarK = n90Var.K();
                parcel2.writeNoException();
                qb.e(parcel2, piVarK);
                return true;
            case 7:
                String strV = n90Var.V();
                parcel2.writeNoException();
                parcel2.writeString(strV);
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
                Bundle bundleC = n90Var.C();
                parcel2.writeNoException();
                qb.d(parcel2, bundleC);
                return true;
            case 12:
                i90Var.v();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarG = n90Var.G();
                parcel2.writeNoException();
                qb.e(parcel2, zzdqVarG);
                return true;
            case 14:
                Bundle bundle = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                i90Var.e(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                boolean zN = i90Var.n(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zN ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) qb.a(parcel, Bundle.CREATOR);
                qb.b(parcel);
                i90Var.h(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                ji jiVarI = n90Var.I();
                parcel2.writeNoException();
                qb.e(parcel2, jiVarI);
                return true;
            case 18:
                a4.a aVarR = n90Var.R();
                parcel2.writeNoException();
                qb.e(parcel2, aVarR);
                return true;
            case 19:
                parcel2.writeNoException();
                parcel2.writeString(this.f6241a);
                return true;
            default:
                return false;
        }
    }
}
