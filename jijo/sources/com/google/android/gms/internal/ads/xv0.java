package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class xv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv0 f10667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10668b = true;

    public xv0(zv0 zv0Var) {
        this.f10667a = zv0Var;
    }

    public static xv0 a(Context context, String str) {
        zv0 yv0Var;
        try {
            try {
                try {
                    IBinder iBinderB = b4.d.c(context, b4.d.f1312b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        yv0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        yv0Var = iInterfaceQueryLocalInterface instanceof zv0 ? (zv0) iInterfaceQueryLocalInterface : new yv0(iBinderB, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                    }
                    yv0Var.U(new a4.b(context), str);
                    return new xv0(yv0Var);
                } catch (Exception e10) {
                    throw new zzfpl(e10);
                }
            } catch (Exception e11) {
                throw new zzfpl(e11);
            }
        } catch (RemoteException | zzfpl | NullPointerException | SecurityException unused) {
            return new xv0(new aw0());
        }
    }
}
