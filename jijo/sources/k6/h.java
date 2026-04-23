package k6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f14723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f14724b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f14725d;

    public h(char c10, char c11, f fVar) {
        if (c11 < c10) {
            c11 = c10;
            c10 = c11;
        }
        this.f14723a = c10;
        this.f14724b = c11;
        this.f14725d = fVar;
    }

    public static void a(char c10, StringBuilder sb) {
        String str;
        if (c10 >= '!' && c10 <= '~' && c10 != '\\' && c10 != '\"') {
            sb.append(c10);
            return;
        }
        sb.append("\\u");
        String hexString = Integer.toHexString(c10);
        if (c10 < 16) {
            str = "000";
        } else {
            if (c10 >= 256) {
                if (c10 < 4096) {
                    str = "0";
                }
                sb.append(hexString);
            }
            str = "00";
        }
        sb.append(str);
        sb.append(hexString);
    }

    public final Object clone() {
        try {
            return (h) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f14723a == this.f14723a && hVar.f14724b == this.f14724b && hVar.f14725d == this.f14725d;
    }

    public final int hashCode() {
        return (this.f14724b * 3) + (this.f14723a * 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        char c10 = this.f14723a;
        a(c10, sb);
        char c11 = this.f14724b;
        if (c10 != c11) {
            sb.append("-");
            a(c11, sb);
        }
        sb.append(" -> ");
        sb.append(this.f14725d.f14718d);
        return sb.toString();
    }

    public h(char c10, f fVar) {
        this.f14724b = c10;
        this.f14723a = c10;
        this.f14725d = fVar;
    }
}
