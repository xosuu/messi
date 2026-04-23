package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d00 implements a00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzg f3527b;

    public /* synthetic */ d00(zzj zzjVar, int i10) {
        this.f3526a = i10;
        this.f3527b = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.a00
    public final void a(HashMap map) {
        int i10 = this.f3526a;
        zzg zzgVar = this.f3527b;
        switch (i10) {
            case 0:
                zzgVar.zzy(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
                break;
            default:
                zzgVar.zzA(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
                break;
        }
    }
}
