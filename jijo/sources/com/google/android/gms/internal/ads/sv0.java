package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class sv0 extends zzc {
    public final int E;

    public sv0(Context context, Looper looper, v3.b bVar, v3.c cVar, int i10) {
        super(context, looper, 116, bVar, cVar);
        this.E = i10;
    }

    @Override // v3.f
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof tv0 ? (tv0) iInterfaceQueryLocalInterface : new tv0(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // v3.f
    public final int getMinApkVersion() {
        return this.E;
    }

    @Override // v3.f
    public final String h() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // v3.f
    public final String i() {
        return "com.google.android.gms.gass.START";
    }

    public final tv0 n() {
        return (tv0) super.getService();
    }
}
