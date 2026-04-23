package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class gr extends v3.f {
    @Override // v3.f
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
        return iInterfaceQueryLocalInterface instanceof lr ? (lr) iInterfaceQueryLocalInterface : new kr(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // v3.f
    public final String h() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    @Override // v3.f
    public final String i() {
        return "com.google.android.gms.ads.service.ADS";
    }

    public final lr n() {
        return (lr) super.getService();
    }
}
