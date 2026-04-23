package f7;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f13302j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f13303k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f13304l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f13305m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13314i;

    public k(String str, String str2, long j10, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f13306a = str;
        this.f13307b = str2;
        this.f13308c = j10;
        this.f13309d = str3;
        this.f13310e = str4;
        this.f13311f = z9;
        this.f13312g = z10;
        this.f13314i = z11;
        this.f13313h = z12;
    }

    public static int a(String str, boolean z9, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (true ^ z9)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long b(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.k.b(int, java.lang.String):long");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f13306a.equals(this.f13306a) && kVar.f13307b.equals(this.f13307b) && kVar.f13309d.equals(this.f13309d) && kVar.f13310e.equals(this.f13310e) && kVar.f13308c == this.f13308c && kVar.f13311f == this.f13311f && kVar.f13312g == this.f13312g && kVar.f13313h == this.f13313h && kVar.f13314i == this.f13314i;
    }

    public final int hashCode() {
        int iHashCode = (this.f13310e.hashCode() + ((this.f13309d.hashCode() + ((this.f13307b.hashCode() + ((this.f13306a.hashCode() + 527) * 31)) * 31)) * 31)) * 31;
        long j10 = this.f13308c;
        return ((((((((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f13311f ? 1 : 0)) * 31) + (!this.f13312g ? 1 : 0)) * 31) + (!this.f13313h ? 1 : 0)) * 31) + (!this.f13314i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13306a);
        sb.append('=');
        sb.append(this.f13307b);
        if (this.f13313h) {
            long j10 = this.f13308c;
            if (j10 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) j7.e.f14450a.get()).format(new Date(j10)));
            }
        }
        if (!this.f13314i) {
            sb.append("; domain=");
            sb.append(this.f13309d);
        }
        sb.append("; path=");
        sb.append(this.f13310e);
        if (this.f13311f) {
            sb.append("; secure");
        }
        if (this.f13312g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
