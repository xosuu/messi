package g9;

import android.text.Editable;
import android.text.TextWatcher;
import team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class b implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13898b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CodeView f13899d;

    static {
        NativeUtil.classesInit0(49);
    }

    public b(CodeView codeView) {
        this.f13899d = codeView;
    }

    @Override // android.text.TextWatcher
    public final native void afterTextChanged(Editable editable);

    @Override // android.text.TextWatcher
    public final native void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12);

    @Override // android.text.TextWatcher
    public final native void onTextChanged(CharSequence charSequence, int i10, int i11, int i12);
}
