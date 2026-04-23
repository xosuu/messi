package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zq extends sq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f11300b;

    public /* synthetic */ zq(List list, int i10) {
        this.f11299a = i10;
        this.f11300b = list;
    }

    @Override // com.google.android.gms.internal.ads.tq
    public final void a(String str) {
        switch (this.f11299a) {
            case 0:
                zzm.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
                break;
            default:
                zzm.zzg("Error recording click: ".concat(String.valueOf(str)));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.tq
    public final void h0(List list) {
        int i10 = this.f11299a;
        List list2 = this.f11300b;
        switch (i10) {
            case 0:
                zzm.zzi("Recorded impression urls: ".concat(list2.toString()));
                break;
            default:
                zzm.zzi("Recorded click: ".concat(list2.toString()));
                break;
        }
    }
}
