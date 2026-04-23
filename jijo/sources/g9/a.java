package g9;

import android.text.InputFilter;
import android.text.Spanned;
import team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CodeView f13896a;

    static {
        NativeUtil.classesInit0(50);
    }

    public a(CodeView codeView) {
        this.f13896a = codeView;
    }

    @Override // android.text.InputFilter
    public final native CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13);
}
