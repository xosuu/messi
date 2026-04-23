package team.dev.epro.apkcustom.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class CustomTextView extends AppCompatTextView {
    static {
        NativeUtil.classesInit0(214);
    }

    public CustomTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public final native void setText(CharSequence charSequence, TextView.BufferType bufferType);
}
