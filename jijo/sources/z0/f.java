package z0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f20656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f20657b;

    public f(TextView textView) {
        this.f20656a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f20656a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = l.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return l.a().f(0, charSequence.length(), charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        l lVarA = l.a();
        if (this.f20657b == null) {
            this.f20657b = new e(textView, this);
        }
        lVarA.g(this.f20657b);
        return charSequence;
    }
}
