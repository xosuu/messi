package h5;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f14044a;

    public n(o oVar) {
        this.f14044a = oVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        o oVar = this.f14044a;
        if (oVar.E == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = oVar.E;
        m mVar = oVar.H;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (oVar.E.getOnFocusChangeListener() == oVar.b().e()) {
                oVar.E.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        oVar.E = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        oVar.b().m(oVar.E);
        oVar.i(oVar.b());
    }
}
