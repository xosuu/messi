package z0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.l;
import l.n3;

/* JADX INFO: loaded from: classes.dex */
public final class j implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f20664a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n3 f20666d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20665b = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20667f = true;

    public j(EditText editText) {
        this.f20664a = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l lVarA = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                lVarA.getClass();
                length = editableText.length();
            }
            lVarA.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f20664a;
        if (editText.isInEditMode() || !this.f20667f) {
            return;
        }
        if ((this.f20665b || l.f604j != null) && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iB = l.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    l.a().f(i10, i12 + i10, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            l lVarA = l.a();
            if (this.f20666d == null) {
                this.f20666d = new n3(editText);
            }
            lVarA.g(this.f20666d);
        }
    }
}
