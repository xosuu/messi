package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class gw0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f5097g = new UUID(0, 0).toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final iw0 f5103f;

    public gw0(Context context, String str, String str2, String str3) {
        if (iw0.f5706c == null) {
            iw0.f5706c = new iw0(context);
        }
        this.f5103f = iw0.f5706c;
        this.f5098a = str;
        this.f5099b = str.concat("_3p");
        this.f5100c = str2;
        this.f5101d = str2.concat("_3p");
        this.f5102e = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.x1 a(java.lang.String r18, java.lang.String r19, long r20, boolean r22) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = r0.f5099b
            r3 = 0
            r4 = 5
            com.google.android.gms.internal.ads.iw0 r5 = r0.f5103f
            if (r1 == 0) goto L3c
            java.util.UUID.fromString(r18)     // Catch: java.lang.IllegalArgumentException -> L3f
            java.lang.String r6 = com.google.android.gms.internal.ads.gw0.f5097g
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L18
            goto L3f
        L18:
            android.content.SharedPreferences r6 = r5.f5708b
            java.lang.String r6 = r6.getString(r2, r3)
            android.content.SharedPreferences r7 = r5.f5708b
            java.lang.String r8 = "paid_3p_hash_key"
            java.lang.String r7 = r7.getString(r8, r3)
            if (r6 == 0) goto L3c
            if (r7 == 0) goto L3c
            r8 = r19
            java.lang.String r7 = r0.e(r1, r8, r7)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L37
            goto L45
        L37:
            com.google.android.gms.internal.ads.x1 r1 = r17.b(r18, r19)
            return r1
        L3c:
            r8 = r19
            goto L45
        L3f:
            com.google.android.gms.internal.ads.x1 r1 = new com.google.android.gms.internal.ads.x1
            r1.<init>(r4)
            return r1
        L45:
            if (r1 == 0) goto L49
            r6 = 1
            goto L4a
        L49:
            r6 = 0
        L4a:
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 < 0) goto La9
            java.lang.String r7 = r0.f5100c
            java.lang.String r11 = r0.f5101d
            if (r6 == 0) goto L5c
            r12 = r11
            goto L5d
        L5c:
            r12 = r7
        L5d:
            android.content.SharedPreferences r13 = r5.f5708b
            r14 = -1
            long r12 = r13.getLong(r12, r14)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L6a
            goto L86
        L6a:
            int r16 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r16 >= 0) goto L7b
            if (r6 == 0) goto L72
            r12 = r11
            goto L73
        L72:
            r12 = r7
        L73:
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r5.a(r9, r12)
            goto L86
        L7b:
            long r12 = r12 + r20
            int r16 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r16 < 0) goto L86
            com.google.android.gms.internal.ads.x1 r1 = r17.b(r18, r19)
            return r1
        L86:
            if (r6 == 0) goto L89
            goto L8b
        L89:
            java.lang.String r2 = r0.f5098a
        L8b:
            android.content.SharedPreferences r9 = r5.f5708b
            java.lang.String r2 = r9.getString(r2, r3)
            if (r2 != 0) goto L9a
            if (r22 != 0) goto L9a
            com.google.android.gms.internal.ads.x1 r1 = r17.b(r18, r19)
            return r1
        L9a:
            com.google.android.gms.internal.ads.x1 r1 = new com.google.android.gms.internal.ads.x1
            if (r6 == 0) goto L9f
            r7 = r11
        L9f:
            android.content.SharedPreferences r3 = r5.f5708b
            long r5 = r3.getLong(r7, r14)
            r1.<init>(r2, r5, r4)
            return r1
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r0.f5102e
            java.lang.String r3 = ": Invalid negative current timestamp. Updating PAID failed"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw0.a(java.lang.String, java.lang.String, long, boolean):com.google.android.gms.internal.ads.x1");
    }

    public final x1 b(String str, String str2) throws IOException {
        if (str == null) {
            return c(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f5103f.a(string, "paid_3p_hash_key");
        return c(e(str, str2, string), true);
    }

    public final x1 c(String str, boolean z9) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f5102e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z9 ? this.f5101d : this.f5100c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        iw0 iw0Var = this.f5103f;
        iw0Var.a(lValueOf, str2);
        iw0Var.a(str, z9 ? this.f5099b : this.f5098a);
        return new x1(str, jCurrentTimeMillis, 5);
    }

    public final void d(boolean z9) throws IOException {
        String str = z9 ? this.f5101d : this.f5100c;
        iw0 iw0Var = this.f5103f;
        iw0Var.b(str);
        iw0Var.b(z9 ? this.f5099b : this.f5098a);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(fb1.x(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5102e);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sb.toString());
    }
}
