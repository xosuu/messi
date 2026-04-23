package a7;

import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends c {
    public static String H(String str) {
        a0.f(str, "<this>");
        a0.f(str, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        a0.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
