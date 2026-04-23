package s5;

import androidx.core.app.NotificationCompat;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f16723v = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f16724w = new String[NotificationCompat.FLAG_HIGH_PRIORITY];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f16725x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f16726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16727b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16728d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16729f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f16730h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16731q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f16733t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16734u;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f16724w[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f16724w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f16725x = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f16727b = iArr;
        this.f16728d = 0;
        if (iArr.length == 0) {
            this.f16727b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f16727b;
        int i10 = this.f16728d;
        this.f16728d = i10 + 1;
        iArr2[i10] = 6;
        this.f16730h = ":";
        this.f16734u = true;
        Objects.requireNonNull(writer, "out == null");
        this.f16726a = writer;
    }

    public void A() throws IOException {
        u(1, 2, ']');
    }

    public void D() throws IOException {
        u(3, 5, '}');
    }

    public void E(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f16733t != null) {
            throw new IllegalStateException();
        }
        if (this.f16728d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f16733t = str;
    }

    public final void F() throws IOException {
        if (this.f16729f == null) {
            return;
        }
        Writer writer = this.f16726a;
        writer.write(10);
        int i10 = this.f16728d;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f16729f);
        }
    }

    public b G() throws IOException {
        if (this.f16733t != null) {
            if (!this.f16734u) {
                this.f16733t = null;
                return this;
            }
            P();
        }
        a();
        this.f16726a.write("null");
        return this;
    }

    public final int H() {
        int i10 = this.f16728d;
        if (i10 != 0) {
            return this.f16727b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f16732s
            if (r0 == 0) goto L7
            java.lang.String[] r0 = s5.b.f16725x
            goto L9
        L7:
            java.lang.String[] r0 = s5.b.f16724w
        L9:
            java.io.Writer r1 = r8.f16726a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = 0
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.b.I(java.lang.String):void");
    }

    public void J(double d10) throws IOException {
        P();
        if (this.f16731q || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            a();
            this.f16726a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void K(long j10) throws IOException {
        P();
        a();
        this.f16726a.write(Long.toString(j10));
    }

    public void L(Boolean bool) throws IOException {
        if (bool == null) {
            G();
            return;
        }
        P();
        a();
        this.f16726a.write(bool.booleanValue() ? "true" : "false");
    }

    public void M(Number number) throws IOException {
        if (number == null) {
            G();
            return;
        }
        P();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f16723v.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f16731q) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        a();
        this.f16726a.append((CharSequence) string);
    }

    public void N(String str) throws IOException {
        if (str == null) {
            G();
            return;
        }
        P();
        a();
        I(str);
    }

    public void O(boolean z9) throws IOException {
        P();
        a();
        this.f16726a.write(z9 ? "true" : "false");
    }

    public final void P() throws IOException {
        if (this.f16733t != null) {
            int iH = H();
            if (iH == 5) {
                this.f16726a.write(44);
            } else if (iH != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            F();
            this.f16727b[this.f16728d - 1] = 4;
            I(this.f16733t);
            this.f16733t = null;
        }
    }

    public final void a() throws IOException {
        int iH = H();
        if (iH == 1) {
            this.f16727b[this.f16728d - 1] = 2;
            F();
            return;
        }
        Writer writer = this.f16726a;
        if (iH == 2) {
            writer.append(',');
            F();
        } else {
            if (iH == 4) {
                writer.append((CharSequence) this.f16730h);
                this.f16727b[this.f16728d - 1] = 5;
                return;
            }
            if (iH != 6) {
                if (iH != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f16731q) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f16727b[this.f16728d - 1] = 7;
        }
    }

    public void c() throws IOException {
        P();
        a();
        int i10 = this.f16728d;
        int[] iArr = this.f16727b;
        if (i10 == iArr.length) {
            this.f16727b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f16727b;
        int i11 = this.f16728d;
        this.f16728d = i11 + 1;
        iArr2[i11] = 1;
        this.f16726a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16726a.close();
        int i10 = this.f16728d;
        if (i10 > 1 || (i10 == 1 && this.f16727b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f16728d = 0;
    }

    public void e() throws IOException {
        P();
        a();
        int i10 = this.f16728d;
        int[] iArr = this.f16727b;
        if (i10 == iArr.length) {
            this.f16727b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f16727b;
        int i11 = this.f16728d;
        this.f16728d = i11 + 1;
        iArr2[i11] = 3;
        this.f16726a.write(123);
    }

    public void flush() throws IOException {
        if (this.f16728d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f16726a.flush();
    }

    public final void u(int i10, int i11, char c10) throws IOException {
        int iH = H();
        if (iH != i11 && iH != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f16733t != null) {
            throw new IllegalStateException("Dangling name: " + this.f16733t);
        }
        this.f16728d--;
        if (iH == i11) {
            F();
        }
        this.f16726a.write(c10);
    }
}
