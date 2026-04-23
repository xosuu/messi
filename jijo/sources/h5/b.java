package h5;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import team.dev.epro.apkcustom.dialogs.RequestBlock;
import team.dev.epro.apkcustom.dialogs.TimeOut;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14012b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f14011a = i10;
        this.f14012b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f14011a;
        Object obj = this.f14012b;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                EditText editText = eVar.f14021i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.q();
                    break;
                }
                break;
            case 1:
                ((l) obj).u();
                break;
            case 2:
                v vVar = (v) obj;
                EditText editText2 = vVar.f14106f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = vVar.f14106f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        vVar.f14106f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        vVar.f14106f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        vVar.f14106f.setSelection(selectionEnd);
                    }
                    vVar.q();
                    break;
                }
                break;
            case 3:
                RequestBlock requestBlock = (RequestBlock) obj;
                requestBlock.G0.setVisibility(8);
                requestBlock.M.setVisibility(0);
                requestBlock.X.requestFocus();
                break;
            default:
                int i11 = TimeOut.J;
                ((TimeOut) obj).finish();
                break;
        }
    }
}
