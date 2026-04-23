package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ce0 implements d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f3256a = new Bundle();

    @Override // com.google.android.gms.internal.ads.d70
    public final synchronized void X(String str) {
        this.f3256a.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final synchronized void a(String str, String str2) {
        this.f3256a.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final synchronized void z(String str) {
        this.f3256a.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void zza(String str) {
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void zzf() {
    }
}
