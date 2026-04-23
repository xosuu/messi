package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.e f16172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.b f16173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f16174d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16171a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f16175e = null;

    public g(a.e eVar, d dVar, ComponentName componentName) {
        this.f16172b = eVar;
        this.f16173c = dVar;
        this.f16174d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.f16175e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        synchronized (this.f16171a) {
            try {
                a.e eVar = this.f16172b;
                a.b bVar = this.f16173c;
                a.c cVar = (a.c) eVar;
                cVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!cVar.f0a.transact(8, parcelObtain, parcelObtain2, 0)) {
                        int i10 = a.d.f1a;
                    }
                    parcelObtain2.readException();
                    parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            } catch (RemoteException unused) {
            }
        }
    }
}
