package f7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f13322a;

    public p(e eVar) {
        ArrayList arrayList = eVar.f13250a;
        this.f13322a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String a(String str) {
        String[] strArr = this.f13322a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String b(int i10) {
        return this.f13322a[i10 * 2];
    }

    public final e c() {
        e eVar = new e();
        Collections.addAll(eVar.f13250a, this.f13322a);
        return eVar;
    }

    public final int d() {
        return this.f13322a.length / 2;
    }

    public final String e(int i10) {
        return this.f13322a[(i10 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && Arrays.equals(((p) obj).f13322a, this.f13322a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13322a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iD = d();
        for (int i10 = 0; i10 < iD; i10++) {
            sb.append(b(i10));
            sb.append(": ");
            sb.append(e(i10));
            sb.append("\n");
        }
        return sb.toString();
    }
}
