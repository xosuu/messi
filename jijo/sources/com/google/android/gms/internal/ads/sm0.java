package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class sm0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzw f8925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f8926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8927c;

    public sm0(zzw zzwVar, VersionInfoParcel versionInfoParcel, boolean z9) {
        this.f8925a = zzwVar;
        this.f8926b = versionInfoParcel;
        this.f8927c = z9;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f8926b.clientJarVersion >= ((Integer) zzba.zzc().a(eg.K4)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) zzba.zzc().a(eg.L4)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f8927c);
        }
        zzw zzwVar = this.f8925a;
        if (zzwVar != null) {
            int i10 = zzwVar.zza;
            if (i10 == 1) {
                bundle.putString("avo", "p");
            } else if (i10 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
