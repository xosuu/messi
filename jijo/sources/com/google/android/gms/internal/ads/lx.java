package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class lx {
    public static final nx a(final Context context, final VersionInfoParcel versionInfoParcel, final zza zzaVar, final jp0 jp0Var, final b4.c cVar, final y9 y9Var, final kd kdVar, final ug ugVar, final qh0 qh0Var, final fr0 fr0Var, final hr0 hr0Var, final pr0 pr0Var, final String str, final boolean z9, final boolean z10) {
        eg.a(context);
        try {
            qx0 qx0Var = new qx0() { // from class: com.google.android.gms.internal.ads.jx
                @Override // com.google.android.gms.internal.ads.qx0
                /* JADX INFO: renamed from: zza */
                public final Object mo3zza() {
                    b4.c cVar2 = cVar;
                    String str2 = str;
                    boolean z11 = z9;
                    kd kdVar2 = kdVar;
                    boolean z12 = z10;
                    y9 y9Var2 = y9Var;
                    fr0 fr0Var2 = fr0Var;
                    ug ugVar2 = ugVar;
                    zzm zzmVar = jp0Var;
                    hr0 hr0Var2 = hr0Var;
                    Context context2 = context;
                    VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
                    zza zzaVar2 = zzaVar;
                    pr0 pr0Var2 = pr0Var;
                    qh0 qh0Var2 = qh0Var;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = px.f7981n0;
                        cy cyVar = new cy(context2);
                        cyVar.setBaseContext(context2);
                        nx nxVar = new nx(new px(cyVar, cVar2, str2, z11, y9Var2, ugVar2, versionInfoParcel2, zzmVar, zzaVar2, kdVar2, fr0Var2, hr0Var2, pr0Var2));
                        nxVar.setWebViewClient(zzu.zzq().zzc(nxVar, kdVar2, z12, qh0Var2));
                        nxVar.setWebChromeClient(new ex(nxVar));
                        return nxVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (nx) qx0Var.mo3zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcev("Webview initialization failed.", th);
        }
    }
}
