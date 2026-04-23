package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f2897c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f2898d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f2899a = new ik0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f2900b = new StringBuilder();

    public static String a(ik0 ik0Var, StringBuilder sb) {
        b(ik0Var);
        if (ik0Var.n() == 0) {
            return null;
        }
        String strC = c(ik0Var, sb);
        if (!RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(strC)) {
            return strC;
        }
        char cV = (char) ik0Var.v();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cV);
        return sb2.toString();
    }

    public static void b(ik0 ik0Var) {
        while (true) {
            for (boolean z9 = true; ik0Var.n() > 0 && z9; z9 = false) {
                int i10 = ik0Var.f5634b;
                byte[] bArr = ik0Var.f5633a;
                byte b10 = bArr[i10];
                char c10 = (char) b10;
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    ik0Var.j(1);
                } else {
                    int i11 = ik0Var.f5635c;
                    if (i10 + 2 <= i11) {
                        int i12 = i10 + 1;
                        if (b10 == 47) {
                            int i13 = i10 + 2;
                            if (bArr[i12] == 42) {
                                while (true) {
                                    int i14 = i13 + 1;
                                    if (i14 >= i11) {
                                        break;
                                    }
                                    if (((char) bArr[i13]) == '*' && ((char) bArr[i14]) == '/') {
                                        i11 = i13 + 2;
                                        i13 = i11;
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                ik0Var.j(i11 - ik0Var.f5634b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String c(ik0 ik0Var, StringBuilder sb) {
        boolean z9;
        char c10;
        sb.setLength(0);
        int i10 = ik0Var.f5634b;
        int i11 = ik0Var.f5635c;
        loop0: while (true) {
            while (i10 < i11 && !z9) {
                c10 = (char) ik0Var.f5633a[i10];
                z9 = (c10 < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_');
            }
            sb.append(c10);
            i10++;
        }
        ik0Var.j(i10 - ik0Var.f5634b);
        return sb.toString();
    }
}
