package p;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qg;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.e f16169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f16170b;

    public e(a.e eVar, ComponentName componentName) {
        this.f16169a = eVar;
        this.f16170b = componentName;
    }

    public final g a(qg qgVar) {
        d dVar = new d(qgVar);
        a.e eVar = this.f16169a;
        try {
            a.c cVar = (a.c) eVar;
            cVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                parcelObtain.writeStrongBinder(dVar);
                if (!cVar.f0a.transact(3, parcelObtain, parcelObtain2, 0)) {
                    int i10 = a.d.f1a;
                }
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    return new g(eVar, dVar, this.f16170b);
                }
                return null;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException unused) {
            return null;
        }
    }
}
