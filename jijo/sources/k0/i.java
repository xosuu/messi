package k0;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale[] f14633c = new Locale[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale[] f14634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14635b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public i(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f14634a = f14633c;
            this.f14635b = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale == null) {
                throw new NullPointerException(fb1.h("list[", i10, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i10 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f14634a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f14635b = sb.toString();
    }

    @Override // k0.j
    public final String a() {
        return this.f14635b;
    }

    @Override // k0.j
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        Locale[] localeArr = ((i) obj).f14634a;
        Locale[] localeArr2 = this.f14634a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < localeArr2.length; i10++) {
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // k0.j
    public final Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f14634a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f14634a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // k0.j
    public final boolean isEmpty() {
        return this.f14634a.length == 0;
    }

    @Override // k0.j
    public final int size() {
        return this.f14634a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f14634a;
            if (i10 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i10]);
            if (i10 < localeArr.length - 1) {
                sb.append(',');
            }
            i10++;
        }
    }
}
