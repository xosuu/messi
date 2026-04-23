package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class z extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f657b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f656a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f658c = 1.0f;

    public z(p pVar) {
        if (pVar == null) {
            throw new NullPointerException("metadata cannot be null");
        }
        this.f657b = pVar;
    }

    @Override // android.text.style.ReplacementSpan
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f656a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        p pVar = this.f657b;
        this.f658c = fAbs / (pVar.c().a(14) != 0 ? r8.f20433b.getShort(r1 + r8.f20432a) : (short) 0);
        y0.a aVarC = pVar.c();
        int iA = aVarC.a(14);
        if (iA != 0) {
            aVarC.f20433b.getShort(iA + aVarC.f20432a);
        }
        short s9 = (short) ((pVar.c().a(12) != 0 ? r5.f20433b.getShort(r7 + r5.f20432a) : (short) 0) * this.f658c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s9;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        l.a().getClass();
        p pVar = this.f657b;
        j2.h hVar = pVar.f621b;
        Typeface typeface = (Typeface) hVar.f14300f;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) hVar.f14298b, pVar.f620a * 2, 2, f10, i13, paint);
        paint.setTypeface(typeface2);
    }
}
