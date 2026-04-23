package w7;

import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.minidns.dnslabel.DnsLabel$LabelToLongException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements CharSequence, Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f18162f = d("*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f18163h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient b f18165b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient byte[] f18166d;

    public b(String str) {
        this.f18164a = str;
        if (f18163h) {
            if (this.f18166d == null) {
                this.f18166d = str.getBytes(StandardCharsets.US_ASCII);
            }
            if (this.f18166d.length > 63) {
                throw new DnsLabel$LabelToLongException(str);
            }
        }
    }

    public static b d(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Label is null or empty");
        }
        return d.e(str) ? (d.e(str) && str.length() >= 4 && str.charAt(2) == '-' && str.charAt(3) == '-') ? str.substring(0, 2).toLowerCase(Locale.US).equals("xn") ? str.equals(IDN.toUnicode(str)) ? new c(str) : new a(str) : new i(str) : new g(str) : str.charAt(0) == '_' ? new j(str) : (!str.isEmpty() && (str.charAt(0) == '-' || str.charAt(str.length() + (-1)) == '-')) ? new e(str) : new h(str);
    }

    public final b a() {
        if (this.f18165b == null) {
            this.f18165b = d(this.f18164a.toLowerCase(Locale.US));
        }
        return this.f18165b;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f18164a.charAt(i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a().f18164a.compareTo(((b) obj).a().f18164a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f18164a.equals(((b) obj).f18164a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18164a.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f18164a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f18164a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f18164a;
    }
}
