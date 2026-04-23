package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f593a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f594b;

    public b0(Spannable spannable) {
        this.f594b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f594b;
        if (!this.f593a) {
            if ((Build.VERSION.SDK_INT < 28 ? new d5.e() : new a0()).o(spannable)) {
                this.f594b = new SpannableString(spannable);
            }
        }
        this.f593a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f594b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f594b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f594b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f594b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f594b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f594b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f594b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f594b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f594b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f594b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f594b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f594b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f594b.toString();
    }

    public b0(CharSequence charSequence) {
        this.f594b = new SpannableString(charSequence);
    }
}
