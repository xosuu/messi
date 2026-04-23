package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z4 f9762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f9763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f9764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v4 f9766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f9767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f9768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f9769m;

    public v4(String str, String str2, long j10, long j11, z4 z4Var, String[] strArr, String str3, String str4, v4 v4Var) {
        this.f9757a = str;
        this.f9758b = str2;
        this.f9765i = str4;
        this.f9762f = z4Var;
        this.f9763g = strArr;
        this.f9759c = str2 != null;
        this.f9760d = j10;
        this.f9761e = j11;
        str3.getClass();
        this.f9764h = str3;
        this.f9766j = v4Var;
        this.f9767k = new HashMap();
        this.f9768l = new HashMap();
    }

    public static v4 b(String str, long j10, long j11, z4 z4Var, String[] strArr, String str2, String str3, v4 v4Var) {
        return new v4(str, null, j10, j11, z4Var, strArr, str2, str3, v4Var);
    }

    public static v4 c(String str) {
        return new v4(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, null, null);
    }

    public static SpannableStringBuilder f(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            n50 n50Var = new n50();
            n50Var.f7160a = new SpannableStringBuilder();
            treeMap.put(str, n50Var);
        }
        CharSequence charSequence = ((n50) treeMap.get(str)).f7160a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final int a() {
        ArrayList arrayList = this.f9769m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final v4 d(int i10) {
        ArrayList arrayList = this.f9769m;
        if (arrayList != null) {
            return (v4) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean e(long j10) {
        long j11 = this.f9761e;
        long j12 = this.f9760d;
        if (j12 == -9223372036854775807L) {
            if (j11 == -9223372036854775807L) {
                return true;
            }
            j12 = -9223372036854775807L;
        }
        if (j12 <= j10 && j11 == -9223372036854775807L) {
            return true;
        }
        if (j12 != -9223372036854775807L || j10 >= j11) {
            return j12 <= j10 && j10 < j11;
        }
        return true;
    }

    public final void g(TreeSet treeSet, boolean z9) {
        String str = this.f9757a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z9 || zEquals || (zEquals2 && this.f9765i != null)) {
            long j10 = this.f9760d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f9761e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f9769m != null) {
            for (int i10 = 0; i10 < this.f9769m.size(); i10++) {
                v4 v4Var = (v4) this.f9769m.get(i10);
                boolean z10 = true;
                if (!z9 && !zEquals) {
                    z10 = false;
                }
                v4Var.g(treeSet, z10);
            }
        }
    }

    public final void h(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f9764h;
        if (!RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str3)) {
            str = str3;
        }
        if (e(j10) && "div".equals(this.f9757a) && (str2 = this.f9765i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < a(); i10++) {
            d(i10).h(j10, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v4.i(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    public final void j(long j10, boolean z9, String str, TreeMap treeMap) {
        HashMap map = this.f9767k;
        map.clear();
        HashMap map2 = this.f9768l;
        map2.clear();
        String str2 = this.f9757a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f9764h;
        String str4 = !RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str3) ? str3 : str;
        if (this.f9759c && z9) {
            SpannableStringBuilder spannableStringBuilderF = f(str4, treeMap);
            String str5 = this.f9758b;
            str5.getClass();
            spannableStringBuilderF.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z9) {
            f(str4, treeMap).append('\n');
            return;
        }
        if (e(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((n50) entry.getValue()).f7160a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < a(); i10++) {
                d(i10).j(j10, z9 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderF2 = f(str4, treeMap);
                int length = spannableStringBuilderF2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderF2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderF2.charAt(length) != '\n') {
                    spannableStringBuilderF2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((n50) entry2.getValue()).f7160a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
