package f7;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char[] f13323i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f13329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13331h;

    public q(z5.b bVar) {
        this.f13324a = (String) bVar.f20714b;
        String str = (String) bVar.f20715c;
        this.f13325b = h(str, false, 0, str.length());
        String str2 = (String) bVar.f20716d;
        this.f13326c = h(str2, false, 0, str2.length());
        this.f13327d = (String) bVar.f20717e;
        int i10 = bVar.f20718f;
        this.f13328e = i10 == -1 ? b((String) bVar.f20714b) : i10;
        i((List) bVar.f20720h, false);
        List list = (List) bVar.f20721i;
        this.f13329f = list != null ? i(list, true) : null;
        String str3 = (String) bVar.f20719g;
        this.f13330g = str3 != null ? h(str3, false, 0, str3.length()) : null;
        this.f13331h = bVar.toString();
    }

    public static String a(String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i12 = 43;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z12) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z9 || (z10 && !j(iCharCount, i11, str)))) || (iCodePointAt == 43 && z11)))) {
                p7.e eVar = new p7.e();
                eVar.O(i10, iCharCount, str);
                p7.e eVar2 = null;
                while (iCharCount < i11) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z9 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i12 && z11) {
                            String str3 = z9 ? "+" : "%2B";
                            eVar.O(0, str3.length(), str3);
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z12) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z9 || (z10 && !j(iCharCount, i11, str)))))) {
                            if (eVar2 == null) {
                                eVar2 = new p7.e();
                            }
                            if (charset == null || charset.equals(g7.b.f13891d)) {
                                eVar2.P(iCodePointAt2);
                            } else {
                                int iCharCount2 = Character.charCount(iCodePointAt2) + iCharCount;
                                if (iCharCount < 0) {
                                    throw new IllegalAccessError(fb1.g("beginIndex < 0: ", iCharCount));
                                }
                                if (iCharCount2 < iCharCount) {
                                    throw new IllegalArgumentException(l.a0.f("endIndex < beginIndex: ", iCharCount2, " < ", iCharCount));
                                }
                                if (iCharCount2 > str.length()) {
                                    throw new IllegalArgumentException("endIndex > string.length: " + iCharCount2 + " > " + str.length());
                                }
                                if (charset.equals(p7.w.f16310a)) {
                                    eVar2.O(iCharCount, iCharCount2, str);
                                } else {
                                    byte[] bytes = str.substring(iCharCount, iCharCount2).getBytes(charset);
                                    eVar2.H(0, bytes, bytes.length);
                                }
                            }
                            while (!eVar2.n()) {
                                byte bC = eVar2.C();
                                eVar.K(37);
                                char[] cArr = f13323i;
                                eVar.K(cArr[((bC & 255) >> 4) & 15]);
                                eVar.K(cArr[bC & 15]);
                            }
                        } else {
                            eVar.P(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i12 = 43;
                }
                return eVar.E();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i10, i11);
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String h(java.lang.String r8, boolean r9, int r10, int r11) {
        /*
            r0 = r10
        L1:
            if (r0 >= r11) goto L60
            char r1 = r8.charAt(r0)
            r2 = 43
            r3 = 37
            if (r1 == r3) goto L15
            if (r1 != r2) goto L12
            if (r9 == 0) goto L12
            goto L15
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            p7.e r1 = new p7.e
            r1.<init>()
            r1.O(r10, r0, r8)
        L1d:
            if (r0 >= r11) goto L5b
            int r10 = r8.codePointAt(r0)
            if (r10 != r3) goto L48
            int r4 = r0 + 2
            if (r4 >= r11) goto L48
            int r5 = r0 + 1
            char r5 = r8.charAt(r5)
            int r5 = g7.b.f(r5)
            char r6 = r8.charAt(r4)
            int r6 = g7.b.f(r6)
            r7 = -1
            if (r5 == r7) goto L52
            if (r6 == r7) goto L52
            int r0 = r5 << 4
            int r0 = r0 + r6
            r1.K(r0)
            r0 = r4
            goto L55
        L48:
            if (r10 != r2) goto L52
            if (r9 == 0) goto L52
            r4 = 32
            r1.K(r4)
            goto L55
        L52:
            r1.P(r10)
        L55:
            int r10 = java.lang.Character.charCount(r10)
            int r0 = r0 + r10
            goto L1d
        L5b:
            java.lang.String r8 = r1.E()
            return r8
        L60:
            java.lang.String r8 = r8.substring(r10, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.q.h(java.lang.String, boolean, int, int):java.lang.String");
    }

    public static List i(List list, boolean z9) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) list.get(i10);
            arrayList.add(str != null ? h(str, z9, 0, str.length()) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean j(int i10, int i11, String str) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && g7.b.f(str.charAt(i10 + 1)) != -1 && g7.b.f(str.charAt(i12)) != -1;
    }

    public static ArrayList k(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public final String c() {
        if (this.f13326c.isEmpty()) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        int length = this.f13324a.length() + 3;
        String str = this.f13331h;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public final ArrayList d() {
        int length = this.f13324a.length() + 3;
        String str = this.f13331h;
        int iIndexOf = str.indexOf(47, length);
        int i10 = g7.b.i(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < i10) {
            int i11 = iIndexOf + 1;
            int iH = g7.b.h(str, i11, i10, '/');
            arrayList.add(str.substring(i11, iH));
            iIndexOf = iH;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f13329f == null) {
            return null;
        }
        String str = this.f13331h;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, g7.b.h(str, iIndexOf, str.length(), '#'));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && ((q) obj).f13331h.equals(this.f13331h);
    }

    public final String f() {
        if (this.f13325b.isEmpty()) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        int length = this.f13324a.length() + 3;
        String str = this.f13331h;
        return str.substring(length, g7.b.i(str, length, str.length(), ":@"));
    }

    public final z5.b g() {
        z5.b bVar = new z5.b(1);
        String str = this.f13324a;
        bVar.f20714b = str;
        bVar.f20715c = f();
        bVar.f20716d = c();
        bVar.f20717e = this.f13327d;
        int iB = b(str);
        int i10 = this.f13328e;
        if (i10 == iB) {
            i10 = -1;
        }
        bVar.f20718f = i10;
        ((List) bVar.f20720h).clear();
        ((List) bVar.f20720h).addAll(d());
        String strE = e();
        String strSubstring = null;
        bVar.f20721i = strE != null ? k(a(strE, 0, strE.length(), " \"'<>#", true, false, true, true, null)) : null;
        if (this.f13330g != null) {
            String str2 = this.f13331h;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        bVar.f20719g = strSubstring;
        return bVar;
    }

    public final int hashCode() {
        return this.f13331h.hashCode();
    }

    public final URI l() {
        z5.b bVarG = g();
        int size = ((List) bVarG.f20720h).size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) ((List) bVarG.f20720h).get(i10);
            ((List) bVarG.f20720h).set(i10, a(str, 0, str.length(), "[]", true, true, false, true, null));
        }
        List list = (List) bVarG.f20721i;
        if (list != null) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str2 = (String) ((List) bVarG.f20721i).get(i11);
                if (str2 != null) {
                    ((List) bVarG.f20721i).set(i11, a(str2, 0, str2.length(), "\\^`{|}", true, true, true, true, null));
                }
            }
        }
        String str3 = (String) bVarG.f20719g;
        if (str3 != null) {
            bVarG.f20719g = a(str3, 0, str3.length(), " \"#<>\\^`{|}", true, true, false, false, null);
        }
        String string = bVarG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String toString() {
        return this.f13331h;
    }
}
