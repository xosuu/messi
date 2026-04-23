package s5;

import c2.n;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {
    public int[] A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f16709a;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f16717u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f16719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f16720x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String[] f16722z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16710b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f16711d = new char[1024];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16712f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16713h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16714q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16715s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16716t = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16721y = 1;

    static {
        n.f1535d = new n(28);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f16720x = iArr;
        iArr[0] = 6;
        this.f16722z = new String[32];
        this.A = new int[32];
        this.f16709a = reader;
    }

    public final void A() throws IOException {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + a0.u(T()) + I());
        }
        int i10 = this.f16721y;
        this.f16721y = i10 - 1;
        int[] iArr = this.A;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f16716t = 0;
    }

    public final void D() throws IOException {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + a0.u(T()) + I());
        }
        int i10 = this.f16721y;
        int i11 = i10 - 1;
        this.f16721y = i11;
        this.f16722z[i11] = null;
        int[] iArr = this.A;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f16716t = 0;
    }

    public final boolean E(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f16715s;
        int i14 = this.f16712f;
        this.f16715s = i13 - i14;
        int i15 = this.f16713h;
        char[] cArr = this.f16711d;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f16713h = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f16713h = 0;
        }
        this.f16712f = 0;
        do {
            int i17 = this.f16713h;
            int i18 = this.f16709a.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f16713h + i18;
            this.f16713h = i11;
            if (this.f16714q == 0 && (i12 = this.f16715s) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f16712f++;
                this.f16715s = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final String F(boolean z9) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f16721y;
            if (i10 >= i11) {
                return sb.toString();
            }
            int i12 = this.f16720x[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.A[i10];
                if (z9 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb.append('[');
                sb.append(i13);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String str = this.f16722z[i10];
                if (str != null) {
                    sb.append(str);
                }
            }
            i10++;
        }
    }

    public final boolean G() throws IOException {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        return (iU == 2 || iU == 4 || iU == 17) ? false : true;
    }

    public final boolean H(char c10) throws MalformedJsonException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public final String I() {
        return " at line " + (this.f16714q + 1) + " column " + ((this.f16712f - this.f16715s) + 1) + " path " + F(false);
    }

    public final boolean J() throws IOException {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 5) {
            this.f16716t = 0;
            int[] iArr = this.A;
            int i10 = this.f16721y - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iU != 6) {
            throw new IllegalStateException("Expected a boolean but was " + a0.u(T()) + I());
        }
        this.f16716t = 0;
        int[] iArr2 = this.A;
        int i11 = this.f16721y - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final double K() throws IOException {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 15) {
            this.f16716t = 0;
            int[] iArr = this.A;
            int i10 = this.f16721y - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f16717u;
        }
        if (iU == 16) {
            this.f16719w = new String(this.f16711d, this.f16712f, this.f16718v);
            this.f16712f += this.f16718v;
        } else if (iU == 8 || iU == 9) {
            this.f16719w = Q(iU == 8 ? '\'' : '\"');
        } else if (iU == 10) {
            this.f16719w = S();
        } else if (iU != 11) {
            throw new IllegalStateException("Expected a double but was " + a0.u(T()) + I());
        }
        this.f16716t = 11;
        double d10 = Double.parseDouble(this.f16719w);
        if (!this.f16710b && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d10 + I());
        }
        this.f16719w = null;
        this.f16716t = 0;
        int[] iArr2 = this.A;
        int i11 = this.f16721y - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public final int L() throws IOException {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 15) {
            long j10 = this.f16717u;
            int i10 = (int) j10;
            if (j10 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f16717u + I());
            }
            this.f16716t = 0;
            int[] iArr = this.A;
            int i11 = this.f16721y - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iU == 16) {
            this.f16719w = new String(this.f16711d, this.f16712f, this.f16718v);
            this.f16712f += this.f16718v;
        } else {
            if (iU != 8 && iU != 9 && iU != 10) {
                throw new IllegalStateException("Expected an int but was " + a0.u(T()) + I());
            }
            if (iU == 10) {
                this.f16719w = S();
            } else {
                this.f16719w = Q(iU == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f16719w);
                this.f16716t = 0;
                int[] iArr2 = this.A;
                int i13 = this.f16721y - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f16716t = 11;
        double d10 = Double.parseDouble(this.f16719w);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f16719w + I());
        }
        this.f16719w = null;
        this.f16716t = 0;
        int[] iArr3 = this.A;
        int i15 = this.f16721y - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public final long M() throws IOException {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 15) {
            this.f16716t = 0;
            int[] iArr = this.A;
            int i10 = this.f16721y - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f16717u;
        }
        if (iU == 16) {
            this.f16719w = new String(this.f16711d, this.f16712f, this.f16718v);
            this.f16712f += this.f16718v;
        } else {
            if (iU != 8 && iU != 9 && iU != 10) {
                throw new IllegalStateException("Expected a long but was " + a0.u(T()) + I());
            }
            if (iU == 10) {
                this.f16719w = S();
            } else {
                this.f16719w = Q(iU == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f16719w);
                this.f16716t = 0;
                int[] iArr2 = this.A;
                int i11 = this.f16721y - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f16716t = 11;
        double d10 = Double.parseDouble(this.f16719w);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f16719w + I());
        }
        this.f16719w = null;
        this.f16716t = 0;
        int[] iArr3 = this.A;
        int i12 = this.f16721y - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public final String N() throws IOException {
        String strQ;
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 14) {
            strQ = S();
        } else if (iU == 12) {
            strQ = Q('\'');
        } else {
            if (iU != 13) {
                throw new IllegalStateException("Expected a name but was " + a0.u(T()) + I());
            }
            strQ = Q('\"');
        }
        this.f16716t = 0;
        this.f16722z[this.f16721y - 1] = strQ;
        return strQ;
    }

    public final int O(boolean z9) throws IOException {
        int i10 = this.f16712f;
        int i11 = this.f16713h;
        while (true) {
            if (i10 == i11) {
                this.f16712f = i10;
                if (!E(1)) {
                    if (!z9) {
                        return -1;
                    }
                    throw new EOFException("End of input" + I());
                }
                i10 = this.f16712f;
                i11 = this.f16713h;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f16711d;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f16714q++;
                this.f16715s = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f16712f = i12;
                    if (i12 == i11) {
                        this.f16712f = i10;
                        boolean zE = E(2);
                        this.f16712f++;
                        if (!zE) {
                            return c10;
                        }
                    }
                    e();
                    int i13 = this.f16712f;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f16712f = i13 + 1;
                        while (true) {
                            if (this.f16712f + 2 > this.f16713h && !E(2)) {
                                a0("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.f16712f;
                            if (cArr[i14] != '\n') {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    if (cArr[this.f16712f + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                }
                                i10 = this.f16712f + 2;
                                i11 = this.f16713h;
                                break;
                            }
                            this.f16714q++;
                            this.f16715s = i14 + 1;
                            this.f16712f++;
                        }
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f16712f = i13 + 1;
                        X();
                        i10 = this.f16712f;
                        i11 = this.f16713h;
                    }
                } else {
                    if (c10 != '#') {
                        this.f16712f = i12;
                        return c10;
                    }
                    this.f16712f = i12;
                    e();
                    X();
                    i10 = this.f16712f;
                    i11 = this.f16713h;
                }
            }
            i10 = i12;
        }
    }

    public final void P() {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 7) {
            throw new IllegalStateException("Expected null but was " + a0.u(T()) + I());
        }
        this.f16716t = 0;
        int[] iArr = this.A;
        int i10 = this.f16721y - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f16712f = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.f16712f = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String Q(char r11) throws com.google.gson.stream.MalformedJsonException {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f16712f
            int r3 = r10.f16713h
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 1
            r6 = 16
            char[] r7 = r10.f16711d
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r7[r2]
            if (r2 != r11) goto L29
            r10.f16712f = r8
            int r8 = r8 - r3
            int r8 = r8 - r5
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L21:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f16712f = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r6)
            r1.<init>(r4)
        L3f:
            r1.append(r7, r3, r2)
            char r2 = r10.V()
            r1.append(r2)
            int r2 = r10.f16712f
            int r3 = r10.f16713h
            goto L6
        L4e:
            r6 = 10
            if (r2 != r6) goto L59
            int r2 = r10.f16714q
            int r2 = r2 + r5
            r10.f16714q = r2
            r10.f16715s = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r6)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r10.f16712f = r2
            boolean r2 = r10.E(r5)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.a0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.a.Q(char):java.lang.String");
    }

    public final String R() throws IOException {
        String str;
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 10) {
            str = S();
        } else if (iU == 8) {
            str = Q('\'');
        } else if (iU == 9) {
            str = Q('\"');
        } else if (iU == 11) {
            str = this.f16719w;
            this.f16719w = null;
        } else if (iU == 15) {
            str = Long.toString(this.f16717u);
        } else {
            if (iU != 16) {
                throw new IllegalStateException("Expected a string but was " + a0.u(T()) + I());
            }
            str = new String(this.f16711d, this.f16712f, this.f16718v);
            this.f16712f += this.f16718v;
        }
        this.f16716t = 0;
        int[] iArr = this.A;
        int i10 = this.f16721y - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String S() throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r7.f16712f
            int r4 = r3 + r2
            int r5 = r7.f16713h
            char[] r6 = r7.f16711d
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.e()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.E(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f16712f
            r0.append(r6, r3, r2)
            int r3 = r7.f16712f
            int r3 = r3 + r2
            r7.f16712f = r3
            r2 = 1
            boolean r2 = r7.E(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f16712f
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f16712f
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f16712f
            int r2 = r2 + r1
            r7.f16712f = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.a.S():java.lang.String");
    }

    public final int T() throws IOException {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        switch (iU) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void U(int i10) {
        int i11 = this.f16721y;
        int[] iArr = this.f16720x;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f16720x = Arrays.copyOf(iArr, i12);
            this.A = Arrays.copyOf(this.A, i12);
            this.f16722z = (String[]) Arrays.copyOf(this.f16722z, i12);
        }
        int[] iArr2 = this.f16720x;
        int i13 = this.f16721y;
        this.f16721y = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char V() throws MalformedJsonException {
        int i10;
        if (this.f16712f == this.f16713h && !E(1)) {
            a0("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f16712f;
        int i12 = i11 + 1;
        this.f16712f = i12;
        char[] cArr = this.f16711d;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f16714q++;
            this.f16715s = i12;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                a0("Invalid escape sequence");
                throw null;
            }
            if (i11 + 5 > this.f16713h && !E(4)) {
                a0("Unterminated escape sequence");
                throw null;
            }
            int i13 = this.f16712f;
            int i14 = i13 + 4;
            char c11 = 0;
            while (i13 < i14) {
                char c12 = cArr[i13];
                char c13 = (char) (c11 << 4);
                if (c12 >= '0' && c12 <= '9') {
                    i10 = c12 - '0';
                } else if (c12 >= 'a' && c12 <= 'f') {
                    i10 = c12 - 'W';
                } else {
                    if (c12 < 'A' || c12 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f16712f, 4)));
                    }
                    i10 = c12 - '7';
                }
                c11 = (char) (i10 + c13);
                i13++;
            }
            this.f16712f += 4;
            return c11;
        }
        return c10;
    }

    public final void W(char c10) throws MalformedJsonException {
        do {
            int i10 = this.f16712f;
            int i11 = this.f16713h;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.f16711d[i10];
                if (c11 == c10) {
                    this.f16712f = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f16712f = i12;
                    V();
                    i10 = this.f16712f;
                    i11 = this.f16713h;
                } else {
                    if (c11 == '\n') {
                        this.f16714q++;
                        this.f16715s = i12;
                    }
                    i10 = i12;
                }
            }
            this.f16712f = i10;
        } while (E(1));
        a0("Unterminated string");
        throw null;
    }

    public final void X() {
        char c10;
        do {
            if (this.f16712f >= this.f16713h && !E(1)) {
                return;
            }
            int i10 = this.f16712f;
            int i11 = i10 + 1;
            this.f16712f = i11;
            c10 = this.f16711d[i10];
            if (c10 == '\n') {
                this.f16714q++;
                this.f16715s = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f16712f
            int r2 = r1 + r0
            int r3 = r4.f16713h
            if (r2 >= r3) goto L51
            char[] r2 = r4.f16711d
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.e()
        L4b:
            int r1 = r4.f16712f
            int r1 = r1 + r0
            r4.f16712f = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f16712f = r1
            r0 = 1
            boolean r0 = r4.E(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.a.Y():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Z() throws IOException {
        int i10 = 0;
        do {
            int iU = this.f16716t;
            if (iU == 0) {
                iU = u();
            }
            switch (iU) {
                case 1:
                    U(3);
                    i10++;
                    this.f16716t = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f16722z[this.f16721y - 1] = null;
                    }
                    this.f16721y--;
                    i10--;
                    this.f16716t = 0;
                    break;
                case 3:
                    U(1);
                    i10++;
                    this.f16716t = 0;
                    break;
                case 4:
                    this.f16721y--;
                    i10--;
                    this.f16716t = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f16716t = 0;
                    break;
                case 8:
                    W('\'');
                    this.f16716t = 0;
                    break;
                case 9:
                    W('\"');
                    this.f16716t = 0;
                    break;
                case 10:
                    Y();
                    this.f16716t = 0;
                    break;
                case 12:
                    W('\'');
                    if (i10 == 0) {
                        this.f16722z[this.f16721y - 1] = "<skipped>";
                    }
                    this.f16716t = 0;
                    break;
                case 13:
                    W('\"');
                    if (i10 == 0) {
                        this.f16722z[this.f16721y - 1] = "<skipped>";
                    }
                    this.f16716t = 0;
                    break;
                case 14:
                    Y();
                    if (i10 == 0) {
                        this.f16722z[this.f16721y - 1] = "<skipped>";
                    }
                    this.f16716t = 0;
                    break;
                case 16:
                    this.f16712f += this.f16718v;
                    this.f16716t = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.A;
        int i11 = this.f16721y - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void a() throws IOException {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 3) {
            U(1);
            this.A[this.f16721y - 1] = 0;
            this.f16716t = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + a0.u(T()) + I());
        }
    }

    public final void a0(String str) throws MalformedJsonException {
        StringBuilder sbS = g1.a.s(str);
        sbS.append(I());
        throw new MalformedJsonException(sbS.toString());
    }

    public final void c() throws IOException {
        int iU = this.f16716t;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 1) {
            U(3);
            this.f16716t = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + a0.u(T()) + I());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16716t = 0;
        this.f16720x[0] = 8;
        this.f16721y = 1;
        this.f16709a.close();
    }

    public final void e() throws MalformedJsonException {
        if (this.f16710b) {
            return;
        }
        a0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String toString() {
        return a.class.getSimpleName() + I();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0215, code lost:
    
        if (H(r1) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x027d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.a.u():int");
    }
}
