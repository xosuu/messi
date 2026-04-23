package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cp0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f3352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p21 f3354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f3355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lf0 f3356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final or0 f3357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f3358g;

    public cp0(zzj zzjVar, Context context, mu muVar, ScheduledExecutorService scheduledExecutorService, lf0 lf0Var, or0 or0Var, VersionInfoParcel versionInfoParcel) {
        this.f3352a = zzjVar;
        this.f3353b = context;
        this.f3354c = muVar;
        this.f3355d = scheduledExecutorService;
        this.f3356e = lf0Var;
        this.f3357f = or0Var;
        this.f3358g = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (java.util.Arrays.asList(r1.split(",")).contains(r5.f3353b.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    @Override // com.google.android.gms.internal.ads.to0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n5.a zzb() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cp0.zzb():n5.a");
    }
}
