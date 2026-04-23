package p1;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16210g;

    public b(int i10, int i11, String str, String str2, String str3, boolean z9) {
        this.f16204a = str;
        this.f16205b = str2;
        this.f16207d = z9;
        this.f16208e = i10;
        int i12 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i12 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i12 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i12 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f16206c = i12;
        this.f16209f = str3;
        this.f16210g = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f16208e != bVar.f16208e || !this.f16204a.equals(bVar.f16204a) || this.f16207d != bVar.f16207d) {
            return false;
        }
        String str = this.f16209f;
        int i10 = this.f16210g;
        int i11 = bVar.f16210g;
        String str2 = bVar.f16209f;
        if (i10 == 1 && i11 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i10 != 2 || i11 != 1 || str2 == null || str2.equals(str)) {
            return (i10 == 0 || i10 != i11 || (str == null ? str2 == null : str.equals(str2))) && this.f16206c == bVar.f16206c;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f16204a.hashCode() * 31) + this.f16206c) * 31) + (this.f16207d ? 1231 : 1237)) * 31) + this.f16208e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f16204a);
        sb.append("', type='");
        sb.append(this.f16205b);
        sb.append("', affinity='");
        sb.append(this.f16206c);
        sb.append("', notNull=");
        sb.append(this.f16207d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f16208e);
        sb.append(", defaultValue='");
        return g1.a.r(sb, this.f16209f, "'}");
    }
}
