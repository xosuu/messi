package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f5801a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f5802b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f5803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f5804d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f5803c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f5804d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString a(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j5.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static int b(List list, String str, g5 g5Var) {
        ArrayList arrayListD = d(list, str, g5Var);
        for (int i10 = 0; i10 < arrayListD.size(); i10++) {
            int i11 = ((h5) arrayListD.get(i10)).f5219b.f3186o;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static d5 c(String str, Matcher matcher, ik0 ik0Var, ArrayList arrayList) {
        i5 i5Var = new i5();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            i5Var.f5485a = z3.a.d0(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            i5Var.f5486b = z3.a.d0(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            f(strGroup3, i5Var);
            StringBuilder sb = new StringBuilder();
            String strH = ik0Var.H(fx0.f4681c);
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strH.trim());
                strH = ik0Var.H(fx0.f4681c);
            }
            i5Var.f5487c = a(str, sb.toString(), arrayList);
            return new d5(i5Var.a().a(), i5Var.f5485a, i5Var.f5486b);
        } catch (NumberFormatException unused) {
            fg0.f("Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList d(java.util.List r8, java.lang.String r9, com.google.android.gms.internal.ads.g5 r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L7b
            java.lang.Object r3 = r8.get(r2)
            com.google.android.gms.internal.ads.c5 r3 = (com.google.android.gms.internal.ads.c5) r3
            java.lang.String r4 = r10.f4816a
            java.lang.String r5 = r3.f3172a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3f
            java.lang.String r5 = r3.f3173b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3f
            java.util.Set r5 = r3.f3174c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3f
            java.lang.String r5 = r3.f3175d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3f
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L3d
            r4 = 1
            goto L6e
        L3d:
            r4 = 0
            goto L6e
        L3f:
            java.lang.String r5 = r3.f3172a
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = com.google.android.gms.internal.ads.c5.a(r5, r1, r6, r9)
            java.lang.String r6 = r3.f3173b
            r7 = 2
            int r4 = com.google.android.gms.internal.ads.c5.a(r6, r5, r7, r4)
            java.lang.String r5 = r3.f3175d
            java.lang.String r6 = r10.f4818c
            r7 = 4
            int r4 = com.google.android.gms.internal.ads.c5.a(r5, r4, r7, r6)
            r5 = -1
            if (r4 == r5) goto L3d
            java.util.Set r5 = r3.f3174c
            java.util.Set r6 = r10.f4819d
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L65
            goto L3d
        L65:
            java.util.Set r5 = r3.f3174c
            int r5 = r5.size()
            int r5 = r5 * 4
            int r4 = r4 + r5
        L6e:
            if (r4 <= 0) goto L78
            com.google.android.gms.internal.ads.h5 r5 = new com.google.android.gms.internal.ads.h5
            r5.<init>(r4, r3)
            r0.add(r5)
        L78:
            int r2 = r2 + 1
            goto L7
        L7b:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j5.d(java.util.List, java.lang.String, com.google.android.gms.internal.ads.g5):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r19, com.google.android.gms.internal.ads.g5 r20, java.util.List r21, android.text.SpannableStringBuilder r22, java.util.List r23) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j5.e(java.lang.String, com.google.android.gms.internal.ads.g5, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(java.lang.String r19, com.google.android.gms.internal.ads.i5 r20) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j5.f(java.lang.String, com.google.android.gms.internal.ads.i5):void");
    }
}
