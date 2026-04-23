package k6;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f14703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f14704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public char f14706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f14710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f14711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f14712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14714m;

    public static void b(e eVar, int i10, ArrayList arrayList) {
        if (eVar.f14702a != i10) {
            arrayList.add(eVar.m());
        } else {
            b(eVar.f14703b, i10, arrayList);
            b(eVar.f14704c, i10, arrayList);
        }
    }

    public static e c(e eVar, e eVar2) {
        StringBuilder sb = new StringBuilder();
        if (eVar.f14702a == 13) {
            sb.append(eVar.f14705d);
        } else {
            sb.append(eVar.f14706e);
        }
        if (eVar2.f14702a == 13) {
            sb.append(eVar2.f14705d);
        } else {
            sb.append(eVar2.f14706e);
        }
        String string = sb.toString();
        e eVar3 = new e();
        eVar3.f14702a = 13;
        eVar3.f14705d = string;
        return eVar3;
    }

    public final boolean a(int i10) {
        return (i10 & this.f14713l) != 0;
    }

    public final boolean d(char c10) {
        int i10 = this.f14714m;
        String str = this.f14712k;
        if (i10 >= str.length() || str.charAt(this.f14714m) != c10) {
            return false;
        }
        this.f14714m++;
        return true;
    }

    public final boolean e() {
        return this.f14714m < this.f14712k.length();
    }

    public final char f() {
        if (!e()) {
            throw new IllegalArgumentException("unexpected end-of-string");
        }
        int i10 = this.f14714m;
        this.f14714m = i10 + 1;
        return this.f14712k.charAt(i10);
    }

    public final e g() {
        d('\\');
        char cF = f();
        if (!d('-')) {
            e eVar = new e();
            eVar.f14702a = 9;
            eVar.f14706e = cF;
            return eVar;
        }
        if (!l("]")) {
            d('\\');
            char cF2 = f();
            e eVar2 = new e();
            eVar2.f14702a = 10;
            eVar2.f14710i = cF;
            eVar2.f14711j = cF2;
            return eVar2;
        }
        e eVar3 = new e();
        eVar3.f14702a = 9;
        eVar3.f14706e = cF;
        e eVar4 = new e();
        eVar4.f14702a = 9;
        eVar4.f14706e = '-';
        e eVar5 = new e();
        eVar5.f14702a = 1;
        eVar5.f14703b = eVar3;
        eVar5.f14704c = eVar4;
        return eVar5;
    }

    public final e h() {
        e eVar;
        e eVar2;
        if (a(2) && d('~')) {
            e eVarH = h();
            e eVar3 = new e();
            eVar3.f14702a = 8;
            eVar3.f14703b = eVarH;
            return eVar3;
        }
        if (d('[')) {
            boolean zD = d('^');
            e eVarG = g();
            while (e() && !l("]")) {
                e eVarG2 = g();
                e eVar4 = new e();
                eVar4.f14702a = 1;
                eVar4.f14703b = eVarG;
                eVar4.f14704c = eVarG2;
                eVarG = eVar4;
            }
            if (zD) {
                e eVar5 = new e();
                eVar5.f14702a = 11;
                e eVar6 = new e();
                eVar6.f14702a = 8;
                eVar6.f14703b = eVarG;
                eVarG = new e();
                eVarG.f14702a = 3;
                eVarG.f14703b = eVar5;
                eVarG.f14704c = eVar6;
            }
            if (d(']')) {
                return eVarG;
            }
            throw new IllegalArgumentException("expected ']' at position " + this.f14714m);
        }
        if (d('.')) {
            eVar2 = new e();
            eVar2.f14702a = 11;
        } else if (a(4) && d('#')) {
            eVar2 = new e();
            eVar2.f14702a = 12;
        } else {
            if (!a(8) || !d('@')) {
                boolean zD2 = d('\"');
                String str = this.f14712k;
                if (zD2) {
                    int i10 = this.f14714m;
                    while (e() && !l("\"")) {
                        f();
                    }
                    if (!d('\"')) {
                        throw new IllegalArgumentException("expected '\"' at position " + this.f14714m);
                    }
                    String strSubstring = str.substring(i10, this.f14714m - 1);
                    eVar = new e();
                    eVar.f14702a = 13;
                    eVar.f14705d = strSubstring;
                } else if (d('(')) {
                    if (d(')')) {
                        eVar2 = new e();
                        eVar2.f14702a = 13;
                        eVar2.f14705d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        eVar = k();
                        if (!d(')')) {
                            throw new IllegalArgumentException("expected ')' at position " + this.f14714m);
                        }
                    }
                } else if ((a(16) || a(32)) && d('<')) {
                    int i11 = this.f14714m;
                    while (e() && !l(">")) {
                        f();
                    }
                    if (!d('>')) {
                        throw new IllegalArgumentException("expected '>' at position " + this.f14714m);
                    }
                    String strSubstring2 = str.substring(i11, this.f14714m - 1);
                    int iIndexOf = strSubstring2.indexOf(45);
                    if (iIndexOf != -1) {
                        if (!a(32)) {
                            throw new IllegalArgumentException("illegal identifier at position " + (this.f14714m - 1));
                        }
                        if (iIndexOf != 0) {
                            try {
                                if (iIndexOf != strSubstring2.length() - 1 && iIndexOf == strSubstring2.lastIndexOf(45)) {
                                    String strSubstring3 = strSubstring2.substring(0, iIndexOf);
                                    String strSubstring4 = strSubstring2.substring(iIndexOf + 1, strSubstring2.length());
                                    int i12 = Integer.parseInt(strSubstring3);
                                    int i13 = Integer.parseInt(strSubstring4);
                                    int length = strSubstring3.length() == strSubstring4.length() ? strSubstring3.length() : 0;
                                    if (i12 > i13) {
                                        i13 = i12;
                                        i12 = i13;
                                    }
                                    eVar = new e();
                                    eVar.f14702a = 16;
                                    eVar.f14707f = i12;
                                    eVar.f14708g = i13;
                                    eVar.f14709h = length;
                                }
                            } catch (NumberFormatException unused) {
                                throw new IllegalArgumentException("interval syntax error at position " + (this.f14714m - 1));
                            }
                        }
                        throw new NumberFormatException();
                    }
                    if (!a(16)) {
                        throw new IllegalArgumentException("interval syntax error at position " + (this.f14714m - 1));
                    }
                    eVar2 = new e();
                    eVar2.f14702a = 15;
                    eVar2.f14705d = strSubstring2;
                } else {
                    d('\\');
                    char cF = f();
                    eVar = new e();
                    eVar.f14702a = 9;
                    eVar.f14706e = cF;
                }
                return eVar;
            }
            eVar2 = new e();
            eVar2.f14702a = 14;
        }
        return eVar2;
    }

    public final e i() {
        int i10;
        e eVar;
        int i11;
        e eVarC;
        e eVar2;
        int i12;
        int i13;
        e eVar3;
        int i14;
        e eVarH = h();
        while (l("?*+{")) {
            if (d('?')) {
                eVar3 = new e();
                eVar3.f14702a = 4;
                eVar3.f14703b = eVarH;
            } else if (d('*')) {
                eVar3 = new e();
                eVar3.f14702a = 5;
                eVar3.f14703b = eVarH;
            } else if (d('+')) {
                eVar3 = new e();
                eVar3.f14702a = 6;
                eVar3.f14703b = eVarH;
                eVar3.f14707f = 1;
            } else if (d('{')) {
                int i15 = this.f14714m;
                while (l("0123456789")) {
                    f();
                }
                int i16 = this.f14714m;
                if (i15 == i16) {
                    throw new IllegalArgumentException("integer expected at position " + this.f14714m);
                }
                String str = this.f14712k;
                int i17 = Integer.parseInt(str.substring(i15, i16));
                if (d(',')) {
                    int i18 = this.f14714m;
                    while (l("0123456789")) {
                        f();
                    }
                    int i19 = this.f14714m;
                    i14 = i18 != i19 ? Integer.parseInt(str.substring(i18, i19)) : -1;
                } else {
                    i14 = i17;
                }
                if (!d('}')) {
                    throw new IllegalArgumentException("expected '}' at position " + this.f14714m);
                }
                if (i14 == -1) {
                    e eVar4 = new e();
                    eVar4.f14702a = 6;
                    eVar4.f14703b = eVarH;
                    eVar4.f14707f = i17;
                    eVarH = eVar4;
                } else {
                    e eVar5 = new e();
                    eVar5.f14702a = 7;
                    eVar5.f14703b = eVarH;
                    eVar5.f14707f = i17;
                    eVar5.f14708g = i14;
                    eVarH = eVar5;
                }
            } else {
                continue;
            }
            eVarH = eVar3;
        }
        if (!e() || l(")|")) {
            return eVarH;
        }
        if (a(1) && l("&")) {
            return eVarH;
        }
        e eVarI = i();
        int i20 = eVarH.f14702a;
        if ((i20 == 9 || i20 == 13) && ((i10 = eVarI.f14702a) == 9 || i10 == 13)) {
            return c(eVarH, eVarI);
        }
        e eVar6 = new e();
        eVar6.f14702a = 2;
        int i21 = eVarH.f14702a;
        if (i21 == 2 && (((i12 = (eVar2 = eVarH.f14704c).f14702a) == 9 || i12 == 13) && ((i13 = eVarI.f14702a) == 9 || i13 == 13))) {
            eVar6.f14703b = eVarH.f14703b;
            eVarC = c(eVar2, eVarI);
        } else {
            if ((i21 != 9 && i21 != 13) || eVarI.f14702a != 2 || ((i11 = (eVar = eVarI.f14703b).f14702a) != 9 && i11 != 13)) {
                eVar6.f14703b = eVarH;
                eVar6.f14704c = eVarI;
                return eVar6;
            }
            eVar6.f14703b = c(eVarH, eVar);
            eVarC = eVarI.f14704c;
        }
        eVar6.f14704c = eVarC;
        return eVar6;
    }

    public final e j() {
        e eVarI = i();
        if (!a(1) || !d('&')) {
            return eVarI;
        }
        e eVarJ = j();
        e eVar = new e();
        eVar.f14702a = 3;
        eVar.f14703b = eVarI;
        eVar.f14704c = eVarJ;
        return eVar;
    }

    public final e k() {
        e eVarJ = j();
        if (!d('|')) {
            return eVarJ;
        }
        e eVarK = k();
        e eVar = new e();
        eVar.f14702a = 1;
        eVar.f14703b = eVarJ;
        eVar.f14704c = eVarK;
        return eVar;
    }

    public final boolean l(String str) {
        return e() && str.indexOf(this.f14712k.charAt(this.f14714m)) != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k6.a m() {
        /*
            Method dump skipped, instruction units count: 1318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.e.m():k6.a");
    }

    public final void n(StringBuilder sb) {
        e eVar;
        String str;
        switch (u.h.b(this.f14702a)) {
            case 0:
                sb.append("(");
                this.f14703b.n(sb);
                sb.append("|");
                this.f14704c.n(sb);
                sb.append(")");
                return;
            case 1:
                this.f14703b.n(sb);
                this.f14704c.n(sb);
                return;
            case 2:
                sb.append("(");
                this.f14703b.n(sb);
                sb.append("&");
                eVar = this.f14704c;
                eVar.n(sb);
                sb.append(")");
                return;
            case 3:
                sb.append("(");
                this.f14703b.n(sb);
                str = ")?";
                sb.append(str);
                return;
            case 4:
                sb.append("(");
                this.f14703b.n(sb);
                str = ")*";
                sb.append(str);
                return;
            case 5:
                sb.append("(");
                this.f14703b.n(sb);
                sb.append("){");
                sb.append(this.f14707f);
                str = ",}";
                sb.append(str);
                return;
            case 6:
                sb.append("(");
                this.f14703b.n(sb);
                sb.append("){");
                sb.append(this.f14707f);
                sb.append(",");
                sb.append(this.f14708g);
                str = "}";
                sb.append(str);
                return;
            case 7:
                sb.append("~(");
                eVar = this.f14703b;
                eVar.n(sb);
                sb.append(")");
                return;
            case 8:
                sb.append("\\");
                sb.append(this.f14706e);
                return;
            case 9:
                sb.append("[\\");
                sb.append(this.f14710i);
                sb.append("-\\");
                sb.append(this.f14711j);
                str = "]";
                sb.append(str);
                return;
            case 10:
                str = ".";
                sb.append(str);
                return;
            case 11:
                str = "#";
                sb.append(str);
                return;
            case 12:
                str = "\"";
                sb.append("\"");
                sb.append(this.f14705d);
                sb.append(str);
                return;
            case 13:
                str = "@";
                sb.append(str);
                return;
            case 14:
                sb.append("<");
                sb.append(this.f14705d);
                sb.append(">");
                return;
            case 15:
                String string = Integer.toString(this.f14707f);
                String string2 = Integer.toString(this.f14708g);
                sb.append("<");
                if (this.f14709h > 0) {
                    for (int length = string.length(); length < this.f14709h; length++) {
                        sb.append('0');
                    }
                }
                sb.append(string);
                sb.append("-");
                if (this.f14709h > 0) {
                    for (int length2 = string2.length(); length2 < this.f14709h; length2++) {
                        sb.append('0');
                    }
                }
                sb.append(string2);
                sb.append(">");
                return;
            default:
                return;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        n(sb);
        return sb.toString();
    }
}
