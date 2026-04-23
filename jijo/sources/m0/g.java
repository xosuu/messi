package m0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f15385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f15386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15388d;

    public g(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            a5.f.n(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
        }
        this.f15385a = textPaint;
        this.f15386b = textDirectionHeuristic;
        this.f15387c = i10;
        this.f15388d = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof m0.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m0.g r8 = (m0.g) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L22
            int r3 = r8.f15387c
            int r4 = r7.f15387c
            if (r4 == r3) goto L1b
        L18:
            r1 = 0
            goto Lb7
        L1b:
            int r3 = r7.f15388d
            int r4 = r8.f15388d
            if (r3 == r4) goto L22
            goto L18
        L22:
            android.text.TextPaint r3 = r7.f15385a
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.f15385a
            float r5 = r5.getTextSize()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L33
            goto L18
        L33:
            float r4 = r3.getTextScaleX()
            android.text.TextPaint r5 = r8.f15385a
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L42
            goto L18
        L42:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L4f
            goto L18
        L4f:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L5c
            goto L18
        L5c:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L6b
            goto L18
        L6b:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L76
            goto L18
        L76:
            r4 = 24
            if (r1 < r4) goto L89
            android.os.LocaleList r1 = k3.d.b(r3)
            android.os.LocaleList r4 = k3.d.b(r5)
            boolean r1 = com.google.android.gms.internal.ads.kd1.w(r4, r1)
            if (r1 != 0) goto L98
            goto L18
        L89:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L98
            goto L18
        L98:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto La6
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto Lb6
            goto L18
        La6:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb6
            goto L18
        Lb6:
            r1 = 1
        Lb7:
            if (r1 != 0) goto Lba
            return r2
        Lba:
            android.text.TextDirectionHeuristic r1 = r7.f15386b
            android.text.TextDirectionHeuristic r8 = r8.f15386b
            if (r1 == r8) goto Lc1
            return r2
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f15388d;
        int i12 = this.f15387c;
        TextDirectionHeuristic textDirectionHeuristic = this.f15386b;
        TextPaint textPaint = this.f15385a;
        return i10 >= 24 ? n0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11)) : n0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f15385a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i10 >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f15386b);
        sb.append(", breakStrategy=" + this.f15387c);
        sb.append(", hyphenationFrequency=" + this.f15388d);
        sb.append("}");
        return sb.toString();
    }

    public g(PrecomputedText.Params params) {
        this.f15385a = params.getTextPaint();
        this.f15386b = params.getTextDirection();
        this.f15387c = params.getBreakStrategy();
        this.f15388d = params.getHyphenationFrequency();
    }
}
