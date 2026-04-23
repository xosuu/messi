package androidx.emoji2.text;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k.q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile r f598d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile j2.h f599f;

    public final void C() {
        try {
            ((l) this.f14587b).f610f.a(new f(this));
        } catch (Throwable th) {
            ((l) this.f14587b).d(th);
        }
    }

    public final CharSequence D(CharSequence charSequence, int i10, int i11, boolean z9) {
        b0 b0Var;
        int iCharCount;
        z[] zVarArr;
        r rVar = this.f598d;
        rVar.getClass();
        boolean z10 = charSequence instanceof y;
        if (z10) {
            ((y) charSequence).a();
        }
        if (!z10) {
            try {
                b0Var = charSequence instanceof Spannable ? new b0((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, z.class) > i11) ? null : new b0(charSequence);
            } finally {
                if (z10) {
                    ((y) charSequence).b();
                }
            }
        }
        if (b0Var != null && (zVarArr = (z[]) b0Var.f594b.getSpans(i10, i11, z.class)) != null && zVarArr.length > 0) {
            for (z zVar : zVarArr) {
                int spanStart = b0Var.f594b.getSpanStart(zVar);
                int spanEnd = b0Var.f594b.getSpanEnd(zVar);
                if (spanStart != i11) {
                    b0Var.removeSpan(zVar);
                }
                i10 = Math.min(spanStart, i10);
                i11 = Math.max(spanEnd, i11);
            }
        }
        if (i10 != i11 && i10 < charSequence.length()) {
            q qVar = new q((w) ((j2.h) rVar.f633d).f14299d, rVar.f631a, (int[]) rVar.f635h);
            b0 b0Var2 = b0Var;
            int iCodePointAt = Character.codePointAt(charSequence, i10);
            int i12 = 0;
            loop1: while (true) {
                iCharCount = i10;
                while (i10 < i11 && i12 < Integer.MAX_VALUE) {
                    int iA = qVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i10 = iCharCount;
                    } else if (iA == 2) {
                        i10 += Character.charCount(iCodePointAt);
                        if (i10 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, i10);
                        }
                    } else if (iA == 3) {
                        if (z9 || !rVar.b(charSequence, iCharCount, i10, qVar.f626d.f651b)) {
                            if (b0Var2 == null) {
                                b0Var2 = new b0((Spannable) new SpannableString(charSequence));
                            }
                            p pVar = qVar.f626d.f651b;
                            ((d5.e) rVar.f632b).getClass();
                            b0Var2.setSpan(new z(pVar), iCharCount, i10, 33);
                            i12++;
                        }
                    }
                }
                break loop1;
            }
            if (qVar.f623a == 2 && qVar.f625c.f651b != null && ((qVar.f628f > 1 || qVar.c()) && i12 < Integer.MAX_VALUE && (z9 || !rVar.b(charSequence, iCharCount, i10, qVar.f625c.f651b)))) {
                if (b0Var2 == null) {
                    b0Var2 = new b0(charSequence);
                }
                p pVar2 = qVar.f625c.f651b;
                ((d5.e) rVar.f632b).getClass();
                b0Var2.setSpan(new z(pVar2), iCharCount, i10, 33);
            }
            if (b0Var2 != null) {
                Spannable spannable = b0Var2.f594b;
                if (z10) {
                    ((y) charSequence).b();
                }
                return spannable;
            }
            if (!z10) {
                return charSequence;
            }
        } else if (!z10) {
            return charSequence;
        }
        return charSequence;
    }

    public final void F(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        y0.b bVar = (y0.b) this.f599f.f14297a;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? bVar.f20433b.getInt(iA + bVar.f20432a) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((l) this.f14587b).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
