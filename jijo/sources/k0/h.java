package k0;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f14631b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f14632a;

    public h(j jVar) {
        this.f14632a = jVar;
    }

    public static h a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new h(new k(g.a(localeArr))) : new h(new i(localeArr));
    }

    public static h b(String str) {
        if (str == null || str.isEmpty()) {
            return f14631b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = f.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.f14632a.equals(((h) obj).f14632a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14632a.hashCode();
    }

    public final String toString() {
        return this.f14632a.toString();
    }
}
