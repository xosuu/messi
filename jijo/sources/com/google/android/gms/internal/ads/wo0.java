package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class wo0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10258b;

    public wo0(int i10, int i11) {
        this.f10257a = i10;
        this.f10258b = i11;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("sessions_without_flags", this.f10257a);
        bundle.putInt("crashes_without_flags", this.f10258b);
        zzay zzayVar = zzay.f1962f;
        if (zzba.zzc().f3269j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
