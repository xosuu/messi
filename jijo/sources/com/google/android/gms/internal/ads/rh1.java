package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class rh1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f8601b;

    public rh1(pg pgVar) {
        this.f8601b = new WeakReference(pgVar);
    }

    @Override // android.content.ServiceConnection
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a.e eVar;
        if (this.f8600a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i10 = a.d.f1a;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a.e)) {
                a.c cVar = new a.c();
                cVar.f0a = iBinder;
                eVar = cVar;
            } else {
                eVar = (a.e) iInterfaceQueryLocalInterface;
            }
        }
        p.f fVar = new p.f(eVar, componentName);
        pg pgVar = (pg) this.f8601b.get();
        if (pgVar != null) {
            pgVar.f7875b = fVar;
            try {
                a.c cVar2 = (a.c) eVar;
                cVar2.getClass();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(0L);
                    cVar2.f0a.transact(2, parcelObtain, parcelObtain2, 0);
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
            ur0 ur0Var = pgVar.f7877d;
            if (ur0Var != null) {
                ur0Var.Q();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        pg pgVar = (pg) this.f8601b.get();
        if (pgVar != null) {
            pgVar.f7875b = null;
            pgVar.f7874a = null;
        }
    }
}
