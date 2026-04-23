package z0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f20652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d5.e f20653b;

    public d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        d5.e eVar = new d5.e();
        super(inputConnection, false);
        this.f20652a = editText;
        this.f20653b = eVar;
        if (l.f604j != null) {
            l lVarA = l.a();
            if (lVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            lVarA.f609e.F(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f20652a.getEditableText();
        this.f20653b.getClass();
        return d5.e.m(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f20652a.getEditableText();
        this.f20653b.getClass();
        return d5.e.m(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
