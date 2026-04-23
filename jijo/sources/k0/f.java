package k0;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Locale[] f14630a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f14630a;
        int length = localeArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String strA = m0.e.a(locale);
                if (!strA.isEmpty()) {
                    return strA.equals(m0.e.a(locale2));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[i10].equals(locale)) {
                break;
            }
            i10++;
        }
        return false;
    }
}
