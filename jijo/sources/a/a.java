package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import l.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Binder implements b {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Bundle bundleB;
        int i12 = 1;
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        int i13 = 0;
        switch (i10) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int i14 = parcel.readInt();
                bundleB = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                p.d dVar = (p.d) this;
                if (dVar.f16168b != null) {
                    dVar.f16167a.post(new b.d(dVar, i14, bundleB, 3));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                String string = parcel.readString();
                bundleB = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                p.d dVar2 = (p.d) this;
                if (dVar2.f16168b != null) {
                    dVar2.f16167a.post(new p.b(dVar2, string, bundleB, i13));
                }
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                bundleB = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                p.d dVar3 = (p.d) this;
                if (dVar3.f16168b != null) {
                    dVar3.f16167a.post(new j(dVar3, i12, bundleB));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                String string2 = parcel.readString();
                bundleB = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                p.d dVar4 = (p.d) this;
                if (dVar4.f16168b != null) {
                    dVar4.f16167a.post(new p.b(dVar4, string2, bundleB, i12));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int i15 = parcel.readInt();
                Uri uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                boolean z9 = parcel.readInt() != 0;
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                p.d dVar5 = (p.d) this;
                if (dVar5.f16168b != null) {
                    dVar5.f16167a.post(new p.c(dVar5, i15, uri, z9, bundle));
                }
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                String string3 = parcel.readString();
                Bundle bundle2 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                p.a aVar = ((p.d) this).f16168b;
                bundleB = aVar != null ? aVar.b(bundle2, string3) : null;
                parcel2.writeNoException();
                if (bundleB != null) {
                    parcel2.writeInt(1);
                    bundleB.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }
}
