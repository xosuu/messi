package g9;

import android.widget.MultiAutoCompleteTextView;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class f implements MultiAutoCompleteTextView.Tokenizer {
    static {
        NativeUtil.classesInit0(46);
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final native int findTokenEnd(CharSequence charSequence, int i10);

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final native int findTokenStart(CharSequence charSequence, int i10);

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final native CharSequence terminateToken(CharSequence charSequence);
}
