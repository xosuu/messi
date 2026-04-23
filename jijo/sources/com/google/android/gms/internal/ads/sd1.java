package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class sd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f8846a;

    static {
        char[] cArr = new char[80];
        f8846a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i10, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            cc1 cc1Var = ec1.f3903b;
            sb.append(en1.T(new cc1(((String) obj).getBytes(ed1.f3910a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ec1) {
            sb.append(": \"");
            sb.append(en1.T((ec1) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof wc1) {
            sb.append(" {");
            c((wc1) obj, sb, i10 + 2);
            sb.append("\n");
            b(i10, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i12, "key", entry.getKey());
        a(sb, i12, "value", entry.getValue());
        sb.append("\n");
        b(i10, sb);
        sb.append("}");
    }

    public static void b(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f8846a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(com.google.android.gms.internal.ads.rd1 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sd1.c(com.google.android.gms.internal.ads.rd1, java.lang.StringBuilder, int):void");
    }
}
