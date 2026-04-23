package z0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.l;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.emoji2.text.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f20654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f20655b;

    public e(TextView textView, f fVar) {
        this.f20654a = new WeakReference(textView);
        this.f20655b = new WeakReference(fVar);
    }

    @Override // androidx.emoji2.text.j
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f20654a.get();
        InputFilter inputFilter = (InputFilter) this.f20655b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    l lVarA = l.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        lVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceF = lVarA.f(0, length, text);
                    if (text == charSequenceF) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceF);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceF);
                    textView.setText(charSequenceF);
                    if (charSequenceF instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceF;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
