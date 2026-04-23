package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class wn0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10253e;

    public wn0(String str, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f10249a = str;
        this.f10250b = z9;
        this.f10251c = z10;
        this.f10252d = z11;
        this.f10253e = z12;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f10249a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z9 = this.f10250b;
        bundle.putInt("test_mode", z9 ? 1 : 0);
        boolean z10 = this.f10251c;
        bundle.putInt("linked_device", z10 ? 1 : 0);
        if (z9 || z10) {
            if (((Boolean) zzba.zzc().a(eg.f4112q8)).booleanValue()) {
                bundle.putInt("risd", !this.f10252d ? 1 : 0);
            }
            if (((Boolean) zzba.zzc().a(eg.f4151u8)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f10253e);
            }
        }
    }
}
