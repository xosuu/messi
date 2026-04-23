package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bl implements com.google.android.gms.ads.internal.overlay.zzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3044a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zza f3046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f3047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f3048e;

    public bl(boolean z9, zza zzaVar, HashMap map, Map map2) {
        this.f3045b = z9;
        this.f3046c = zzaVar;
        this.f3047d = map;
        this.f3048e = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zza(boolean z9) {
        if (this.f3044a) {
            return;
        }
        zza zzaVar = this.f3046c;
        if (z9 && this.f3045b) {
            ((q70) zzaVar).L();
        }
        this.f3044a = true;
        String str = (String) this.f3048e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z9);
        Map map = this.f3047d;
        map.put(str, boolValueOf);
        ((hm) zzaVar).j("openIntentAsync", map);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zzb(int i10) {
    }
}
