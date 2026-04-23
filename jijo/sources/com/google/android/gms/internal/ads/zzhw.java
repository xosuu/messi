package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class zzhw extends zzbp {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11647d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11648f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11649h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y1 f11650q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jo1 f11652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f11653u;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public zzhw(int i10, Throwable th, int i11) {
        this(i10, th, i11, null, -1, null, 4, false);
    }

    public final zzhw a(jo1 jo1Var) {
        String message = getMessage();
        int i10 = yn0.f10944a;
        return new zzhw(message, getCause(), this.f11512a, this.f11647d, this.f11648f, this.f11649h, this.f11650q, this.f11651s, jo1Var, this.f11513b, this.f11653u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzhw(int i10, Throwable th, int i11, String str, int i12, y1 y1Var, int i13, boolean z9) {
        String strR;
        String str2;
        if (i10 == 0) {
            strR = "Source error";
        } else if (i10 != 1) {
            strR = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(y1Var);
            int i14 = yn0.f10944a;
            if (i13 == 0) {
                str2 = "NO";
            } else if (i13 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str2 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i12);
            sb.append(", format=");
            sb.append(strValueOf);
            strR = g1.a.r(sb, ", format_supported=", str2);
        }
        this(TextUtils.isEmpty(null) ? strR : strR.concat(": null"), th, i11, i10, str, i12, y1Var, i13, null, SystemClock.elapsedRealtime(), z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzhw(java.lang.String r9, java.lang.Throwable r10, int r11, int r12, java.lang.String r13, int r14, com.google.android.gms.internal.ads.y1 r15, int r16, com.google.android.gms.internal.ads.jo1 r17, long r18, boolean r20) {
        /*
            r8 = this;
            r6 = r8
            r7 = r20
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r18
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L18
            r2 = r12
            if (r2 != r1) goto L16
            r2 = 1
        L14:
            r3 = 1
            goto L1a
        L16:
            r3 = 0
            goto L1a
        L18:
            r2 = r12
            goto L14
        L1a:
            com.google.android.gms.internal.ads.tc1.K(r3)
            if (r10 != 0) goto L20
            goto L21
        L20:
            r0 = 1
        L21:
            com.google.android.gms.internal.ads.tc1.K(r0)
            r6.f11647d = r2
            r0 = r13
            r6.f11648f = r0
            r0 = r14
            r6.f11649h = r0
            r0 = r15
            r6.f11650q = r0
            r0 = r16
            r6.f11651s = r0
            r0 = r17
            r6.f11652t = r0
            r6.f11653u = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhw.<init>(java.lang.String, java.lang.Throwable, int, int, java.lang.String, int, com.google.android.gms.internal.ads.y1, int, com.google.android.gms.internal.ads.jo1, long, boolean):void");
    }
}
