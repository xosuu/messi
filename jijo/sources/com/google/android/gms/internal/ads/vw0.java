package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class vw0 extends pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.q f9990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww0 f9991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(ww0 ww0Var, k.q qVar) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.f9991b = ww0Var;
        this.f9990a = qVar;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        ek0 ek0Var;
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) qb.a(parcel, Bundle.CREATOR);
        qb.b(parcel);
        int i11 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        if (string == null) {
            string = null;
        }
        this.f9990a.B(new tw0(i11, string));
        if (i11 != 8157 || (ek0Var = this.f9991b.f10366a) == null) {
            return true;
        }
        ww0.f10364c.d("unbind LMD display overlay service", new Object[0]);
        ek0Var.c(new yd0(16, ek0Var));
        return true;
    }
}
