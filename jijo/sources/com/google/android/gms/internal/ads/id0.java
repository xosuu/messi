package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class id0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f5570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzr f5571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CsiUrlBuilder f5573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f5576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f5577j;

    public id0(mu muVar, zzr zzrVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        this.f5568a = new HashMap();
        this.f5576i = new AtomicBoolean();
        this.f5577j = new AtomicReference(new Bundle());
        this.f5570c = muVar;
        this.f5571d = zzrVar;
        this.f5572e = ((Boolean) zzba.zzc().a(eg.N1)).booleanValue();
        this.f5573f = csiUrlBuilder;
        this.f5574g = ((Boolean) zzba.zzc().a(eg.Q1)).booleanValue();
        this.f5575h = ((Boolean) zzba.zzc().a(eg.f4100p6)).booleanValue();
        this.f5569b = context;
    }

    public final void a(Map map, boolean z9) {
        if (map.isEmpty()) {
            zzm.zze("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            zzm.zze("Empty or null paramMap.");
        } else {
            int i10 = 1;
            boolean andSet = this.f5576i.getAndSet(true);
            AtomicReference atomicReference = this.f5577j;
            if (!andSet) {
                String str = (String) zzba.zzc().a(eg.F9);
                atomicReference.set(zzad.zza(this.f5569b, str, new ot(this, str, i10)));
            }
            Bundle bundle = (Bundle) atomicReference.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        String strGenerateUrl = this.f5573f.generateUrl(map);
        zze.zza(strGenerateUrl);
        boolean z10 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f5572e) {
            if (!z9 || this.f5574g) {
                if (!z10 || this.f5575h) {
                    this.f5570c.execute(new vm(this, 25, strGenerateUrl));
                }
            }
        }
    }
}
