package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h40 extends zzdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5206b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5207d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5208f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f5209h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f5210q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gi0 f5212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bundle f5213u;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h40(com.google.android.gms.internal.ads.fr0 r3, java.lang.String r4, com.google.android.gms.internal.ads.gi0 r5, com.google.android.gms.internal.ads.hr0 r6, java.lang.String r7) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            if (r3 != 0) goto L8
            r1 = r0
            goto La
        L8:
            java.lang.String r1 = r3.f4603b0
        La:
            r2.f5206b = r1
            r2.f5207d = r7
            if (r6 != 0) goto L12
            r7 = r0
            goto L14
        L12:
            java.lang.String r7 = r6.f5371b
        L14:
            r2.f5208f = r7
            java.lang.String r7 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L26
            java.lang.String r7 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L30
        L26:
            org.json.JSONObject r3 = r3.f4642v     // Catch: org.json.JSONException -> L2f
            java.lang.String r7 = "class_name"
            java.lang.String r0 = r3.getString(r7)     // Catch: org.json.JSONException -> L2f
            goto L30
        L2f:
        L30:
            if (r0 == 0) goto L33
            r4 = r0
        L33:
            r2.f5205a = r4
            java.util.List r3 = r5.f4925a
            r2.f5209h = r3
            r2.f5212t = r5
            y3.a r3 = com.google.android.gms.ads.internal.zzu.zzB()
            y3.b r3 = (y3.b) r3
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            r2.f5210q = r3
            com.google.android.gms.internal.ads.xf r3 = com.google.android.gms.internal.ads.eg.f3996f6
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L66
            if (r6 == 0) goto L66
            android.os.Bundle r3 = r6.f5380k
            r2.f5213u = r3
            goto L6d
        L66:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.f5213u = r3
        L6d:
            com.google.android.gms.internal.ads.xf r3 = com.google.android.gms.internal.ads.eg.f4122r8
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L89
            if (r6 == 0) goto L89
            java.lang.String r3 = r6.f5378i
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L8b
        L89:
            java.lang.String r3 = ""
        L8b:
            r2.f5211s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h40.<init>(com.google.android.gms.internal.ads.fr0, java.lang.String, com.google.android.gms.internal.ads.gi0, com.google.android.gms.internal.ads.hr0, java.lang.String):void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        return this.f5213u;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() {
        gi0 gi0Var = this.f5212t;
        if (gi0Var != null) {
            return gi0Var.f4930f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        return this.f5205a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        return this.f5207d;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        return this.f5206b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        return this.f5209h;
    }
}
